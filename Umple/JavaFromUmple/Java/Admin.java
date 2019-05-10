/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 9 "model.ump"
// line 325 "model.ump"
public class Admin
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Admin Attributes
  private String username;
  private String hashedPassword;

  //Admin Associations
  private AdminEAO adminEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Admin(String aUsername, String aHashedPassword, AdminEAO aAdminEAO)
  {
    username = aUsername;
    hashedPassword = aHashedPassword;
    boolean didAddAdminEAO = setAdminEAO(aAdminEAO);
    if (!didAddAdminEAO)
    {
      throw new RuntimeException("Unable to create admin due to adminEAO");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUsername(String aUsername)
  {
    boolean wasSet = false;
    username = aUsername;
    wasSet = true;
    return wasSet;
  }

  public boolean setHashedPassword(String aHashedPassword)
  {
    boolean wasSet = false;
    hashedPassword = aHashedPassword;
    wasSet = true;
    return wasSet;
  }

  public String getUsername()
  {
    return username;
  }

  public String getHashedPassword()
  {
    return hashedPassword;
  }
  /* Code from template association_GetOne */
  public AdminEAO getAdminEAO()
  {
    return adminEAO;
  }
  /* Code from template association_SetOneToMany */
  public boolean setAdminEAO(AdminEAO aAdminEAO)
  {
    boolean wasSet = false;
    if (aAdminEAO == null)
    {
      return wasSet;
    }

    AdminEAO existingAdminEAO = adminEAO;
    adminEAO = aAdminEAO;
    if (existingAdminEAO != null && !existingAdminEAO.equals(aAdminEAO))
    {
      existingAdminEAO.removeAdmin(this);
    }
    adminEAO.addAdmin(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    AdminEAO placeholderAdminEAO = adminEAO;
    this.adminEAO = null;
    if(placeholderAdminEAO != null)
    {
      placeholderAdminEAO.removeAdmin(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "username" + ":" + getUsername()+ "," +
            "hashedPassword" + ":" + getHashedPassword()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "adminEAO = "+(getAdminEAO()!=null?Integer.toHexString(System.identityHashCode(getAdminEAO())):"null");
  }
}