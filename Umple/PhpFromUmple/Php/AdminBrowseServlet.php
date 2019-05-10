<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class AdminBrowseServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminBrowseServlet Associations
  private $instituteEAO;
  private $standEAO;
  private $studyEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aInstituteEAO = null, $aStandEAO = null, $aStudyEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aInstituteEAO == null || $aInstituteEAO->getAdminBrowseServlet() != null)
    {
      throw new Exception("Unable to create AdminBrowseServlet due to aInstituteEAO");
    }
    $this->instituteEAO = $aInstituteEAO;
    if ($aStandEAO == null || $aStandEAO->getAdminBrowseServlet() != null)
    {
      throw new Exception("Unable to create AdminBrowseServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
    if ($aStudyEAO == null || $aStudyEAO->getAdminBrowseServlet() != null)
    {
      throw new Exception("Unable to create AdminBrowseServlet due to aStudyEAO");
    }
    $this->studyEAO = $aStudyEAO;
  }
  public static function newInstance($aBrowseServletForInstituteEAO, $aResultServletForInstituteEAO, $aAdminEditStandServletForInstituteEAO, $aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminEditStandServletForStandEAO, $aBrowseServletForStudyEAO, $aRegistrationServletForStudyEAO, $aAdminEditStandServletForStudyEAO)
  {
    $thisInstance = new AdminBrowseServlet();
    $thisInstance->instituteEAO = new InstituteEAO($aBrowseServletForInstituteEAO, $aResultServletForInstituteEAO, $thisInstance, $aAdminEditStandServletForInstituteEAO);
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $thisInstance, $aAdminEditStandServletForStandEAO);
    $thisInstance->studyEAO = new StudyEAO($aBrowseServletForStudyEAO, $aRegistrationServletForStudyEAO, $thisInstance, $aAdminEditStandServletForStudyEAO);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getInstituteEAO()
  {
    return $this->instituteEAO;
  }

  public function getStandEAO()
  {
    return $this->standEAO;
  }

  public function getStudyEAO()
  {
    return $this->studyEAO;
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
    $existingStandEAO = $this->standEAO;
    $this->standEAO = null;
    if ($existingStandEAO != null)
    {
      $existingStandEAO->delete();
    }
    $existingStudyEAO = $this->studyEAO;
    $this->studyEAO = null;
    if ($existingStudyEAO != null)
    {
      $existingStudyEAO->delete();
    }
  }

}
?>