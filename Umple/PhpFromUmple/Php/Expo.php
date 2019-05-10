<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class Expo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Expo Associations
  private $stand;
  private $resultServlet;
  private $voteServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStand = null, $aResultServlet = null, $aVoteServlet = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aStand == null || $aStand->getExpo() != null)
    {
      throw new Exception("Unable to create Expo due to aStand");
    }
    $this->stand = $aStand;
    if ($aResultServlet == null || $aResultServlet->getExpo() != null)
    {
      throw new Exception("Unable to create Expo due to aResultServlet");
    }
    $this->resultServlet = $aResultServlet;
    if ($aVoteServlet == null || $aVoteServlet->getExpo() != null)
    {
      throw new Exception("Unable to create Expo due to aVoteServlet");
    }
    $this->voteServlet = $aVoteServlet;
  }
  public static function newInstance($aStandIdForStand, $aStandNameForStand, $aAuthorsForStand, $aStudyForStand, $aStandResultForStand, $aVoteEAOForResultServlet, $aInstituteEAOForResultServlet, $aVoteEAOForVoteServlet, $aStandEAOForVoteServlet)
  {
    $thisInstance = new Expo();
    $thisInstance->stand = new Stand($aStandIdForStand, $aStandNameForStand, $aAuthorsForStand, $thisInstance, $aStudyForStand, $aStandResultForStand);
    $thisInstance->resultServlet = new ResultServlet($aVoteEAOForResultServlet, $aInstituteEAOForResultServlet, $thisInstance);
    $thisInstance->voteServlet = new VoteServlet($aVoteEAOForVoteServlet, $aStandEAOForVoteServlet, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStand()
  {
    return $this->stand;
  }

  public function getResultServlet()
  {
    return $this->resultServlet;
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
    $existingStand = $this->stand;
    $this->stand = null;
    if ($existingStand != null)
    {
      $existingStand->delete();
    }
    $existingResultServlet = $this->resultServlet;
    $this->resultServlet = null;
    if ($existingResultServlet != null)
    {
      $existingResultServlet->delete();
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