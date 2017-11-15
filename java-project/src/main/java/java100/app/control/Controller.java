package java100.app.control;

public interface Controller {
    /*생략가능 public abstract*/ void execute();
    
    default void init() {}
    
    
    default void destroy() {}

}
