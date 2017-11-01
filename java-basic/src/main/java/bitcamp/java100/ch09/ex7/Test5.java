package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test5 {
    
    static class Contact {
        String name;
        String email;
        String tel;
        
        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }
    }
    public static void main(String[] args) {

        //여러 객체(주소)를 저장할 컬렉션 준비
        HashSet<Contact> set = new HashSet<>();
        
       Contact c1 = new Contact("홍길동", "hong@test.com", "1111-1111");
       Contact c2 = new Contact("홍길동", "hong@test.com", "1111-1111");
       Contact c3 = new Contact("홍길동", "hong@test.com", "1111-1111");

        System.out.println(c1 == c2); // false
        System.out.println(c1 == c3); // false
        System.out.println(c2 == c3);; // false
        
        //c1, c2, c3 hashCode()의 리턴값이 다름
       System.out.println(c1.hashCode());
       System.out.println(c2.hashCode());
       System.out.println(c3.hashCode());

       System.out.println(c1.equals(c2)); // true
       System.out.println(c1.equals(c3)); // true
       System.out.println(c2.equals(c3)); // true

       set.add(c1);
       set.add(c2);
       set.add(c3);
        
       
       System.out.println(set.size());
        
       Contact[] arr = new Contact[set.size()];
            set.toArray(arr);
            
        for (Contact c : arr) {
            System.out.printf("%s, %s, %s\n ", c.name, c.email, c.tel);
        }

        
    }
}
