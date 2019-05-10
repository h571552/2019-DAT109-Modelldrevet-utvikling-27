<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class StandResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandResult Associations
  private $votes;
  private $stand;
  private $instituteResult;
  private $result;
  private $studyResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStand = null, $aInstituteResult = null, $aResult = null, $aStudyResult = null)
  {
    if (func_num_args() == 0) { return; }

    $this->votes = array();
    if ($aStand == null || $aStand->getStandResult() != null)
    {
      throw new Exception("Unable to create StandResult due to aStand");
    }
    $this->stand = $aStand;
    $didAddInstituteResult = $this->setInstituteResult($aInstituteResult);
    if (!$didAddInstituteResult)
    {
      throw new Exception("Unable to create standResult due to instituteResult");
    }
    $didAddResult = $this->setResult($aResult);
    if (!$didAddResult)
    {
      throw new Exception("Unable to create standResult due to result");
    }
    $didAddStudyResult = $this->setStudyResult($aStudyResult);
    if (!$didAddStudyResult)
    {
      throw new Exception("Unable to create standResult due to studyResult");
    }
  }
  public static function newInstance($aStandIdForStand, $aStandNameForStand, $aAuthorsForStand, $aExpoForStand, $aStudyForStand, $aInstituteResult, $aResult, $aStudyResult)
  {
    $thisInstance = new StandResult();
    $this->votes = array();
    $thisInstance->stand = new Stand($aStandIdForStand, $aStandNameForStand, $aAuthorsForStand, $aExpoForStand, $aStudyForStand, $thisInstance);$this->instituteResults = array();
    $this->instituteResults[] = $aInstituteResult;$this->results = array();
    $this->results[] = $aResult;$this->studyResults = array();
    $this->studyResults[] = $aStudyResult;
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getVote_index($index)
  {
    $aVote = $this->votes[$index];
    return $aVote;
  }

  public function getVotes()
  {
    $newVotes = $this->votes;
    return $newVotes;
  }

  public function numberOfVotes()
  {
    $number = count($this->votes);
    return $number;
  }

  public function hasVotes()
  {
    $has = $this->numberOfVotes() > 0;
    return $has;
  }

  public function indexOfVote($aVote)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->votes as $vote)
    {
      if ($vote->equals($aVote))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getStand()
  {
    return $this->stand;
  }

  public function getInstituteResult()
  {
    return $this->instituteResult;
  }

  public function getResult()
  {
    return $this->result;
  }

  public function getStudyResult()
  {
    return $this->studyResult;
  }

  public static function minimumNumberOfVotes()
  {
    return 0;
  }

  public function addVoteVia($aVoteId, $aVoteValue, $aStand, $aVisitor, $aResult)
  {
    return new Vote($aVoteId, $aVoteValue, $aStand, $aVisitor, $aResult, $this);
  }

  public function addVote($aVote)
  {
    $wasAdded = false;
    if ($this->indexOfVote($aVote) !== -1) { return false; }
    $existingStandResult = $aVote->getStandResult();
    $isNewStandResult = $existingStandResult != null && $this !== $existingStandResult;
    if ($isNewStandResult)
    {
      $aVote->setStandResult($this);
    }
    else
    {
      $this->votes[] = $aVote;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeVote($aVote)
  {
    $wasRemoved = false;
    //Unable to remove aVote, as it must always have a standResult
    if ($this !== $aVote->getStandResult())
    {
      unset($this->votes[$this->indexOfVote($aVote)]);
      $this->votes = array_values($this->votes);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addVoteAt($aVote, $index)
  {  
    $wasAdded = false;
    if($this->addVote($aVote))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfVotes()) { $index = $this->numberOfVotes() - 1; }
      array_splice($this->votes, $this->indexOfVote($aVote), 1);
      array_splice($this->votes, $index, 0, array($aVote));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveVoteAt($aVote, $index)
  {
    $wasAdded = false;
    if($this->indexOfVote($aVote) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfVotes()) { $index = $this->numberOfVotes() - 1; }
      array_splice($this->votes, $this->indexOfVote($aVote), 1);
      array_splice($this->votes, $index, 0, array($aVote));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addVoteAt($aVote, $index);
    }
    return $wasAdded;
  }

  public function setInstituteResult($aInstituteResult)
  {
    $wasSet = false;
    if ($aInstituteResult == null)
    {
      return $wasSet;
    }
    
    $existingInstituteResult = $this->instituteResult;
    $this->instituteResult = $aInstituteResult;
    if ($existingInstituteResult != null && $existingInstituteResult != $aInstituteResult)
    {
      $existingInstituteResult->removeStandResult($this);
    }
    $this->instituteResult->addStandResult($this);
    $wasSet = true;
    return $wasSet;
  }

  public function setResult($aResult)
  {
    $wasSet = false;
    if ($aResult == null)
    {
      return $wasSet;
    }
    
    $existingResult = $this->result;
    $this->result = $aResult;
    if ($existingResult != null && $existingResult != $aResult)
    {
      $existingResult->removeStandResult($this);
    }
    $this->result->addStandResult($this);
    $wasSet = true;
    return $wasSet;
  }

  public function setStudyResult($aStudyResult)
  {
    $wasSet = false;
    if ($aStudyResult == null)
    {
      return $wasSet;
    }
    
    $existingStudyResult = $this->studyResult;
    $this->studyResult = $aStudyResult;
    if ($existingStudyResult != null && $existingStudyResult != $aStudyResult)
    {
      $existingStudyResult->removeStandResult($this);
    }
    $this->studyResult->addStandResult($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    foreach ($this->votes as $aVote)
    {
      $aVote->delete();
    }
    $existingStand = $this->stand;
    $this->stand = null;
    if ($existingStand != null)
    {
      $existingStand->delete();
    }
    $placeholderInstituteResult = $this->instituteResult;
    $this->instituteResult = null;
    $placeholderInstituteResult->removeStandResult($this);
    $placeholderResult = $this->result;
    $this->result = null;
    $placeholderResult->removeStandResult($this);
    $placeholderStudyResult = $this->studyResult;
    $this->studyResult = null;
    $placeholderStudyResult->removeStandResult($this);
  }

}
?>