/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/


import java.util.*;

// line 60 "model.ump"
// line 355 "model.ump"
public class Visitor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Visitor Attributes
  private String visitorId;
  private String visitorToken;

  //Visitor Associations
  private List<Vote> votes;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Visitor(String aVisitorId, String aVisitorToken)
  {
    visitorId = aVisitorId;
    visitorToken = aVisitorToken;
    votes = new ArrayList<Vote>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setVisitorId(String aVisitorId)
  {
    boolean wasSet = false;
    visitorId = aVisitorId;
    wasSet = true;
    return wasSet;
  }

  public boolean setVisitorToken(String aVisitorToken)
  {
    boolean wasSet = false;
    visitorToken = aVisitorToken;
    wasSet = true;
    return wasSet;
  }

  public String getVisitorId()
  {
    return visitorId;
  }

  public String getVisitorToken()
  {
    return visitorToken;
  }
  /* Code from template association_GetMany */
  public Vote getVote(int index)
  {
    Vote aVote = votes.get(index);
    return aVote;
  }

  public List<Vote> getVotes()
  {
    List<Vote> newVotes = Collections.unmodifiableList(votes);
    return newVotes;
  }

  public int numberOfVotes()
  {
    int number = votes.size();
    return number;
  }

  public boolean hasVotes()
  {
    boolean has = votes.size() > 0;
    return has;
  }

  public int indexOfVote(Vote aVote)
  {
    int index = votes.indexOf(aVote);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVotes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Vote addVote(int aVoteId, int aVoteValue, Stand aStand, Result aResult, StandResult aStandResult)
  {
    return new Vote(aVoteId, aVoteValue, aStand, this, aResult, aStandResult);
  }

  public boolean addVote(Vote aVote)
  {
    boolean wasAdded = false;
    if (votes.contains(aVote)) { return false; }
    Visitor existingVisitor = aVote.getVisitor();
    boolean isNewVisitor = existingVisitor != null && !this.equals(existingVisitor);
    if (isNewVisitor)
    {
      aVote.setVisitor(this);
    }
    else
    {
      votes.add(aVote);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeVote(Vote aVote)
  {
    boolean wasRemoved = false;
    //Unable to remove aVote, as it must always have a visitor
    if (!this.equals(aVote.getVisitor()))
    {
      votes.remove(aVote);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVoteAt(Vote aVote, int index)
  {  
    boolean wasAdded = false;
    if(addVote(aVote))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVotes()) { index = numberOfVotes() - 1; }
      votes.remove(aVote);
      votes.add(index, aVote);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVoteAt(Vote aVote, int index)
  {
    boolean wasAdded = false;
    if(votes.contains(aVote))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVotes()) { index = numberOfVotes() - 1; }
      votes.remove(aVote);
      votes.add(index, aVote);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVoteAt(aVote, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=votes.size(); i > 0; i--)
    {
      Vote aVote = votes.get(i - 1);
      aVote.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "visitorId" + ":" + getVisitorId()+ "," +
            "visitorToken" + ":" + getVisitorToken()+ "]";
  }
}