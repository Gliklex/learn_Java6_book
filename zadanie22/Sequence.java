package zadanie22;
/*
(2) Реализуйте reverseSelector() в Sequence.java.
 */

public class Sequence {
    private Object[] items;
    private int next;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class ReverseSelector implements Selector {
        private int i = items.length;

        @Override
        public boolean end() {
            return i == 0;
        }

        @Override
        public Object current() {
            return items[i - 1];
        }

        @Override
        public void next() {
            if (i > 0) {
                i--;
            }
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }

        System.out.println();

        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            System.out.println(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
}
