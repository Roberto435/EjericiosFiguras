//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lado;
        int opciones;
        Figuras figurin= new Figuras();

        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe el tamaño del lado");
        lado= sc.nextInt();

        figurin.Rombo(lado);
    }
}