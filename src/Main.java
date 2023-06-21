import java.util.Scanner;

public class Main {

  private static final int MAX_TAREFAS = 6;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //inicializando a scanner para ler as informações 

       System.out.println("Escolha um time: ");
       System.out.println("1.Mercedes");
       System.out.println("2.Ferrari");
       System.out.println("3.Aston Martin");
       int opcaoTime = scanner.nextInt();
       //lendo a escolha do usuario 

       String equipes = ""; //evitando erro de inicialização da variavel time 

       //switch cases para escolha de equipe
       switch (opcaoTime) {
        case 1:
          equipes = "Mercedes";
          break;
        case 2:
          equipes = "Ferrari";
          break;
        case 3:
          equipes = "Aston Martin";
          break;
        default:
          System.out.println("Opção inválida!");
          break;
       }

       ListaDeTarefas listaDeTarefas = new ListaDeTarefas(equipes, MAX_TAREFAS);
       //inicializando uma lista de tarefas levando em conta o time e o max de tarefas 

       scanner.nextLine(); //limpando buffer do scanner

      
      for (int i = 0; i < MAX_TAREFAS; i++) {
      //o loop continua enquanto o numero de tarefas for menor que 6 
        System.out.println("Digite uma tarefa " + (i + 1) + ":" );
        //pede para o usuario inserir uma tarefa e começa a contagem
        String tarefa = scanner.nextLine();
        //lê a proxima linha 
        listaDeTarefas.adicionarTarefa(tarefa); //adiciona a tarefa a lista de array
       }

       scanner.close();
    }
}
