<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class InstituteEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //InstituteEAO Associations
  private $browseServlet;
  private $resultServlet;
  private $adminBrowseServlet;
  private $adminEditStandServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aBrowseServlet = null, $aResultServlet = null, $aAdminBrowseServlet = null, $aAdminEditStandServlet = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aBrowseServlet == null || $aBrowseServlet->getInstituteEAO() != null)
    {
      throw new Exception("Unable to create InstituteEAO due to aBrowseServlet");
    }
    $this->browseServlet = $aBrowseServlet;
    if ($aResultServlet == null || $aResultServlet->getInstituteEAO() != null)
    {
      throw new Exception("Unable to create InstituteEAO due to aResultServlet");
    }
    $this->resultServlet = $aResultServlet;
    if ($aAdminBrowseServlet == null || $aAdminBrowseServlet->getInstituteEAO() != null)
    {
      throw new Exception("Unable to create InstituteEAO due to aAdminBrowseServlet");
    }
    $this->adminBrowseServlet = $aAdminBrowseServlet;
    if ($aAdminEditStandServlet == null || $aAdminEditStandServlet->getInstituteEAO() != null)
    {
      throw new Exception("Unable to create InstituteEAO due to aAdminEditStandServlet");
    }
    $this->adminEditStandServlet = $aAdminEditStandServlet;
  }
  public static function newInstance($aStudyEAOForBrowseServlet, $aStandEAOForBrowseServlet, $aVoteEAOForResultServlet, $aExpoForResultServlet, $aStandEAOForAdminBrowseServlet, $aStudyEAOForAdminBrowseServlet, $aStudyEAOForAdminEditStandServlet, $aStandEAOForAdminEditStandServlet)
  {
    $thisInstance = new InstituteEAO();
    $thisInstance->browseServlet = new BrowseServlet($thisInstance, $aStudyEAOForBrowseServlet, $aStandEAOForBrowseServlet);
    $thisInstance->resultServlet = new ResultServlet($aVoteEAOForResultServlet, $thisInstance, $aExpoForResultServlet);
    $thisInstance->adminBrowseServlet = new AdminBrowseServlet($thisInstance, $aStandEAOForAdminBrowseServlet, $aStudyEAOForAdminBrowseServlet);
    $thisInstance->adminEditStandServlet = new AdminEditStandServlet($thisInstance, $aStudyEAOForAdminEditStandServlet, $aStandEAOForAdminEditStandServlet);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getBrowseServlet()
  {
    return $this->browseServlet;
  }

  public function getResultServlet()
  {
    return $this->resultServlet;
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
    $existingResultServlet = $this->resultServlet;
    $this->resultServlet = null;
    if ($existingResultServlet != null)
    {
      $existingResultServlet->delete();
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