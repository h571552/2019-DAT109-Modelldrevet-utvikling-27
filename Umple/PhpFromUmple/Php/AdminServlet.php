<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class AdminServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminServlet State Machines
  private static $AccessDefault = 1;
  private static $AccessRegistrationStands = 2;
  private static $AccessRegistrationVotes = 3;
  private static $AccessRegistrationSMS = 4;
  private $Access;

  //AdminServlet Associations
  private $adminEAO;
  private $expoEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aAdminEAO = null, $aExpoEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aAdminEAO == null || $aAdminEAO->getAdminServlet() != null)
    {
      throw new Exception("Unable to create AdminServlet due to aAdminEAO");
    }
    $this->adminEAO = $aAdminEAO;
    if ($aExpoEAO == null || $aExpoEAO->getAdminServlet() != null)
    {
      throw new Exception("Unable to create AdminServlet due to aExpoEAO");
    }
    $this->expoEAO = $aExpoEAO;
    $this->setAccess(self::$AccessDefault);
  }
  public static function newInstance($aStartServletForAdminEAO, $aNewVisitorServletForExpoEAO, $aRegistrationServletForExpoEAO, $aStartServletForExpoEAO)
  {
    $thisInstance = new AdminServlet();
    $thisInstance->adminEAO = new AdminEAO($aStartServletForAdminEAO, $thisInstance);
    $thisInstance->expoEAO = new ExpoEAO($aNewVisitorServletForExpoEAO, $aRegistrationServletForExpoEAO, $aStartServletForExpoEAO, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getAccessFullName()
  {
    $answer = $this->getAccess();
    return $answer;
  }

  public function getAccess()
  {
    if ($this->Access == self::$AccessDefault) { return "AccessDefault"; }
    elseif ($this->Access == self::$AccessRegistrationStands) { return "AccessRegistrationStands"; }
    elseif ($this->Access == self::$AccessRegistrationVotes) { return "AccessRegistrationVotes"; }
    elseif ($this->Access == self::$AccessRegistrationSMS) { return "AccessRegistrationSMS"; }
    return null;
  }

  private function exitAccess()
  {
    if ($this->Access == self::$AccessDefault)
    {
      doPost();
    }
    elseif ($this->Access == self::$AccessRegistrationStands)
    {
      doPost();
    }
    elseif ($this->Access == self::$AccessRegistrationVotes)
    {
      doPost();
    }
    elseif ($this->Access == self::$AccessRegistrationSMS)
    {
      doPost();
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
    elseif ($this->Access == self::$AccessRegistrationStands)
    {
      doGet();
    }
    elseif ($this->Access == self::$AccessRegistrationVotes)
    {
      doGet();
    }
    elseif ($this->Access == self::$AccessRegistrationSMS)
    {
      doGet();
      doGet();
    }
  }

  public function getAdminEAO()
  {
    return $this->adminEAO;
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
    $existingExpoEAO = $this->expoEAO;
    $this->expoEAO = null;
    if ($existingExpoEAO != null)
    {
      $existingExpoEAO->delete();
    }
  }

}
?>