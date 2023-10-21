import java.util.List;

public class ListaTarefa {

    private long Codigo;
    private List<Tarefa> tarefa;
    private long Tarefa;


    public Long getCodigo() {
        return this.Codigo;
    }

    public void getCodigo(Long codigo) {
        this.Codigo = codigo;
    }

    public List<Tarefa> getTarefa() {
        return this.tarefa;
    }

    public void addTarefa(List<Tarefa> tarefa) {
        this.tarefa.addAll(tarefa);
    }

    public void removeTarefa(List<Tarefa> tarefa) {
        this.tarefa.remove(tarefa);
    }

    

}
