<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class PasswordUtil
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PasswordUtil Attributes
  private $SALTLENGDE;
  private $PASSORD_TEGNSETT;
  private $HASH_ALGORITME;
  private $HASH_ITERATIONS;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aSALTLENGDE, $aPASSORD_TEGNSETT, $aHASH_ALGORITME, $aHASH_ITERATIONS)
  {
    $this->SALTLENGDE = $aSALTLENGDE;
    $this->PASSORD_TEGNSETT = $aPASSORD_TEGNSETT;
    $this->HASH_ALGORITME = $aHASH_ALGORITME;
    $this->HASH_ITERATIONS = $aHASH_ITERATIONS;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setSALTLENGDE($aSALTLENGDE)
  {
    $wasSet = false;
    $this->SALTLENGDE = $aSALTLENGDE;
    $wasSet = true;
    return $wasSet;
  }

  public function setPASSORD_TEGNSETT($aPASSORD_TEGNSETT)
  {
    $wasSet = false;
    $this->PASSORD_TEGNSETT = $aPASSORD_TEGNSETT;
    $wasSet = true;
    return $wasSet;
  }

  public function setHASH_ALGORITME($aHASH_ALGORITME)
  {
    $wasSet = false;
    $this->HASH_ALGORITME = $aHASH_ALGORITME;
    $wasSet = true;
    return $wasSet;
  }

  public function setHASH_ITERATIONS($aHASH_ITERATIONS)
  {
    $wasSet = false;
    $this->HASH_ITERATIONS = $aHASH_ITERATIONS;
    $wasSet = true;
    return $wasSet;
  }

  public function getSALTLENGDE()
  {
    return $this->SALTLENGDE;
  }

  public function getPASSORD_TEGNSETT()
  {
    return $this->PASSORD_TEGNSETT;
  }

  public function getHASH_ALGORITME()
  {
    return $this->HASH_ALGORITME;
  }

  public function getHASH_ITERATIONS()
  {
    return $this->HASH_ITERATIONS;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>