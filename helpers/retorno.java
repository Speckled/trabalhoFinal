package helpers;

public class retorno {
    private boolean status;
    private String mensagem;
    public retorno(boolean status, String mensagem) {
        this.status = status;
        this.mensagem = mensagem;
    }
    public boolean isStatus() {
        return status;
    }
    public String getMensagem() {
        return mensagem;
    }
    
}
