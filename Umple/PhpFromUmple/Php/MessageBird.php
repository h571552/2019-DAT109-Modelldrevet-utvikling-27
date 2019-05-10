<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/

class MessageBird
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MessageBird Attributes
  private $API_KEY;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aAPI_KEY)
  {
    $this->API_KEY = $aAPI_KEY;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setAPI_KEY($aAPI_KEY)
  {
    $wasSet = false;
    $this->API_KEY = $aAPI_KEY;
    $wasSet = true;
    return $wasSet;
  }

  public function getAPI_KEY()
  {
    return $this->API_KEY;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>