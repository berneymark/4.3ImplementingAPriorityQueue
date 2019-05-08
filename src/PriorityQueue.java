import java.util.ArrayList;
import java.util.LinkedList;

public class PriorityQueue {
    ArrayList<Task> taskList = new ArrayList<>();

    public boolean enqueue(Task task) {
        boolean added = false;
        int currentSize = taskList.size();

        if (currentSize == 0) {
            taskList.add(0, task);
            added = true;
        } else {
            for (int i = currentSize - 1; i >= 0; i--) {

                if (taskList.get(i).getPriority() < task.getPriority()) {
                    taskList.add(i + 1, task);
                    added = true;
                    break;
                }
            }
        }

        return added;
    }

    public void dequeueMin() {
        taskList.remove(0);
    }

    public Task findMin() {
        return taskList.get(0);
    }

    @Override
    public String toString() {
        String print = "{";

        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i) != taskList.get(taskList.size() - 1))
                print += taskList.get(i).getElement() + ", ";
            else print += (String)taskList.get(i).getElement();
        }

        print += "}";

        return print;
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.enqueue(new Task("Jane", 1));
        pq.enqueue(new Task("Mary", 2));
        pq.enqueue(new Task("Bobby", 2));
        pq.enqueue(new Task("Billy", 4));
        pq.enqueue(new Task("Sue", 3));

        System.out.println(pq);
    }
}
