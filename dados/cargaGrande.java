package dados;
 
public class cargaGrande extends Carga{
    public cargaGrande(double peso, double valor) {
        super(peso, valor);
    }
    
    @Override
    public String toString(){
        return "Carga Grande{" +
                "idCarga=" + getIdCarga() +
                ", peso=" + getPeso() +
                ", valor=" + getValor() +
                '}';
    }
}
