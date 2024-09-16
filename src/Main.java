import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero1 = entrada.nextInt();
        System.out.println("Digite mais um numero:");
        int numero2 = entrada.nextInt();

        if(numero1 == numero2) {
            System.out.println("São iguais!");
        }else if (numero1 > numero2) {
            System.out.println("o Primeiro numero é maior");
        }else {
            System.out.println("o segundo numeros é maior");
        }









    }
}