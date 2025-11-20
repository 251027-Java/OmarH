import java.util.Scanner;

public class LetterGrades {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double grade = -1;
        boolean invalidInput = true;

        while (invalidInput) {
            try {
                System.out.println("Please enter a score between 0 and 100");
                grade = scanner.nextDouble();
                if(( grade <= 100 ) && ( grade >= 0 )) {
                    invalidInput = false;
                }else {
                    System.out.println(" Value was out of range, please try again");
                }
            } catch (Exception e) {
                System.out.println("That wasn't a number!");
                scanner.next();
            }
        }
        scanner.close();

        System.out.println(grade);

        if (grade < 60){
            IO.println("F");

        } else if (grade < 70){
            IO.println("D");

        } else if (grade < 80){
            IO.println("C");

        } else if(grade < 90){
            IO.println("B");

        } else {
            IO.println("A");
        }

    }
}
//for - counted by the iterator
//while - continue until false
//do-while - run it once, then continue until false
//for-each - use an iterable