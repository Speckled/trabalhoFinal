package dados;
public class cargaPerigosa extends Carga{
    public cargaPerigosa(int numeroVolumes, double peso, double valor) {
        super( peso, valor);
    }
    
    @Override
    public String toString(){
        return "Carga Perigosa{" +
                "idCarga=" + getIdCarga() +
                ", peso=" + getPeso() +
                ", valor=" + getValor() +
                '}';
    }
    
}
