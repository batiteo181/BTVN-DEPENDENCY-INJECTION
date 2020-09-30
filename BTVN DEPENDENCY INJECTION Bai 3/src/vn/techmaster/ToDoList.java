package vn.techmaster;

public class ToDoList {
    int jobId;
    String jobName;
    String jobContent;
    ToDoList toDoList;

    public void setToDoList(ToDoList toDoList) {
        this.toDoList = toDoList;
    }

    public void setJobId() {
        this.jobId = jobId;
    }
    public void setJobName() {
        this.jobName = jobName;
    }

    public void setJobContent() {
        this.jobContent = jobContent;
    }

    public void add(int data) {
        toDoList.add(data);
    }
    public int get() {
        return toDoList.get();
    }
}
