/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/


import java.util.*;

// line 33 "model.ump"
// line 345 "model.ump"
public class AdminEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminEAO Associations
  private List<Admin> admins;
  private StartServlet startServlet;
  private AdminServlet adminServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AdminEAO(StartServlet aStartServlet, AdminServlet aAdminServlet)
  {
    admins = new ArrayList<Admin>();
    if (aStartServlet == null || aStartServlet.getAdminEAO() != null)
    {
      throw new RuntimeException("Unable to create AdminEAO due to aStartServlet");
    }
    startServlet = aStartServlet;
    if (aAdminServlet == null || aAdminServlet.getAdminEAO() != null)
    {
      throw new RuntimeException("Unable to create AdminEAO due to aAdminServlet");
    }
    adminServlet = aAdminServlet;
  }

  public AdminEAO(int aTimeoutForStartServlet, StandEAO aStandEAOForStartServlet, ExpoEAO aExpoEAOForStartServlet, ExpoEAO aExpoEAOForAdminServlet)
  {
    admins = new ArrayList<Admin>();
    startServlet = new StartServlet(aTimeoutForStartServlet, this, aStandEAOForStartServlet, aExpoEAOForStartServlet);
    adminServlet = new AdminServlet(this, aExpoEAOForAdminServlet);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Admin getAdmin(int index)
  {
    Admin aAdmin = admins.get(index);
    return aAdmin;
  }

  public List<Admin> getAdmins()
  {
    List<Admin> newAdmins = Collections.unmodifiableList(admins);
    return newAdmins;
  }

  public int numberOfAdmins()
  {
    int number = admins.size();
    return number;
  }

  public boolean hasAdmins()
  {
    boolean has = admins.size() > 0;
    return has;
  }

  public int indexOfAdmin(Admin aAdmin)
  {
    int index = admins.indexOf(aAdmin);
    return index;
  }
  /* Code from template association_GetOne */
  public StartServlet getStartServlet()
  {
    return startServlet;
  }
  /* Code from template association_GetOne */
  public AdminServlet getAdminServlet()
  {
    return adminServlet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAdmins()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Admin addAdmin(String aUsername, String aHashedPassword)
  {
    return new Admin(aUsername, aHashedPassword, this);
  }

  public boolean addAdmin(Admin aAdmin)
  {
    boolean wasAdded = false;
    if (admins.contains(aAdmin)) { return false; }
    AdminEAO existingAdminEAO = aAdmin.getAdminEAO();
    boolean isNewAdminEAO = existingAdminEAO != null && !this.equals(existingAdminEAO);
    if (isNewAdminEAO)
    {
      aAdmin.setAdminEAO(this);
    }
    else
    {
      admins.add(aAdmin);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAdmin(Admin aAdmin)
  {
    boolean wasRemoved = false;
    //Unable to remove aAdmin, as it must always have a adminEAO
    if (!this.equals(aAdmin.getAdminEAO()))
    {
      admins.remove(aAdmin);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAdminAt(Admin aAdmin, int index)
  {  
    boolean wasAdded = false;
    if(addAdmin(aAdmin))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAdmins()) { index = numberOfAdmins() - 1; }
      admins.remove(aAdmin);
      admins.add(index, aAdmin);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAdminAt(Admin aAdmin, int index)
  {
    boolean wasAdded = false;
    if(admins.contains(aAdmin))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAdmins()) { index = numberOfAdmins() - 1; }
      admins.remove(aAdmin);
      admins.add(index, aAdmin);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAdminAt(aAdmin, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=admins.size(); i > 0; i--)
    {
      Admin aAdmin = admins.get(i - 1);
      aAdmin.delete();
    }
    StartServlet existingStartServlet = startServlet;
    startServlet = null;
    if (existingStartServlet != null)
    {
      existingStartServlet.delete();
    }
    AdminServlet existingAdminServlet = adminServlet;
    adminServlet = null;
    if (existingAdminServlet != null)
    {
      existingAdminServlet.delete();
    }
  }

}