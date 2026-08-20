import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine(); // consume the leftover newline

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        while (n-- > 0) {
            String role = input.nextLine().trim(); // read full line and trim spaces

            switch (role) {
                case "Student":
                    studentCount++;
                    break;

                case "Rockstar":
                    rockstarCount++;
                    break;

                case "Hacker":
                    hackerCount++;
                    break;

                default:
                    // optional: handle unexpected input
                    break;
            }
        }

        System.out.println(studentCount + " " + rockstarCount + " " + hackerCount);

        input.close();
    }
}
