/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 100 "model.ump"
// line 385 "model.ump"
public class NewVisitorServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //NewVisitorServlet Associations
  private VisitorEAO visitorEAO;
  private ExpoEAO expoEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public NewVisitorServlet(VisitorEAO aVisitorEAO, ExpoEAO aExpoEAO)
  {
    if (aVisitorEAO == null || aVisitorEAO.getNewVisitorServlet() != null)
    {
      throw new RuntimeException("Unable to create NewVisitorServlet due to aVisitorEAO");
    }
    visitorEAO = aVisitorEAO;
    if (aExpoEAO == null || aExpoEAO.getNewVisitorServlet() != null)
    {
      throw new RuntimeException("Unable to create NewVisitorServlet due to aExpoEAO");
    }
    expoEAO = aExpoEAO;
  }

  public NewVisitorServlet(VerificationServlet aVerificationServletForVisitorEAO, RegistrationServlet aRegistrationServletForExpoEAO, StartServlet aStartServletForExpoEAO, AdminServlet aAdminServletForExpoEAO)
  {
    visitorEAO = new VisitorEAO(this, aVerificationServletForVisitorEAO);
    expoEAO = new ExpoEAO(this, aRegistrationServletForExpoEAO, aStartServletForExpoEAO, aAdminServletForExpoEAO);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public VisitorEAO getVisitorEAO()
  {
    return visitorEAO;
  }
  /* Code from template association_GetOne */
  public ExpoEAO getExpoEAO()
  {
    return expoEAO;
  }

  public void delete()
  {
    VisitorEAO existingVisitorEAO = visitorEAO;
    visitorEAO = null;
    if (existingVisitorEAO != null)
    {
      existingVisitorEAO.delete();
    }
    ExpoEAO existingExpoEAO = expoEAO;
    expoEAO = null;
    if (existingExpoEAO != null)
    {
      existingExpoEAO.delete();
    }
  }

}