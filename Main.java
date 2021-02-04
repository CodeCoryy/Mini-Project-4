import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Scanner to recieve user's answer
    Scanner sc = new Scanner(System.in);
    //Title 
    System.out.println("Ready to take your Math test?\n");
    //First question
    System.out.println("Jimmy and Ariana are school counselors for a camp. They want to group the kids into lines each having 10 children. Jimmy says if they have 5 lines, then you would have to do 5 * 10 to find the total amount of children grouped. Ariana says if you raise 10 to the 5th power, then that will get the total amount of children. Is Jimmy right?\n");
    //Answer choices. 1 = True, 2 = False
    System.out.println("1 -- Yes");
    System.out.println("2 -- No\n");
    int answer = sc.nextInt();
    System.out.println(q1(answer));
    //Second question
    System.out.println("\nWhat is the answer (Write your answer here)\n");
    int answer2 = sc.nextInt();
    System.out.println(q2(answer2));
  }

  //First question method: Checks if answer correct or not. Returns boolean.
  static boolean q1(int answer) 
  { 
    if(answer == 1)
    {
      //Correct answer
      boolean corAnswer = true;
      return corAnswer;    
    }
    else {
      boolean corAnswer = false;
      return corAnswer;
    }
  }

  //Second question method: Checks if answer is correct or not, but returns string.
  static String q2(int answer2) {
    String corAnswer2 = "Correct!";
    String incAnswer2 = "Incorrect";
    if(answer2 == 50) {
      return corAnswer2;
    }
    else {
      //Incorrect answer
      return incAnswer2;
    }
  }
}