package Task9;
import java.util.Scanner;

public class grading_5 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  score;    
	      char grade;    

	      
	      Scanner console = new Scanner(System.in);

	      
	      System.out.print("Enter your mark ");
	      score = console.nextInt();

	      // Calculate the grade.
	      if (score == 100) {
	    	  grade = 'S';
	      }
	      else if (score >= 90)
	      {
	         grade = 'A';
	      }
	      else if (score >= 80)
	      {
	         grade = 'B';
	      }
	      else if (score >= 70)
	      {
	         grade = 'C';
	      }
	      else if (score >= 60)
	      {
	         grade = 'D';
	      }
	      else if (score >= 50)
	      {
	    	  grade = 'E';
	      }
	      else
	      {
	         grade = 'F';
	      }

	      // Display the grade.
	      System.out.println("Your grade is " + grade);
	   }
	}