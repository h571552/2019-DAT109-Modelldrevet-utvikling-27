<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class Vote
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vote Attributes
  private $voteId;
  private $voteValue;

  //Vote Associations
  private $stand;
  private $visitor;
  private $result;
  private $standResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aVoteId, $aVoteValue, $aStand, $aVisitor, $aResult, $aStandResult)
  {
    $this->voteId = $aVoteId;
    $this->voteValue = $aVoteValue;
    $didAddStand = $this->setStand($aStand);
    if (!$didAddStand)
    {
      throw new Exception("Unable to create vote due to stand");
    }
    $didAddVisitor = $this->setVisitor($aVisitor);
    if (!$didAddVisitor)
    {
      throw new Exception("Unable to create vote due to visitor");
    }
    $didAddResult = $this->setResult($aResult);
    if (!$didAddResult)
    {
      throw new Exception("Unable to create vote due to result");
    }
    $didAddStandResult = $this->setStandResult($aStandResult);
    if (!$didAddStandResult)
    {
      throw new Exception("Unable to create vote due to standResult");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setVoteId($aVoteId)
  {
    $wasSet = false;
    $this->voteId = $aVoteId;
    $wasSet = true;
    return $wasSet;
  }

  public function setVoteValue($aVoteValue)
  {
    $wasSet = false;
    $this->voteValue = $aVoteValue;
    $wasSet = true;
    return $wasSet;
  }

  public function getVoteId()
  {
    return $this->voteId;
  }

  public function getVoteValue()
  {
    return $this->voteValue;
  }

  public function getStand()
  {
    return $this->stand;
  }

  public function getVisitor()
  {
    return $this->visitor;
  }

  public function getResult()
  {
    return $this->result;
  }

  public function getStandResult()
  {
    return $this->standResult;
  }

  public function setStand($aStand)
  {
    $wasSet = false;
    if ($aStand == null)
    {
      return $wasSet;
    }
    
    $existingStand = $this->stand;
    $this->stand = $aStand;
    if ($existingStand != null && $existingStand != $aStand)
    {
      $existingStand->removeVote($this);
    }
    $this->stand->addVote($this);
    $wasSet = true;
    return $wasSet;
  }

  public function setVisitor($aVisitor)
  {
    $wasSet = false;
    if ($aVisitor == null)
    {
      return $wasSet;
    }
    
    $existingVisitor = $this->visitor;
    $this->visitor = $aVisitor;
    if ($existingVisitor != null && $existingVisitor != $aVisitor)
    {
      $existingVisitor->removeVote($this);
    }
    $this->visitor->addVote($this);
    $wasSet = true;
    return $wasSet;
  }

  public function setResult($aResult)
  {
    $wasSet = false;
    if ($aResult == null)
    {
      return $wasSet;
    }
    
    $existingResult = $this->result;
    $this->result = $aResult;
    if ($existingResult != null && $existingResult != $aResult)
    {
      $existingResult->removeVote($this);
    }
    $this->result->addVote($this);
    $wasSet = true;
    return $wasSet;
  }

  public function setStandResult($aStandResult)
  {
    $wasSet = false;
    if ($aStandResult == null)
    {
      return $wasSet;
    }
    
    $existingStandResult = $this->standResult;
    $this->standResult = $aStandResult;
    if ($existingStandResult != null && $existingStandResult != $aStandResult)
    {
      $existingStandResult->removeVote($this);
    }
    $this->standResult->addVote($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderStand = $this->stand;
    $this->stand = null;
    $placeholderStand->removeVote($this);
    $placeholderVisitor = $this->visitor;
    $this->visitor = null;
    $placeholderVisitor->removeVote($this);
    $placeholderResult = $this->result;
    $this->result = null;
    $placeholderResult->removeVote($this);
    $placeholderStandResult = $this->standResult;
    $this->standResult = null;
    $placeholderStandResult->removeVote($this);
  }

}
?>