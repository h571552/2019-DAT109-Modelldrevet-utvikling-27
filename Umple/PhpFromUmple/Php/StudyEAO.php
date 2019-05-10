<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class StudyEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudyEAO Associations
  private $browseServlet;
  private $registrationServlet;
  private $adminBrowseServlet;
  private $adminEditStandServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aBrowseServlet = null, $aRegistrationServlet = null, $aAdminBrowseServlet = null, $aAdminEditStandServlet = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aBrowseServlet == null || $aBrowseServlet->getStudyEAO() != null)
    {
      throw new Exception("Unable to create StudyEAO due to aBrowseServlet");
    }
    $this->browseServlet = $aBrowseServlet;
    if ($aRegistrationServlet == null || $aRegistrationServlet->getStudyEAO() != null)
    {
      throw new Exception("Unable to create StudyEAO due to aRegistrationServlet");
    }
    $this->registrationServlet = $aRegistrationServlet;
    if ($aAdminBrowseServlet == null || $aAdminBrowseServlet->getStudyEAO() != null)
    {
      throw new Exception("Unable to create StudyEAO due to aAdminBrowseServlet");
    }
    $this->adminBrowseServlet = $aAdminBrowseServlet;
    if ($aAdminEditStandServlet == null || $aAdminEditStandServlet->getStudyEAO() != null)
    {
      throw new Exception("Unable to create StudyEAO due to aAdminEditStandServlet");
    }
    $this->adminEditStandServlet = $aAdminEditStandServlet;
  }
  public static function newInstance($aInstituteEAOForBrowseServlet, $aStandEAOForBrowseServlet, $aStandEAOForRegistrationServlet, $aExpoEAOForRegistrationServlet, $aInstituteEAOForAdminBrowseServlet, $aStandEAOForAdminBrowseServlet, $aInstituteEAOForAdminEditStandServlet, $aStandEAOForAdminEditStandServlet)
  {
    $thisInstance = new StudyEAO();
    $thisInstance->browseServlet = new BrowseServlet($aInstituteEAOForBrowseServlet, $thisInstance, $aStandEAOForBrowseServlet);
    $thisInstance->registrationServlet = new RegistrationServlet($aStandEAOForRegistrationServlet, $aExpoEAOForRegistrationServlet, $thisInstance);
    $thisInstance->adminBrowseServlet = new AdminBrowseServlet($aInstituteEAOForAdminBrowseServlet, $aStandEAOForAdminBrowseServlet, $thisInstance);
    $thisInstance->adminEditStandServlet = new AdminEditStandServlet($aInstituteEAOForAdminEditStandServlet, $thisInstance, $aStandEAOForAdminEditStandServlet);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getBrowseServlet()
  {
    return $this->browseServlet;
  }

  public function getRegistrationServlet()
  {
    return $this->registrationServlet;
  }

  public function getAdminBrowseServlet()
  {
    return $this->adminBrowseServlet;
  }

  public function getAdminEditStandServlet()
  {
    return $this->adminEditStandServlet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingBrowseServlet = $this->browseServlet;
    $this->browseServlet = null;
    if ($existingBrowseServlet != null)
    {
      $existingBrowseServlet->delete();
    }
    $existingRegistrationServlet = $this->registrationServlet;
    $this->registrationServlet = null;
    if ($existingRegistrationServlet != null)
    {
      $existingRegistrationServlet->delete();
    }
    $existingAdminBrowseServlet = $this->adminBrowseServlet;
    $this->adminBrowseServlet = null;
    if ($existingAdminBrowseServlet != null)
    {
      $existingAdminBrowseServlet->delete();
    }
    $existingAdminEditStandServlet = $this->adminEditStandServlet;
    $this->adminEditStandServlet = null;
    if ($existingAdminEditStandServlet != null)
    {
      $existingAdminEditStandServlet->delete();
    }
  }

}
?>