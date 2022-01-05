package Iterator;

import Entity.SensorData;

/**
 * 数据抽象迭代器
 */
public interface DataIterator {
    boolean hasNext();
    String getNext();
    boolean isLast();

}
