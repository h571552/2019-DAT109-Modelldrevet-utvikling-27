<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class AdminEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminEAO Associations
  private $admins;
  private $startServlet;
  private $adminServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStartServlet = null, $aAdminServlet = null)
  {
    if (func_num_args() == 0) { return; }

    $this->admins = array();
    if ($aStartServlet == null || $aStartServlet->getAdminEAO() != null)
    {
      throw new Exception("Unable to create AdminEAO due to aStartServlet");
    }
    $this->startServlet = $aStartServlet;
    if ($aAdminServlet == null || $aAdminServlet->getAdminEAO() != null)
    {
      throw new Exception("Unable to create AdminEAO due to aAdminServlet");
    }
    $this->adminServlet = $aAdminServlet;
  }
  public static function newInstance($aTimeoutForStartServlet, $aStandEAOForStartServlet, $aExpoEAOForStartServlet, $aExpoEAOForAdminServlet)
  {
    $thisInstance = new AdminEAO();
    $this->admins = array();
    $thisInstance->startServlet = new StartServlet($aTimeoutForStartServlet, $thisInstance, $aStandEAOForStartServlet, $aExpoEAOForStartServlet);
    $thisInstance->adminServlet = new AdminServlet($thisInstance, $aExpoEAOForAdminServlet);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getAdmin_index($index)
  {
    $aAdmin = $this->admins[$index];
    return $aAdmin;
  }

  public function getAdmins()
  {
    $newAdmins = $this->admins;
    return $newAdmins;
  }

  public function numberOfAdmins()
  {
    $number = count($this->admins);
    return $number;
  }

  public function hasAdmins()
  {
    $has = $this->numberOfAdmins() > 0;
    return $has;
  }

  public function indexOfAdmin($aAdmin)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->admins as $admin)
    {
      if ($admin->equals($aAdmin))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getStartServlet()
  {
    return $this->startServlet;
  }

  public function getAdminServlet()
  {
    return $this->adminServlet;
  }

  public static function minimumNumberOfAdmins()
  {
    return 0;
  }

  public function addAdminVia($aUsername, $aHashedPassword)
  {
    return new Admin($aUsername, $aHashedPassword, $this);
  }

  public function addAdmin($aAdmin)
  {
    $wasAdded = false;
    if ($this->indexOfAdmin($aAdmin) !== -1) { return false; }
    $existingAdminEAO = $aAdmin->getAdminEAO();
    $isNewAdminEAO = $existingAdminEAO != null && $this !== $existingAdminEAO;
    if ($isNewAdminEAO)
    {
      $aAdmin->setAdminEAO($this);
    }
    else
    {
      $this->admins[] = $aAdmin;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeAdmin($aAdmin)
  {
    $wasRemoved = false;
    //Unable to remove aAdmin, as it must always have a adminEAO
    if ($this !== $aAdmin->getAdminEAO())
    {
      unset($this->admins[$this->indexOfAdmin($aAdmin)]);
      $this->admins = array_values($this->admins);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addAdminAt($aAdmin, $index)
  {  
    $wasAdded = false;
    if($this->addAdmin($aAdmin))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfAdmins()) { $index = $this->numberOfAdmins() - 1; }
      array_splice($this->admins, $this->indexOfAdmin($aAdmin), 1);
      array_splice($this->admins, $index, 0, array($aAdmin));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveAdminAt($aAdmin, $index)
  {
    $wasAdded = false;
    if($this->indexOfAdmin($aAdmin) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfAdmins()) { $index = $this->numberOfAdmins() - 1; }
      array_splice($this->admins, $this->indexOfAdmin($aAdmin), 1);
      array_splice($this->admins, $index, 0, array($aAdmin));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addAdminAt($aAdmin, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    foreach ($this->admins as $aAdmin)
    {
      $aAdmin->delete();
    }
    $existingStartServlet = $this->startServlet;
    $this->startServlet = null;
    if ($existingStartServlet != null)
    {
      $existingStartServlet->delete();
    }
    $existingAdminServlet = $this->adminServlet;
    $this->adminServlet = null;
    if ($existingAdminServlet != null)
    {
      $existingAdminServlet->delete();
    }
  }

}
?>