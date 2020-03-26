/**
 * Passageiro
 */
public class Passageiro {
    private String cpf;
    private String nome;
    private FormaPagamento fPagamento;
    private String numeroCartao;

    public Passageiro(String cpf, String nome, FormaPagamento fPagamento, String numeroCartao){
        this.cpf = cpf;
        this.nome = nome;
        this.fPagamento = fPagamento;
        this.numeroCartao = numeroCartao;    
    }
    
    public String getCPF(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public FormaPagamento getFormaPgto(){
        return fPagamento;
    }

    public String getNroCartao(){
        return numeroCartao;
    }
}