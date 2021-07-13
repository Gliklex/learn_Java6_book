package zadanie4;
/*
(2) Добавьте в класс Sequence.SequenceSelector метод для получения ссылки на внешний класс Sequence.
 */

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object obj) {
        if (next < items.length) {
            items[next++] = obj;
        }
    }

    public class SequenceSelector implements Selector {
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

        public Sequence outerGet() {
            return Sequence.this;
        }
    }
    public SequenceSelector sequenceSelector() {
        return new SequenceSelector();
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence seq = new Sequence(3);
        Sequence.SequenceSelector sSS = seq.sequenceSelector();
        sSS.outerGet();
    }
}
