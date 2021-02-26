package Iterator;

public class Data implements Aggregate {
    private final String[] data = {
            "Param 1",
            "Param 2",
            "Param 3",
            "Param 4",
            "Param 5"
    };

    @Override
    public Iterator createIterator() {
        return new DataIterator();
    }


    private class DataIterator implements Iterator {
        private int nextPointer;

        @Override
        public boolean hasNext() {
            return nextPointer < data.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) return data[nextPointer++];
            return null;
        }
    }
}
