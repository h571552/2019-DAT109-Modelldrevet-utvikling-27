<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class StudyResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudyResult Associations
  private $standResults;
  private $study;
  private $result;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStudy = null, $aResult = null)
  {
    if (func_num_args() == 0) { return; }

    $this->standResults = array();
    if ($aStudy == null || $aStudy->getStudyResult() != null)
    {
      throw new Exception("Unable to create StudyResult due to aStudy");
    }
    $this->study = $aStudy;
    $didAddResult = $this->setResult($aResult);
    if (!$didAddResult)
    {
      throw new Exception("Unable to create studyResult due to result");
    }
  }
  public static function newInstance($aExpodForStudy, $aVoteRegistrationOpenForStudy, $aStatisticsOpenToPublicForStudy, $aStandRegistrationOpenForStudy, $aVerificationRequiredForStudy, $aStudyidForStudy, $aStudynameForStudy, $aInstituteForStudy, $aResult)
  {
    $thisInstance = new StudyResult();
    $this->standResults = array();
    $thisInstance->study = new Study($aExpodForStudy, $aVoteRegistrationOpenForStudy, $aStatisticsOpenToPublicForStudy, $aStandRegistrationOpenForStudy, $aVerificationRequiredForStudy, $aStudyidForStudy, $aStudynameForStudy, $aInstituteForStudy, $thisInstance);$this->results = array();
    $this->results[] = $aResult;
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public function getStudy()
  {
    return $this->study;
  }

  public function getResult()
  {
    return $this->result;
  }

  public static function minimumNumberOfStandResults()
  {
    return 0;
  }

  public function addStandResultVia($aStand, $aInstituteResult, $aResult)
  {
    return new StandResult($aStand, $aInstituteResult, $aResult, $this);
  }

  public function addStandResult($aStandResult)
  {
    $wasAdded = false;
    if ($this->indexOfStandResult($aStandResult) !== -1) { return false; }
    $existingStudyResult = $aStandResult->getStudyResult();
    $isNewStudyResult = $existingStudyResult != null && $this !== $existingStudyResult;
    if ($isNewStudyResult)
    {
      $aStandResult->setStudyResult($this);
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
    //Unable to remove aStandResult, as it must always have a studyResult
    if ($this !== $aStandResult->getStudyResult())
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
      $existingResult->removeStudyResult($this);
    }
    $this->result->addStudyResult($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    foreach ($this->standResults as $aStandResult)
    {
      $aStandResult->delete();
    }
    $existingStudy = $this->study;
    $this->study = null;
    if ($existingStudy != null)
    {
      $existingStudy->delete();
    }
    $placeholderResult = $this->result;
    $this->result = null;
    $placeholderResult->removeStudyResult($this);
  }

}
?>