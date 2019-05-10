/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 69 "model.ump"
// line 360 "model.ump"
public class Vote
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vote Attributes
  private int voteId;
  private int voteValue;

  //Vote Associations
  private Stand stand;
  private Visitor visitor;
  private Result result;
  private StandResult standResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vote(int aVoteId, int aVoteValue, Stand aStand, Visitor aVisitor, Result aResult, StandResult aStandResult)
  {
    voteId = aVoteId;
    voteValue = aVoteValue;
    boolean didAddStand = setStand(aStand);
    if (!didAddStand)
    {
      throw new RuntimeException("Unable to create vote due to stand");
    }
    boolean didAddVisitor = setVisitor(aVisitor);
    if (!didAddVisitor)
    {
      throw new RuntimeException("Unable to create vote due to visitor");
    }
    boolean didAddResult = setResult(aResult);
    if (!didAddResult)
    {
      throw new RuntimeException("Unable to create vote due to result");
    }
    boolean didAddStandResult = setStandResult(aStandResult);
    if (!didAddStandResult)
    {
      throw new RuntimeException("Unable to create vote due to standResult");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setVoteId(int aVoteId)
  {
    boolean wasSet = false;
    voteId = aVoteId;
    wasSet = true;
    return wasSet;
  }

  public boolean setVoteValue(int aVoteValue)
  {
    boolean wasSet = false;
    voteValue = aVoteValue;
    wasSet = true;
    return wasSet;
  }

  public int getVoteId()
  {
    return voteId;
  }

  public int getVoteValue()
  {
    return voteValue;
  }
  /* Code from template association_GetOne */
  public Stand getStand()
  {
    return stand;
  }
  /* Code from template association_GetOne */
  public Visitor getVisitor()
  {
    return visitor;
  }
  /* Code from template association_GetOne */
  public Result getResult()
  {
    return result;
  }
  /* Code from template association_GetOne */
  public StandResult getStandResult()
  {
    return standResult;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStand(Stand aStand)
  {
    boolean wasSet = false;
    if (aStand == null)
    {
      return wasSet;
    }

    Stand existingStand = stand;
    stand = aStand;
    if (existingStand != null && !existingStand.equals(aStand))
    {
      existingStand.removeVote(this);
    }
    stand.addVote(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setVisitor(Visitor aVisitor)
  {
    boolean wasSet = false;
    if (aVisitor == null)
    {
      return wasSet;
    }

    Visitor existingVisitor = visitor;
    visitor = aVisitor;
    if (existingVisitor != null && !existingVisitor.equals(aVisitor))
    {
      existingVisitor.removeVote(this);
    }
    visitor.addVote(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setResult(Result aResult)
  {
    boolean wasSet = false;
    if (aResult == null)
    {
      return wasSet;
    }

    Result existingResult = result;
    result = aResult;
    if (existingResult != null && !existingResult.equals(aResult))
    {
      existingResult.removeVote(this);
    }
    result.addVote(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStandResult(StandResult aStandResult)
  {
    boolean wasSet = false;
    if (aStandResult == null)
    {
      return wasSet;
    }

    StandResult existingStandResult = standResult;
    standResult = aStandResult;
    if (existingStandResult != null && !existingStandResult.equals(aStandResult))
    {
      existingStandResult.removeVote(this);
    }
    standResult.addVote(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Stand placeholderStand = stand;
    this.stand = null;
    if(placeholderStand != null)
    {
      placeholderStand.removeVote(this);
    }
    Visitor placeholderVisitor = visitor;
    this.visitor = null;
    if(placeholderVisitor != null)
    {
      placeholderVisitor.removeVote(this);
    }
    Result placeholderResult = result;
    this.result = null;
    if(placeholderResult != null)
    {
      placeholderResult.removeVote(this);
    }
    StandResult placeholderStandResult = standResult;
    this.standResult = null;
    if(placeholderStandResult != null)
    {
      placeholderStandResult.removeVote(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "voteId" + ":" + getVoteId()+ "," +
            "voteValue" + ":" + getVoteValue()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "stand = "+(getStand()!=null?Integer.toHexString(System.identityHashCode(getStand())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "visitor = "+(getVisitor()!=null?Integer.toHexString(System.identityHashCode(getVisitor())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "result = "+(getResult()!=null?Integer.toHexString(System.identityHashCode(getResult())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "standResult = "+(getStandResult()!=null?Integer.toHexString(System.identityHashCode(getStandResult())):"null");
  }
}