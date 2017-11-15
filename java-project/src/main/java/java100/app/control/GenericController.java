package java100.app.control;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class GenericController<T> implements Controller{

    static Scanner keyScan = new Scanner(System.in);
    
    protected ArrayList<T> list = new ArrayList<>();

    
        
    }
    
    // 물려 받았기 때문에 또 선언해서는 안됨
    //public abstract void execute();

    
        
    

