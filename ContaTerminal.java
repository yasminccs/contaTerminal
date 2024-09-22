import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = myObj.nextLine();

        System.out.println("Informe sua agência: ");
        int agencia = myObj.nextInt();

        System.out.println("Informe seu número: ");
        int numero = myObj.nextInt();

        System.out.println("Informe seu saldo: ");
        int saldo = myObj.nextInt();

        System.out.println(STR."Cliente: \{nome}\nAgência: \{agencia}\nNúmero: \{numero}\nSaldo: \{saldo}");
    }
}