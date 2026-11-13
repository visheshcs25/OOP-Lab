import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        // len
        System.out.println("1. Length: " + email.length());

        // username
        int at = email.indexOf('@');
        if(at!=-1) {
            System.out.println("2. Username: " + email.substring(0,at));
            System.out.println("3. Domain: " + email.substring(at + 1));
        } else {
            System.out.println("Enter valid email");
        }

        String emailLower = email.toLowerCase();
        System.err.println("4. Lowercase Email: " + emailLower);

        // prefix
        System.err.print("Enter prefix: ");
        String pref = sc.nextLine();
        if (email.startsWith(pref)) {
            System.out.println("Starts with");
        } else {
            System.out.println("Does not start with");
        }

        // COMPARE
        if (email.substring(at + 1).equals("bmsce.ac.in")) {
            System.err.println("Valid email");
        } else {
            System.out.println("Not a valid email");
        }

        System.err.println("Updated email: " + email.replace("bmsce.ac.in", "cse.bmsce.ac.in"));

        System.out.println("Enter chracter to search: ");
        String key = sc.nextLine();
        if (email.contains(key)) {
            System.out.println("Contains");
        } else {
            System.out.println("Does not contain");
        }
        String trimmedEmail = email.trim();
        System.out.println("Trimmed Email: " + trimmedEmail);

        System.out.println("Enter another email: ");
        String email2 = sc.nextLine();
        if (email.trim().equalsIgnoreCase(email2.trim())) {
            System.out.println("match");
        } else {
            System.out.println("does not match");
        }
        sc.close();
    }
}
