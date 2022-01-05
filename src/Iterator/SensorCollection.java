package Iterator;

import java.util.ArrayList;

/**
 * 传感器迭代器集合
 */
public class SensorCollection implements IterableCollection{

    private ArrayList<String> list;

    public SensorCollection(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public DataIterator createIterator() {
        return new SensorIterator(this);
    }

    @Override
    public ArrayList<String> getList() {
        return this.list;
    }


}
