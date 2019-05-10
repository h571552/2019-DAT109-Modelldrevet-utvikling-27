<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class StandServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandServlet Associations
  private $standEAO;
  private $voteEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStandEAO = null, $aVoteEAO = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aStandEAO == null || $aStandEAO->getStandServlet() != null)
    {
      throw new Exception("Unable to create StandServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
    if ($aVoteEAO == null || $aVoteEAO->getStandServlet() != null)
    {
      throw new Exception("Unable to create StandServlet due to aVoteEAO");
    }
    $this->voteEAO = $aVoteEAO;
  }
  public static function newInstance($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO, $aResultServletForVoteEAO, $aVoteServletForVoteEAO)
  {
    $thisInstance = new StandServlet();
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $thisInstance, $aStartServletForStandEAO, $aVoteServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO);
    $thisInstance->voteEAO = new VoteEAO($aResultServletForVoteEAO, $thisInstance, $aVoteServletForVoteEAO);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStandEAO()
  {
    return $this->standEAO;
  }

  public function getVoteEAO()
  {
    return $this->voteEAO;
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
    $existingVoteEAO = $this->voteEAO;
    $this->voteEAO = null;
    if ($existingVoteEAO != null)
    {
      $existingVoteEAO->delete();
    }
  }

}
?>