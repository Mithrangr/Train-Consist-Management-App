import java.util.Arrays;

public class SortBogieApp {
    public static void main(String[] args) {

        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General"};

        Arrays.sort(bogieTypes);

        System.out.println(Arrays.toString(bogieTypes));
    }
}