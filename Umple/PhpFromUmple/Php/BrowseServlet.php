<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class BrowseServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BrowseServlet Associations
  private $instituteEAO;
  private $studyEAO;
  private $standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aInstituteEAO = null, $aStudyEAO = null, $aStandEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aInstituteEAO == null || $aInstituteEAO->getBrowseServlet() != null)
    {
      throw new Exception("Unable to create BrowseServlet due to aInstituteEAO");
    }
    $this->instituteEAO = $aInstituteEAO;
    if ($aStudyEAO == null || $aStudyEAO->getBrowseServlet() != null)
    {
      throw new Exception("Unable to create BrowseServlet due to aStudyEAO");
    }
    $this->studyEAO = $aStudyEAO;
    if ($aStandEAO == null || $aStandEAO->getBrowseServlet() != null)
    {
      throw new Exception("Unable to create BrowseServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
  }
  public static function newInstance($aResultServletForInstituteEAO, $aAdminBrowseServletForInstituteEAO, $aAdminEditStandServletForInstituteEAO, $aRegistrationServletForStudyEAO, $aAdminBrowseServletForStudyEAO, $aAdminEditStandServletForStudyEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO)
  {
    $thisInstance = new BrowseServlet();
    $thisInstance->instituteEAO = new InstituteEAO($thisInstance, $aResultServletForInstituteEAO, $aAdminBrowseServletForInstituteEAO, $aAdminEditStandServletForInstituteEAO);
    $thisInstance->studyEAO = new StudyEAO($thisInstance, $aRegistrationServletForStudyEAO, $aAdminBrowseServletForStudyEAO, $aAdminEditStandServletForStudyEAO);
    $thisInstance->standEAO = new StandEAO($thisInstance, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getInstituteEAO()
  {
    return $this->instituteEAO;
  }

  public function getStudyEAO()
  {
    return $this->studyEAO;
  }

  public function getStandEAO()
  {
    return $this->standEAO;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingInstituteEAO = $this->instituteEAO;
    $this->instituteEAO = null;
    if ($existingInstituteEAO != null)
    {
      $existingInstituteEAO->delete();
    }
    $existingStudyEAO = $this->studyEAO;
    $this->studyEAO = null;
    if ($existingStudyEAO != null)
    {
      $existingStudyEAO->delete();
    }
    $existingStandEAO = $this->standEAO;
    $this->standEAO = null;
    if ($existingStandEAO != null)
    {
      $existingStandEAO->delete();
    }
  }

}
?>