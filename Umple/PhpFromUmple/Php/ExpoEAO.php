<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class ExpoEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ExpoEAO Associations
  private $newVisitorServlet;
  private $registrationServlet;
  private $startServlet;
  private $adminServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNewVisitorServlet = null, $aRegistrationServlet = null, $aStartServlet = null, $aAdminServlet = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aNewVisitorServlet == null || $aNewVisitorServlet->getExpoEAO() != null)
    {
      throw new Exception("Unable to create ExpoEAO due to aNewVisitorServlet");
    }
    $this->newVisitorServlet = $aNewVisitorServlet;
    if ($aRegistrationServlet == null || $aRegistrationServlet->getExpoEAO() != null)
    {
      throw new Exception("Unable to create ExpoEAO due to aRegistrationServlet");
    }
    $this->registrationServlet = $aRegistrationServlet;
    if ($aStartServlet == null || $aStartServlet->getExpoEAO() != null)
    {
      throw new Exception("Unable to create ExpoEAO due to aStartServlet");
    }
    $this->startServlet = $aStartServlet;
    if ($aAdminServlet == null || $aAdminServlet->getExpoEAO() != null)
    {
      throw new Exception("Unable to create ExpoEAO due to aAdminServlet");
    }
    $this->adminServlet = $aAdminServlet;
  }
  public static function newInstance($aVisitorEAOForNewVisitorServlet, $aStandEAOForRegistrationServlet, $aStudyEAOForRegistrationServlet, $aTimeoutForStartServlet, $aAdminEAOForStartServlet, $aStandEAOForStartServlet, $aAdminEAOForAdminServlet)
  {
    $thisInstance = new ExpoEAO();
    $thisInstance->newVisitorServlet = new NewVisitorServlet($aVisitorEAOForNewVisitorServlet, $thisInstance);
    $thisInstance->registrationServlet = new RegistrationServlet($aStandEAOForRegistrationServlet, $thisInstance, $aStudyEAOForRegistrationServlet);
    $thisInstance->startServlet = new StartServlet($aTimeoutForStartServlet, $aAdminEAOForStartServlet, $aStandEAOForStartServlet, $thisInstance);
    $thisInstance->adminServlet = new AdminServlet($aAdminEAOForAdminServlet, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getNewVisitorServlet()
  {
    return $this->newVisitorServlet;
  }

  public function getRegistrationServlet()
  {
    return $this->registrationServlet;
  }

  public function getStartServlet()
  {
    return $this->startServlet;
  }

  public function getAdminServlet()
  {
    return $this->adminServlet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingNewVisitorServlet = $this->newVisitorServlet;
    $this->newVisitorServlet = null;
    if ($existingNewVisitorServlet != null)
    {
      $existingNewVisitorServlet->delete();
    }
    $existingRegistrationServlet = $this->registrationServlet;
    $this->registrationServlet = null;
    if ($existingRegistrationServlet != null)
    {
      $existingRegistrationServlet->delete();
    }
    $existingStartServlet = $this->startServlet;
    $this->startServlet = null;
    if ($existingStartServlet != null)
    {
      $existingStartServlet->delete();
    }
    $existingAdminServlet = $this->adminServlet;
    $this->adminServlet = null;
    if ($existingAdminServlet != null)
    {
      $existingAdminServlet->delete();
    }
  }

}
?>