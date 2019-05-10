/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 163 "model.ump"
// line 420 "model.ump"
public class VerificationServlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VerificationServlet Associations
  private VisitorEAO visitorEAO;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VerificationServlet(VisitorEAO aVisitorEAO)
  {
    if (aVisitorEAO == null || aVisitorEAO.getVerificationServlet() != null)
    {
      throw new RuntimeException("Unable to create VerificationServlet due to aVisitorEAO");
    }
    visitorEAO = aVisitorEAO;
  }

  public VerificationServlet(NewVisitorServlet aNewVisitorServletForVisitorEAO)
  {
    visitorEAO = new VisitorEAO(aNewVisitorServletForVisitorEAO, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public VisitorEAO getVisitorEAO()
  {
    return visitorEAO;
  }

  public void delete()
  {
    VisitorEAO existingVisitorEAO = visitorEAO;
    visitorEAO = null;
    if (existingVisitorEAO != null)
    {
      existingVisitorEAO.delete();
    }
  }

}