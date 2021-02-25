package ChainOfResponsibility;

import java.util.List;

public class ChainOfResponsibility_Main {
    public static void main(String[] args) {
        Handler<List<Integer>> handler1 = new FilterHandler(0);
        Handler<List<Integer>> handler2 = new SortHandler(1);
        handler1.setNextHandler(handler2);

        List<Integer> list = handler1.handleRequest(null);
        System.out.println(list);


        list = handler1.handleRequest(list);
        System.out.println(list);

        handler1.setProcessingParam(1);
        handler2.setProcessingParam(0);

        list = handler1.handleRequest(list);
        System.out.println(list);
    }
}
