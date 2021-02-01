import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Math test");
    int answer = sc.nextInt();
  }
  static boolean q1(int answer) 
  {
    System.out.println("Jimmy and Ariana both want to eat an apple pie. However, they want to share it equally. Jimmy has already ate one pie slice before. The pie has 10 slices. Jimmy says if he eats 4, then it will be fair. Ariana says that if she eats 5, then it woud be fair. Is Ariana right?");
    System.out.println("1 -- Yes");
    System.out.println("2 -- No");
    if(answer == 1)
    {
      boolean corAnswer = true;
      return corAnswer;
    }
  //static int q2(int answer) 
  }

}