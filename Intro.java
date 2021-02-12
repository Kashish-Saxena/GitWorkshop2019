/**
 * This is an Introduction class for git testing.
 * 
 * @author Kashish Saxena
 * @version 1.0
 *
 */
public class Intro {
  
  private String name;
  
  /**
   * Constructor of the Intro class
   * 
   * @param name Name of the person
   */
  public Intro(String name)
  {
       this.name = name;
  }
  
  /**
   * Returns the name of the person
   * @return The name of the person
   */
  public String getName(){
    return name;
  }
  
  // Main function
  public static void main( String args[] )
  {
      Intro i = new Intro("Kashish");
      System.out.print("My name is "+ i.getName() +".");
  }
}
