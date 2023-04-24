public class ListElement {
    private String element;
    private String next;
    private String prev;

    public ListElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("Element: %s, Link to next element: %s, Link to previous element: %s", element, next, prev);
    }

    public String getElement() {
        return element;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }
}
