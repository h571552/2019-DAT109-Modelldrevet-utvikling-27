<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class VoteServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VoteServlet Associations
  private $voteEAO;
  private $standEAO;
  private $expo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aVoteEAO = null, $aStandEAO = null, $aExpo = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aVoteEAO == null || $aVoteEAO->getVoteServlet() != null)
    {
      throw new Exception("Unable to create VoteServlet due to aVoteEAO");
    }
    $this->voteEAO = $aVoteEAO;
    if ($aStandEAO == null || $aStandEAO->getVoteServlet() != null)
    {
      throw new Exception("Unable to create VoteServlet due to aStandEAO");
    }
    $this->standEAO = $aStandEAO;
    if ($aExpo == null || $aExpo->getVoteServlet() != null)
    {
      throw new Exception("Unable to create VoteServlet due to aExpo");
    }
    $this->expo = $aExpo;
  }
  public static function newInstance($aResultServletForVoteEAO, $aStandServletForVoteEAO, $aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO, $aStandForExpo, $aResultServletForExpo)
  {
    $thisInstance = new VoteServlet();
    $thisInstance->voteEAO = new VoteEAO($aResultServletForVoteEAO, $aStandServletForVoteEAO, $thisInstance);
    $thisInstance->standEAO = new StandEAO($aBrowseServletForStandEAO, $aConfirmNewStandServletForStandEAO, $aGetQRCodeServletForStandEAO, $aRegistrationServletForStandEAO, $aStandServletForStandEAO, $aStartServletForStandEAO, $thisInstance, $aAdminBrowseServletForStandEAO, $aAdminEditStandServletForStandEAO);
    $thisInstance->expo = new Expo($aStandForExpo, $aResultServletForExpo, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getVoteEAO()
  {
    return $this->voteEAO;
  }

  public function getStandEAO()
  {
    return $this->standEAO;
  }

  public function getExpo()
  {
    return $this->expo;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingVoteEAO = $this->voteEAO;
    $this->voteEAO = null;
    if ($existingVoteEAO != null)
    {
      $existingVoteEAO->delete();
    }
    $existingStandEAO = $this->standEAO;
    $this->standEAO = null;
    if ($existingStandEAO != null)
    {
      $existingStandEAO->delete();
    }
    $existingExpo = $this->expo;
    $this->expo = null;
    if ($existingExpo != null)
    {
      $existingExpo->delete();
    }
  }

}
?>