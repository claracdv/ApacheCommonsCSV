/**
 * Passageiro
 */
public class Passageiro {
    private String cpf;
    private String nome;
    private FormaPagamento formaPgto;
    private String numeroCartao;

    public Passageiro(String cpf, String nome, FormaPagamento formaPgto, String numeroCartao){
        this.cpf = cpf;
        this.nome = nome;
        this.formaPgto = formaPgto;
        this.numeroCartao = numeroCartao;    
    }
    
    public String getCPF(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public FormaPagamento getFormaPgto(){
        return formaPgto;
    }

    public String getNroCartao(){
        return numeroCartao;
    }
}