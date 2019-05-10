/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 177 "model.ump"
// line 430 "model.ump"
public class AdminBrowseServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AdminBrowseServlet Associations
  private InstituteEAO instituteEAO;
  private StandEAO standEAO;
  private StudyEAO studyEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AdminBrowseServlet(InstituteEAO aInstituteEAO, StandEAO aStandEAO, StudyEAO aStudyEAO)
  {
    if (aInstituteEAO == null || aInstituteEAO.getAdminBrowseServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminBrowseServlet due to aInstituteEAO");
    }
    instituteEAO = aInstituteEAO;
    if (aStandEAO == null || aStandEAO.getAdminBrowseServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminBrowseServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
    if (aStudyEAO == null || aStudyEAO.getAdminBrowseServlet() != null)
    {
      throw new RuntimeException("Unable to create AdminBrowseServlet due to aStudyEAO");
    }
    studyEAO = aStudyEAO;
  }

  public AdminBrowseServlet(BrowseServlet aBrowseServletForInstituteEAO, ResultServlet aResultServletForInstituteEAO, AdminEditStandServlet aAdminEditStandServletForInstituteEAO, BrowseServlet aBrowseServletForStandEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StandServlet aStandServletForStandEAO, StartServlet aStartServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO, BrowseServlet aBrowseServletForStudyEAO, RegistrationServlet aRegistrationServletForStudyEAO, AdminEditStandServlet aAdminEditStandServletForStudyEAO)
  {
    instituteEAO = new InstituteEAO(aBrowseServletForInstituteEAO, aResultServletForInstituteEAO, this, aAdminEditStandServletForInstituteEAO);
    standEAO = new StandEAO(aBrowseServletForStandEAO, aConfirmNewStandServletForStandEAO, aGetQRCodeServletForStandEAO, aRegistrationServletForStandEAO, aStandServletForStandEAO, aStartServletForStandEAO, aVoteServletForStandEAO, this, aAdminEditStandServletForStandEAO);
    studyEAO = new StudyEAO(aBrowseServletForStudyEAO, aRegistrationServletForStudyEAO, this, aAdminEditStandServletForStudyEAO);
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
  public StandEAO getStandEAO()
  {
    return standEAO;
  }
  /* Code from template association_GetOne */
  public StudyEAO getStudyEAO()
  {
    return studyEAO;
  }

  public void delete()
  {
    InstituteEAO existingInstituteEAO = instituteEAO;
    instituteEAO = null;
    if (existingInstituteEAO != null)
    {
      existingInstituteEAO.delete();
    }
    StandEAO existingStandEAO = standEAO;
    standEAO = null;
    if (existingStandEAO != null)
    {
      existingStandEAO.delete();
    }
    StudyEAO existingStudyEAO = studyEAO;
    studyEAO = null;
    if (existingStudyEAO != null)
    {
      existingStudyEAO.delete();
    }
  }

}