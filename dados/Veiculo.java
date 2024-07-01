package dados;

import helpers.retorno;
import java.util.List;
import java.util.ArrayList;
public abstract class Veiculo implements Comparable<Veiculo> {
    private String placa;
    private String modelo;
    private int capacidadeCarga;
    // set property visible to subclasses
    protected List<Entrega> entregas = new ArrayList<Entrega>();

    public Veiculo(String placa, String modelo, int capacidadeCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }
    public String getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public abstract retorno adicionarEntrega(Entrega entrega);
    public List<Entrega> getEntrega() {
        return entregas;
    }
    @Override
    public int compareTo(Veiculo outro) {
        return this.placa.compareTo(outro.placa);
    }
}
