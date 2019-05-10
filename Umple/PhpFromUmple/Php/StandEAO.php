<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class StandEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandEAO Associations
  private $browseServlet;
  private $confirmNewStandServlet;
  private $getQRCodeServlet;
  private $registrationServlet;
  private $standServlet;
  private $startServlet;
  private $voteServlet;
  private $adminBrowseServlet;
  private $adminEditStandServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aBrowseServlet = null, $aConfirmNewStandServlet = null, $aGetQRCodeServlet = null, $aRegistrationServlet = null, $aStandServlet = null, $aStartServlet = null, $aVoteServlet = null, $aAdminBrowseServlet = null, $aAdminEditStandServlet = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aBrowseServlet == null || $aBrowseServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aBrowseServlet");
    }
    $this->browseServlet = $aBrowseServlet;
    if ($aConfirmNewStandServlet == null || $aConfirmNewStandServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aConfirmNewStandServlet");
    }
    $this->confirmNewStandServlet = $aConfirmNewStandServlet;
    if ($aGetQRCodeServlet == null || $aGetQRCodeServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aGetQRCodeServlet");
    }
    $this->getQRCodeServlet = $aGetQRCodeServlet;
    if ($aRegistrationServlet == null || $aRegistrationServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aRegistrationServlet");
    }
    $this->registrationServlet = $aRegistrationServlet;
    if ($aStandServlet == null || $aStandServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aStandServlet");
    }
    $this->standServlet = $aStandServlet;
    if ($aStartServlet == null || $aStartServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aStartServlet");
    }
    $this->startServlet = $aStartServlet;
    if ($aVoteServlet == null || $aVoteServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aVoteServlet");
    }
    $this->voteServlet = $aVoteServlet;
    if ($aAdminBrowseServlet == null || $aAdminBrowseServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aAdminBrowseServlet");
    }
    $this->adminBrowseServlet = $aAdminBrowseServlet;
    if ($aAdminEditStandServlet == null || $aAdminEditStandServlet->getStandEAO() != null)
    {
      throw new Exception("Unable to create StandEAO due to aAdminEditStandServlet");
    }
    $this->adminEditStandServlet = $aAdminEditStandServlet;
  }
  public static function newInstance($aInstituteEAOForBrowseServlet, $aStudyEAOForBrowseServlet, $aExpoEAOForRegistrationServlet, $aStudyEAOForRegistrationServlet, $aVoteEAOForStandServlet, $aTimeoutForStartServlet, $aAdminEAOForStartServlet, $aExpoEAOForStartServlet, $aVoteEAOForVoteServlet, $aExpoForVoteServlet, $aInstituteEAOForAdminBrowseServlet, $aStudyEAOForAdminBrowseServlet, $aInstituteEAOForAdminEditStandServlet, $aStudyEAOForAdminEditStandServlet)
  {
    $thisInstance = new StandEAO();
    $thisInstance->browseServlet = new BrowseServlet($aInstituteEAOForBrowseServlet, $aStudyEAOForBrowseServlet, $thisInstance);
    $thisInstance->confirmNewStandServlet = new ConfirmNewStandServlet($thisInstance);
    $thisInstance->getQRCodeServlet = new GetQRCodeServlet($thisInstance);
    $thisInstance->registrationServlet = new RegistrationServlet($thisInstance, $aExpoEAOForRegistrationServlet, $aStudyEAOForRegistrationServlet);
    $thisInstance->standServlet = new StandServlet($thisInstance, $aVoteEAOForStandServlet);
    $thisInstance->startServlet = new StartServlet($aTimeoutForStartServlet, $aAdminEAOForStartServlet, $thisInstance, $aExpoEAOForStartServlet);
    $thisInstance->voteServlet = new VoteServlet($aVoteEAOForVoteServlet, $thisInstance, $aExpoForVoteServlet);
    $thisInstance->adminBrowseServlet = new AdminBrowseServlet($aInstituteEAOForAdminBrowseServlet, $thisInstance, $aStudyEAOForAdminBrowseServlet);
    $thisInstance->adminEditStandServlet = new AdminEditStandServlet($aInstituteEAOForAdminEditStandServlet, $aStudyEAOForAdminEditStandServlet, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getBrowseServlet()
  {
    return $this->browseServlet;
  }

  public function getConfirmNewStandServlet()
  {
    return $this->confirmNewStandServlet;
  }

  public function getGetQRCodeServlet()
  {
    return $this->getQRCodeServlet;
  }

  public function getRegistrationServlet()
  {
    return $this->registrationServlet;
  }

  public function getStandServlet()
  {
    return $this->standServlet;
  }

  public function getStartServlet()
  {
    return $this->startServlet;
  }

  public function getVoteServlet()
  {
    return $this->voteServlet;
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
    $existingConfirmNewStandServlet = $this->confirmNewStandServlet;
    $this->confirmNewStandServlet = null;
    if ($existingConfirmNewStandServlet != null)
    {
      $existingConfirmNewStandServlet->delete();
    }
    $existingGetQRCodeServlet = $this->getQRCodeServlet;
    $this->getQRCodeServlet = null;
    if ($existingGetQRCodeServlet != null)
    {
      $existingGetQRCodeServlet->delete();
    }
    $existingRegistrationServlet = $this->registrationServlet;
    $this->registrationServlet = null;
    if ($existingRegistrationServlet != null)
    {
      $existingRegistrationServlet->delete();
    }
    $existingStandServlet = $this->standServlet;
    $this->standServlet = null;
    if ($existingStandServlet != null)
    {
      $existingStandServlet->delete();
    }
    $existingStartServlet = $this->startServlet;
    $this->startServlet = null;
    if ($existingStartServlet != null)
    {
      $existingStartServlet->delete();
    }
    $existingVoteServlet = $this->voteServlet;
    $this->voteServlet = null;
    if ($existingVoteServlet != null)
    {
      $existingVoteServlet->delete();
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