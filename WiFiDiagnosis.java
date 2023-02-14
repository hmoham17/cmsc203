/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: This class asks the user about their wifi problems to help them figure out the issue. 
 * Due: 2/13/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Hadiya Mohammed 
*/

import java.util.Scanner;

class WiFiDiagnosis {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");

    // 1. Asks user to reboot computer
    System.out.println("Reboot your computer and try to connect! ");
    System.out.print("Did that fix the problem? (Yes or No): ");
    String choice = s.nextLine();
    while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
      System.out.println("Invalid answer; try again\n");
      choice = s.nextLine();
    }
    if (choice.equalsIgnoreCase("yes")) {
      System.out.println("Done");
      System.out.println("Programmer: Hadiya Mohammed");
      return;
    }

    // Asks user to reboot their router and try again
    System.out.println("Reboot your router and try to connect!");
    System.out.print("Did that fix the problem? (Yes or No): ");
    choice = s.nextLine();
    while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
      System.out.println("Invalid answer; try again\n");
      choice = s.nextLine().trim();
    }
    if (choice.equalsIgnoreCase("yes")) {
      System.out.println("Done");
      System.out.println("Programmer: Hadiya Mohammed");
      return;
    }

    // Asks user if their cables are connected
    System.out
        .println("Make sure the cables connecting the router are firmly pugged in and power is getting to the router");
    System.out.print("Did that fix the problem? (Yes or No): ");
    choice = s.nextLine();
    while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
      System.out.println("Invalid answer; try again\n");
      choice = s.nextLine();
    }
    if (choice.equalsIgnoreCase("yes")) {
      System.out.println("Done");
      System.out.println("Programmer: Hadiya Mohammed");
      return;
    }

    // asks user to move their computer closer to the router and try again
    System.out.println("Move the computer closer to the router and try to connect");
    System.out.print("Did that fix the problem? (Yes or No): ");
    choice = s.nextLine();
    while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
      System.out.println("Invalid answer; try again\n");
      choice = s.nextLine();
    }
    if (choice.equalsIgnoreCase("yes")) {
      System.out.println("Done");
      System.out.println("Programmer: Hadiya Mohammed");
      return;
    }

    // If nothing above works, then contact your ISP
    System.out.println("Contact your ISP\n");
    System.out.println("Done");
    System.out.println("Programmer: Hadiya Mohammed");
    return;
  }
}
