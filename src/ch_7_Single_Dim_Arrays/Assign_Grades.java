package ch_7_Single_Dim_Arrays;

public class Assign_Grades {
	
	/*7.1 (Assign scores) Write a program that reads student scores, gets the best score, and
then assigns scores based on the following scheme:
Grade is A if score is >= best -10;
Grade is B if score is >= best -20;
Grade is C if score is >= best -30;
Grade is D if score is >= best -40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the scores.*/

	public static void main(String[] args) {
		
		// Reads student scores
		int [] scores = createScoresArray();
		
		// Gets the best score
		int maxScore = getMaxScore(scores);
		
		// Assigns scores based on the scheme
		assignScores(scores, maxScore);
		
	}

	public static int[] createScoresArray() {
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter number of student: ");
		int numberStudents = input.nextInt();
		System.out.print("Enter " + numberStudents+ " scores: ");
		int [] scores = new int [numberStudents];
		for (int i = 0; i < numberStudents; i++)
		scores[i] = input.nextInt();
		return scores;
	}
	
	public static int getMaxScore(int [] scores) {
		int score = scores[0];
		for (int i = 0; i < scores.length; i++) {
		if (scores[i] > score) score = scores[i];
		}
		System.out.println("Max score is "+score);
		return score;
	}
	
	public static void assignScores(int [] scores, int score) {
		char [] grades = {'A', 'B', 'C', 'D'};
		char grade;
		for (int i = 0; i < scores.length; i++) {
			int index = (int)(score - scores[i] - 1) / 10;
			if (index <= 3) {
				grade = grades[index];
				System.out.println("Student " + (i + 1) +" score is " + scores [i] + " and grade is " + grade);
			}
			else {
				grade = 'F';
				System.out.println("Student " + (i + 1) +" score is " + scores [i] + " and grade is " + grade );
			}	
		}
		
	}
	
	

}
