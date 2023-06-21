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

       String time = ""; //evitando erro de inicialização da variavel time 

       switch (opcaoTime) {
        case 1:
          time = "Mercedes";
          break;
        case 2:
          time = "Ferrari";
          break;
        case 3:
          time = "Aston Martin";
          break;
        default:
          System.out.println("Opção inválida!");
          break;
       }

       ListaDeTarefas listaDeTarefas = new ListaDeTarefas(time, MAX_TAREFAS);

       scanner.nextLine(); //limpando buffer do scanner

      
      for (int i = 0; i < MAX_TAREFAS; i++) {
        System.out.println("Digite uma tarefa " + (i + 1) + ":" );
        String tarefa = scanner.nextLine();
        listaDeTarefas.adicionarTarefa(tarefa);
       }

       scanner.close();
    }
}
