package bitcamp.java100;
// 조건문의 용도와 if 문 사용법을 알아보자!
public class Test16_2 {    

    public static void main(String[] args) {

        int age = 27;

        if (age < 19) System.out.println("미성년"); else System.out.println("성년");

        age = 17;
        if (age <= 19)
            System.out.println("미성년");
        else 
            System.out.println("성년");


        System.out.println("--------------------------------");

        age = 57;
        if (age > 65)
            System.out.println("경로우대 대상자입니다.");

        //age = 57; else  문만 단독으로 사용할 수는 없다.
        else
            System.out.println("경로우대 대상자가 아닙니다.");


        System.out.println("--------------------------------");

        age = 27;
        if (age <= 19)
            System.out.println("미성년입니다.");
        System.out.println("청소년 할인을 받을 수 있습니다.");


        System.out.println("--------------------------------");

        if (age <= 19) {
            System.out.println("미성년입니다.");
            System.out.println("청소년 할인을 받을 수 있습니다.");
        }

        System.out.println("--------------------------------");

        age = 13;

        if (age <= 19)
            if (age > 13)
                System.out.println("청소년");


        System.out.println("--------------------------------");

        age = 27;
        if (age <= 19)
            if (age > 13)
                System.out.println("청소년!");
            else
                System.out.println("성년");
        // else는 가까운 if에 묶인다.

        System.out.println("--------------------------------");

        age = 27;
        if (age <= 19) 
            if (age > 13)
                System.out.println("청소년!");

            else
                System.out.println("어린이 또는 유아");

        System.out.println("--------------------------------");

        age = 23;
        if (age <= 19) 
            if (age > 13)
                System.out.println("청소년!");
            else
                System.out.println("어린이 또는 유아");
        else
            System.out.println("성년입니다.");

        System.out.println("--------------------------------");



        // 전문가 들은 블록을 사용하라고 권장한다.
        age = 72;
        if (age <= 19) {
            if (age > 13)
                System.out.println("청소년!");
            else
                System.out.println("어린이 또는 유아");
        }
        else {
            if (age < 65)
                System.out.println("성년");
            else
                System.out.println("노인");
        }

        System.out.println("--------------------------------");

        age = 19;

        if (age < 8)
            System.out.println("유아");
        else
            if(age < 14)
                System.out.println("어린이");
            else
                if (age < 20)
                    System.out.println("청소년");
                else
                    if( age < 65)
                        System.out.println("성년");
                    else
                        System.out.println("노인");

        System.out.println("--------------------------------");

        age = 19;

        if (age < 8)
            System.out.println("유아");
        else if(age < 14)
            System.out.println("어린이");
        else if (age < 20)
            System.out.println("청소년");
        else if( age < 65)
            System.out.println("성년");
        else
            System.out.println("노인");


        // 가독성을 좋게 하기 위해 블록을 사용!
        age = 70;

        if (age < 8) {
            System.out.println("유아");
        } else if(age < 14) {
            System.out.println("어린이");
        } else if (age < 20) {
            System.out.println("청소년");
        } else if( age < 65) {
            System.out.println("성년");
        } else {
            System.out.println("노인");
        }
    }
}



