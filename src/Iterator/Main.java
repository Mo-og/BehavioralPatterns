package Iterator;

public class Main {
    public static void main(String[] args) {
        Aggregate data = new Data();
        for (Iterator iterator = data.createIterator(); iterator.hasNext(); ) {
            String item = String.valueOf(iterator.next());
            System.out.println("Data item: " + item);
        }
    }
}
