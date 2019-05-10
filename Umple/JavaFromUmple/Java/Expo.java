/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 15 "model.ump"
// line 330 "model.ump"
public class Expo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Expo Associations
  private Stand stand;
  private ResultServlet resultServlet;
  private VoteServlet voteServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Expo(Stand aStand, ResultServlet aResultServlet, VoteServlet aVoteServlet)
  {
    if (aStand == null || aStand.getExpo() != null)
    {
      throw new RuntimeException("Unable to create Expo due to aStand");
    }
    stand = aStand;
    if (aResultServlet == null || aResultServlet.getExpo() != null)
    {
      throw new RuntimeException("Unable to create Expo due to aResultServlet");
    }
    resultServlet = aResultServlet;
    if (aVoteServlet == null || aVoteServlet.getExpo() != null)
    {
      throw new RuntimeException("Unable to create Expo due to aVoteServlet");
    }
    voteServlet = aVoteServlet;
  }

  public Expo(String aStandIdForStand, String aStandNameForStand, String aAuthorsForStand, Study aStudyForStand, StandResult aStandResultForStand, VoteEAO aVoteEAOForResultServlet, InstituteEAO aInstituteEAOForResultServlet, VoteEAO aVoteEAOForVoteServlet, StandEAO aStandEAOForVoteServlet)
  {
    stand = new Stand(aStandIdForStand, aStandNameForStand, aAuthorsForStand, this, aStudyForStand, aStandResultForStand);
    resultServlet = new ResultServlet(aVoteEAOForResultServlet, aInstituteEAOForResultServlet, this);
    voteServlet = new VoteServlet(aVoteEAOForVoteServlet, aStandEAOForVoteServlet, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Stand getStand()
  {
    return stand;
  }
  /* Code from template association_GetOne */
  public ResultServlet getResultServlet()
  {
    return resultServlet;
  }
  /* Code from template association_GetOne */
  public VoteServlet getVoteServlet()
  {
    return voteServlet;
  }

  public void delete()
  {
    Stand existingStand = stand;
    stand = null;
    if (existingStand != null)
    {
      existingStand.delete();
    }
    ResultServlet existingResultServlet = resultServlet;
    resultServlet = null;
    if (existingResultServlet != null)
    {
      existingResultServlet.delete();
    }
    VoteServlet existingVoteServlet = voteServlet;
    voteServlet = null;
    if (existingVoteServlet != null)
    {
      existingVoteServlet.delete();
    }
  }

}