package Iterator;


import java.util.ArrayList;


/**
 * 传感器具体迭代器
 */
public class SensorIterator implements DataIterator{
    private final ArrayList<String> list;
    private int index = 0;

    public SensorIterator(IterableCollection collection) {
        list = collection.getList();
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
