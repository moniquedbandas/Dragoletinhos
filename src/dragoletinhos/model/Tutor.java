package dragoletinhos.model;

/**
 *
 * @author Monique
 */
public class Tutor {
    
    private String nome, endereco, telefone, cpf;
    private int codTutor;

    public Tutor(){
        
    }
    
    public Tutor(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getCodTutor() {
        return codTutor;
    }
    public void setCodTutor(int codTutor) {
        this.codTutor = codTutor;
    }
  
    
}
