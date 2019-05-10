<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class Study
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Study Attributes
  private $expod;
  private $voteRegistrationOpen;
  private $statisticsOpenToPublic;
  private $standRegistrationOpen;
  private $verificationRequired;
  private $studyid;
  private $studyname;

  //Study Associations
  private $institute;
  private $stands;
  private $studyResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aExpod = null, $aVoteRegistrationOpen = null, $aStatisticsOpenToPublic = null, $aStandRegistrationOpen = null, $aVerificationRequired = null, $aStudyid = null, $aStudyname = null, $aInstitute = null, $aStudyResult = null)
  {
    if (func_num_args() == 0) { return; }

    $this->expod = $aExpod;
    $this->voteRegistrationOpen = $aVoteRegistrationOpen;
    $this->statisticsOpenToPublic = $aStatisticsOpenToPublic;
    $this->standRegistrationOpen = $aStandRegistrationOpen;
    $this->verificationRequired = $aVerificationRequired;
    $this->studyid = $aStudyid;
    $this->studyname = $aStudyname;
    if ($aInstitute == null || $aInstitute->getStudy() != null)
    {
      throw new Exception("Unable to create Study due to aInstitute");
    }
    $this->institute = $aInstitute;
    $this->stands = array();
    if ($aStudyResult == null || $aStudyResult->getStudy() != null)
    {
      throw new Exception("Unable to create Study due to aStudyResult");
    }
    $this->studyResult = $aStudyResult;
  }
  public static function newInstance($aExpod, $aVoteRegistrationOpen, $aStatisticsOpenToPublic, $aStandRegistrationOpen, $aVerificationRequired, $aStudyid, $aStudyname, $aInstituteidForInstitute, $aInstitutenameForInstitute, $aInstituteResultForInstitute, $aResultForStudyResult)
  {
    $thisInstance = new Study();
    $thisInstance->expod = $aExpod;
    $thisInstance->voteRegistrationOpen = $aVoteRegistrationOpen;
    $thisInstance->statisticsOpenToPublic = $aStatisticsOpenToPublic;
    $thisInstance->standRegistrationOpen = $aStandRegistrationOpen;
    $thisInstance->verificationRequired = $aVerificationRequired;
    $thisInstance->studyid = $aStudyid;
    $thisInstance->studyname = $aStudyname;
    $thisInstance->institute = new Institute($aInstituteidForInstitute, $aInstitutenameForInstitute, $thisInstance, $aInstituteResultForInstitute);
    $this->stands = array();
    $thisInstance->studyResult = new StudyResult($thisInstance, $aResultForStudyResult);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setExpod($aExpod)
  {
    $wasSet = false;
    $this->expod = $aExpod;
    $wasSet = true;
    return $wasSet;
  }

  public function setVoteRegistrationOpen($aVoteRegistrationOpen)
  {
    $wasSet = false;
    $this->voteRegistrationOpen = $aVoteRegistrationOpen;
    $wasSet = true;
    return $wasSet;
  }

  public function setStatisticsOpenToPublic($aStatisticsOpenToPublic)
  {
    $wasSet = false;
    $this->statisticsOpenToPublic = $aStatisticsOpenToPublic;
    $wasSet = true;
    return $wasSet;
  }

  public function setStandRegistrationOpen($aStandRegistrationOpen)
  {
    $wasSet = false;
    $this->standRegistrationOpen = $aStandRegistrationOpen;
    $wasSet = true;
    return $wasSet;
  }

  public function setVerificationRequired($aVerificationRequired)
  {
    $wasSet = false;
    $this->verificationRequired = $aVerificationRequired;
    $wasSet = true;
    return $wasSet;
  }

  public function setStudyid($aStudyid)
  {
    $wasSet = false;
    $this->studyid = $aStudyid;
    $wasSet = true;
    return $wasSet;
  }

  public function setStudyname($aStudyname)
  {
    $wasSet = false;
    $this->studyname = $aStudyname;
    $wasSet = true;
    return $wasSet;
  }

  public function getExpod()
  {
    return $this->expod;
  }

  public function getVoteRegistrationOpen()
  {
    return $this->voteRegistrationOpen;
  }

  public function getStatisticsOpenToPublic()
  {
    return $this->statisticsOpenToPublic;
  }

  public function getStandRegistrationOpen()
  {
    return $this->standRegistrationOpen;
  }

  public function getVerificationRequired()
  {
    return $this->verificationRequired;
  }

  public function getStudyid()
  {
    return $this->studyid;
  }

  public function getStudyname()
  {
    return $this->studyname;
  }

  public function getInstitute()
  {
    return $this->institute;
  }

  public function getStand_index($index)
  {
    $aStand = $this->stands[$index];
    return $aStand;
  }

  public function getStands()
  {
    $newStands = $this->stands;
    return $newStands;
  }

  public function numberOfStands()
  {
    $number = count($this->stands);
    return $number;
  }

  public function hasStands()
  {
    $has = $this->numberOfStands() > 0;
    return $has;
  }

  public function indexOfStand($aStand)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->stands as $stand)
    {
      if ($stand->equals($aStand))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getStudyResult()
  {
    return $this->studyResult;
  }

  public static function minimumNumberOfStands()
  {
    return 0;
  }

  public function addStandVia($aStandId, $aStandName, $aAuthors, $aExpo, $aStandResult)
  {
    return new Stand($aStandId, $aStandName, $aAuthors, $aExpo, $this, $aStandResult);
  }

  public function addStand($aStand)
  {
    $wasAdded = false;
    if ($this->indexOfStand($aStand) !== -1) { return false; }
    $existingStudy = $aStand->getStudy();
    $isNewStudy = $existingStudy != null && $this !== $existingStudy;
    if ($isNewStudy)
    {
      $aStand->setStudy($this);
    }
    else
    {
      $this->stands[] = $aStand;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeStand($aStand)
  {
    $wasRemoved = false;
    //Unable to remove aStand, as it must always have a study
    if ($this !== $aStand->getStudy())
    {
      unset($this->stands[$this->indexOfStand($aStand)]);
      $this->stands = array_values($this->stands);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addStandAt($aStand, $index)
  {  
    $wasAdded = false;
    if($this->addStand($aStand))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStands()) { $index = $this->numberOfStands() - 1; }
      array_splice($this->stands, $this->indexOfStand($aStand), 1);
      array_splice($this->stands, $index, 0, array($aStand));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveStandAt($aStand, $index)
  {
    $wasAdded = false;
    if($this->indexOfStand($aStand) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStands()) { $index = $this->numberOfStands() - 1; }
      array_splice($this->stands, $this->indexOfStand($aStand), 1);
      array_splice($this->stands, $index, 0, array($aStand));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addStandAt($aStand, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingInstitute = $this->institute;
    $this->institute = null;
    if ($existingInstitute != null)
    {
      $existingInstitute->delete();
    }
    foreach ($this->stands as $aStand)
    {
      $aStand->delete();
    }
    $existingStudyResult = $this->studyResult;
    $this->studyResult = null;
    if ($existingStudyResult != null)
    {
      $existingStudyResult->delete();
    }
  }

}
?>