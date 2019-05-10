<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class ConfirmNewStandServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConfirmNewStandServlet Associations
  private $standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStandEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aStandEAO == null || $aStandEAO->getConfirmNewStandServlet() != null)
    {
      throw new Exception("Unable to create ConfirmNewStandServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
  }
  public static function newInstance($aBrowseServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO)
  {
    $thisInstance = new ConfirmNewStandServlet();
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $thisInstance, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStandEAO()
  {
    return $this->standEAO;
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
  }

}
?>