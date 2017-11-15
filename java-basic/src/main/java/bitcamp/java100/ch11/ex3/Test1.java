package bitcamp.java100.ch11.ex3;
//generalization 수행 후 
public class Test1 {
    public static void main(String[] args) {
        Sedan car = new Sedan();
        car.model = "소나타";
        car.cc = 1980;
        
        car.openSunroof();
        car.run();
        car.closeSunroof();
        car.run();
        car.stop();
        
        
    }
}
