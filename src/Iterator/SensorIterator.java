package Iterator;


import java.util.ArrayList;


/**
 * 具体迭代器
 */
public class SensorIterator implements DataIterator{
    private final ArrayList<String> list;
    private int index = 0;

    public SensorIterator(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index <= list.size();
    }

    @Override
    public String getNext() {
        index++;
        return list.get(index);
    }

    @Override
    public boolean isLast() {
        return index == list.size();
    }
}
