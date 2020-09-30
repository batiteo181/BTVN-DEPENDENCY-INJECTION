package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.setToDoList(new ToDoList());
        toDoList.get();
        toDoList.add(10);
    }
}

/*
Thiết kế và thực hiện yêu cầu sau sử dụng kỹ thuật DI
Bối cảnh: bạn cần lưu danh sách công việc (gồm mã công việc,
tên công việc và nội dung công việc).
Tuy nhiên bạn không biết khách hàng muốn sử dụng kiểu cấu trúc dữ liệu
gì trong các kiểu sau:
Stack
Queue
Vậy bạn hãy tạo ra 1 chương trình phù hợp với việc thay đổi kiểu
cấu trúc dữ liệu
Method mà khách hàng yêu cầu là add và get

 */