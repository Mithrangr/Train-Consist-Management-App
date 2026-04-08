import java.util.*;

public class DefensiveSearchApp {
    public static void main(String[] args) {

        List<String> bogieIds = new ArrayList<>();

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available for search");
        }

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