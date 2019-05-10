<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class NewVisitorServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NewVisitorServlet Associations
  private $visitorEAO;
  private $expoEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aVisitorEAO = null, $aExpoEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aVisitorEAO == null || $aVisitorEAO->getNewVisitorServlet() != null)
    {
      throw new Exception("Unable to create NewVisitorServlet due to aVisitorEAO");
    }
    $this->visitorEAO = $aVisitorEAO;
    if ($aExpoEAO == null || $aExpoEAO->getNewVisitorServlet() != null)
    {
      throw new Exception("Unable to create NewVisitorServlet due to aExpoEAO");
    }
    $this->expoEAO = $aExpoEAO;
  }
  public static function newInstance($aVerificationServletForVisitorEAO, $aRegistrationServletForExpoEAO, $aStartServletForExpoEAO, $aAdminServletForExpoEAO)
  {
    $thisInstance = new NewVisitorServlet();
    $thisInstance->visitorEAO = new VisitorEAO($thisInstance, $aVerificationServletForVisitorEAO);
    $thisInstance->expoEAO = new ExpoEAO($thisInstance, $aRegistrationServletForExpoEAO, $aStartServletForExpoEAO, $aAdminServletForExpoEAO);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getVisitorEAO()
  {
    return $this->visitorEAO;
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
    $existingVisitorEAO = $this->visitorEAO;
    $this->visitorEAO = null;
    if ($existingVisitorEAO != null)
    {
      $existingVisitorEAO->delete();
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