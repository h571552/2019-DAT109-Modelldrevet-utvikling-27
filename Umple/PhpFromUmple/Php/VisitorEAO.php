<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class VisitorEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VisitorEAO Associations
  private $newVisitorServlet;
  private $verificationServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aNewVisitorServlet = null, $aVerificationServlet = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aNewVisitorServlet == null || $aNewVisitorServlet->getVisitorEAO() != null)
    {
      throw new Exception("Unable to create VisitorEAO due to aNewVisitorServlet");
    }
    $this->newVisitorServlet = $aNewVisitorServlet;
    if ($aVerificationServlet == null || $aVerificationServlet->getVisitorEAO() != null)
    {
      throw new Exception("Unable to create VisitorEAO due to aVerificationServlet");
    }
    $this->verificationServlet = $aVerificationServlet;
  }
  public static function newInstance($aExpoEAOForNewVisitorServlet)
  {
    $thisInstance = new VisitorEAO();
    $thisInstance->newVisitorServlet = new NewVisitorServlet($thisInstance, $aExpoEAOForNewVisitorServlet);
    $thisInstance->verificationServlet = new VerificationServlet($thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getNewVisitorServlet()
  {
    return $this->newVisitorServlet;
  }

  public function getVerificationServlet()
  {
    return $this->verificationServlet;
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
    $existingVerificationServlet = $this->verificationServlet;
    $this->verificationServlet = null;
    if ($existingVerificationServlet != null)
    {
      $existingVerificationServlet->delete();
    }
  }

}
?>