package dados;
 
import helpers.retorno;

public class veiculoCarretaFuracao extends Veiculo{
    public veiculoCarretaFuracao(String placa, String modelo, int capacidadeCarga) {
        super(placa, modelo, capacidadeCarga);
    }
    @Override
    public int getCapacidadeCarga() {
        return Integer.MAX_VALUE;
    }
    public retorno adicionarEntrega(Entrega entrega) {
        entregas.add(entrega);
        return new retorno(true, "Carreta furacão nunca te deixa na mão");
    }
    @Override
    public String toString() {
        return "Super Veículo{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", capacidadeCarga=" + getCapacidadeCarga() +
                '}';
    }
}
