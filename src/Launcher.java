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

            System.out.println("Unknown command");
        }
    }
}