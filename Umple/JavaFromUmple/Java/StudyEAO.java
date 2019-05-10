/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 5 "model.ump"
// line 310 "model.ump"
public class StudyEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudyEAO Associations
  private BrowseServlet browseServlet;
  private RegistrationServlet registrationServlet;
  private AdminBrowseServlet adminBrowseServlet;
  private AdminEditStandServlet adminEditStandServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudyEAO(BrowseServlet aBrowseServlet, RegistrationServlet aRegistrationServlet, AdminBrowseServlet aAdminBrowseServlet, AdminEditStandServlet aAdminEditStandServlet)
  {
    if (aBrowseServlet == null || aBrowseServlet.getStudyEAO() != null)
    {
      throw new RuntimeException("Unable to create StudyEAO due to aBrowseServlet");
    }
    browseServlet = aBrowseServlet;
    if (aRegistrationServlet == null || aRegistrationServlet.getStudyEAO() != null)
    {
      throw new RuntimeException("Unable to create StudyEAO due to aRegistrationServlet");
    }
    registrationServlet = aRegistrationServlet;
    if (aAdminBrowseServlet == null || aAdminBrowseServlet.getStudyEAO() != null)
    {
      throw new RuntimeException("Unable to create StudyEAO due to aAdminBrowseServlet");
    }
    adminBrowseServlet = aAdminBrowseServlet;
    if (aAdminEditStandServlet == null || aAdminEditStandServlet.getStudyEAO() != null)
    {
      throw new RuntimeException("Unable to create StudyEAO due to aAdminEditStandServlet");
    }
    adminEditStandServlet = aAdminEditStandServlet;
  }

  public StudyEAO(InstituteEAO aInstituteEAOForBrowseServlet, StandEAO aStandEAOForBrowseServlet, StandEAO aStandEAOForRegistrationServlet, ExpoEAO aExpoEAOForRegistrationServlet, InstituteEAO aInstituteEAOForAdminBrowseServlet, StandEAO aStandEAOForAdminBrowseServlet, InstituteEAO aInstituteEAOForAdminEditStandServlet, StandEAO aStandEAOForAdminEditStandServlet)
  {
    browseServlet = new BrowseServlet(aInstituteEAOForBrowseServlet, this, aStandEAOForBrowseServlet);
    registrationServlet = new RegistrationServlet(aStandEAOForRegistrationServlet, aExpoEAOForRegistrationServlet, this);
    adminBrowseServlet = new AdminBrowseServlet(aInstituteEAOForAdminBrowseServlet, aStandEAOForAdminBrowseServlet, this);
    adminEditStandServlet = new AdminEditStandServlet(aInstituteEAOForAdminEditStandServlet, this, aStandEAOForAdminEditStandServlet);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public BrowseServlet getBrowseServlet()
  {
    return browseServlet;
  }
  /* Code from template association_GetOne */
  public RegistrationServlet getRegistrationServlet()
  {
    return registrationServlet;
  }
  /* Code from template association_GetOne */
  public AdminBrowseServlet getAdminBrowseServlet()
  {
    return adminBrowseServlet;
  }
  /* Code from template association_GetOne */
  public AdminEditStandServlet getAdminEditStandServlet()
  {
    return adminEditStandServlet;
  }

  public void delete()
  {
    BrowseServlet existingBrowseServlet = browseServlet;
    browseServlet = null;
    if (existingBrowseServlet != null)
    {
      existingBrowseServlet.delete();
    }
    RegistrationServlet existingRegistrationServlet = registrationServlet;
    registrationServlet = null;
    if (existingRegistrationServlet != null)
    {
      existingRegistrationServlet.delete();
    }
    AdminBrowseServlet existingAdminBrowseServlet = adminBrowseServlet;
    adminBrowseServlet = null;
    if (existingAdminBrowseServlet != null)
    {
      existingAdminBrowseServlet.delete();
    }
    AdminEditStandServlet existingAdminEditStandServlet = adminEditStandServlet;
    adminEditStandServlet = null;
    if (existingAdminEditStandServlet != null)
    {
      existingAdminEditStandServlet.delete();
    }
  }

}