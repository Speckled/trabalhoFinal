package dados;
import java.util.ArrayList;
import java.util.List;
 
public class Transportadora {
    private List<Entrega> entregas;
    private List<Caminhao> caminhoes;

    public Transportadora() {
        entregas = new ArrayList<>();
        caminhoes = new ArrayList<>();

        //dados de exemplo setados inicialmente
        Caminhao caminhao1 = new Caminhao("ABC-1234", "Scania");
        Caminhao caminhao2 = new Caminhao("BCA-1635", "Mercedes");
        Caminhao caminhao3 = new Caminhao("XYZ-7777", "Volvo");
        caminhoes.add(caminhao1);
        caminhoes.add(caminhao2);
        caminhoes.add(caminhao3);

        Entrega entrega1 = new Entrega(25, caminhao1);
        entrega1.adicionarCarga(new Carga(30));
        entrega1.adicionarCarga(new Carga(200.0));

        Entrega entrega2 = new Entrega(150, caminhao2);
        entrega2.adicionarCarga(new Carga(300.0));
    }

    public void adicionarEntrega (Entrega entrega) throws ExcessaoPersonalizada {
        for (Entrega ent: entregas){
            if(ent.getId() == entrega.getId()){
                throw new ExcessaoPersonalizada("Id de entrega já existe.");
            }
        }
        entregas.add(entrega);
    }

    public void deletarEntrega (int id) throws ExcessaoPersonalizada {
        for (Entrega ent: entregas){
            entregas.removeIf(entrega -> ent.getId() == id);
        }
    }

    public Entrega consultarEntregaID (int id) throws ExcessaoPersonalizada {
        return entregas.stream()
                .filter(entrega -> entrega.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Entrega> consultarEntregas () {
        return new ArrayList<>(entregas);
    }

    public List<Caminhao> consultarCaminhaoes () {
        return caminhoes;
    }


    public double consultarValoresEntregas(){
        return entregas.stream()
                .mapToDouble(Entrega::calcularValorTotal)
                .sum();
    }

    public void adicionarCaminhao(Caminhao cam) {
        caminhoes.add(cam);
    }
}
