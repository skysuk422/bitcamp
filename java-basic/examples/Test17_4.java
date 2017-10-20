package bitcamp.java100;
//메서드 - 기본 메서드 정의 III
public class Test17_4 {    

    static void m1(int... values) {
    System.out.printf("아규먼트 개수: %d\n",values.length);
    for (int v : values) {
        System.out.println(v);
    }
    System.out.println("-----------------");
    }
    //static void m2(int...values, int...is values2) {}
    
    static void m3(String name, int age, int... values) {}
    
    static void sum(int... values) {
        int s = 0;
        for (int v : values) {
            s+= v;
        }
        System.out.printf("합계: %d\n", s);
    }
    public static void main(String[] args) {
        
     m1();
     m1(10);
     m1(10, 20);
     m1(10, 20 ,30);
     
     sum();
     sum(1, 2, 3, 4, 5);
     sum(100, 80, 70, 90);
    }
}




