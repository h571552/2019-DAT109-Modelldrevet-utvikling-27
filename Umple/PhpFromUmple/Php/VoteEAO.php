<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class VoteEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VoteEAO Associations
  private $resultServlet;
  private $standServlet;
  private $voteServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aResultServlet = null, $aStandServlet = null, $aVoteServlet = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aResultServlet == null || $aResultServlet->getVoteEAO() != null)
    {
      throw new Exception("Unable to create VoteEAO due to aResultServlet");
    }
    $this->resultServlet = $aResultServlet;
    if ($aStandServlet == null || $aStandServlet->getVoteEAO() != null)
    {
      throw new Exception("Unable to create VoteEAO due to aStandServlet");
    }
    $this->standServlet = $aStandServlet;
    if ($aVoteServlet == null || $aVoteServlet->getVoteEAO() != null)
    {
      throw new Exception("Unable to create VoteEAO due to aVoteServlet");
    }
    $this->voteServlet = $aVoteServlet;
  }
  public static function newInstance($aInstituteEAOForResultServlet, $aExpoForResultServlet, $aStandEAOForStandServlet, $aStandEAOForVoteServlet, $aExpoForVoteServlet)
  {
    $thisInstance = new VoteEAO();
    $thisInstance->resultServlet = new ResultServlet($thisInstance, $aInstituteEAOForResultServlet, $aExpoForResultServlet);
    $thisInstance->standServlet = new StandServlet($aStandEAOForStandServlet, $thisInstance);
    $thisInstance->voteServlet = new VoteServlet($thisInstance, $aStandEAOForVoteServlet, $aExpoForVoteServlet);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getResultServlet()
  {
    return $this->resultServlet;
  }

  public function getStandServlet()
  {
    return $this->standServlet;
  }

  public function getVoteServlet()
  {
    return $this->voteServlet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingResultServlet = $this->resultServlet;
    $this->resultServlet = null;
    if ($existingResultServlet != null)
    {
      $existingResultServlet->delete();
    }
    $existingStandServlet = $this->standServlet;
    $this->standServlet = null;
    if ($existingStandServlet != null)
    {
      $existingStandServlet->delete();
    }
    $existingVoteServlet = $this->voteServlet;
    $this->voteServlet = null;
    if ($existingVoteServlet != null)
    {
      $existingVoteServlet->delete();
    }
  }

}
?>