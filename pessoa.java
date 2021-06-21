
package aviao;

import java.util.Scanner;

public class pessoa {
    
    Scanner ler = new Scanner(System.in);
   
    int idade;
    String nome;
    Assento assento = new Assento();

    public pessoa(int idade, String nome){
		
        this.nome = nome;
        this.idade = idade;
		
    }
    
    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public void imprimir(){
        System.out.println(this.nome + this.idade);
    }
    
    public boolean reserva(int cad){
		
        int count = 0;
		int re = this.assento.getreservado();
		
		if(re == 1){
			
			return false;
			
		}
		
		this.assento.setCadeira(cad);
            
        while(cad > 4){
            cad = cad-4;
            count++;
        }
		
	this.assento.setFileira(count);    
	this.assento.setreservado(1);
        return true;
		
    }  
}

