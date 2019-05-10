/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 17 "model.ump"
// line 335 "model.ump"
public class Institute
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Institute Attributes
  private String instituteid;
  private String institutename;

  //Institute Associations
  private Study study;
  private InstituteResult instituteResult;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Institute(String aInstituteid, String aInstitutename, Study aStudy, InstituteResult aInstituteResult)
  {
    instituteid = aInstituteid;
    institutename = aInstitutename;
    if (aStudy == null || aStudy.getInstitute() != null)
    {
      throw new RuntimeException("Unable to create Institute due to aStudy");
    }
    study = aStudy;
    if (aInstituteResult == null || aInstituteResult.getInstitute() != null)
    {
      throw new RuntimeException("Unable to create Institute due to aInstituteResult");
    }
    instituteResult = aInstituteResult;
  }

  public Institute(String aInstituteid, String aInstitutename, String aExpodForStudy, boolean aVoteRegistrationOpenForStudy, boolean aStatisticsOpenToPublicForStudy, boolean aStandRegistrationOpenForStudy, boolean aVerificationRequiredForStudy, String aStudyidForStudy, String aStudynameForStudy, StudyResult aStudyResultForStudy, Result aResultForInstituteResult)
  {
    instituteid = aInstituteid;
    institutename = aInstitutename;
    study = new Study(aExpodForStudy, aVoteRegistrationOpenForStudy, aStatisticsOpenToPublicForStudy, aStandRegistrationOpenForStudy, aVerificationRequiredForStudy, aStudyidForStudy, aStudynameForStudy, this, aStudyResultForStudy);
    instituteResult = new InstituteResult(this, aResultForInstituteResult);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setInstituteid(String aInstituteid)
  {
    boolean wasSet = false;
    instituteid = aInstituteid;
    wasSet = true;
    return wasSet;
  }

  public boolean setInstitutename(String aInstitutename)
  {
    boolean wasSet = false;
    institutename = aInstitutename;
    wasSet = true;
    return wasSet;
  }

  public String getInstituteid()
  {
    return instituteid;
  }

  public String getInstitutename()
  {
    return institutename;
  }
  /* Code from template association_GetOne */
  public Study getStudy()
  {
    return study;
  }
  /* Code from template association_GetOne */
  public InstituteResult getInstituteResult()
  {
    return instituteResult;
  }

  public void delete()
  {
    Study existingStudy = study;
    study = null;
    if (existingStudy != null)
    {
      existingStudy.delete();
    }
    InstituteResult existingInstituteResult = instituteResult;
    instituteResult = null;
    if (existingInstituteResult != null)
    {
      existingInstituteResult.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "instituteid" + ":" + getInstituteid()+ "," +
            "institutename" + ":" + getInstitutename()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "study = "+(getStudy()!=null?Integer.toHexString(System.identityHashCode(getStudy())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "instituteResult = "+(getInstituteResult()!=null?Integer.toHexString(System.identityHashCode(getInstituteResult())):"null");
  }
}