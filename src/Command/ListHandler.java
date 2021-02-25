package Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ListHandler {
    private List<Double> list = new ArrayList<>();

    public void printList() {
        System.out.println(list);
    }

    public void initiate() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + random.nextDouble() * random.nextInt(5));
        }
    }

    public void clear() {
        list.clear();
    }


    public void add() {
        list = list.stream().map(o1 -> o1 + 25.25).collect(Collectors.toList());
    }

    public void subtract() {
        list = list.stream().map(o1 -> o1 - 25.25).collect(Collectors.toList());
    }

    public void multiply() {
        list = list.stream().map(o1 -> o1 * 10).collect(Collectors.toList());
    }

    public void divide() {
        list = list.stream().map(o1 -> o1 / 10).collect(Collectors.toList());
    }
}
