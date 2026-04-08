import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    String cargo;

    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class PerformanceApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Cylindrical", "Petroleum"));
            bogies.add(new Bogie("Box", "Coal"));
        }

        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.type.equals("Cylindrical")) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.type.equals("Cylindrical"))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Time: " + loopTime + " ns");
        System.out.println("Stream Time: " + streamTime + " ns");
    }
}