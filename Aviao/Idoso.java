
package aviao;

public class Idoso extends pessoa{
	
	public Idoso(int idade, String nome) {
        super(idade, nome);
    }
    
    Assento a = new Assento();
    private int opc;
    private int i;
    private int j;
 
    public int Reservar(){
 
        System.out.println("Voce deseja resrvar assento normal ou preferencial");
        System.out.println("1 - preferencial");
        System.out.println("2 - normal");
        opc = ler.nextInt();
            
        System.out.println("Escolha o numero do assento (Numero entre 1-20)");
            
        i = ler.nextInt();
        this.a.setCadeira(i);
        while(i > 4){
            i = i-4;
            j++;
        }
        this.a.setFileira(j);
                
        this.setAssento(a);
		
        if(opc == 1){
            returneturn 1;
        }else{
            return 0;
        }   
    }
}  
    
    