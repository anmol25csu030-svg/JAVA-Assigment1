 import java.util.Scanner;

    public class GradingSystem {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int mark = readMark(input);
            String classification = classifyMark(mark);
            printResult(mark, classification);

            input.close();
        }

        static int readMark(Scanner input) {
            System.out.print("Enter mark: ");
            return input.nextInt();
        }

        static String classifyMark(int mark) {
            if (mark < 0 || mark > 100) {
                return "Invalid Mark";
            } else if (mark >= 80) {
                return "Distinction";
            } else if (mark >= 70) {
                return "Merit";
            } else if (mark >= 50) {
                return "Pass";
            } else {
                return "Fail";
            }
        }

        static void printResult(int mark, String classification) {
            System.out.println("Mark: " + mark);
            System.out.println("Classification: " + classification);
        }
    }