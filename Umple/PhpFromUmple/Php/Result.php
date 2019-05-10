<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class Result
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Result Attributes
  private $MINSTE_ANTALL_STEMMER;

  //Result Associations
  private $votes;
  private $standResults;
  private $studyResults;
  private $instituteResults;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aMINSTE_ANTALL_STEMMER)
  {
    $this->MINSTE_ANTALL_STEMMER = $aMINSTE_ANTALL_STEMMER;
    $this->votes = array();
    $this->standResults = array();
    $this->studyResults = array();
    $this->instituteResults = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setMINSTE_ANTALL_STEMMER($aMINSTE_ANTALL_STEMMER)
  {
    $wasSet = false;
    $this->MINSTE_ANTALL_STEMMER = $aMINSTE_ANTALL_STEMMER;
    $wasSet = true;
    return $wasSet;
  }

  public function getMINSTE_ANTALL_STEMMER()
  {
    return $this->MINSTE_ANTALL_STEMMER;
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

  public function getStandResult_index($index)
  {
    $aStandResult = $this->standResults[$index];
    return $aStandResult;
  }

  public function getStandResults()
  {
    $newStandResults = $this->standResults;
    return $newStandResults;
  }

  public function numberOfStandResults()
  {
    $number = count($this->standResults);
    return $number;
  }

  public function hasStandResults()
  {
    $has = $this->numberOfStandResults() > 0;
    return $has;
  }

  public function indexOfStandResult($aStandResult)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->standResults as $standResult)
    {
      if ($standResult->equals($aStandResult))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getStudyResult_index($index)
  {
    $aStudyResult = $this->studyResults[$index];
    return $aStudyResult;
  }

  public function getStudyResults()
  {
    $newStudyResults = $this->studyResults;
    return $newStudyResults;
  }

  public function numberOfStudyResults()
  {
    $number = count($this->studyResults);
    return $number;
  }

  public function hasStudyResults()
  {
    $has = $this->numberOfStudyResults() > 0;
    return $has;
  }

  public function indexOfStudyResult($aStudyResult)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->studyResults as $studyResult)
    {
      if ($studyResult->equals($aStudyResult))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getInstituteResult_index($index)
  {
    $aInstituteResult = $this->instituteResults[$index];
    return $aInstituteResult;
  }

  public function getInstituteResults()
  {
    $newInstituteResults = $this->instituteResults;
    return $newInstituteResults;
  }

  public function numberOfInstituteResults()
  {
    $number = count($this->instituteResults);
    return $number;
  }

  public function hasInstituteResults()
  {
    $has = $this->numberOfInstituteResults() > 0;
    return $has;
  }

  public function indexOfInstituteResult($aInstituteResult)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->instituteResults as $instituteResult)
    {
      if ($instituteResult->equals($aInstituteResult))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfVotes()
  {
    return 0;
  }

  public function addVoteVia($aVoteId, $aVoteValue, $aStand, $aVisitor, $aStandResult)
  {
    return new Vote($aVoteId, $aVoteValue, $aStand, $aVisitor, $this, $aStandResult);
  }

  public function addVote($aVote)
  {
    $wasAdded = false;
    if ($this->indexOfVote($aVote) !== -1) { return false; }
    $existingResult = $aVote->getResult();
    $isNewResult = $existingResult != null && $this !== $existingResult;
    if ($isNewResult)
    {
      $aVote->setResult($this);
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
    //Unable to remove aVote, as it must always have a result
    if ($this !== $aVote->getResult())
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

  public static function minimumNumberOfStandResults()
  {
    return 0;
  }

  public function addStandResultVia($aStand, $aInstituteResult, $aStudyResult)
  {
    return new StandResult($aStand, $aInstituteResult, $this, $aStudyResult);
  }

  public function addStandResult($aStandResult)
  {
    $wasAdded = false;
    if ($this->indexOfStandResult($aStandResult) !== -1) { return false; }
    $existingResult = $aStandResult->getResult();
    $isNewResult = $existingResult != null && $this !== $existingResult;
    if ($isNewResult)
    {
      $aStandResult->setResult($this);
    }
    else
    {
      $this->standResults[] = $aStandResult;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeStandResult($aStandResult)
  {
    $wasRemoved = false;
    //Unable to remove aStandResult, as it must always have a result
    if ($this !== $aStandResult->getResult())
    {
      unset($this->standResults[$this->indexOfStandResult($aStandResult)]);
      $this->standResults = array_values($this->standResults);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addStandResultAt($aStandResult, $index)
  {  
    $wasAdded = false;
    if($this->addStandResult($aStandResult))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStandResults()) { $index = $this->numberOfStandResults() - 1; }
      array_splice($this->standResults, $this->indexOfStandResult($aStandResult), 1);
      array_splice($this->standResults, $index, 0, array($aStandResult));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveStandResultAt($aStandResult, $index)
  {
    $wasAdded = false;
    if($this->indexOfStandResult($aStandResult) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStandResults()) { $index = $this->numberOfStandResults() - 1; }
      array_splice($this->standResults, $this->indexOfStandResult($aStandResult), 1);
      array_splice($this->standResults, $index, 0, array($aStandResult));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addStandResultAt($aStandResult, $index);
    }
    return $wasAdded;
  }

  public static function minimumNumberOfStudyResults()
  {
    return 0;
  }

  public function addStudyResultVia($aStudy)
  {
    return new StudyResult($aStudy, $this);
  }

  public function addStudyResult($aStudyResult)
  {
    $wasAdded = false;
    if ($this->indexOfStudyResult($aStudyResult) !== -1) { return false; }
    $existingResult = $aStudyResult->getResult();
    $isNewResult = $existingResult != null && $this !== $existingResult;
    if ($isNewResult)
    {
      $aStudyResult->setResult($this);
    }
    else
    {
      $this->studyResults[] = $aStudyResult;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeStudyResult($aStudyResult)
  {
    $wasRemoved = false;
    //Unable to remove aStudyResult, as it must always have a result
    if ($this !== $aStudyResult->getResult())
    {
      unset($this->studyResults[$this->indexOfStudyResult($aStudyResult)]);
      $this->studyResults = array_values($this->studyResults);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addStudyResultAt($aStudyResult, $index)
  {  
    $wasAdded = false;
    if($this->addStudyResult($aStudyResult))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStudyResults()) { $index = $this->numberOfStudyResults() - 1; }
      array_splice($this->studyResults, $this->indexOfStudyResult($aStudyResult), 1);
      array_splice($this->studyResults, $index, 0, array($aStudyResult));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveStudyResultAt($aStudyResult, $index)
  {
    $wasAdded = false;
    if($this->indexOfStudyResult($aStudyResult) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStudyResults()) { $index = $this->numberOfStudyResults() - 1; }
      array_splice($this->studyResults, $this->indexOfStudyResult($aStudyResult), 1);
      array_splice($this->studyResults, $index, 0, array($aStudyResult));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addStudyResultAt($aStudyResult, $index);
    }
    return $wasAdded;
  }

  public static function minimumNumberOfInstituteResults()
  {
    return 0;
  }

  public function addInstituteResultVia($aInstitute)
  {
    return new InstituteResult($aInstitute, $this);
  }

  public function addInstituteResult($aInstituteResult)
  {
    $wasAdded = false;
    if ($this->indexOfInstituteResult($aInstituteResult) !== -1) { return false; }
    $existingResult = $aInstituteResult->getResult();
    $isNewResult = $existingResult != null && $this !== $existingResult;
    if ($isNewResult)
    {
      $aInstituteResult->setResult($this);
    }
    else
    {
      $this->instituteResults[] = $aInstituteResult;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeInstituteResult($aInstituteResult)
  {
    $wasRemoved = false;
    //Unable to remove aInstituteResult, as it must always have a result
    if ($this !== $aInstituteResult->getResult())
    {
      unset($this->instituteResults[$this->indexOfInstituteResult($aInstituteResult)]);
      $this->instituteResults = array_values($this->instituteResults);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addInstituteResultAt($aInstituteResult, $index)
  {  
    $wasAdded = false;
    if($this->addInstituteResult($aInstituteResult))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfInstituteResults()) { $index = $this->numberOfInstituteResults() - 1; }
      array_splice($this->instituteResults, $this->indexOfInstituteResult($aInstituteResult), 1);
      array_splice($this->instituteResults, $index, 0, array($aInstituteResult));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveInstituteResultAt($aInstituteResult, $index)
  {
    $wasAdded = false;
    if($this->indexOfInstituteResult($aInstituteResult) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfInstituteResults()) { $index = $this->numberOfInstituteResults() - 1; }
      array_splice($this->instituteResults, $this->indexOfInstituteResult($aInstituteResult), 1);
      array_splice($this->instituteResults, $index, 0, array($aInstituteResult));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addInstituteResultAt($aInstituteResult, $index);
    }
    return $wasAdded;
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
    foreach ($this->standResults as $aStandResult)
    {
      $aStandResult->delete();
    }
    foreach ($this->studyResults as $aStudyResult)
    {
      $aStudyResult->delete();
    }
    foreach ($this->instituteResults as $aInstituteResult)
    {
      $aInstituteResult->delete();
    }
  }

}
?>