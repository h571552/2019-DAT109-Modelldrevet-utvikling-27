/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/


import java.util.*;

// line 242 "model.ump"
// line 460 "model.ump"
public class InstituteResult
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //InstituteResult Associations
  private List<StandResult> standResults;
  private Institute institute;
  private Result result;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public InstituteResult(Institute aInstitute, Result aResult)
  {
    standResults = new ArrayList<StandResult>();
    if (aInstitute == null || aInstitute.getInstituteResult() != null)
    {
      throw new RuntimeException("Unable to create InstituteResult due to aInstitute");
    }
    institute = aInstitute;
    boolean didAddResult = setResult(aResult);
    if (!didAddResult)
    {
      throw new RuntimeException("Unable to create instituteResult due to result");
    }
  }

  public InstituteResult(String aInstituteidForInstitute, String aInstitutenameForInstitute, Study aStudyForInstitute, Result aResult)
  {
    standResults = new ArrayList<StandResult>();
    institute = new Institute(aInstituteidForInstitute, aInstitutenameForInstitute, aStudyForInstitute, this);
    boolean didAddResult = setResult(aResult);
    if (!didAddResult)
    {
      throw new RuntimeException("Unable to create instituteResult due to result");
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
  public Institute getInstitute()
  {
    return institute;
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
  public StandResult addStandResult(Stand aStand, Result aResult, StudyResult aStudyResult)
  {
    return new StandResult(aStand, this, aResult, aStudyResult);
  }

  public boolean addStandResult(StandResult aStandResult)
  {
    boolean wasAdded = false;
    if (standResults.contains(aStandResult)) { return false; }
    InstituteResult existingInstituteResult = aStandResult.getInstituteResult();
    boolean isNewInstituteResult = existingInstituteResult != null && !this.equals(existingInstituteResult);
    if (isNewInstituteResult)
    {
      aStandResult.setInstituteResult(this);
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
    //Unable to remove aStandResult, as it must always have a instituteResult
    if (!this.equals(aStandResult.getInstituteResult()))
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
      existingResult.removeInstituteResult(this);
    }
    result.addInstituteResult(this);
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
    Institute existingInstitute = institute;
    institute = null;
    if (existingInstitute != null)
    {
      existingInstitute.delete();
    }
    Result placeholderResult = result;
    this.result = null;
    if(placeholderResult != null)
    {
      placeholderResult.removeInstituteResult(this);
    }
  }

}