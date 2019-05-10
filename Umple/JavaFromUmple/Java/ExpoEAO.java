/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 2 "model.ump"
// line 295 "model.ump"
public class ExpoEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ExpoEAO Associations
  private NewVisitorServlet newVisitorServlet;
  private RegistrationServlet registrationServlet;
  private StartServlet startServlet;
  private AdminServlet adminServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ExpoEAO(NewVisitorServlet aNewVisitorServlet, RegistrationServlet aRegistrationServlet, StartServlet aStartServlet, AdminServlet aAdminServlet)
  {
    if (aNewVisitorServlet == null || aNewVisitorServlet.getExpoEAO() != null)
    {
      throw new RuntimeException("Unable to create ExpoEAO due to aNewVisitorServlet");
    }
    newVisitorServlet = aNewVisitorServlet;
    if (aRegistrationServlet == null || aRegistrationServlet.getExpoEAO() != null)
    {
      throw new RuntimeException("Unable to create ExpoEAO due to aRegistrationServlet");
    }
    registrationServlet = aRegistrationServlet;
    if (aStartServlet == null || aStartServlet.getExpoEAO() != null)
    {
      throw new RuntimeException("Unable to create ExpoEAO due to aStartServlet");
    }
    startServlet = aStartServlet;
    if (aAdminServlet == null || aAdminServlet.getExpoEAO() != null)
    {
      throw new RuntimeException("Unable to create ExpoEAO due to aAdminServlet");
    }
    adminServlet = aAdminServlet;
  }

  public ExpoEAO(VisitorEAO aVisitorEAOForNewVisitorServlet, StandEAO aStandEAOForRegistrationServlet, StudyEAO aStudyEAOForRegistrationServlet, int aTimeoutForStartServlet, AdminEAO aAdminEAOForStartServlet, StandEAO aStandEAOForStartServlet, AdminEAO aAdminEAOForAdminServlet)
  {
    newVisitorServlet = new NewVisitorServlet(aVisitorEAOForNewVisitorServlet, this);
    registrationServlet = new RegistrationServlet(aStandEAOForRegistrationServlet, this, aStudyEAOForRegistrationServlet);
    startServlet = new StartServlet(aTimeoutForStartServlet, aAdminEAOForStartServlet, aStandEAOForStartServlet, this);
    adminServlet = new AdminServlet(aAdminEAOForAdminServlet, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public NewVisitorServlet getNewVisitorServlet()
  {
    return newVisitorServlet;
  }
  /* Code from template association_GetOne */
  public RegistrationServlet getRegistrationServlet()
  {
    return registrationServlet;
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

  public void delete()
  {
    NewVisitorServlet existingNewVisitorServlet = newVisitorServlet;
    newVisitorServlet = null;
    if (existingNewVisitorServlet != null)
    {
      existingNewVisitorServlet.delete();
    }
    RegistrationServlet existingRegistrationServlet = registrationServlet;
    registrationServlet = null;
    if (existingRegistrationServlet != null)
    {
      existingRegistrationServlet.delete();
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