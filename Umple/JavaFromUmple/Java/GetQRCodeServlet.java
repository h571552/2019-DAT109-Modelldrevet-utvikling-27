/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 94 "model.ump"
// line 380 "model.ump"
public class GetQRCodeServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GetQRCodeServlet Associations
  private StandEAO standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GetQRCodeServlet(StandEAO aStandEAO)
  {
    if (aStandEAO == null || aStandEAO.getGetQRCodeServlet() != null)
    {
      throw new RuntimeException("Unable to create GetQRCodeServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
  }

  public GetQRCodeServlet(BrowseServlet aBrowseServletForStandEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StandServlet aStandServletForStandEAO, StartServlet aStartServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO)
  {
    standEAO = new StandEAO(aBrowseServletForStandEAO, aConfirmNewStandServletForStandEAO, this, aRegistrationServletForStandEAO, aStandServletForStandEAO, aStartServletForStandEAO, aVoteServletForStandEAO, aAdminBrowseServletForStandEAO, aAdminEditStandServletForStandEAO);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public StandEAO getStandEAO()
  {
    return standEAO;
  }

  public void delete()
  {
    StandEAO existingStandEAO = standEAO;
    standEAO = null;
    if (existingStandEAO != null)
    {
      existingStandEAO.delete();
    }
  }

}