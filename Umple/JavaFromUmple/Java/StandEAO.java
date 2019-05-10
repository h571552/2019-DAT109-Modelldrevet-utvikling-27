/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 4 "model.ump"
// line 305 "model.ump"
public class StandEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandEAO Associations
  private BrowseServlet browseServlet;
  private ConfirmNewStandServlet confirmNewStandServlet;
  private GetQRCodeServlet getQRCodeServlet;
  private RegistrationServlet registrationServlet;
  private StandServlet standServlet;
  private StartServlet startServlet;
  private VoteServlet voteServlet;
  private AdminBrowseServlet adminBrowseServlet;
  private AdminEditStandServlet adminEditStandServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StandEAO(BrowseServlet aBrowseServlet, ConfirmNewStandServlet aConfirmNewStandServlet, GetQRCodeServlet aGetQRCodeServlet, RegistrationServlet aRegistrationServlet, StandServlet aStandServlet, StartServlet aStartServlet, VoteServlet aVoteServlet, AdminBrowseServlet aAdminBrowseServlet, AdminEditStandServlet aAdminEditStandServlet)
  {
    if (aBrowseServlet == null || aBrowseServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aBrowseServlet");
    }
    browseServlet = aBrowseServlet;
    if (aConfirmNewStandServlet == null || aConfirmNewStandServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aConfirmNewStandServlet");
    }
    confirmNewStandServlet = aConfirmNewStandServlet;
    if (aGetQRCodeServlet == null || aGetQRCodeServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aGetQRCodeServlet");
    }
    getQRCodeServlet = aGetQRCodeServlet;
    if (aRegistrationServlet == null || aRegistrationServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aRegistrationServlet");
    }
    registrationServlet = aRegistrationServlet;
    if (aStandServlet == null || aStandServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aStandServlet");
    }
    standServlet = aStandServlet;
    if (aStartServlet == null || aStartServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aStartServlet");
    }
    startServlet = aStartServlet;
    if (aVoteServlet == null || aVoteServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aVoteServlet");
    }
    voteServlet = aVoteServlet;
    if (aAdminBrowseServlet == null || aAdminBrowseServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aAdminBrowseServlet");
    }
    adminBrowseServlet = aAdminBrowseServlet;
    if (aAdminEditStandServlet == null || aAdminEditStandServlet.getStandEAO() != null)
    {
      throw new RuntimeException("Unable to create StandEAO due to aAdminEditStandServlet");
    }
    adminEditStandServlet = aAdminEditStandServlet;
  }

  public StandEAO(InstituteEAO aInstituteEAOForBrowseServlet, StudyEAO aStudyEAOForBrowseServlet, ExpoEAO aExpoEAOForRegistrationServlet, StudyEAO aStudyEAOForRegistrationServlet, VoteEAO aVoteEAOForStandServlet, int aTimeoutForStartServlet, AdminEAO aAdminEAOForStartServlet, ExpoEAO aExpoEAOForStartServlet, VoteEAO aVoteEAOForVoteServlet, Expo aExpoForVoteServlet, InstituteEAO aInstituteEAOForAdminBrowseServlet, StudyEAO aStudyEAOForAdminBrowseServlet, InstituteEAO aInstituteEAOForAdminEditStandServlet, StudyEAO aStudyEAOForAdminEditStandServlet)
  {
    browseServlet = new BrowseServlet(aInstituteEAOForBrowseServlet, aStudyEAOForBrowseServlet, this);
    confirmNewStandServlet = new ConfirmNewStandServlet(this);
    getQRCodeServlet = new GetQRCodeServlet(this);
    registrationServlet = new RegistrationServlet(this, aExpoEAOForRegistrationServlet, aStudyEAOForRegistrationServlet);
    standServlet = new StandServlet(this, aVoteEAOForStandServlet);
    startServlet = new StartServlet(aTimeoutForStartServlet, aAdminEAOForStartServlet, this, aExpoEAOForStartServlet);
    voteServlet = new VoteServlet(aVoteEAOForVoteServlet, this, aExpoForVoteServlet);
    adminBrowseServlet = new AdminBrowseServlet(aInstituteEAOForAdminBrowseServlet, this, aStudyEAOForAdminBrowseServlet);
    adminEditStandServlet = new AdminEditStandServlet(aInstituteEAOForAdminEditStandServlet, aStudyEAOForAdminEditStandServlet, this);
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
  public ConfirmNewStandServlet getConfirmNewStandServlet()
  {
    return confirmNewStandServlet;
  }
  /* Code from template association_GetOne */
  public GetQRCodeServlet getGetQRCodeServlet()
  {
    return getQRCodeServlet;
  }
  /* Code from template association_GetOne */
  public RegistrationServlet getRegistrationServlet()
  {
    return registrationServlet;
  }
  /* Code from template association_GetOne */
  public StandServlet getStandServlet()
  {
    return standServlet;
  }
  /* Code from template association_GetOne */
  public StartServlet getStartServlet()
  {
    return startServlet;
  }
  /* Code from template association_GetOne */
  public VoteServlet getVoteServlet()
  {
    return voteServlet;
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
    ConfirmNewStandServlet existingConfirmNewStandServlet = confirmNewStandServlet;
    confirmNewStandServlet = null;
    if (existingConfirmNewStandServlet != null)
    {
      existingConfirmNewStandServlet.delete();
    }
    GetQRCodeServlet existingGetQRCodeServlet = getQRCodeServlet;
    getQRCodeServlet = null;
    if (existingGetQRCodeServlet != null)
    {
      existingGetQRCodeServlet.delete();
    }
    RegistrationServlet existingRegistrationServlet = registrationServlet;
    registrationServlet = null;
    if (existingRegistrationServlet != null)
    {
      existingRegistrationServlet.delete();
    }
    StandServlet existingStandServlet = standServlet;
    standServlet = null;
    if (existingStandServlet != null)
    {
      existingStandServlet.delete();
    }
    StartServlet existingStartServlet = startServlet;
    startServlet = null;
    if (existingStartServlet != null)
    {
      existingStartServlet.delete();
    }
    VoteServlet existingVoteServlet = voteServlet;
    voteServlet = null;
    if (existingVoteServlet != null)
    {
      existingVoteServlet.delete();
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