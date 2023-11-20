import java.util.Scanner;

public class MajorDeterminerBTHS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Hey Brooklyn Tech Student! What is your name?");
            String inputName = scanner.nextLine();

            System.out.println("Which are you interested in? : technology, science, or neither? (cte/science/non-stem)");
            String category = scanner.nextLine();

            MajorCategoryDecider decider = new MajorCategoryDecider(inputName);

            if (category.equals("cte")) {
                decider.decideCTEMajor();
            } else if (category.equals("science")) {
                decider.decideScienceMajor();
            } else if (category.equals("non-stem")) {
                decider.decideNonSTEMMajor();
            } else {
                System.out.println("You need to choose out of the 3 categories! (cte/science/non-stem)");
            }

            System.out.println("Did you receive a major that you think you are interested in?");
            System.out.println("If not, would you like to try again? (yes/no)");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equals("yes")) {
                continueProgram = false;
            }
        }

        scanner.close();
    }
}


