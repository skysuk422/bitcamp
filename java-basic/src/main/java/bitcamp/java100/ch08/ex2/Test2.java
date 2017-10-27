package bitcamp.java100.ch08.ex2;

public class Test2 {

    public static void main(String[] args) {
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        Boat b;
        b = new Boat();
//        b = new Vehicle(); // 상위 분류를 하위 분류로 가리킬 수 없다.
//        b = new Car(); // 다른 파생 분류를 가리킬 수 없다.
        
        Car c;
        c = new Car();
        
        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.valve = 16;
        
        c = new Truck();
        
        c.model = "타이탄";
        c.capacity = 3;
        c.enginType = 2;
        c.cylinder = 8;
        c.valve = 32;
        
//        c.weight = 15;
//        c = new Sedan();
        
        c = new Sedan();
//        c = new Boat(); //  다른 파생 분류를 가리킬 수 없다.
//        c = new Vehicle(); // 상위 분류를 하위 분류로 가리킬 수 없다.
        
        Sedan s; 
        s = new Sedan();
//        s = new Truck();
//        s = new Car();
//        s = new Boat();
//        s = new Vehicle();
        
        Sedan r1; // Sedan 객체만 가리킬 수 있다.
        Vehicle r2; // Vehicle 뿐만 아니라 그 하위의 모든 클래스의 인스턴스를 가리킬 수 있다.
        
    }

}
