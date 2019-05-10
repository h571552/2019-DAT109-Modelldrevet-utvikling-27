/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 169 "model.ump"
// line 425 "model.ump"
public class VoteServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VoteServlet Associations
  private VoteEAO voteEAO;
  private StandEAO standEAO;
  private Expo expo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VoteServlet(VoteEAO aVoteEAO, StandEAO aStandEAO, Expo aExpo)
  {
    if (aVoteEAO == null || aVoteEAO.getVoteServlet() != null)
    {
      throw new RuntimeException("Unable to create VoteServlet due to aVoteEAO");
    }
    voteEAO = aVoteEAO;
    if (aStandEAO == null || aStandEAO.getVoteServlet() != null)
    {
      throw new RuntimeException("Unable to create VoteServlet due to aStandEAO");
    }
    standEAO = aStandEAO;
    if (aExpo == null || aExpo.getVoteServlet() != null)
    {
      throw new RuntimeException("Unable to create VoteServlet due to aExpo");
    }
    expo = aExpo;
  }

  public VoteServlet(ResultServlet aResultServletForVoteEAO, StandServlet aStandServletForVoteEAO, BrowseServlet aBrowseServletForStandEAO, ConfirmNewStandServlet aConfirmNewStandServletForStandEAO, GetQRCodeServlet aGetQRCodeServletForStandEAO, RegistrationServlet aRegistrationServletForStandEAO, StandServlet aStandServletForStandEAO, StartServlet aStartServletForStandEAO, AdminBrowseServlet aAdminBrowseServletForStandEAO, AdminEditStandServlet aAdminEditStandServletForStandEAO, Stand aStandForExpo, ResultServlet aResultServletForExpo)
  {
    voteEAO = new VoteEAO(aResultServletForVoteEAO, aStandServletForVoteEAO, this);
    standEAO = new StandEAO(aBrowseServletForStandEAO, aConfirmNewStandServletForStandEAO, aGetQRCodeServletForStandEAO, aRegistrationServletForStandEAO, aStandServletForStandEAO, aStartServletForStandEAO, this, aAdminBrowseServletForStandEAO, aAdminEditStandServletForStandEAO);
    expo = new Expo(aStandForExpo, aResultServletForExpo, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public VoteEAO getVoteEAO()
  {
    return voteEAO;
  }
  /* Code from template association_GetOne */
  public StandEAO getStandEAO()
  {
    return standEAO;
  }
  /* Code from template association_GetOne */
  public Expo getExpo()
  {
    return expo;
  }

  public void delete()
  {
    VoteEAO existingVoteEAO = voteEAO;
    voteEAO = null;
    if (existingVoteEAO != null)
    {
      existingVoteEAO.delete();
    }
    StandEAO existingStandEAO = standEAO;
    standEAO = null;
    if (existingStandEAO != null)
    {
      existingStandEAO.delete();
    }
    Expo existingExpo = expo;
    expo = null;
    if (existingExpo != null)
    {
      existingExpo.delete();
    }
  }

}