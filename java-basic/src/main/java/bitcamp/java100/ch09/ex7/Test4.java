package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

import bitcamp.java100.ch09.ex7.Test5.Contact;

public class Test4 {
    
    public static void main(String[] args) {

        //여러 객체(주소)를 저장할 컬렉션 준비
        HashSet<String> set = new HashSet<>();
        
        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";

        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        String s4 = new String("홍길동");
        String s5 = new String("홍길동");
        
        
         System.out.println(s1 == s4); // false
         System.out.println(s1 == s5); // false
         System.out.println(s4 == s5);; // false
         
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
        
        set.add(s4);
        set.add(s5);
        
        System.out.println(set.size());
        

        String[] arr = new String[set.size()];
        set.toArray(arr);
        
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
        System.out.println();
        /*
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        set.add(null);
        set.add(null);

        System.out.println(set.size());
        
        
        String[] arr = new String[set.size()];
        String[] arr2 = set.toArray(arr);
        
        if (arr == arr2)
            System.out.println("arr == arr2");
        else
            System.out.println("arr != arr2");
            
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
        System.out.println();
*/
        
    }
}
