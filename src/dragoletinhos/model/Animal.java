package dragoletinhos.model;

/**
 *
 * @author Monique
 */
public class Animal {
    
    private String  nome, sexo, raca, tipoAlimentacao;
    private double peso;
    private int codAnimal,idade; 	 
    private boolean castrado;
    
    public Animal(){
        
    }
    
    public Animal(String nome, String sexo, String raca, double peso, int idade, String tipoAlimentacao, boolean castrado) {
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.tipoAlimentacao = tipoAlimentacao;
        this.peso = peso;
        this.idade = idade;
        this.castrado = castrado;
    }

    public int getCodAnimal() {
        return codAnimal;
    }
    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }
    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isCastrado() {
        return castrado;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    
    
}
