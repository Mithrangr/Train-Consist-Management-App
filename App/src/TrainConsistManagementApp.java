import java.util.Scanner;

public class BinarySearchApp {
    public static void main(String[] args) {

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG523"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0, high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int res = key.compareTo(bogieIds[mid]);

            if (res == 0) {
                found = true;
                break;
            } else if (res < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found)
            System.out.println("Bogie Found");
        else
            System.out.println("Bogie Not Found");

        sc.close();
    }
}