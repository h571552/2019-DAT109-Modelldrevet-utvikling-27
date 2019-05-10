/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 186 "model.ump"
// line 435 "model.ump"
public class AdminEditStandServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminEditStandServlet Associations
  private InstituteEAO instituteEAO;
  private StudyEAO studyEAO;
  private StandEAO standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AdminEditStandServlet(InstituteEAO aInstituteEAO, StudyEAO aStudyEAO, StandEAO aStandEAO)
  {
    if (aInstituteEAO == null || aInstituteEAO.getAdminEditStandServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminEditStandServlet due to aInstituteEAO");
    }
    instituteEAO = aInstituteEAO;
    if (aStudyEAO == null || aStudyEAO.getAdminEditStandServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminEditStandServlet due to aStudyEAO");
    }
    studyEAO = aStudyEAO;
    if (aStandEAO == null || aStandEAO.getAdminEditStandServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminEditStandServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
  }

  public AdminEditStandServlet(BrowseServlet aBrowseServletForInstituteEAO, ResultServlet aResultServletForInstituteEAO, AdminBrowseServlet aAdminBrowseServletForInstituteEAO, BrowseServlet aBrowseServletForStudyEAO, RegistrationServlet aRegistrationServletForStudyEAO, AdminBrowseServlet aAdminBrowseServletForStudyEAO, BrowseServlet aBrowseServletForStandEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StandServlet aStandServletForStandEAO, StartServlet aStartServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO)
  {
    instituteEAO = new InstituteEAO(aBrowseServletForInstituteEAO, aResultServletForInstituteEAO, aAdminBrowseServletForInstituteEAO, this);
    studyEAO = new StudyEAO(aBrowseServletForStudyEAO, aRegistrationServletForStudyEAO, aAdminBrowseServletForStudyEAO, this);
    standEAO = new StandEAO(aBrowseServletForStandEAO, aConfirmNewStandServletForStandEAO, aGetQRCodeServletForStandEAO, aRegistrationServletForStandEAO, aStandServletForStandEAO, aStartServletForStandEAO, aVoteServletForStandEAO, aAdminBrowseServletForStandEAO, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public InstituteEAO getInstituteEAO()
  {
    return instituteEAO;
  }
  /* Code from template association_GetOne */
  public StudyEAO getStudyEAO()
  {
    return studyEAO;
  }
  /* Code from template association_GetOne */
  public StandEAO getStandEAO()
  {
    return standEAO;
  }

  public void delete()
  {
    InstituteEAO existingInstituteEAO = instituteEAO;
    instituteEAO = null;
    if (existingInstituteEAO != null)
    {
      existingInstituteEAO.delete();
    }
    StudyEAO existingStudyEAO = studyEAO;
    studyEAO = null;
    if (existingStudyEAO != null)
    {
      existingStudyEAO.delete();
    }
    StandEAO existingStandEAO = standEAO;
    standEAO = null;
    if (existingStandEAO != null)
    {
      existingStandEAO.delete();
    }
  }

}