package Iterator;

import java.util.ArrayList;

/**
 * 具体集合
 */
public class DataCollection implements IterableCollection{

    private final ArrayList<String> list;

    public DataCollection(ArrayList<String> list) {
        this.list = list;
    }

    /**
     * 返回一个特定的具体迭代器类实体
     */
    @Override
    public DataIterator createIterator() {
        return new SensorIterator(list);
    }


}
