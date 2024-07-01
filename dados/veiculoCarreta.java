package dados;
 
import helpers.retorno;

public class veiculoCarreta extends Veiculo{
    public veiculoCarreta(String placa, String modelo, int capacidadeCarga) {
        super(placa, modelo, capacidadeCarga);
    }
    public retorno adicionarEntrega(Entrega entrega) {
        if (entregas.size() == 0) {
            if (entrega.getPesoTotal() > this.getCapacidadeCarga())return new retorno(false, "Entrega excede a capacidade de carga do veiculo");
            if (entrega.hasLiquid())return new retorno(false, "Veiculo não pode transportar carga líquida");
            if (entrega.hasLarge())return new retorno(false, "Veiculo não pode transportar carga grande");
            entregas.add(entrega);
        }
        return new retorno(false, "Veiculo já possui uma entrega") ;
    }
    @Override
    public String toString() {
        return "Carreta{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", capacidadeCarga=" + getCapacidadeCarga() +
                '}';
    }
    
}
