/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 3 "model.ump"
// line 300 "model.ump"
public class InstituteEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //InstituteEAO Associations
  private BrowseServlet browseServlet;
  private ResultServlet resultServlet;
  private AdminBrowseServlet adminBrowseServlet;
  private AdminEditStandServlet adminEditStandServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public InstituteEAO(BrowseServlet aBrowseServlet, ResultServlet aResultServlet, AdminBrowseServlet aAdminBrowseServlet, AdminEditStandServlet aAdminEditStandServlet)
  {
    if (aBrowseServlet == null || aBrowseServlet.getInstituteEAO() != null)
    {
      throw new RuntimeException("Unable to create InstituteEAO due to aBrowseServlet");
    }
    browseServlet = aBrowseServlet;
    if (aResultServlet == null || aResultServlet.getInstituteEAO() != null)
    {
      throw new RuntimeException("Unable to create InstituteEAO due to aResultServlet");
    }
    resultServlet = aResultServlet;
    if (aAdminBrowseServlet == null || aAdminBrowseServlet.getInstituteEAO() != null)
    {
      throw new RuntimeException("Unable to create InstituteEAO due to aAdminBrowseServlet");
    }
    adminBrowseServlet = aAdminBrowseServlet;
    if (aAdminEditStandServlet == null || aAdminEditStandServlet.getInstituteEAO() != null)
    {
      throw new RuntimeException("Unable to create InstituteEAO due to aAdminEditStandServlet");
    }
    adminEditStandServlet = aAdminEditStandServlet;
  }

  public InstituteEAO(StudyEAO aStudyEAOForBrowseServlet, StandEAO aStandEAOForBrowseServlet, VoteEAO aVoteEAOForResultServlet, Expo aExpoForResultServlet, StandEAO aStandEAOForAdminBrowseServlet, StudyEAO aStudyEAOForAdminBrowseServlet, StudyEAO aStudyEAOForAdminEditStandServlet, StandEAO aStandEAOForAdminEditStandServlet)
  {
    browseServlet = new BrowseServlet(this, aStudyEAOForBrowseServlet, aStandEAOForBrowseServlet);
    resultServlet = new ResultServlet(aVoteEAOForResultServlet, this, aExpoForResultServlet);
    adminBrowseServlet = new AdminBrowseServlet(this, aStandEAOForAdminBrowseServlet, aStudyEAOForAdminBrowseServlet);
    adminEditStandServlet = new AdminEditStandServlet(this, aStudyEAOForAdminEditStandServlet, aStandEAOForAdminEditStandServlet);
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
  public ResultServlet getResultServlet()
  {
    return resultServlet;
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
    ResultServlet existingResultServlet = resultServlet;
    resultServlet = null;
    if (existingResultServlet != null)
    {
      existingResultServlet.delete();
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