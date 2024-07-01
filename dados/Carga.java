package dados;
public class Carga {
    private static int contador = 1;
    private String idCarga;
    private double peso;
    private double valor;

    public Carga(double peso, double valor) {
        this.idCarga = String.format("%03d", contador++);
        this.valor = valor;
    }

    public String getIdCarga() {
        return idCarga;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "idCarga=" + idCarga +
                ", peso=" + peso +
                ", valor=" + valor +
                '}';
    }
}
