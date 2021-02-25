package ChainOfResponsibility;

import java.util.Comparator;
import java.util.List;

public class SortHandler extends Handler<List<Integer>> {
    public SortHandler(int processingParam) {
        super(processingParam);
    }

    @Override
    protected List<Integer> logic(List<Integer> list) {
        if (processingParam == 0) {
            // 1 2 3
            list.sort(Integer::compareTo);
        } else {
            // 3 2 1
            list.sort(Comparator.reverseOrder());
        }
        return list;
    }

    @Override
    protected List<Integer> nullAttributeLogic(List<Integer> list) {
        return list;
    }
}
