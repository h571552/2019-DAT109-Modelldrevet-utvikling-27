/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 275 "model.ump"
// line 490 "model.ump"
public class PasswordUtil
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PasswordUtil Attributes
  private int SALTLENGDE;
  private String PASSORD_TEGNSETT;
  private String HASH_ALGORITME;
  private int HASH_ITERATIONS;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PasswordUtil(int aSALTLENGDE, String aPASSORD_TEGNSETT, String aHASH_ALGORITME, int aHASH_ITERATIONS)
  {
    SALTLENGDE = aSALTLENGDE;
    PASSORD_TEGNSETT = aPASSORD_TEGNSETT;
    HASH_ALGORITME = aHASH_ALGORITME;
    HASH_ITERATIONS = aHASH_ITERATIONS;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSALTLENGDE(int aSALTLENGDE)
  {
    boolean wasSet = false;
    SALTLENGDE = aSALTLENGDE;
    wasSet = true;
    return wasSet;
  }

  public boolean setPASSORD_TEGNSETT(String aPASSORD_TEGNSETT)
  {
    boolean wasSet = false;
    PASSORD_TEGNSETT = aPASSORD_TEGNSETT;
    wasSet = true;
    return wasSet;
  }

  public boolean setHASH_ALGORITME(String aHASH_ALGORITME)
  {
    boolean wasSet = false;
    HASH_ALGORITME = aHASH_ALGORITME;
    wasSet = true;
    return wasSet;
  }

  public boolean setHASH_ITERATIONS(int aHASH_ITERATIONS)
  {
    boolean wasSet = false;
    HASH_ITERATIONS = aHASH_ITERATIONS;
    wasSet = true;
    return wasSet;
  }

  public int getSALTLENGDE()
  {
    return SALTLENGDE;
  }

  public String getPASSORD_TEGNSETT()
  {
    return PASSORD_TEGNSETT;
  }

  public String getHASH_ALGORITME()
  {
    return HASH_ALGORITME;
  }

  public int getHASH_ITERATIONS()
  {
    return HASH_ITERATIONS;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "SALTLENGDE" + ":" + getSALTLENGDE()+ "," +
            "PASSORD_TEGNSETT" + ":" + getPASSORD_TEGNSETT()+ "," +
            "HASH_ALGORITME" + ":" + getHASH_ALGORITME()+ "," +
            "HASH_ITERATIONS" + ":" + getHASH_ITERATIONS()+ "]";
  }
}