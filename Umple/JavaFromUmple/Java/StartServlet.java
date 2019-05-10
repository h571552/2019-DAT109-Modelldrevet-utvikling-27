/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 135 "model.ump"
// line 415 "model.ump"
public class StartServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StartServlet Attributes
  private int timeout;

  //StartServlet State Machines
  public enum Access { Default, IncorrectPassword, IncorrectStand }
  private Access access;

  //StartServlet Associations
  private AdminEAO adminEAO;
  private StandEAO standEAO;
  private ExpoEAO expoEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StartServlet(int aTimeout, AdminEAO aAdminEAO, StandEAO aStandEAO, ExpoEAO aExpoEAO)
  {
    timeout = aTimeout;
    if (aAdminEAO == null || aAdminEAO.getStartServlet() != null)
    {
      throw new RuntimeException("Unable to create StartServlet due to aAdminEAO");
    }
    adminEAO = aAdminEAO;
    if (aStandEAO == null || aStandEAO.getStartServlet() != null)
    {
      throw new RuntimeException("Unable to create StartServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
    if (aExpoEAO == null || aExpoEAO.getStartServlet() != null)
    {
      throw new RuntimeException("Unable to create StartServlet due to aExpoEAO");
    }
    expoEAO = aExpoEAO;
    setAccess(Access.Default);
  }

  public StartServlet(int aTimeout, AdminServlet aAdminServletForAdminEAO, BrowseServlet aBrowseServletForStandEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StandServlet aStandServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO, NewVisitorServlet aNewVisitorServletForExpoEAO, RegistrationServlet aRegistrationServletForExpoEAO, AdminServlet aAdminServletForExpoEAO)
  {
    timeout = aTimeout;
    adminEAO = new AdminEAO(this, aAdminServletForAdminEAO);
    standEAO = new StandEAO(aBrowseServletForStandEAO, aConfirmNewStandServletForStandEAO, aGetQRCodeServletForStandEAO, aRegistrationServletForStandEAO, aStandServletForStandEAO, this, aVoteServletForStandEAO, aAdminBrowseServletForStandEAO, aAdminEditStandServletForStandEAO);
    expoEAO = new ExpoEAO(aNewVisitorServletForExpoEAO, aRegistrationServletForExpoEAO, this, aAdminServletForExpoEAO);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTimeout(int aTimeout)
  {
    boolean wasSet = false;
    timeout = aTimeout;
    wasSet = true;
    return wasSet;
  }

  public int getTimeout()
  {
    return timeout;
  }

  public String getAccessFullName()
  {
    String answer = access.toString();
    return answer;
  }

  public Access getAccess()
  {
    return access;
  }

  private void exitAccess()
  {
    switch(access)
    {
      case Default:
        // line 141 "model.ump"
        doPost();
        break;
      case IncorrectPassword:
        // line 146 "model.ump"
        doPost();
        break;
      case IncorrectStand:
        // line 151 "model.ump"
        doPost();
        break;
    }
  }

  private void setAccess(Access aAccess)
  {
    access = aAccess;

    // entry actions and do activities
    switch(access)
    {
      case Default:
        // line 140 "model.ump"
        doGet();
        break;
      case IncorrectPassword:
        // line 145 "model.ump"
        doGet();
        break;
      case IncorrectStand:
        // line 150 "model.ump"
        doGet();
        break;
    }
  }
  /* Code from template association_GetOne */
  public AdminEAO getAdminEAO()
  {
    return adminEAO;
  }
  /* Code from template association_GetOne */
  public StandEAO getStandEAO()
  {
    return standEAO;
  }
  /* Code from template association_GetOne */
  public ExpoEAO getExpoEAO()
  {
    return expoEAO;
  }

  public void delete()
  {
    AdminEAO existingAdminEAO = adminEAO;
    adminEAO = null;
    if (existingAdminEAO != null)
    {
      existingAdminEAO.delete();
    }
    StandEAO existingStandEAO = standEAO;
    standEAO = null;
    if (existingStandEAO != null)
    {
      existingStandEAO.delete();
    }
    ExpoEAO existingExpoEAO = expoEAO;
    expoEAO = null;
    if (existingExpoEAO != null)
    {
      existingExpoEAO.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "timeout" + ":" + getTimeout()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "adminEAO = "+(getAdminEAO()!=null?Integer.toHexString(System.identityHashCode(getAdminEAO())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "standEAO = "+(getStandEAO()!=null?Integer.toHexString(System.identityHashCode(getStandEAO())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "expoEAO = "+(getExpoEAO()!=null?Integer.toHexString(System.identityHashCode(getExpoEAO())):"null");
  }
}