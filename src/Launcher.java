import java.util.Scanner;

class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue"); 


        while(true){

            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter word :");
            String word = myObj.nextLine();

            if (word.equals("quit"))  {
                break;
            }

            if (word.equals("fibo"))  {
                Scanner myFibo = new Scanner(System.in);

                System.out.println("Enter a number for Fibonacci :");
                String fibo = myFibo.nextLine();

                int i = Integer.parseInt(fibo);  
                System.out.println(Fibo(i));
                break;
            }

            System.out.println("Unknown command");
        }
    }


    public static int Fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return Fibo(n - 1) + Fibo(n - 2);
    }
}