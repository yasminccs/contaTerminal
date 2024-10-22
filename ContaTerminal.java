package co.dio.projetoPessoaConta;
import java.util.Scanner;
import java.util.Random;

public class ContaTerminal extends dadosUsuario {
    static Scanner myObj = new Scanner(System.in);
    static dadosUsuario usuario = new dadosUsuario();

    public static void main(String[] args){
        boolean cond = true;

        while(cond){
            System.out.println("Menu eletrônico do usuário:\n 1- Acessar conta\n 2- Criar conta\n 3- Apagar conta");
            String menu = myObj.nextLine();

            switch (menu) {
                case "1":
                    accessUser();
                    break;
                case "2":
                    createContaUser();
                    break;
                case "3":
                    deleteContaUser();
                    break;
                default:
                    System.out.println("Entrada inválida.");
                    break;
            }

            System.out.println("Deseja voltar ao menu?");
            String res = myObj.nextLine().toUpperCase();

            if (res.equals("N")) {
                cond = false;
            }
        }
    }
    public static void accessUser(){
        usuario.infos();
        System.out.println("Nome: " + usuario.getNome() + " | " + "Agência: " + usuario.getAgencia() + " | " + "Conta corrente: " + usuario.getContaCorrente());
        System.out.println("Confirma os dados acima?");
        String res = myObj.nextLine().toUpperCase();
        if(res.equals("S")){
            System.out.println("Conta acessada.");
        } else {
            System.out.println("Conta não acessada.");
        }
    }

    public static void createContaUser(){
        System.out.println("Informe seu nome completo: ");
        String nome = myObj.nextLine();
        System.out.println("Informe seu endereço: ");
        String endereco = myObj.nextLine();
        System.out.println("Informe seu CPF: ");
        int cpf = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Nome: " + nome + " | " + "Endereço: " + endereco + " | " + "CPF: " + cpf);

        System.out.println("Confirma os dados acima?");
        String respd = myObj.nextLine().toUpperCase();
        if(respd.equals("S")){
            System.out.println("Dados confirmados com sucesso! A seguir, informaremos sua agência e conta corrente.");
        } else {
            System.out.println("Dados não confirmados.");
            return;
        }

        Random random = new Random();
        long contaCorrenteGerada = (long) (random.nextDouble() * 1_000_000_0000L);
        int agenciaGerada = 10000 + random.nextInt(90000);

        System.out.println("Sua agência: " + agenciaGerada + " | " + "Sua conta corrente: " + contaCorrenteGerada);
    }

    public static void deleteContaUser(){
        usuario.infos();
        System.out.println("Deseja realmente apagar sua conta?");
        String resp = myObj.nextLine().toUpperCase();
        if(resp.equals("S")){
            System.out.println("Conta excluída com sucesso.");
        } else {
            System.out.println("Sua conta não foi excluída.");
        }
    }
}
