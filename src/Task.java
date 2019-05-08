import java.util.PriorityQueue;

public class Task<E> {
    private E element;
    private int priority;

    public Task(E element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public E getElement() {
        return element;
    }
}
