import java.util.Scanner;

// first program
public class Main {
    public static void main(String[] args) {
        // output
//        System.out.println("Hello Java!");
//        System.out.println("hello world! ");

        //variable
//        String name = "saqib";
//        int age = 17;
//        String friend ="sattar";
//        String BestFriend = friend;
//        System.out.println(BestFriend );

        //JAVA type of two

        //first type primitive

//       byte - 1byte ki memory leta hai [-128 to 127]
//        byte age = 17 ;
//        System.out.println(age);

//        short - 2bytes memory leta hai

//        int - 4bytes memory leta hai (1,2,3,4,5,6 integars)
//           int phone = 1234567890;
//        System.out.println(phone);

//        long - 8bytes memory leta hai
//            long phone2 = 12345678900L;
//        System.out.println(phone2);

//        float - 4bytes memory leta hai (3.14 point wali value pi hoti hai)
//                 float pi = 4153.33F;
//        System.out.println(pi);

//        double -8bytes memory leta hai

//         char -2bytes memory leta hai(a,b,c,d,e,f,@,# ,)
//            char letter = '@';
//        System.out.println(letter);

//          boolean = 1 bytes memory leta hai (true/false)

        //second type non primitive /refrence









//        ATM PROGRAM

        //declare and initialize balance, withdraw, and deposit
        int balance = 100000,withdraw,deposit;

        //create scanner class object to get choice of user
        Scanner sc=  new Scanner(System.in);
        while (true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("choose the operation you want to perform");

            //get choice from user
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the money");

                    withdraw =sc.nextInt();
                     if(balance>= withdraw){
                         balance= balance- withdraw;
                         System.out.println("Please collect the money");
                     }else {
                         System.out.println("Insufficient money");
                     }
                    System.out.println("");
                    break;

                     case 2:
                         System.out.println("Deposit your money");
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                         System.out.println("Your Money has been successfully deposit");
                         System.out.println("");
                         break;

                case 3:
                    System.out.println("Balance : "+ balance);
                    System.out.println("");
                    break;

                case 4 :
                    System.exit(0);


            }
        }
    }
}