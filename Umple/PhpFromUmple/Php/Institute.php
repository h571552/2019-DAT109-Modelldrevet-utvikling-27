<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class Institute
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Institute Attributes
  private $instituteid;
  private $institutename;

  //Institute Associations
  private $study;
  private $instituteResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aInstituteid = null, $aInstitutename = null, $aStudy = null, $aInstituteResult = null)
  {
    if (func_num_args() == 0) { return; }

    $this->instituteid = $aInstituteid;
    $this->institutename = $aInstitutename;
    if ($aStudy == null || $aStudy->getInstitute() != null)
    {
      throw new Exception("Unable to create Institute due to aStudy");
    }
    $this->study = $aStudy;
    if ($aInstituteResult == null || $aInstituteResult->getInstitute() != null)
    {
      throw new Exception("Unable to create Institute due to aInstituteResult");
    }
    $this->instituteResult = $aInstituteResult;
  }
  public static function newInstance($aInstituteid, $aInstitutename, $aExpodForStudy, $aVoteRegistrationOpenForStudy, $aStatisticsOpenToPublicForStudy, $aStandRegistrationOpenForStudy, $aVerificationRequiredForStudy, $aStudyidForStudy, $aStudynameForStudy, $aStudyResultForStudy, $aResultForInstituteResult)
  {
    $thisInstance = new Institute();
    $thisInstance->instituteid = $aInstituteid;
    $thisInstance->institutename = $aInstitutename;
    $thisInstance->study = new Study($aExpodForStudy, $aVoteRegistrationOpenForStudy, $aStatisticsOpenToPublicForStudy, $aStandRegistrationOpenForStudy, $aVerificationRequiredForStudy, $aStudyidForStudy, $aStudynameForStudy, $thisInstance, $aStudyResultForStudy);
    $thisInstance->instituteResult = new InstituteResult($thisInstance, $aResultForInstituteResult);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setInstituteid($aInstituteid)
  {
    $wasSet = false;
    $this->instituteid = $aInstituteid;
    $wasSet = true;
    return $wasSet;
  }

  public function setInstitutename($aInstitutename)
  {
    $wasSet = false;
    $this->institutename = $aInstitutename;
    $wasSet = true;
    return $wasSet;
  }

  public function getInstituteid()
  {
    return $this->instituteid;
  }

  public function getInstitutename()
  {
    return $this->institutename;
  }

  public function getStudy()
  {
    return $this->study;
  }

  public function getInstituteResult()
  {
    return $this->instituteResult;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingStudy = $this->study;
    $this->study = null;
    if ($existingStudy != null)
    {
      $existingStudy->delete();
    }
    $existingInstituteResult = $this->instituteResult;
    $this->instituteResult = null;
    if ($existingInstituteResult != null)
    {
      $existingInstituteResult->delete();
    }
  }

}
?>