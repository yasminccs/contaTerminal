package co.dio.projetoPessoaConta;
import java.util.Scanner;

public class dadosUsuario {
    private String nome;
    private int agencia;
    private int contaCorrente;

    public void infos(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        this.nome = myObj.nextLine();
        System.out.println("Informe sua agência: ");
        this.agencia = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Informe sua conta corrente: ");
        this.contaCorrente = myObj.nextInt();
    }

    public String getNome(){
        return nome;
    }
    public int getAgencia(){
        return agencia;
    }
    public int getContaCorrente(){
        return contaCorrente;
    }
}