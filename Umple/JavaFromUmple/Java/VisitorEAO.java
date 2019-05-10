/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4454.24f3505c9 modeling language!*/



// line 6 "model.ump"
// line 315 "model.ump"
public class VisitorEAO
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //VisitorEAO Associations
  private NewVisitorServlet newVisitorServlet;
  private VerificationServlet verificationServlet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public VisitorEAO(NewVisitorServlet aNewVisitorServlet, VerificationServlet aVerificationServlet)
  {
    if (aNewVisitorServlet == null || aNewVisitorServlet.getVisitorEAO() != null)
    {
      throw new RuntimeException("Unable to create VisitorEAO due to aNewVisitorServlet");
    }
    newVisitorServlet = aNewVisitorServlet;
    if (aVerificationServlet == null || aVerificationServlet.getVisitorEAO() != null)
    {
      throw new RuntimeException("Unable to create VisitorEAO due to aVerificationServlet");
    }
    verificationServlet = aVerificationServlet;
  }

  public VisitorEAO(ExpoEAO aExpoEAOForNewVisitorServlet)
  {
    newVisitorServlet = new NewVisitorServlet(this, aExpoEAOForNewVisitorServlet);
    verificationServlet = new VerificationServlet(this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public NewVisitorServlet getNewVisitorServlet()
  {
    return newVisitorServlet;
  }
  /* Code from template association_GetOne */
  public VerificationServlet getVerificationServlet()
  {
    return verificationServlet;
  }

  public void delete()
  {
    NewVisitorServlet existingNewVisitorServlet = newVisitorServlet;
    newVisitorServlet = null;
    if (existingNewVisitorServlet != null)
    {
      existingNewVisitorServlet.delete();
    }
    VerificationServlet existingVerificationServlet = verificationServlet;
    verificationServlet = null;
    if (existingVerificationServlet != null)
    {
      existingVerificationServlet.delete();
    }
  }

}