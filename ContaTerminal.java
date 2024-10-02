package co.dio;
import java.util.Scanner;
import java.util.Random;

public class ContaTerminal extends dadosUsuario {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        dadosUsuario usuario = new dadosUsuario();

        boolean cond = true;

        while(cond){
            System.out.println("Menu eletrônico do usuário:\n 1- Acessar conta\n 2- Criar conta\n 3- Apagar conta");
            String menu = myObj.nextLine();

            switch (menu) {
                case "1":
                    usuario.infos();
                    System.out.println("Nome: " + usuario.getNome() + "\n" + "Agência: " + usuario.getAgencia() + "\n" + "Conta corrente: " + usuario.getContaCorrente());
                    System.out.println("Confirma os dados acima?");
                    String res = myObj.nextLine().toUpperCase();
                    if(res.equals("S")){
                        System.out.println("Conta acessada.");
                    } else {
                        System.out.println("Conta não acessada.");
                    }
                    break;
                case "2":
                    System.out.println("Informe seu nome completo: ");
                    String nome = myObj.nextLine();
                    System.out.println("Informe seu endereço: ");
                    String endereco = myObj.nextLine();
                    System.out.println("Informe seu CPF: ");
                    int cpf = myObj.nextInt();
                    myObj.nextLine();
                    System.out.println("Nome: " + nome + "\n" + "Endereço: " + endereco + "\n" + "CPF: " + cpf);

                    System.out.println("Confirma os dados acima?");
                    String respd = myObj.nextLine().toUpperCase();
                    if(respd.equals("S")){
                        System.out.println("Dados confirmados.");
                    } else {
                        System.out.println("Dados não confirmados.");
                        break;
                    }
                  
                    Random random = new Random();
                    long contaCorrenteGerada = (long) (random.nextDouble() * 1_000_000_0000L);
                    int agenciaGerada = 10000 + random.nextInt(90000);

                    System.out.println("Sua agência: " + agenciaGerada + "\n" + "Sua conta-corrente: " + contaCorrenteGerada);
                    break;
                case "3":
                    usuario.infos();
                    System.out.println("Deseja realmente apagar sua conta?");
                    String resp = myObj.nextLine().toUpperCase();
                    if(resp.equals("S")){
                        System.out.println("Conta excluída com sucesso.");
                    } else {
                        System.out.println("Sua conta não foi excluída.");
                    }
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
}
