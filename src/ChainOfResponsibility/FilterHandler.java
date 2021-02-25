package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FilterHandler extends Handler<List<Integer>> {

    public FilterHandler(int processingParam) {
        super(processingParam);
    }

    @Override
    protected List<Integer> logic(List<Integer> list) {
        if (processingParam > 0)
            list = list.stream().filter(o1 -> o1 % 2 == 0).map(o1 -> o1 * 10).collect(Collectors.toList());
        else list = list.stream().filter(o1 -> o1 % 2 == 0).collect(Collectors.toList());
        return list;
    }

    @Override
    protected List<Integer> nullAttributeLogic(List<Integer> list) {
        list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }
}
