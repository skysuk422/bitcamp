

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberController {
    
    static Scanner keyScan = new Scanner(System.in);
    
    private ArrayList<Member> list = new ArrayList<>();
    
    public void execute() {
        loop:
        while (true) {
            System.out.print("회원관리> ");
            String input = keyScan.nextLine();
            
            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "list": this.doList(); break;
            case "add": this.doAdd(); break;
            case "view": this.doView(); break;
            //case "update": this.doUpdate(); break;
            //case "delete": this.doDelete(); break;
            case "main": break loop;
            default: 
                System.out.println("해당 명령이 없습니다.");
            }
        }
    }
    
    private void doList() {
        System.out.println("[회원 목록]");
        
        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }
    
    private void doAdd() {
        System.out.println("[회원 등록]");
        
        Member member;
        member = new Member(); 
        member.input();
        
        list.add(member);
    } 
    
    private void doView() {
        System.out.println("[회원 상세 정보]");
        String email = Prompts.input("이메일? ");
        
        Member member = null;
        Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member temp = iterator.next();
            if (temp.email.equals(email)) {
                member = temp;
                break;
            }
        }
        
        if (member == null) {
            System.out.printf("'%s'의 회원 정보가 없습니다.\n", email);
        } else {
            member.printDetail();
        }
    }    
    
}
