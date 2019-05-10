/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 7 "model.ump"
// line 320 "model.ump"
public class VoteEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VoteEAO Associations
  private ResultServlet resultServlet;
  private StandServlet standServlet;
  private VoteServlet voteServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VoteEAO(ResultServlet aResultServlet, StandServlet aStandServlet, VoteServlet aVoteServlet)
  {
    if (aResultServlet == null || aResultServlet.getVoteEAO() != null)
    {
      throw new RuntimeException("Unable to create VoteEAO due to aResultServlet");
    }
    resultServlet = aResultServlet;
    if (aStandServlet == null || aStandServlet.getVoteEAO() != null)
    {
      throw new RuntimeException("Unable to create VoteEAO due to aStandServlet");
    }
    standServlet = aStandServlet;
    if (aVoteServlet == null || aVoteServlet.getVoteEAO() != null)
    {
      throw new RuntimeException("Unable to create VoteEAO due to aVoteServlet");
    }
    voteServlet = aVoteServlet;
  }

  public VoteEAO(InstituteEAO aInstituteEAOForResultServlet, Expo aExpoForResultServlet, StandEAO aStandEAOForStandServlet, StandEAO aStandEAOForVoteServlet, Expo aExpoForVoteServlet)
  {
    resultServlet = new ResultServlet(this, aInstituteEAOForResultServlet, aExpoForResultServlet);
    standServlet = new StandServlet(aStandEAOForStandServlet, this);
    voteServlet = new VoteServlet(this, aStandEAOForVoteServlet, aExpoForVoteServlet);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public ResultServlet getResultServlet()
  {
    return resultServlet;
  }
  /* Code from template association_GetOne */
  public StandServlet getStandServlet()
  {
    return standServlet;
  }
  /* Code from template association_GetOne */
  public VoteServlet getVoteServlet()
  {
    return voteServlet;
  }

  public void delete()
  {
    ResultServlet existingResultServlet = resultServlet;
    resultServlet = null;
    if (existingResultServlet != null)
    {
      existingResultServlet.delete();
    }
    StandServlet existingStandServlet = standServlet;
    standServlet = null;
    if (existingStandServlet != null)
    {
      existingStandServlet.delete();
    }
    VoteServlet existingVoteServlet = voteServlet;
    voteServlet = null;
    if (existingVoteServlet != null)
    {
      existingVoteServlet.delete();
    }
  }

}