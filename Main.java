import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Math test");
    int answer = sc.nextInt();
    System.out.println(q1(answer));
  }
  static boolean q1(int answer) 
  { 
    System.out.println("Jimmy and Ariana are school counselors for a camp. They want to group the kids into lines each having 10 children. Jimmy says if they have 5 lines, then you would have to do 5 * 10 to find the total amount of children groped. Arian says if you raise 10 to the 5th power, then that will get the total mount of children. Is Jimmy right?");
    System.out.println("1 -- Yes");
    System.out.println("2 -- No");
 
    if(answer == 1)
    {
      boolean corAnswer = true;
      return corAnswer;    
    }
    else {
      boolean corAnswer = false;
      return corAnswer;
    }
  //static int q2(int answer) 
  }
  static boolean q2(int answer2) {
    System.out.println("What is the answer then?");
    if(answer2 == 50){
      return corAnswer2;
    }
    else {
      System.out.println("Incorrect");
      return incAnswer2;

    }


  }

}