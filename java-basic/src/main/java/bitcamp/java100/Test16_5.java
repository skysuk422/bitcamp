package bitcamp.java100;
// do 명령문  while
public class Test16_5 {    

    public static void main(String[] args) {

        int i = 0;
        do
            System.out.println(i++);
        while (i < 5);


        System.out.println("--------------------");

        i = 0;
        do {
            System.out.print("=> ");
            System.out.println(i);
            i++;
        }while (i <5);
        System.out.println("------------------");


    }
}



