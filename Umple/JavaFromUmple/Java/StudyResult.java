/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/


import java.util.*;

// line 266 "model.ump"
// line 475 "model.ump"
public class StudyResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudyResult Associations
  private List<StandResult> standResults;
  private Study study;
  private Result result;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudyResult(Study aStudy, Result aResult)
  {
    standResults = new ArrayList<StandResult>();
    if (aStudy == null || aStudy.getStudyResult() != null)
    {
      throw new RuntimeException("Unable to create StudyResult due to aStudy");
    }
    study = aStudy;
    boolean didAddResult = setResult(aResult);
    if (!didAddResult)
    {
      throw new RuntimeException("Unable to create studyResult due to result");
    }
  }

  public StudyResult(String aExpodForStudy, boolean aVoteRegistrationOpenForStudy, boolean aStatisticsOpenToPublicForStudy, boolean aStandRegistrationOpenForStudy, boolean aVerificationRequiredForStudy, String aStudyidForStudy, String aStudynameForStudy, Institute aInstituteForStudy, Result aResult)
  {
    standResults = new ArrayList<StandResult>();
    study = new Study(aExpodForStudy, aVoteRegistrationOpenForStudy, aStatisticsOpenToPublicForStudy, aStandRegistrationOpenForStudy, aVerificationRequiredForStudy, aStudyidForStudy, aStudynameForStudy, aInstituteForStudy, this);
    boolean didAddResult = setResult(aResult);
    if (!didAddResult)
    {
      throw new RuntimeException("Unable to create studyResult due to result");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
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
  /* Code from template association_GetOne */
  public Study getStudy()
  {
    return study;
  }
  /* Code from template association_GetOne */
  public Result getResult()
  {
    return result;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStandResults()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StandResult addStandResult(Stand aStand, InstituteResult aInstituteResult, Result aResult)
  {
    return new StandResult(aStand, aInstituteResult, aResult, this);
  }

  public boolean addStandResult(StandResult aStandResult)
  {
    boolean wasAdded = false;
    if (standResults.contains(aStandResult)) { return false; }
    StudyResult existingStudyResult = aStandResult.getStudyResult();
    boolean isNewStudyResult = existingStudyResult != null && !this.equals(existingStudyResult);
    if (isNewStudyResult)
    {
      aStandResult.setStudyResult(this);
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
    //Unable to remove aStandResult, as it must always have a studyResult
    if (!this.equals(aStandResult.getStudyResult()))
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
      existingResult.removeStudyResult(this);
    }
    result.addStudyResult(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=standResults.size(); i > 0; i--)
    {
      StandResult aStandResult = standResults.get(i - 1);
      aStandResult.delete();
    }
    Study existingStudy = study;
    study = null;
    if (existingStudy != null)
    {
      existingStudy.delete();
    }
    Result placeholderResult = result;
    this.result = null;
    if(placeholderResult != null)
    {
      placeholderResult.removeStudyResult(this);
    }
  }

}