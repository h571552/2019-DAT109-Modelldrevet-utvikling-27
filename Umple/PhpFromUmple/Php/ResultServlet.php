<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class ResultServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ResultServlet Associations
  private $voteEAO;
  private $instituteEAO;
  private $expo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aVoteEAO = null, $aInstituteEAO = null, $aExpo = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aVoteEAO == null || $aVoteEAO->getResultServlet() != null)
    {
      throw new Exception("Unable to create ResultServlet due to aVoteEAO");
    }
    $this->voteEAO = $aVoteEAO;
    if ($aInstituteEAO == null || $aInstituteEAO->getResultServlet() != null)
    {
      throw new Exception("Unable to create ResultServlet due to aInstituteEAO");
    }
    $this->instituteEAO = $aInstituteEAO;
    if ($aExpo == null || $aExpo->getResultServlet() != null)
    {
      throw new Exception("Unable to create ResultServlet due to aExpo");
    }
    $this->expo = $aExpo;
  }
  public static function newInstance($aStandServletForVoteEAO, $aVoteServletForVoteEAO, $aBrowseServletForInstituteEAO, $aAdminBrowseServletForInstituteEAO, $aAdminEditStandServletForInstituteEAO, $aStandForExpo, $aVoteServletForExpo)
  {
    $thisInstance = new ResultServlet();
    $thisInstance->voteEAO = new VoteEAO($thisInstance, $aStandServletForVoteEAO, $aVoteServletForVoteEAO);
    $thisInstance->instituteEAO = new InstituteEAO($aBrowseServletForInstituteEAO, $thisInstance, $aAdminBrowseServletForInstituteEAO, $aAdminEditStandServletForInstituteEAO);
    $thisInstance->expo = new Expo($aStandForExpo, $thisInstance, $aVoteServletForExpo);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getVoteEAO()
  {
    return $this->voteEAO;
  }

  public function getInstituteEAO()
  {
    return $this->instituteEAO;
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
    $existingInstituteEAO = $this->instituteEAO;
    $this->instituteEAO = null;
    if ($existingInstituteEAO != null)
    {
      $existingInstituteEAO->delete();
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