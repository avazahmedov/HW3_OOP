import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListExam implements Iterable<ListElement> {
    List<ListElement> linkedList = new ArrayList<>();

    @Override
    public Iterator<ListElement> iterator() {
        return new Iterator<ListElement>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < linkedList.size();
            }

            @Override
            public ListElement next() {
                return linkedList.get(index++);
            }
        };
    }

    public LinkedListExam addElement(ListElement listElement) {
        linkedList.add(listElement);
        return this;
    }

    public List<ListElement> getList() {
        return linkedList;
    }

    public int size() {
        return linkedList.size();
    }
}
