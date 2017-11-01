package bitcamp.java100.ch09.ex6;
//제네릭 적용 후
public class Test2 {
   
      
    public static void main(String[] args) {
        
        // 제네릭 도입한 클래스 사용할때는 타입 이름 전달해야함
        // 전달 하지 않으면 기본이 Object가 된다.
        Stack2<Contact> contacts = new Stack2<Contact>();
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));


        //contacts.push(new String ("안중근")); //컴파일오류
        //contacts.push(new Boolean(true)); //컴파일오류
        
        Contact c = (Contact)contacts.pop();
        
        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        //bookStack.push(new String()); //컴파일오류
        //bookStack.push(new Integer(20)); //컴파일오류
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        //예2) ScoreStack
        Stack2<Score> scoreStack = new Stack2<>();
        scoreStack.push(new  Score());
        scoreStack.push(new  Score());
        scoreStack.push(new  Score());
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        
        
        
        
    }
    }

