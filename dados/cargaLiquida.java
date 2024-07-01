package dados;
 
public class cargaLiquida extends Carga{
    private int volume;
    public cargaLiquida(double peso, double valor, int volume) {
        super(peso, valor);
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public String toString(){
        return "Carga Liquida{" +
                "idCarga=" + getIdCarga() +
                ", volume=" + volume + "L" +
                ", valor=" + getValor() +
                '}';
    }
}
