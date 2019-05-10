/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 128 "model.ump"
// line 410 "model.ump"
public class StandServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandServlet Associations
  private StandEAO standEAO;
  private VoteEAO voteEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StandServlet(StandEAO aStandEAO, VoteEAO aVoteEAO)
  {
    if (aStandEAO == null || aStandEAO.getStandServlet() != null)
    {
      throw new RuntimeException("Unable to create StandServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
    if (aVoteEAO == null || aVoteEAO.getStandServlet() != null)
    {
      throw new RuntimeException("Unable to create StandServlet due to aVoteEAO");
    }
    voteEAO = aVoteEAO;
  }

  public StandServlet(BrowseServlet aBrowseServletForStandEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StartServlet aStartServletForStandEAO, VoteServlet aVoteServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO, ResultServlet aResultServletForVoteEAO, VoteServlet aVoteServletForVoteEAO)
  {
    standEAO = new StandEAO(aBrowseServletForStandEAO, aConfirmNewStandServletForStandEAO, aGetQRCodeServletForStandEAO, aRegistrationServletForStandEAO, this, aStartServletForStandEAO, aVoteServletForStandEAO, aAdminBrowseServletForStandEAO, aAdminEditStandServletForStandEAO);
    voteEAO = new VoteEAO(aResultServletForVoteEAO, this, aVoteServletForVoteEAO);
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
  public VoteEAO getVoteEAO()
  {
    return voteEAO;
  }

  public void delete()
  {
    StandEAO existingStandEAO = standEAO;
    standEAO = null;
    if (existingStandEAO != null)
    {
      existingStandEAO.delete();
    }
    VoteEAO existingVoteEAO = voteEAO;
    voteEAO = null;
    if (existingVoteEAO != null)
    {
      existingVoteEAO.delete();
    }
  }

}