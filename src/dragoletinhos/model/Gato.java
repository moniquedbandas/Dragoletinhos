package dragoletinhos.model;

/**
 *
 * @author xxher
 */
public class Gato extends Animal {
    
    private String temperamento;
    
    public Gato() {
        
    }

    public Gato(String nome, String sexo, String raca, double peso, int idade, String tipoAlimentacao, boolean castrado, String temperamento) {
        super(nome, sexo, raca, peso, idade, tipoAlimentacao, castrado);
        this.temperamento = temperamento;
    }

    public String getTemperamento() {
        return temperamento;
    }
    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
    
    
}
