package classes;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    @Override
    public String toString(){
        return "Pessoa Jurídica - Nome: " + getNome() + " - E-mail: " + getEmail() + " - Telefone: " + getTelefone() + " - CNPJ: " + this.cnpj;
    }
    
}
    
    