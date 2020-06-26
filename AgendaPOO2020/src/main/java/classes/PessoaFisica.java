package classes;



/**
 * 
 * @author carvalho
 */

public class PessoaFisica extends Pessoa {

    private String cpf; 

    
    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

        
    @Override
    public String toString(){
        return "Pessoa Física - Nome: " + getNome() + " - E-mail: " + getEmail() + " - Telefone: " + getTelefone() + " - CPF: " + this.cpf;
    }
    
}
