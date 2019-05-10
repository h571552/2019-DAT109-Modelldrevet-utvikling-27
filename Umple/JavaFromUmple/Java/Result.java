/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/


import java.util.*;

// line 249 "model.ump"
// line 465 "model.ump"
public class Result
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Result Attributes
  private int MINSTE_ANTALL_STEMMER;

  //Result Associations
  private List<Vote> votes;
  private List<StandResult> standResults;
  private List<StudyResult> studyResults;
  private List<InstituteResult> instituteResults;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Result(int aMINSTE_ANTALL_STEMMER)
  {
    MINSTE_ANTALL_STEMMER = aMINSTE_ANTALL_STEMMER;
    votes = new ArrayList<Vote>();
    standResults = new ArrayList<StandResult>();
    studyResults = new ArrayList<StudyResult>();
    instituteResults = new ArrayList<InstituteResult>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMINSTE_ANTALL_STEMMER(int aMINSTE_ANTALL_STEMMER)
  {
    boolean wasSet = false;
    MINSTE_ANTALL_STEMMER = aMINSTE_ANTALL_STEMMER;
    wasSet = true;
    return wasSet;
  }

  public int getMINSTE_ANTALL_STEMMER()
  {
    return MINSTE_ANTALL_STEMMER;
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
  /* Code from template association_GetMany */
  public StandResult getStandResult(int index)
  {
    StandResult aStandResult = standResults.get(index);
    return aStandResult;
  }

  public List<StandResult> getStandResults()
  {
    List<StandResult> newStandResults = Collections.unmodifiableList(standResults);
    return newStandResults;
  }

  public int numberOfStandResults()
  {
    int number = standResults.size();
    return number;
  }

  public boolean hasStandResults()
  {
    boolean has = standResults.size() > 0;
    return has;
  }

  public int indexOfStandResult(StandResult aStandResult)
  {
    int index = standResults.indexOf(aStandResult);
    return index;
  }
  /* Code from template association_GetMany */
  public StudyResult getStudyResult(int index)
  {
    StudyResult aStudyResult = studyResults.get(index);
    return aStudyResult;
  }

  public List<StudyResult> getStudyResults()
  {
    List<StudyResult> newStudyResults = Collections.unmodifiableList(studyResults);
    return newStudyResults;
  }

  public int numberOfStudyResults()
  {
    int number = studyResults.size();
    return number;
  }

  public boolean hasStudyResults()
  {
    boolean has = studyResults.size() > 0;
    return has;
  }

  public int indexOfStudyResult(StudyResult aStudyResult)
  {
    int index = studyResults.indexOf(aStudyResult);
    return index;
  }
  /* Code from template association_GetMany */
  public InstituteResult getInstituteResult(int index)
  {
    InstituteResult aInstituteResult = instituteResults.get(index);
    return aInstituteResult;
  }

  public List<InstituteResult> getInstituteResults()
  {
    List<InstituteResult> newInstituteResults = Collections.unmodifiableList(instituteResults);
    return newInstituteResults;
  }

  public int numberOfInstituteResults()
  {
    int number = instituteResults.size();
    return number;
  }

  public boolean hasInstituteResults()
  {
    boolean has = instituteResults.size() > 0;
    return has;
  }

  public int indexOfInstituteResult(InstituteResult aInstituteResult)
  {
    int index = instituteResults.indexOf(aInstituteResult);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVotes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Vote addVote(int aVoteId, int aVoteValue, Stand aStand, Visitor aVisitor, StandResult aStandResult)
  {
    return new Vote(aVoteId, aVoteValue, aStand, aVisitor, this, aStandResult);
  }

  public boolean addVote(Vote aVote)
  {
    boolean wasAdded = false;
    if (votes.contains(aVote)) { return false; }
    Result existingResult = aVote.getResult();
    boolean isNewResult = existingResult != null && !this.equals(existingResult);
    if (isNewResult)
    {
      aVote.setResult(this);
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
    //Unable to remove aVote, as it must always have a result
    if (!this.equals(aVote.getResult()))
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStandResults()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StandResult addStandResult(Stand aStand, InstituteResult aInstituteResult, StudyResult aStudyResult)
  {
    return new StandResult(aStand, aInstituteResult, this, aStudyResult);
  }

  public boolean addStandResult(StandResult aStandResult)
  {
    boolean wasAdded = false;
    if (standResults.contains(aStandResult)) { return false; }
    Result existingResult = aStandResult.getResult();
    boolean isNewResult = existingResult != null && !this.equals(existingResult);
    if (isNewResult)
    {
      aStandResult.setResult(this);
    }
    else
    {
      standResults.add(aStandResult);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStandResult(StandResult aStandResult)
  {
    boolean wasRemoved = false;
    //Unable to remove aStandResult, as it must always have a result
    if (!this.equals(aStandResult.getResult()))
    {
      standResults.remove(aStandResult);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStandResultAt(StandResult aStandResult, int index)
  {  
    boolean wasAdded = false;
    if(addStandResult(aStandResult))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStandResults()) { index = numberOfStandResults() - 1; }
      standResults.remove(aStandResult);
      standResults.add(index, aStandResult);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStandResultAt(StandResult aStandResult, int index)
  {
    boolean wasAdded = false;
    if(standResults.contains(aStandResult))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStandResults()) { index = numberOfStandResults() - 1; }
      standResults.remove(aStandResult);
      standResults.add(index, aStandResult);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStandResultAt(aStandResult, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStudyResults()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StudyResult addStudyResult(Study aStudy)
  {
    return new StudyResult(aStudy, this);
  }

  public boolean addStudyResult(StudyResult aStudyResult)
  {
    boolean wasAdded = false;
    if (studyResults.contains(aStudyResult)) { return false; }
    Result existingResult = aStudyResult.getResult();
    boolean isNewResult = existingResult != null && !this.equals(existingResult);
    if (isNewResult)
    {
      aStudyResult.setResult(this);
    }
    else
    {
      studyResults.add(aStudyResult);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStudyResult(StudyResult aStudyResult)
  {
    boolean wasRemoved = false;
    //Unable to remove aStudyResult, as it must always have a result
    if (!this.equals(aStudyResult.getResult()))
    {
      studyResults.remove(aStudyResult);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStudyResultAt(StudyResult aStudyResult, int index)
  {  
    boolean wasAdded = false;
    if(addStudyResult(aStudyResult))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudyResults()) { index = numberOfStudyResults() - 1; }
      studyResults.remove(aStudyResult);
      studyResults.add(index, aStudyResult);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStudyResultAt(StudyResult aStudyResult, int index)
  {
    boolean wasAdded = false;
    if(studyResults.contains(aStudyResult))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStudyResults()) { index = numberOfStudyResults() - 1; }
      studyResults.remove(aStudyResult);
      studyResults.add(index, aStudyResult);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStudyResultAt(aStudyResult, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfInstituteResults()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public InstituteResult addInstituteResult(Institute aInstitute)
  {
    return new InstituteResult(aInstitute, this);
  }

  public boolean addInstituteResult(InstituteResult aInstituteResult)
  {
    boolean wasAdded = false;
    if (instituteResults.contains(aInstituteResult)) { return false; }
    Result existingResult = aInstituteResult.getResult();
    boolean isNewResult = existingResult != null && !this.equals(existingResult);
    if (isNewResult)
    {
      aInstituteResult.setResult(this);
    }
    else
    {
      instituteResults.add(aInstituteResult);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeInstituteResult(InstituteResult aInstituteResult)
  {
    boolean wasRemoved = false;
    //Unable to remove aInstituteResult, as it must always have a result
    if (!this.equals(aInstituteResult.getResult()))
    {
      instituteResults.remove(aInstituteResult);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addInstituteResultAt(InstituteResult aInstituteResult, int index)
  {  
    boolean wasAdded = false;
    if(addInstituteResult(aInstituteResult))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInstituteResults()) { index = numberOfInstituteResults() - 1; }
      instituteResults.remove(aInstituteResult);
      instituteResults.add(index, aInstituteResult);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveInstituteResultAt(InstituteResult aInstituteResult, int index)
  {
    boolean wasAdded = false;
    if(instituteResults.contains(aInstituteResult))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInstituteResults()) { index = numberOfInstituteResults() - 1; }
      instituteResults.remove(aInstituteResult);
      instituteResults.add(index, aInstituteResult);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addInstituteResultAt(aInstituteResult, index);
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
    for(int i=standResults.size(); i > 0; i--)
    {
      StandResult aStandResult = standResults.get(i - 1);
      aStandResult.delete();
    }
    for(int i=studyResults.size(); i > 0; i--)
    {
      StudyResult aStudyResult = studyResults.get(i - 1);
      aStudyResult.delete();
    }
    for(int i=instituteResults.size(); i > 0; i--)
    {
      InstituteResult aInstituteResult = instituteResults.get(i - 1);
      aInstituteResult.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "MINSTE_ANTALL_STEMMER" + ":" + getMINSTE_ANTALL_STEMMER()+ "]";
  }
}