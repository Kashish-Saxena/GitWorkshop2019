public class Intro {
  
  private String name;
  public Intro(String name)
  {
       this.name = name;
  }
  
  public String getName(){
    return name;
  }

  public static void main( String args[] )
  {
      Intro i = new Intro("Kashish");
      System.out.print("My name is "+ i.getName() +".");
  }
}
