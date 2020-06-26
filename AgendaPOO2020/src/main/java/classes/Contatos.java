package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carvalho
 */
public class Contatos {
    
    private List<Pessoa> pessoas = new ArrayList<>();

    public Contatos() {
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void addPessoas(Pessoa pessoa) {
        if(pessoa.getTelefone() != null && pessoa.getEmail()!= null) {
            pessoas.add(pessoa);
        }
    }
    
    
}
