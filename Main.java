import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListExam linkedListExam = new LinkedListExam();
        Scanner in = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Enter an linked list element: ");
            String element = in.nextLine();
            ListElement l1 = new ListElement(element);
            if (element.equals("q")) check = false;
            else linkedListExam.addElement(l1);
        }
        int i = 0;
        for (ListElement element : linkedListExam.getList()) {
            if (i == 0) {
                linkedListExam.linkedList.get(i).setPrev(null);
                linkedListExam.linkedList.get(i).setNext(linkedListExam.linkedList.get(i + 1).getElement());
                i++;
            } else if (i == linkedListExam.size() - 1) {
                linkedListExam.linkedList.get(i).setPrev(linkedListExam.linkedList.get(i - 1).getElement());
                linkedListExam.linkedList.get(i).setNext(null);
                i++;
            } else if (i == linkedListExam.size()) {
                break;
            } else {
                linkedListExam.linkedList.get(i).setPrev(linkedListExam.linkedList.get(i - 1).getElement());
                linkedListExam.linkedList.get(i).setNext(linkedListExam.linkedList.get(i + 1).getElement());
                i++;
            }
        }

        for (ListElement element1 : linkedListExam.getList()) {
            System.out.println(element1);
        }
    }
}
