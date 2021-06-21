
package aviao;

public class MenordeIdade extends pessoa {
    
    public MenordeIdade(int idade, String nome) {
        super(idade, nome);
    }
        
    String Autorizacao;

    public String getAutorizacao() {
        return Autorizacao;
    }

    public void setAutorizacao(String Autorizacao) {
        this.Autorizacao = Autorizacao;
    }
    
}