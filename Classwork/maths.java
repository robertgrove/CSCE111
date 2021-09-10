/*
Robert Grove
UIN 628001368
CSCE 111 Section 505
9/8/2021
Assignment 1
*/

class maths
{
  public static void main(String[] args)
  {
    System.out.println("Math Example.");
    int myInt = -148;
    int max = 20;
    int min = 10;
    System.out.println("Mod example: " + myInt % 14);
    System.out.println("Abs example: " + Math.abs(myInt));
    System.out.println("Hypot example: " + Math.hypot(3,4));
    System.out.println("Pi exmaple: " + Math.PI);
    System.out.println("Max example: " + Math.max(max, min));
    System.out.println("Min example: " + Math.min(max, min));
    System.out.println("Exp example: " + Math.pow(5, 2));
    System.out.println("Random example: " + Math.random());
    System.out.println("Pick a number 1-10: " + (Math.random() *(max - min) + min));

  }
}
