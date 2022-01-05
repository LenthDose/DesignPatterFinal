package Iterator;


import java.util.ArrayList;

/**
 * 迭代器集合
 */
public interface IterableCollection {

    DataIterator createIterator();

    ArrayList<String> getList();
}
