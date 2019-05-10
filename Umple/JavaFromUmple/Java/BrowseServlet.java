/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 78 "model.ump"
// line 365 "model.ump"
public class BrowseServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //BrowseServlet Associations
  private InstituteEAO instituteEAO;
  private StudyEAO studyEAO;
  private StandEAO standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BrowseServlet(InstituteEAO aInstituteEAO, StudyEAO aStudyEAO, StandEAO aStandEAO)
  {
    if (aInstituteEAO == null || aInstituteEAO.getBrowseServlet() != null)
    {
      throw new RuntimeException("Unable to create BrowseServlet due to aInstituteEAO");
    }
    instituteEAO = aInstituteEAO;
    if (aStudyEAO == null || aStudyEAO.getBrowseServlet() != null)
    {
      throw new RuntimeException("Unable to create BrowseServlet due to aStudyEAO");
    }
    studyEAO = aStudyEAO;
    if (aStandEAO == null || aStandEAO.getBrowseServlet() != null)
    {
      throw new RuntimeException("Unable to create BrowseServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
  }

  public BrowseServlet(ResultServlet aResultServletForInstituteEAO, AdminBrowseServlet aAdminBrowseServletForInstituteEAO, AdminEditStandServlet aAdminEditStandServletForInstituteEAO, RegistrationServlet aRegistrationServletForStudyEAO, AdminBrowseServlet aAdminBrowseServletForStudyEAO, AdminEditStandServlet aAdminEditStandServletForStudyEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StandServlet aStandServletForStandEAO, StartServlet aStartServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO)
  {
    instituteEAO = new InstituteEAO(this, aResultServletForInstituteEAO, aAdminBrowseServletForInstituteEAO, aAdminEditStandServletForInstituteEAO);
    studyEAO = new StudyEAO(this, aRegistrationServletForStudyEAO, aAdminBrowseServletForStudyEAO, aAdminEditStandServletForStudyEAO);
    standEAO = new StandEAO(this, aConfirmNewStandServletForStandEAO, aGetQRCodeServletForStandEAO, aRegistrationServletForStandEAO, aStandServletForStandEAO, aStartServletForStandEAO, aVoteServletForStandEAO, aAdminBrowseServletForStandEAO, aAdminEditStandServletForStandEAO);
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