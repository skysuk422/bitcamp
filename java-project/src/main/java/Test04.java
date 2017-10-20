class Test04 {
    public static void main(String[] args) {
      
      String[] names = {"홍길동", "임꺽정", "유관순"};
      int[] kor = {100,90,80};
      int[] eng = {80,80,100};
      int[] math = {100,100,90};

      for(int i=0; i<names.length;i++){
        int sum = kor[i] + eng[i] + math[i];
        float aver = sum/3.0f;
        System.out.printf("%-4s,%4d,%4d,%4d,%4d,%5.1f\n",
        names[i],kor[i],eng[i],math[i],sum,aver);
      }

      }
      


      }
    
    
  
  