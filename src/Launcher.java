import java.util.Scanner;

class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue"); 
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter word :");

        String word = myObj.nextLine();

        if (word.equals("quit"))  {
            return;
        }
        else{
            System.out.println("Unknown command");
        }
    }
}