package bitcamp.java100.ch09.ex2;

public class Test1 {
    
    static void printList(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }
        System.out.println();
        System.out.println("---------------------");

    }
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        list.add("안중근");
        list.add("윤봉길");

        System.out.println(list.size());

        printList(list);

        list.insert(1, "심현석");

        printList(list);
        
        list.insert(3, "김구");
        
   printList(list);
        
        list.insert(5, "이순신");
        
        printList(list);

    }

}
