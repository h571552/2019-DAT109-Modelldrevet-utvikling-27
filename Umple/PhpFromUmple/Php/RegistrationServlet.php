<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class RegistrationServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RegistrationServlet Associations
  private $standEAO;
  private $expoEAO;
  private $studyEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStandEAO = null, $aExpoEAO = null, $aStudyEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aStandEAO == null || $aStandEAO->getRegistrationServlet() != null)
    {
      throw new Exception("Unable to create RegistrationServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
    if ($aExpoEAO == null || $aExpoEAO->getRegistrationServlet() != null)
    {
      throw new Exception("Unable to create RegistrationServlet due to aExpoEAO");
    }
    $this->expoEAO = $aExpoEAO;
    if ($aStudyEAO == null || $aStudyEAO->getRegistrationServlet() != null)
    {
      throw new Exception("Unable to create RegistrationServlet due to aStudyEAO");
    }
    $this->studyEAO = $aStudyEAO;
  }
  public static function newInstance($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO, $aNewVisitorServletForExpoEAO, $aStartServletForExpoEAO, $aAdminServletForExpoEAO, $aBrowseServletForStudyEAO, $aAdminBrowseServletForStudyEAO, $aAdminEditStandServletForStudyEAO)
  {
    $thisInstance = new RegistrationServlet();
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $thisInstance, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO);
    $thisInstance->expoEAO = new ExpoEAO($aNewVisitorServletForExpoEAO, $thisInstance, $aStartServletForExpoEAO, $aAdminServletForExpoEAO);
    $thisInstance->studyEAO = new StudyEAO($aBrowseServletForStudyEAO, $thisInstance, $aAdminBrowseServletForStudyEAO, $aAdminEditStandServletForStudyEAO);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStandEAO()
  {
    return $this->standEAO;
  }

  public function getExpoEAO()
  {
    return $this->expoEAO;
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
    $existingStandEAO = $this->standEAO;
    $this->standEAO = null;
    if ($existingStandEAO != null)
    {
      $existingStandEAO->delete();
    }
    $existingExpoEAO = $this->expoEAO;
    $this->expoEAO = null;
    if ($existingExpoEAO != null)
    {
      $existingExpoEAO->delete();
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