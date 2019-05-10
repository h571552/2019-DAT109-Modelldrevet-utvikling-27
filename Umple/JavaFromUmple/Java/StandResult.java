/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/


import java.util.*;

// line 259 "model.ump"
// line 470 "model.ump"
public class StandResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandResult Associations
  private List<Vote> votes;
  private Stand stand;
  private InstituteResult instituteResult;
  private Result result;
  private StudyResult studyResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StandResult(Stand aStand, InstituteResult aInstituteResult, Result aResult, StudyResult aStudyResult)
  {
    votes = new ArrayList<Vote>();
    if (aStand == null || aStand.getStandResult() != null)
    {
      throw new RuntimeException("Unable to create StandResult due to aStand");
    }
    stand = aStand;
    boolean didAddInstituteResult = setInstituteResult(aInstituteResult);
    if (!didAddInstituteResult)
    {
      throw new RuntimeException("Unable to create standResult due to instituteResult");
    }
    boolean didAddResult = setResult(aResult);
    if (!didAddResult)
    {
      throw new RuntimeException("Unable to create standResult due to result");
    }
    boolean didAddStudyResult = setStudyResult(aStudyResult);
    if (!didAddStudyResult)
    {
      throw new RuntimeException("Unable to create standResult due to studyResult");
    }
  }

  public StandResult(String aStandIdForStand, String aStandNameForStand, String aAuthorsForStand, Expo aExpoForStand, Study aStudyForStand, InstituteResult aInstituteResult, Result aResult, StudyResult aStudyResult)
  {
    votes = new ArrayList<Vote>();
    stand = new Stand(aStandIdForStand, aStandNameForStand, aAuthorsForStand, aExpoForStand, aStudyForStand, this);
    boolean didAddInstituteResult = setInstituteResult(aInstituteResult);
    if (!didAddInstituteResult)
    {
      throw new RuntimeException("Unable to create standResult due to instituteResult");
    }
    boolean didAddResult = setResult(aResult);
    if (!didAddResult)
    {
      throw new RuntimeException("Unable to create standResult due to result");
    }
    boolean didAddStudyResult = setStudyResult(aStudyResult);
    if (!didAddStudyResult)
    {
      throw new RuntimeException("Unable to create standResult due to studyResult");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
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
  /* Code from template association_GetOne */
  public Stand getStand()
  {
    return stand;
  }
  /* Code from template association_GetOne */
  public InstituteResult getInstituteResult()
  {
    return instituteResult;
  }
  /* Code from template association_GetOne */
  public Result getResult()
  {
    return result;
  }
  /* Code from template association_GetOne */
  public StudyResult getStudyResult()
  {
    return studyResult;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVotes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Vote addVote(int aVoteId, int aVoteValue, Stand aStand, Visitor aVisitor, Result aResult)
  {
    return new Vote(aVoteId, aVoteValue, aStand, aVisitor, aResult, this);
  }

  public boolean addVote(Vote aVote)
  {
    boolean wasAdded = false;
    if (votes.contains(aVote)) { return false; }
    StandResult existingStandResult = aVote.getStandResult();
    boolean isNewStandResult = existingStandResult != null && !this.equals(existingStandResult);
    if (isNewStandResult)
    {
      aVote.setStandResult(this);
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
    //Unable to remove aVote, as it must always have a standResult
    if (!this.equals(aVote.getStandResult()))
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
  /* Code from template association_SetOneToMany */
  public boolean setInstituteResult(InstituteResult aInstituteResult)
  {
    boolean wasSet = false;
    if (aInstituteResult == null)
    {
      return wasSet;
    }

    InstituteResult existingInstituteResult = instituteResult;
    instituteResult = aInstituteResult;
    if (existingInstituteResult != null && !existingInstituteResult.equals(aInstituteResult))
    {
      existingInstituteResult.removeStandResult(this);
    }
    instituteResult.addStandResult(this);
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
      existingResult.removeStandResult(this);
    }
    result.addStandResult(this);
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStudyResult(StudyResult aStudyResult)
  {
    boolean wasSet = false;
    if (aStudyResult == null)
    {
      return wasSet;
    }

    StudyResult existingStudyResult = studyResult;
    studyResult = aStudyResult;
    if (existingStudyResult != null && !existingStudyResult.equals(aStudyResult))
    {
      existingStudyResult.removeStandResult(this);
    }
    studyResult.addStandResult(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=votes.size(); i > 0; i--)
    {
      Vote aVote = votes.get(i - 1);
      aVote.delete();
    }
    Stand existingStand = stand;
    stand = null;
    if (existingStand != null)
    {
      existingStand.delete();
    }
    InstituteResult placeholderInstituteResult = instituteResult;
    this.instituteResult = null;
    if(placeholderInstituteResult != null)
    {
      placeholderInstituteResult.removeStandResult(this);
    }
    Result placeholderResult = result;
    this.result = null;
    if(placeholderResult != null)
    {
      placeholderResult.removeStandResult(this);
    }
    StudyResult placeholderStudyResult = studyResult;
    this.studyResult = null;
    if(placeholderStudyResult != null)
    {
      placeholderStudyResult.removeStandResult(this);
    }
  }

}