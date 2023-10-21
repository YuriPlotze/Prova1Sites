import java.util.List;

public class Tarefa {

    private long Nome;
    private long Detalhes;
    private long Status;


    public Long setNome() {
        return this.Nome;
    }

    public void setNome(Long codigo) {
        this.Nome = codigo;
    }

    public Long getDetalhes() {
        return this.Detalhes;
    }

    public void setDetalhes(Long codigo) {
        this.Detalhes = codigo;
    }

    //public void addDetalhes()

    public Long getStatus() {
        return this.Status;
    }

    public void setStatus(Long codigo) {
        this.Status = codigo;
    }



}