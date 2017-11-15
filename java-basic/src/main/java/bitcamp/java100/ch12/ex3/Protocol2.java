package bitcamp.java100.ch12.ex3;

public interface Protocol2 {
    public static final float PI = 3.14159f;
    
    //public 을 생략할수있다
    static final int AA = 100;
    
    //static 을 생략할수있다
    final int BB = 200;
    
    //final 을 생략할수있다
    int CC= 300;
    
    //생략하면 자동으로 public, static, final 자동으로 붙는다.
    
    //private int DD = 400; //컴파일 오류 왜? 규칙은 공개되야 하니까!
}
