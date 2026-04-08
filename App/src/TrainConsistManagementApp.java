

import java.util.*;
import java.util.function.Predicate;

class Bogie {
    String type;
    String cargo;

    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Box", "Coal"),
                new Bogie("Cylindrical", "Petroleum")
        );

        Predicate<Bogie> rule = b ->
                !(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum"));

        boolean isSafe = bogies.stream().allMatch(rule);

        if (isSafe)
            System.out.println("Train is Safety Compliant");
        else
            System.out.println("Train is NOT Safety Compliant");

    }
}