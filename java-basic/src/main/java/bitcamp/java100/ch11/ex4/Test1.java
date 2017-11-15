package bitcamp.java100.ch11.ex4;
//generalization 수행 후 
public class Test1 {
    public static void main(String[] args) {
        //Car car = new Car(); //추상클래이기 때문에 인스턴스를 생성할수 없음! 컴파일오류
        Sedan car1 = new Sedan();
        car1.run();
        car1.stop();
        
        Truck car2 = new Truck();
        car2.run();
        car2.stop();
    }
}
