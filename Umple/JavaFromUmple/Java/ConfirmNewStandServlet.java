/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 86 "model.ump"
// line 370 "model.ump"
public class ConfirmNewStandServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ConfirmNewStandServlet Associations
  private StandEAO standEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ConfirmNewStandServlet(StandEAO aStandEAO)
  {
    if (aStandEAO == null || aStandEAO.getConfirmNewStandServlet() != null)
    {
      throw new RuntimeException("Unable to create ConfirmNewStandServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
  }

  public ConfirmNewStandServlet(BrowseServlet aBrowseServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StandServlet aStandServletForStandEAO, StartServlet aStartServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO)
  {
    standEAO = new StandEAO(aBrowseServletForStandEAO, this, aGetQRCodeServletForStandEAO, aRegistrationServletForStandEAO, aStandServletForStandEAO, aStartServletForStandEAO, aVoteServletForStandEAO, aAdminBrowseServletForStandEAO, aAdminEditStandServletForStandEAO);
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