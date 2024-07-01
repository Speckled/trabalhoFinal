package dados;

import helpers.retorno;

public class veiculoCaminhao extends Veiculo {
    private int numeroEixos;
    public veiculoCaminhao(String placa, String modelo, int capacidadeCarga, int numeroEixos) {
        super(placa, modelo, capacidadeCarga);
        this.numeroEixos = numeroEixos;
    }
    public int getNumeroEixos() {
        return numeroEixos;
    }
    public retorno adicionarEntrega(Entrega entrega) {
        if (entregas.size() == 0){
            if (entrega.getPesoTotal() > this.getCapacidadeCarga())return new retorno(false, "Entrega excede a capacidade de carga do veiculo");
            if (entrega.hasLiquid())return new retorno(false, "Veiculo não pode transportar carga líquida");
            entregas.add(entrega);
        }
        return new retorno(false, "Veiculo já possui uma entrega") ;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", capacidadeCarga=" + getCapacidadeCarga() +
                ", numeroEixos=" + numeroEixos +
                '}';
    }
}
