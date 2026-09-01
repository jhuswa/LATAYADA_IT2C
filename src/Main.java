import java.util.Scanner;
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------------------");
    System.out.println("------PORTFOLIO OF ACTIVITY-----");
    System.out.println("NAME: JHUSWA LATAYADA");
    System.out.println("SECTION AND YEAR: IT2C");
    System.out.println("------------CONTENTS------------");
    System.out.println("1. Activity 1");
    System.out.println("2. Activity 2");
    System.out.println("--------------------------------");
    System.out.println("Enter Selection: ");
    int select = sc.nextInt();
    System.out.println("--------------------------------");

    if (select == 1) {
        Activity1 act1 = new Activity1();
        act1.userGreeting();
    }else if (select == 2){
        Activity2 act2 = new Activity2();
        act2.cinemaTicket();
    }
    else {


        System.out.println("Selection Not Found");
    }
}