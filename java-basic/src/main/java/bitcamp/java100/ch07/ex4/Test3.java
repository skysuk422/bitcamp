package bitcamp.java100.ch07.ex4;

public class Test3 { /*extends Object*/
    public static void main(String[] args) {
        
        Test3 obj = new Test3();
        
        System.out.println(obj.toString());
        
        System.out.println(Integer.toHexString(obj.hashCode()));
        
        Test3 obj2 = new Test3();
        Test3 obj3 = obj;
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        
        System.out.println("--------------------------");
        
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        System.out.println("----------------------");
        
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        
        Class c = obj.getClass();
        
        System.out.println(c.getName());
        
    }
}
