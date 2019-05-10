<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class InstituteResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //InstituteResult Associations
  private $standResults;
  private $institute;
  private $result;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aInstitute = null, $aResult = null)
  {
    if (func_num_args() == 0) { return; }

    $this->standResults = array();
    if ($aInstitute == null || $aInstitute->getInstituteResult() != null)
    {
      throw new Exception("Unable to create InstituteResult due to aInstitute");
    }
    $this->institute = $aInstitute;
    $didAddResult = $this->setResult($aResult);
    if (!$didAddResult)
    {
      throw new Exception("Unable to create instituteResult due to result");
    }
  }
  public static function newInstance($aInstituteidForInstitute, $aInstitutenameForInstitute, $aStudyForInstitute, $aResult)
  {
    $thisInstance = new InstituteResult();
    $this->standResults = array();
    $thisInstance->institute = new Institute($aInstituteidForInstitute, $aInstitutenameForInstitute, $aStudyForInstitute, $thisInstance);$this->results = array();
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

  public function getInstitute()
  {
    return $this->institute;
  }

  public function getResult()
  {
    return $this->result;
  }

  public static function minimumNumberOfStandResults()
  {
    return 0;
  }

  public function addStandResultVia($aStand, $aResult, $aStudyResult)
  {
    return new StandResult($aStand, $this, $aResult, $aStudyResult);
  }

  public function addStandResult($aStandResult)
  {
    $wasAdded = false;
    if ($this->indexOfStandResult($aStandResult) !== -1) { return false; }
    $existingInstituteResult = $aStandResult->getInstituteResult();
    $isNewInstituteResult = $existingInstituteResult != null && $this !== $existingInstituteResult;
    if ($isNewInstituteResult)
    {
      $aStandResult->setInstituteResult($this);
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
    //Unable to remove aStandResult, as it must always have a instituteResult
    if ($this !== $aStandResult->getInstituteResult())
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
      $existingResult->removeInstituteResult($this);
    }
    $this->result->addInstituteResult($this);
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
    $existingInstitute = $this->institute;
    $this->institute = null;
    if ($existingInstitute != null)
    {
      $existingInstitute->delete();
    }
    $placeholderResult = $this->result;
    $this->result = null;
    $placeholderResult->removeInstituteResult($this);
  }

}
?>