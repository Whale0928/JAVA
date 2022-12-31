package c.impl.list;

public abstract class AbstractList implements List {
    private int index;
    @Override
    public void add() {

    }

    @Override
    public void update(int index, Object value) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int prevIndex(int index) {
        return 0;
    }

    @Override
    public int nextIndex(int index) {
        return 0;
    }

    public abstract void clear();
}
