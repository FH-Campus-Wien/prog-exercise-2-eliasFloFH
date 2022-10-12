package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scanTask1 = new Scanner(System.in);

        double userInput;
        double tempInput = 0;
        int numberCount = 1;

        do {
            System.out.print("Number " + numberCount + ": ");
            userInput = scanTask1.nextDouble();
            numberCount++;

            if (userInput > tempInput) {
                tempInput = userInput;
            }

        } while (userInput >0);

        if (tempInput > 0) {
            System.out.printf("The largest number is %.2f", tempInput);
            System.out.println();
        } else {
            System.out.println("No number entered.");
        }

    }

    //todo Task 2
    public void stairs(){
        // input your solution here

        Scanner scanTask2 = new Scanner(System.in);

        System.out.print("n: ");
        int userChoiceRows = scanTask2.nextInt();

        int count = 1;

        if (userChoiceRows < 0) {

            System.out.println("Invalid number!");

        } else {

            for (int rows = 0; rows < userChoiceRows; rows++) {
                for (int columns = 0; columns < userChoiceRows; columns++) {
                    if (rows >= columns) {
                        System.out.print(count + " ");
                        count++;
                    }
                }
                System.out.println();
            }
        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here

        final int ROWS = 6;
        int dist = 0;

        for (int rows = 1; rows <= ROWS; rows++) {
            for (int x = 0; x < ROWS - rows; x++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= rows * 2 -1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here


    }

    //todo Task 5
    public void marks(){
        // input your solution here

        Scanner scanTask5 = new Scanner(System.in);

        int grade;
        double sum = 0;
        int numberMark = 1;
        double count = 0;
        int negativeMarks = 0;

        do {

            System.out.print("Mark " + numberMark + ": ");
            grade = scanTask5.nextInt();

            if (grade < 0 || grade > 5) {
                System.out.println("Invalid mark!");
            } else {
                numberMark++;
                sum += grade;
            }

            if (grade > 0 && grade < 6) {
                count++;
            }

            if (grade == 5) {
                negativeMarks++;
            }


        } while (grade != 0);

        if (count == 0) {
            count++;
        }

        double averageMark = sum / count;

        System.out.printf("Average: %.2f", averageMark);
        System.out.println();
        System.out.println("Negative marks: " + negativeMarks);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}