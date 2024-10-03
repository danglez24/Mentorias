import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        boolean flag = false;
        Boolean start = keyboard.nextBoolean();
        if (start) {
            flag =! flag;
            while (flag) {
                System.out.println(input);
            }
        }
        String hola = "Hola prueba 1";
        
        System.out.println(hola);
    }
}
