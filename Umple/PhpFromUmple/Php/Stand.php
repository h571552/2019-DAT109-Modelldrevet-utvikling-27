<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class Stand
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Stand Attributes
  private $standId;
  private $standName;
  private $authors;

  //Stand Associations
  private $expo;
  private $votes;
  private $study;
  private $standResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStandId = null, $aStandName = null, $aAuthors = null, $aExpo = null, $aStudy = null, $aStandResult = null)
  {
    if (func_num_args() == 0) { return; }

    $this->standId = $aStandId;
    $this->standName = $aStandName;
    $this->authors = $aAuthors;
    if ($aExpo == null || $aExpo->getStand() != null)
    {
      throw new Exception("Unable to create Stand due to aExpo");
    }
    $this->expo = $aExpo;
    $this->votes = array();
    $didAddStudy = $this->setStudy($aStudy);
    if (!$didAddStudy)
    {
      throw new Exception("Unable to create stand due to study");
    }
    if ($aStandResult == null || $aStandResult->getStand() != null)
    {
      throw new Exception("Unable to create Stand due to aStandResult");
    }
    $this->standResult = $aStandResult;
  }
  public static function newInstance($aStandId, $aStandName, $aAuthors, $aResultServletForExpo, $aVoteServletForExpo, $aStudy, $aInstituteResultForStandResult, $aResultForStandResult, $aStudyResultForStandResult)
  {
    $thisInstance = new Stand();
    $thisInstance->standId = $aStandId;
    $thisInstance->standName = $aStandName;
    $thisInstance->authors = $aAuthors;
    $thisInstance->expo = new Expo($thisInstance, $aResultServletForExpo, $aVoteServletForExpo);
    $this->votes = array();$this->studies = array();
    $this->studies[] = $aStudy;
    $thisInstance->standResult = new StandResult($thisInstance, $aInstituteResultForStandResult, $aResultForStandResult, $aStudyResultForStandResult);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setStandId($aStandId)
  {
    $wasSet = false;
    $this->standId = $aStandId;
    $wasSet = true;
    return $wasSet;
  }

  public function setStandName($aStandName)
  {
    $wasSet = false;
    $this->standName = $aStandName;
    $wasSet = true;
    return $wasSet;
  }

  public function setAuthors($aAuthors)
  {
    $wasSet = false;
    $this->authors = $aAuthors;
    $wasSet = true;
    return $wasSet;
  }

  public function getStandId()
  {
    return $this->standId;
  }

  public function getStandName()
  {
    return $this->standName;
  }

  public function getAuthors()
  {
    return $this->authors;
  }

  public function getExpo()
  {
    return $this->expo;
  }

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

  public function getStudy()
  {
    return $this->study;
  }

  public function getStandResult()
  {
    return $this->standResult;
  }

  public static function minimumNumberOfVotes()
  {
    return 0;
  }

  public function addVoteVia($aVoteId, $aVoteValue, $aVisitor, $aResult, $aStandResult)
  {
    return new Vote($aVoteId, $aVoteValue, $this, $aVisitor, $aResult, $aStandResult);
  }

  public function addVote($aVote)
  {
    $wasAdded = false;
    if ($this->indexOfVote($aVote) !== -1) { return false; }
    $existingStand = $aVote->getStand();
    $isNewStand = $existingStand != null && $this !== $existingStand;
    if ($isNewStand)
    {
      $aVote->setStand($this);
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
    //Unable to remove aVote, as it must always have a stand
    if ($this !== $aVote->getStand())
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

  public function setStudy($aStudy)
  {
    $wasSet = false;
    if ($aStudy == null)
    {
      return $wasSet;
    }
    
    $existingStudy = $this->study;
    $this->study = $aStudy;
    if ($existingStudy != null && $existingStudy != $aStudy)
    {
      $existingStudy->removeStand($this);
    }
    $this->study->addStand($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingExpo = $this->expo;
    $this->expo = null;
    if ($existingExpo != null)
    {
      $existingExpo->delete();
    }
    foreach ($this->votes as $aVote)
    {
      $aVote->delete();
    }
    $placeholderStudy = $this->study;
    $this->study = null;
    $placeholderStudy->removeStand($this);
    $existingStandResult = $this->standResult;
    $this->standResult = null;
    if ($existingStandResult != null)
    {
      $existingStandResult->delete();
    }
  }

}
?>