package java100.app.s7;

import java100.app.Score;

public class Test5 {
    public static void main(String[] args) {
        
        class Score {
            String name;
            int[] subject = new int[3];
            int sum;
            float aver;
        }
        
        Score s1 = new Score();
        s1.name = "홍길동";
        s1.subject[0] = 100;
        s1.subject[1] = 90;
        s1.subject[2] = 80;
        s1.sum = s1.subject[0] + s1.subject[1] + s1.subject[2];
        s1.aver = s1.sum / 3f;
        
        Score s2 = new Score();
        s2.name = "임꺽정";
        s2.subject[0] = 80;
        s2.subject[1] = 80;
        s2.subject[2] = 80;
        s2.sum = s2.subject[0] + s2.subject[1] + s2.subject[2];
        s2.aver = s2.sum / 3f;
        
        Score s3 = new Score();
        s3.name = "유관순";
        s3.subject[0] = 100;
        s3.subject[1] = 100;
        s3.subject[2] = 100;
        s3.sum = s3.subject[0] + s3.subject[1] + s3.subject[2];
        s3.aver = s3.sum / 3f;
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                s1.name, s1.subject[0], s1.subject[1], s1.subject[2], s1.sum, s1.aver);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                s2.name, s2.subject[0], s2.subject[1], s2.subject[2], s2.sum, s2.aver);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                s3.name, s3.subject[0], s3.subject[1], s3.subject[2], s3.sum, s3.aver);
        

    }
}

