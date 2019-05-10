/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 112 "model.ump"
// line 400 "model.ump"
public class RegistrationServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RegistrationServlet Associations
  private StandEAO standEAO;
  private ExpoEAO expoEAO;
  private StudyEAO studyEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RegistrationServlet(StandEAO aStandEAO, ExpoEAO aExpoEAO, StudyEAO aStudyEAO)
  {
    if (aStandEAO == null || aStandEAO.getRegistrationServlet() != null)
    {
      throw new RuntimeException("Unable to create RegistrationServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
    if (aExpoEAO == null || aExpoEAO.getRegistrationServlet() != null)
    {
      throw new RuntimeException("Unable to create RegistrationServlet due to aExpoEAO");
    }
    expoEAO = aExpoEAO;
    if (aStudyEAO == null || aStudyEAO.getRegistrationServlet() != null)
    {
      throw new RuntimeException("Unable to create RegistrationServlet due to aStudyEAO");
    }
    studyEAO = aStudyEAO;
  }

  public RegistrationServlet(BrowseServlet aBrowseServletForStandEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, StandServlet aStandServletForStandEAO, StartServlet aStartServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO, NewVisitorServlet aNewVisitorServletForExpoEAO, StartServlet aStartServletForExpoEAO, AdminServlet aAdminServletForExpoEAO, BrowseServlet aBrowseServletForStudyEAO, AdminBrowseServlet aAdminBrowseServletForStudyEAO, AdminEditStandServlet aAdminEditStandServletForStudyEAO)
  {
    standEAO = new StandEAO(aBrowseServletForStandEAO, aConfirmNewStandServletForStandEAO, aGetQRCodeServletForStandEAO, this, aStandServletForStandEAO, aStartServletForStandEAO, aVoteServletForStandEAO, aAdminBrowseServletForStandEAO, aAdminEditStandServletForStandEAO);
    expoEAO = new ExpoEAO(aNewVisitorServletForExpoEAO, this, aStartServletForExpoEAO, aAdminServletForExpoEAO);
    studyEAO = new StudyEAO(aBrowseServletForStudyEAO, this, aAdminBrowseServletForStudyEAO, aAdminEditStandServletForStudyEAO);
  }

  //------------------------
  // INTERFACE
  //------------------------
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
  /* Code from template association_GetOne */
  public StudyEAO getStudyEAO()
  {
    return studyEAO;
  }

  public void delete()
  {
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
    StudyEAO existingStudyEAO = studyEAO;
    studyEAO = null;
    if (existingStudyEAO != null)
    {
      existingStudyEAO.delete();
    }
  }

}