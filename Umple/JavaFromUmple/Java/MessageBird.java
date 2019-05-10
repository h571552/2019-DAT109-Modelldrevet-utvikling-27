/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 235 "model.ump"
// line 450 "model.ump"
public class MessageBird
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MessageBird Attributes
  private String API_KEY;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MessageBird(String aAPI_KEY)
  {
    API_KEY = aAPI_KEY;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAPI_KEY(String aAPI_KEY)
  {
    boolean wasSet = false;
    API_KEY = aAPI_KEY;
    wasSet = true;
    return wasSet;
  }

  public String getAPI_KEY()
  {
    return API_KEY;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "API_KEY" + ":" + getAPI_KEY()+ "]";
  }
}