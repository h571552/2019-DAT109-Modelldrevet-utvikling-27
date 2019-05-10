<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class Admin
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Admin Attributes
  private $username;
  private $hashedPassword;

  //Admin Associations
  private $adminEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aUsername, $aHashedPassword, $aAdminEAO)
  {
    $this->username = $aUsername;
    $this->hashedPassword = $aHashedPassword;
    $didAddAdminEAO = $this->setAdminEAO($aAdminEAO);
    if (!$didAddAdminEAO)
    {
      throw new Exception("Unable to create admin due to adminEAO");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setUsername($aUsername)
  {
    $wasSet = false;
    $this->username = $aUsername;
    $wasSet = true;
    return $wasSet;
  }

  public function setHashedPassword($aHashedPassword)
  {
    $wasSet = false;
    $this->hashedPassword = $aHashedPassword;
    $wasSet = true;
    return $wasSet;
  }

  public function getUsername()
  {
    return $this->username;
  }

  public function getHashedPassword()
  {
    return $this->hashedPassword;
  }

  public function getAdminEAO()
  {
    return $this->adminEAO;
  }

  public function setAdminEAO($aAdminEAO)
  {
    $wasSet = false;
    if ($aAdminEAO == null)
    {
      return $wasSet;
    }
    
    $existingAdminEAO = $this->adminEAO;
    $this->adminEAO = $aAdminEAO;
    if ($existingAdminEAO != null && $existingAdminEAO != $aAdminEAO)
    {
      $existingAdminEAO->removeAdmin($this);
    }
    $this->adminEAO->addAdmin($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderAdminEAO = $this->adminEAO;
    $this->adminEAO = null;
    $placeholderAdminEAO->removeAdmin($this);
  }

}
?>