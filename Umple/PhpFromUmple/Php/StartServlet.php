<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class StartServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StartServlet Attributes
  private $timeout;

  //StartServlet State Machines
  private static $AccessDefault = 1;
  private static $AccessIncorrectPassword = 2;
  private static $AccessIncorrectStand = 3;
  private $Access;

  //StartServlet Associations
  private $adminEAO;
  private $standEAO;
  private $expoEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aTimeout = null, $aAdminEAO = null, $aStandEAO = null, $aExpoEAO = null)
  {
    if (func_num_args() == 0) { return; }

    $this->timeout = $aTimeout;
    if ($aAdminEAO == null || $aAdminEAO->getStartServlet() != null)
    {
      throw new Exception("Unable to create StartServlet due to aAdminEAO");
    }
    $this->adminEAO = $aAdminEAO;
    if ($aStandEAO == null || $aStandEAO->getStartServlet() != null)
    {
      throw new Exception("Unable to create StartServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
    if ($aExpoEAO == null || $aExpoEAO->getStartServlet() != null)
    {
      throw new Exception("Unable to create StartServlet due to aExpoEAO");
    }
    $this->expoEAO = $aExpoEAO;
    $this->setAccess(self::$AccessDefault);
  }
  public static function newInstance($aTimeout, $aAdminServletForAdminEAO, $aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO, $aNewVisitorServletForExpoEAO, $aRegistrationServletForExpoEAO, $aAdminServletForExpoEAO)
  {
    $thisInstance = new StartServlet();
    $thisInstance->timeout = $aTimeout;
    $thisInstance->adminEAO = new AdminEAO($thisInstance, $aAdminServletForAdminEAO);
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $thisInstance, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO);
    $thisInstance->expoEAO = new ExpoEAO($aNewVisitorServletForExpoEAO, $aRegistrationServletForExpoEAO, $thisInstance, $aAdminServletForExpoEAO);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setTimeout($aTimeout)
  {
    $wasSet = false;
    $this->timeout = $aTimeout;
    $wasSet = true;
    return $wasSet;
  }

  public function getTimeout()
  {
    return $this->timeout;
  }

  public function getAccessFullName()
  {
    $answer = $this->getAccess();
    return $answer;
  }

  public function getAccess()
  {
    if ($this->Access == self::$AccessDefault) { return "AccessDefault"; }
    elseif ($this->Access == self::$AccessIncorrectPassword) { return "AccessIncorrectPassword"; }
    elseif ($this->Access == self::$AccessIncorrectStand) { return "AccessIncorrectStand"; }
    return null;
  }

  private function exitAccess()
  {
    if ($this->Access == self::$AccessDefault)
    {
      doPost();
    }
    elseif ($this->Access == self::$AccessIncorrectPassword)
    {
      doPost();
    }
    elseif ($this->Access == self::$AccessIncorrectStand)
    {
      doPost();
    }
  }

  private function setAccess($aAccess)
  {
    $this->Access = $aAccess;

    // entry actions and do activities
    if ($this->Access == self::$AccessDefault)
    {
      doGet();
    }
    elseif ($this->Access == self::$AccessIncorrectPassword)
    {
      doGet();
    }
    elseif ($this->Access == self::$AccessIncorrectStand)
    {
      doGet();
    }
  }

  public function getAdminEAO()
  {
    return $this->adminEAO;
  }

  public function getStandEAO()
  {
    return $this->standEAO;
  }

  public function getExpoEAO()
  {
    return $this->expoEAO;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingAdminEAO = $this->adminEAO;
    $this->adminEAO = null;
    if ($existingAdminEAO != null)
    {
      $existingAdminEAO->delete();
    }
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
  }

}
?>