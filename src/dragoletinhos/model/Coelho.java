package dragoletinhos.model;
/**
 *
 * @author xxher
 */
public class Coelho extends Animal {    
    private double velocidadeMaxima;

    public Coelho(){
        
    }

    public Coelho(String nome, String sexo, String raca, double peso, int idade, String tipoAlimentacao, boolean castrado, double velocidadeMaxima) {
        super(nome, sexo, raca, peso, idade, tipoAlimentacao, castrado);
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    
}
