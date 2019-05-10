/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/


import java.util.*;

// line 23 "model.ump"
// line 50 "model.ump"
// line 340 "model.ump"
public class Study
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Study Attributes
  private String expod;
  private boolean voteRegistrationOpen;
  private boolean statisticsOpenToPublic;
  private boolean standRegistrationOpen;
  private boolean verificationRequired;
  private String studyid;
  private String studyname;

  //Study Associations
  private Institute institute;
  private List<Stand> stands;
  private StudyResult studyResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Study(String aExpod, boolean aVoteRegistrationOpen, boolean aStatisticsOpenToPublic, boolean aStandRegistrationOpen, boolean aVerificationRequired, String aStudyid, String aStudyname, Institute aInstitute, StudyResult aStudyResult)
  {
    expod = aExpod;
    voteRegistrationOpen = aVoteRegistrationOpen;
    statisticsOpenToPublic = aStatisticsOpenToPublic;
    standRegistrationOpen = aStandRegistrationOpen;
    verificationRequired = aVerificationRequired;
    studyid = aStudyid;
    studyname = aStudyname;
    if (aInstitute == null || aInstitute.getStudy() != null)
    {
      throw new RuntimeException("Unable to create Study due to aInstitute");
    }
    institute = aInstitute;
    stands = new ArrayList<Stand>();
    if (aStudyResult == null || aStudyResult.getStudy() != null)
    {
      throw new RuntimeException("Unable to create Study due to aStudyResult");
    }
    studyResult = aStudyResult;
  }

  public Study(String aExpod, boolean aVoteRegistrationOpen, boolean aStatisticsOpenToPublic, boolean aStandRegistrationOpen, boolean aVerificationRequired, String aStudyid, String aStudyname, String aInstituteidForInstitute, String aInstitutenameForInstitute, InstituteResult aInstituteResultForInstitute, Result aResultForStudyResult)
  {
    expod = aExpod;
    voteRegistrationOpen = aVoteRegistrationOpen;
    statisticsOpenToPublic = aStatisticsOpenToPublic;
    standRegistrationOpen = aStandRegistrationOpen;
    verificationRequired = aVerificationRequired;
    studyid = aStudyid;
    studyname = aStudyname;
    institute = new Institute(aInstituteidForInstitute, aInstitutenameForInstitute, this, aInstituteResultForInstitute);
    stands = new ArrayList<Stand>();
    studyResult = new StudyResult(this, aResultForStudyResult);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setExpod(String aExpod)
  {
    boolean wasSet = false;
    expod = aExpod;
    wasSet = true;
    return wasSet;
  }

  public boolean setVoteRegistrationOpen(boolean aVoteRegistrationOpen)
  {
    boolean wasSet = false;
    voteRegistrationOpen = aVoteRegistrationOpen;
    wasSet = true;
    return wasSet;
  }

  public boolean setStatisticsOpenToPublic(boolean aStatisticsOpenToPublic)
  {
    boolean wasSet = false;
    statisticsOpenToPublic = aStatisticsOpenToPublic;
    wasSet = true;
    return wasSet;
  }

  public boolean setStandRegistrationOpen(boolean aStandRegistrationOpen)
  {
    boolean wasSet = false;
    standRegistrationOpen = aStandRegistrationOpen;
    wasSet = true;
    return wasSet;
  }

  public boolean setVerificationRequired(boolean aVerificationRequired)
  {
    boolean wasSet = false;
    verificationRequired = aVerificationRequired;
    wasSet = true;
    return wasSet;
  }

  public boolean setStudyid(String aStudyid)
  {
    boolean wasSet = false;
    studyid = aStudyid;
    wasSet = true;
    return wasSet;
  }

  public boolean setStudyname(String aStudyname)
  {
    boolean wasSet = false;
    studyname = aStudyname;
    wasSet = true;
    return wasSet;
  }

  public String getExpod()
  {
    return expod;
  }

  public boolean getVoteRegistrationOpen()
  {
    return voteRegistrationOpen;
  }

  public boolean getStatisticsOpenToPublic()
  {
    return statisticsOpenToPublic;
  }

  public boolean getStandRegistrationOpen()
  {
    return standRegistrationOpen;
  }

  public boolean getVerificationRequired()
  {
    return verificationRequired;
  }

  public String getStudyid()
  {
    return studyid;
  }

  public String getStudyname()
  {
    return studyname;
  }
  /* Code from template association_GetOne */
  public Institute getInstitute()
  {
    return institute;
  }
  /* Code from template association_GetMany */
  public Stand getStand(int index)
  {
    Stand aStand = stands.get(index);
    return aStand;
  }

  public List<Stand> getStands()
  {
    List<Stand> newStands = Collections.unmodifiableList(stands);
    return newStands;
  }

  public int numberOfStands()
  {
    int number = stands.size();
    return number;
  }

  public boolean hasStands()
  {
    boolean has = stands.size() > 0;
    return has;
  }

  public int indexOfStand(Stand aStand)
  {
    int index = stands.indexOf(aStand);
    return index;
  }
  /* Code from template association_GetOne */
  public StudyResult getStudyResult()
  {
    return studyResult;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStands()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Stand addStand(String aStandId, String aStandName, String aAuthors, Expo aExpo, StandResult aStandResult)
  {
    return new Stand(aStandId, aStandName, aAuthors, aExpo, this, aStandResult);
  }

  public boolean addStand(Stand aStand)
  {
    boolean wasAdded = false;
    if (stands.contains(aStand)) { return false; }
    Study existingStudy = aStand.getStudy();
    boolean isNewStudy = existingStudy != null && !this.equals(existingStudy);
    if (isNewStudy)
    {
      aStand.setStudy(this);
    }
    else
    {
      stands.add(aStand);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStand(Stand aStand)
  {
    boolean wasRemoved = false;
    //Unable to remove aStand, as it must always have a study
    if (!this.equals(aStand.getStudy()))
    {
      stands.remove(aStand);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStandAt(Stand aStand, int index)
  {  
    boolean wasAdded = false;
    if(addStand(aStand))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStands()) { index = numberOfStands() - 1; }
      stands.remove(aStand);
      stands.add(index, aStand);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStandAt(Stand aStand, int index)
  {
    boolean wasAdded = false;
    if(stands.contains(aStand))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStands()) { index = numberOfStands() - 1; }
      stands.remove(aStand);
      stands.add(index, aStand);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStandAt(aStand, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    Institute existingInstitute = institute;
    institute = null;
    if (existingInstitute != null)
    {
      existingInstitute.delete();
    }
    for(int i=stands.size(); i > 0; i--)
    {
      Stand aStand = stands.get(i - 1);
      aStand.delete();
    }
    StudyResult existingStudyResult = studyResult;
    studyResult = null;
    if (existingStudyResult != null)
    {
      existingStudyResult.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "expod" + ":" + getExpod()+ "," +
            "voteRegistrationOpen" + ":" + getVoteRegistrationOpen()+ "," +
            "statisticsOpenToPublic" + ":" + getStatisticsOpenToPublic()+ "," +
            "standRegistrationOpen" + ":" + getStandRegistrationOpen()+ "," +
            "verificationRequired" + ":" + getVerificationRequired()+ "," +
            "studyid" + ":" + getStudyid()+ "," +
            "studyname" + ":" + getStudyname()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "institute = "+(getInstitute()!=null?Integer.toHexString(System.identityHashCode(getInstitute())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "studyResult = "+(getStudyResult()!=null?Integer.toHexString(System.identityHashCode(getStudyResult())):"null");
  }
}