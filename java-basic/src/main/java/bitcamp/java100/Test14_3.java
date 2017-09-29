package bitcamp.java100;
  
public class Test14_3 {    
    
    public static void main(String[] args) {
    // 비트캠프의 수강생 정보를 저장할 데이터 타입
    class bitcamp{
        String name;
        String gender;
        int age ;
        String email;
        String job;
        String phone;
        
       }   
        bitcamp b1;

        b1 = new bitcamp();

        b1.name = "심현석";
        b1.gender = "남";
        b1.age = 29;
        b1.email = "skysuk422@gmail.com";
        b1.job = "무직";
        b1.phone = "010717326669";

        System.out.printf("%s\n %s\n %d\n %s\n %s\n %s\n",
        b1.name, b1.gender, b1.age, b1.email, b1.job, b1.phone);

    }
}

    



