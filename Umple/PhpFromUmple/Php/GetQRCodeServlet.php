<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class GetQRCodeServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GetQRCodeServlet Associations
  private $standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStandEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aStandEAO == null || $aStandEAO->getGetQRCodeServlet() != null)
    {
      throw new Exception("Unable to create GetQRCodeServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
  }
  public static function newInstance($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO)
  {
    $thisInstance = new GetQRCodeServlet();
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $thisInstance, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO);
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