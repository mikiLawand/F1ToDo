import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    
    private int MAX_TAREFAS = 6;
    //setando a numero max de tarefas que podem ser adicionadas

    private static final String[] POSICOES = {"P6", "P5", "P4", "P3", "P2", "P1"};
    //setando as posições 


    private String time;
    private List<String> tarefas;
    private int posicaoAtual;

    public ListaDeTarefas(String time, int MAX_TAREFAS) {
        this.time = time;
        this.tarefas = new ArrayList<>(); //definindo as tarefas como a Arraylist
        this.posicaoAtual = 0; //iniciando a posição em 0
        this.MAX_TAREFAS = MAX_TAREFAS;
    }

    public void adicionarTarefa(String tarefa) {
        if (tarefas.size() < MAX_TAREFAS) {
        //se a lista de tarefas for menor que 6
            tarefas.add(tarefa); //ele adiciona a tarefa
            subirPosicao(); //e o usuario sobe de posicao 
        } else {
            System.out.println("Você já adicionou o máximo de tarefas para o dia!");
        }
    }

    private void subirPosicao() {
       if (posicaoAtual < POSICOES.length -1) {
       //sempre que a posição atual for menor que 6
        posicaoAtual++; //o usuario sobe de posição
        exibirMensagem(); //e é exibida uma mensagem 
        exibirImagem(); //e uma imagem
       } else {
        System.out.println("Parabens!Você concluiu todas as suas tarefas");
       }
    }

    private void exibirMensagem() {
        String posicao = POSICOES[posicaoAtual];//obtem a posição do usuario 
        System.out.println("Você subiu para " + posicao + "!");
    }

    private void exibirImagem() {
        String posicao = POSICOES[posicaoAtual]; //obtem a posição do usuario 
        String imagem = "imagem_padrao.jpg";

        switch (posicao) {
            case "P1":
              imagem = "imagem_p1.jpg";
              break;
            case "P2":
              imagem = "imagem_p2.jpg";
              break;
            case "P3":
              imagem = "imagem_p3.jpg";
              break;
            case "P4":
              imagem = "imagem_p4.jpg";
              break;
            case "P5":
              imagem = "imagem_p5.jgp";
              break;
            case "P6":
              imagem = "imagem_p6.jpg";
            default:
              System.out.println("Opção não existente! ");
              imagem = "imagem_padrao.jpg";
              break;
        }

        System.out.println("Imagem da posição " + posicao + ":" + imagem);
    }
}