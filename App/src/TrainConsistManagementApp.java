import java.util.Scanner;

public class LinearSearchApp {
    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG523"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Bogie Found");
        else
            System.out.println("Bogie Not Found");

        sc.close();
    }
}