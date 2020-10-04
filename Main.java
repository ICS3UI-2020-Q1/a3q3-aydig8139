import java.util.Scanner;

/**
 * Tells user what percentage range their grade falls in
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // import scanner for user input
    Scanner input = new Scanner(System.in);
    
    //ask user for a leter grade
    System.out.println("Please enter a letter grade");
    String letterGrade = input.nextLine();

    //switch case statement to determine what percentage range it is
    switch(letterGrade){
      case "A":
       System.out.println("That is between 80% and 100%");
       break;
      case "B":
       System.out.println("That is between 70% and 79%");
       break;
      case "C":
       System.out.println("That is between 60% and 69%");
       break;
      case "D":
       System.out.println("That is between 50% and 59%");
       break;
      case "F":
       System.out.println("That is between 0% and 49%");
       break;
      default:
       System.out.println("Please enter a valid letter");
      }
  }
}
