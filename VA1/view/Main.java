package view;
import java.util.*;
public class Main {
    

        final Scanner leitura = new Scanner(System.in);

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
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        System.out.println("-------- Sistema encerrado!!! --------");
                        break;
                }
            }  
        }

        public String listarMenu() {
            return "0 – Listar menu\n"
                    + "1 – Cadastrar Aluno\n"
                    + "2 – Cadastrar Professor\n"
                    + "3 – Cadastrar Matéria\n"
                    + "4 – Cadastrar Curso\n"
                    + "5 – Listar Alunos\n"
                    + "6 – Listar Professor\n"
                    + "7 – Listar Matérias \n"
                    + "8 – Listar Cursos\n"
                    + "9 – Adicionar aluno a um curso\n"
                    + "10 – Adicionar matéria a um curso\n"
                    + "11 – Alterar professor da matéria\n"
                    + "12- Conceder bolsa para aluno\n"
                    + "14 - Sair\n"
                    + "Digite uma opção: ";
        }
    
        public void mensagemPadrao() {
            System.out.println("Digite 0 para listar as opções:");
        }
    
        public static void main(String[] args) {
            new Main().run();
        }
    
        
}
