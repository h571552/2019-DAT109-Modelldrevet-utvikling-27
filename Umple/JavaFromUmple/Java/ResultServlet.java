/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 120 "model.ump"
// line 405 "model.ump"
public class ResultServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ResultServlet Associations
  private VoteEAO voteEAO;
  private InstituteEAO instituteEAO;
  private Expo expo;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ResultServlet(VoteEAO aVoteEAO, InstituteEAO aInstituteEAO, Expo aExpo)
  {
    if (aVoteEAO == null || aVoteEAO.getResultServlet() != null)
    {
      throw new RuntimeException("Unable to create ResultServlet due to aVoteEAO");
    }
    voteEAO = aVoteEAO;
    if (aInstituteEAO == null || aInstituteEAO.getResultServlet() != null)
    {
      throw new RuntimeException("Unable to create ResultServlet due to aInstituteEAO");
    }
    instituteEAO = aInstituteEAO;
    if (aExpo == null || aExpo.getResultServlet() != null)
    {
      throw new RuntimeException("Unable to create ResultServlet due to aExpo");
    }
    expo = aExpo;
  }

  public ResultServlet(StandServlet aStandServletForVoteEAO, VoteServlet aVoteServletForVoteEAO, BrowseServlet aBrowseServletForInstituteEAO, AdminBrowseServlet aAdminBrowseServletForInstituteEAO, AdminEditStandServlet aAdminEditStandServletForInstituteEAO, Stand aStandForExpo, VoteServlet aVoteServletForExpo)
  {
    voteEAO = new VoteEAO(this, aStandServletForVoteEAO, aVoteServletForVoteEAO);
    instituteEAO = new InstituteEAO(aBrowseServletForInstituteEAO, this, aAdminBrowseServletForInstituteEAO, aAdminEditStandServletForInstituteEAO);
    expo = new Expo(aStandForExpo, this, aVoteServletForExpo);
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
  public InstituteEAO getInstituteEAO()
  {
    return instituteEAO;
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
    InstituteEAO existingInstituteEAO = instituteEAO;
    instituteEAO = null;
    if (existingInstituteEAO != null)
    {
      existingInstituteEAO.delete();
    }
    Expo existingExpo = expo;
    expo = null;
    if (existingExpo != null)
    {
      existingExpo.delete();
    }
  }

}