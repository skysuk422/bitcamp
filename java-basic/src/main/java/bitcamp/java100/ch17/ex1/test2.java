package bitcamp.java100.ch17.ex1;

public class test2 {

    public static void main(String[] args) throws Exception{
        
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        
        System.out.println(driver.getMajorVersion());
        System.out.println(driver.getMinorVersion());
        System.out.println(driver.toString());

    }

}
