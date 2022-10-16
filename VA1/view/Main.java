package view;
import java.util.*;
import controller.GlobalControl;
public class Main {
    

        final Scanner leitura = new Scanner(System.in);
        GlobalControl global = new GlobalControl();
        public void run() {
            var opcaoMenu = -1;
            System.out.println("Bem vindo ao sistema");
            mensagemPadrao();
    
            while (opcaoMenu != 4) {
                System.out.println("=================== Menu inicial - Digite uma opção ===================");
                opcaoMenu = leitura.nextInt();
                switch (opcaoMenu) {
                    case 0:
                        System.out.println(listarMenu());
                        break;
                    case 1:
                        global.AdicionarJogo();
                        break;
                    case 2:
                        global.ListarJogos();
                        break;
                    case 3:
                        global.AdicionarAvaliacaoNoJogo();
                        break;
                    case 4:
                        System.out.println("-------- Sistema encerrado!!! --------");
                        break;
                }
            }  
        }

        public String listarMenu() {
            return "0 - Listar menu\n"
                    + "1 - Cadastrar Jogo\n"
                    + "2 - Listar Jogos\n"
                    + "3 - Avaliar Jogo\n"
                    + "4 - Sair\n"
                    + "Digite uma opção: ";
        }
    
        public void mensagemPadrao() {
            System.out.println("Digite 0 para listar as opções:");
        }
    
        public static void main(String[] args) {
            new Main().run();
        }
    
        
}
