package dragoletinhos.model;

public class Cachorro extends Animal {
    
    private boolean adestrado;
    private String porte;
    
    public Cachorro(){
        
    }

    public Cachorro(String nome, String sexo, String raca, double peso, int idade, String tipoAlimentacao, boolean castrado, String porte, boolean adestrado) {
        super(nome, sexo, raca, peso, idade, tipoAlimentacao, castrado);
        this.adestrado = adestrado;
        this.porte = porte;
    }
    
    public boolean isAdestrado() {
        return adestrado;
    }
    public void setAdestrado(boolean adestrado) {
        this.adestrado = adestrado;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    
}
