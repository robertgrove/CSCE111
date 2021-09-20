/*
Robert Grove
UIN 628001368
CSCE 111 Section 505
9/8/2021
Assignment 1
*/

class Scanner

{
  public static  void main(String[] arg)
  {
    System.out.println("=============================\n");
    System.out.println("| Let's play the name game! |\n");
    System.out.println("=============================\n\n");
    System.out.println("----------------------------------\n");
    Scanner name = new Scanner(System.in);
    System.out.println("| Enter your name: ");
    String user_name = name.nextLine();
    System.out.println(" |\n");
    System.out.println("----------------------------------\n\n");

    System.out.println(user_name);



  }
}
