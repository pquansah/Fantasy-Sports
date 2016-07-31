//Paakwesi Quansah ECS 102 Professor Yu
public class Fantasy
{
  //called the instance variables
  private String pg;
  private String sg;
  private String sf;
  private String pf;
  private String ct;
  private double pgFan;
  private double sgFan;
  private double sfFan;
  private double pfFan;
  private double ctFan;
  //overload the constructor with 2
  public Fantasy(String p, String sh, String s, String po, String c)
  {
    pg=p;
    sg=sh;
    sf=s;
    pf=po;
    ct=c;
    pgFan=0;
    sgFan=0;
    sfFan=0;
    pfFan=0;
    ctFan=0;
  }
  //pg is Point Guard, sg is Shooting Guard, sf is Shooting Forward
  //pf is Point Forward, ct is Center
  public Fantasy(String p, String sh, String s, String po, String c, double pFan, double shFan, double sFan, double poFan, double cFan)
  {
    pg=p;
    sg=sh;
    sf=s;
    pf=po;
    ct=c;
    pgFan=pFan;
    sgFan=shFan;
    sfFan=sFan;
    pfFan=poFan;
    ctFan=cFan;
  }
  //called all the getters and setters in
  // this class 
  public void setPg(String p)
  {
    pg=p;
  }
  
  public void setSg(String sh)
  {
    sg=sh;
  }
  
  public void setSf(String s)
  {
    sf=s;
  }
  
  public void setPf(String po)
  {
    pf=po;
  }
  
  public void setCt(String c)
  {
    ct=c;
  }
  
  public String getPg()
  {
    return pg;
  }
  
  public String getSg()
  {
    return sg;
  }
  
  public String getSf()
  {
    return sf;
  }
  
  public String getPf()
  {
    return pf;
  }
  
  public String getCt()
  {
    return ct;
  }
}