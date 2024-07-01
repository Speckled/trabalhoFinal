package dados;
import java.util.ArrayList;
import java.util.List;

import helpers.retorno;

public class Entrega {
    private static int cont = 1;
    private String id;
    private List<Carga> cargas = new ArrayList<Carga>();
    private Veiculo veiculo;
    private Boolean hasLiquid = false;
    private Boolean hasLarge = false;
    
    public Entrega() {
        this.id = String.format("%03d", cont++);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean hasLiquid() {
        return hasLiquid;
    }
    public boolean hasLarge() {
        return hasLarge;
    }
    public List<Carga> getCargas() {
        return cargas;
    }
    public int getPesoTotal() {
        int pesoTotal = 0;
        for (Carga carga : cargas) {
            pesoTotal += carga.getPeso();
        }
        return pesoTotal;
    }
    // O ideal seria que esses metodos usassem um retorno ao invés de void
    public void adicionarCarga(cargaLiquida carga) {
        if (cargas.size() > 0 && !hasLiquid) {
            // Aqui tem que gerar um erro
            // Já existe uma carga não líquida
            return;
        }
        this.hasLiquid = true;
        cargas.add(carga);
    }
    public void adicionarCarga(cargaGrande carga) {
        if (cargas.size() > 0 && !hasLarge) {
            // Aqui tem que gerar um erro
            // Já existe uma carga não grande
            return;
        }
        this.hasLarge = true;
        cargas.add(carga);
    } 
    public void adicionarCarga(Carga carga) {
        // Checa se a carga existente é compatível com a nova carga
        if (carga instanceof cargaLiquida) {
            hasLiquid = true;
            // Aqui tem que gerar um erro
            // Já existe uma carga líquida
            return;
        } else if (carga instanceof cargaGrande) {
            hasLarge = true;
            // Aqui tem que gerar um erro
            // Já existe uma carga grande
            return;
        }
        cargas.add(carga);
    }
    public void setVeiculo(Veiculo car) {
        retorno retorno = car.adicionarEntrega(this);
        if (!retorno.isStatus()) {
            // Aqui tem que gerar um erro
            // Não foi possível adicionar a entrega ao veículo
            return;
        }
    }
    public Veiculo getVeiculo() {
        if(this.veiculo == null){
            // Aqui tem que gerar um erro
            // Não foi possível retornar o veículo
            return null;
        }
        return veiculo;
    }
    
    

    public String toString() {
        return "Entrega{" +
                "id=" + id +
                '}';
    }
}
