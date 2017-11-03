package bitcamp.java100.ch09.ex7;

import java.util.Collection;
import java.util.HashMap;

public class Test11 {

    static class MyKey {
        String id;
        String pwd;

        public MyKey(String id, String pwd) {
            this.id = id;
            this.pwd = pwd;
        }
    }

    static class Contact {
        String name;
        String email;
        String tel;

        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        }




        @Override
        public String toString() {
            return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
        }




        public static void main(String[] args) {

            HashMap<String,Contact> map = new HashMap<>();

            map.put("c01", new Contact("홍길동", "hong@test.com", "1111-1111"));
            map.put("c02", new Contact("홍길동", "hong@test.com", "1111-1111"));
            map.put("c03", new Contact("홍길동", "hong@test.com", "1111-1111"));
            map.put("c04", new Contact("홍길동", "hong@test.com", "1111-1111"));
            map.put("c05", new Contact("홍길동", "hong@test.com", "1111-1111"));
            
            
            //값만 꺼내고 싶을때
            Collection<Contact> values = map.values();
            
            for (Contact c : values) {
                System.out.println(c.toString());
            }
            


        }
    }
}