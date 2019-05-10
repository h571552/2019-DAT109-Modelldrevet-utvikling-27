<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class AdminEditStandServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminEditStandServlet Associations
  private $instituteEAO;
  private $studyEAO;
  private $standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aInstituteEAO = null, $aStudyEAO = null, $aStandEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aInstituteEAO == null || $aInstituteEAO->getAdminEditStandServlet() != null)
    {
      throw new Exception("Unable to create AdminEditStandServlet due to aInstituteEAO");
    }
    $this->instituteEAO = $aInstituteEAO;
    if ($aStudyEAO == null || $aStudyEAO->getAdminEditStandServlet() != null)
    {
      throw new Exception("Unable to create AdminEditStandServlet due to aStudyEAO");
    }
    $this->studyEAO = $aStudyEAO;
    if ($aStandEAO == null || $aStandEAO->getAdminEditStandServlet() != null)
    {
      throw new Exception("Unable to create AdminEditStandServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
  }
  public static function newInstance($aBrowseServletForInstituteEAO, $aResultServletForInstituteEAO, $aAdminBrowseServletForInstituteEAO, $aBrowseServletForStudyEAO, $aRegistrationServletForStudyEAO, $aAdminBrowseServletForStudyEAO, $aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO)
  {
    $thisInstance = new AdminEditStandServlet();
    $thisInstance->instituteEAO = new InstituteEAO($aBrowseServletForInstituteEAO, $aResultServletForInstituteEAO, $aAdminBrowseServletForInstituteEAO, $thisInstance);
    $thisInstance->studyEAO = new StudyEAO($aBrowseServletForStudyEAO, $aRegistrationServletForStudyEAO, $aAdminBrowseServletForStudyEAO, $thisInstance);
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $thisInstance);
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