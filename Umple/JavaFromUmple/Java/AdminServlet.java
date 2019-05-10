/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 196 "model.ump"
// line 440 "model.ump"
public class AdminServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminServlet State Machines
  public enum Access { Default, RegistrationStands, RegistrationVotes, RegistrationSMS }
  private Access access;

  //AdminServlet Associations
  private AdminEAO adminEAO;
  private ExpoEAO expoEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AdminServlet(AdminEAO aAdminEAO, ExpoEAO aExpoEAO)
  {
    if (aAdminEAO == null || aAdminEAO.getAdminServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminServlet due to aAdminEAO");
    }
    adminEAO = aAdminEAO;
    if (aExpoEAO == null || aExpoEAO.getAdminServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminServlet due to aExpoEAO");
    }
    expoEAO = aExpoEAO;
    setAccess(Access.Default);
  }

  public AdminServlet(StartServlet aStartServletForAdminEAO, NewVisitorServlet aNewVisitorServletForExpoEAO, RegistrationServlet aRegistrationServletForExpoEAO, StartServlet aStartServletForExpoEAO)
  {
    adminEAO = new AdminEAO(aStartServletForAdminEAO, this);
    expoEAO = new ExpoEAO(aNewVisitorServletForExpoEAO, aRegistrationServletForExpoEAO, aStartServletForExpoEAO, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

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
        // line 203 "model.ump"
        doPost();
        break;
      case RegistrationStands:
        // line 208 "model.ump"
        doPost();
        break;
      case RegistrationVotes:
        // line 213 "model.ump"
        doPost();
        break;
      case RegistrationSMS:
        // line 218 "model.ump"
        doPost();
        // line 223 "model.ump"
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
        // line 202 "model.ump"
        doGet();
        break;
      case RegistrationStands:
        // line 207 "model.ump"
        doGet();
        break;
      case RegistrationVotes:
        // line 212 "model.ump"
        doGet();
        break;
      case RegistrationSMS:
        // line 217 "model.ump"
        doGet();
        // line 222 "model.ump"
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
    ExpoEAO existingExpoEAO = expoEAO;
    expoEAO = null;
    if (existingExpoEAO != null)
    {
      existingExpoEAO.delete();
    }
  }

}