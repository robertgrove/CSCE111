/*
Robert Grove
UIN 628001368
CSCE 111 Section 505
9/8/2021
Assignment 1
*/

class type
{
  public static void main(String[] args)
  {
    System.out.println("Tab example.");
    System.out.println("\t1\t2\t3\t4");
    System.out.println("\t\t1\t3\t3");
    System.out.println("\tAll\tBall\t5\t4\n\n");

    System.out.println("Bacl space example.");
    System.out.println("Robert");
    System.out.println("\b\b\bby ");

    System.out.println("\n\nCarrage return example.");
    System.out.println("Robert is great!");
    System.out.println("\rSamuel");

    System.out.println("\nFormfeed example");
    System.out.println("First line \f second line.");
    System.out.println("First line \n            second line.");

    System.out.println("Quote example");
    System.out.println("In 'java' single quotes can be \'.");
    System.out.println("In \"Java\" for \" you have to use\\");

    char bell = '\u0007';
    System.out.println(bell);

  }
}
