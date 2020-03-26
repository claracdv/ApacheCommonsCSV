/**
 * Motorista
 */
public class Motorista {
    private String cpf;
    private String nome;
    private Veiculo veiculo;
    private FormaPagamento fPagamento;

    public Motorista(String cpf, String nome, Veiculo veiculo, FormaPagamento fPagamento){
        this.cpf = cpf;
        this.nome = nome;
        this.veiculo = veiculo;
        this.fPagamento = fPagamento;
    }

    public String getCPF(){
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

    public FormaPagamento getfPagamento(){
        return fPagamento;
    }
}