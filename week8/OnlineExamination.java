import java.util.Scanner;

enum Result {
    PASS, FAIL, ABSENT
}

class Student {
    String USN;
    String Name;
    Integer Marks;
    Result resultStatus;
       
    void acceptDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Marks (-1 for Absent): ");
        int marks = sc.nextInt();

        Marks = marks;
    }

    void calculateResult() {
        int m = Marks;

        if (m == -1) {
            resultStatus = Result.ABSENT;
        } 
        else if (m >= 40) {
            resultStatus = Result.PASS;
        } 
        else {
            resultStatus = Result.FAIL;
        }
    }

    void displayResult() {
        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("USN          : " + USN);
        System.out.println("Name         : " + Name);
        System.out.println("Marks        : " + Marks);
        System.out.println("Result Status: " + resultStatus);
    }
}

public class OnlineExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.acceptDetails(sc);
        s.calculateResult();
        s.displayResult();

        sc.close();
    }
}
