public class Score2 {
    
    
    String name; // => 문자열을 저장할 name 이라는 메모리를 만들라!
    int[] subjects; // => 국,영,수 점수를 저장할 메모리를 만들라!
    int sum; // => 합계를 저장할 메모리를 만들라!
    float aver; // => 평균을 저장할 메모리를 만들라!
    
    // 생성자
    Score2(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] {kor, eng, math};
        
        this.compute();
    }
    
    // 인스턴스 메서드
    void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
}    
