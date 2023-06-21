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
        this.tarefas = new ArrayList<>(); //inicalizando a lista de tarefas do tipo Array
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
        String posicao = POSICOES[posicaoAtual];
        System.out.println("Você subiu para " + posicao + "!");
    }

    private void exibirImagem() {
        System.out.println("Imagem da posição " + POSICOES[posicaoAtual]);
    }
}