<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class VerificationServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VerificationServlet Associations
  private $visitorEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aVisitorEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aVisitorEAO == null || $aVisitorEAO->getVerificationServlet() != null)
    {
      throw new Exception("Unable to create VerificationServlet due to aVisitorEAO");
    }
    $this->visitorEAO = $aVisitorEAO;
  }
  public static function newInstance($aNewVisitorServletForVisitorEAO)
  {
    $thisInstance = new VerificationServlet();
    $thisInstance->visitorEAO = new VisitorEAO($aNewVisitorServletForVisitorEAO, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getVisitorEAO()
  {
    return $this->visitorEAO;
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
  }

}
?>