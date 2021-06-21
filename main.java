package aviao;

import java.util.Scanner;

public class main {
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        String nome;
        int xa;
		
	pessoa[] p = new pessoa[80];
	MenordeIdade[] c;
        c = new MenordeIdade[80];
	Idoso[] i = new Idoso[80];
        
        for(xa=0; xa<20; xa++){
	    c[xa] = new MenordeIdade(0, null);
	}
	for(xa=0; xa<20; xa++){
	    i[xa] = new Idoso(0, null);
	}
	for(xa=0; xa<20; xa++){
	    p[xa] = new pessoa(0, null);
	}
		
	int countc = 0;
	int counti = 0;
	int countp = 0;
        int assp = 0;
		
	int ass;
        int x = 0; 
        
        while(x != 1){
            int opc;
            System.out.println("MENU");
	        System.out.println("1 - reserva");
	        System.out.println("2 - consulta assentos livres");
	        System.out.println("3 - numero de passageiros");
	        System.out.println("4 - passageiro por assento");
	        System.out.println("5 - idade dos passageiros");
	        System.out.println("6 - sair");
            
            opc = ler.nextInt();
            
            
            switch(opc){
                 
                case 1:{
                    System.out.println("Digite sua idade");
		    idade = ler.nextInt();
		    System.out.println("Digite seu nome");
		    nome = ler.next();
		    System.out.println("Digite o numero do assento");
		    ass = ler.nextInt();
					 
		    if(idade <= 18){
                                        
			countc++;
			c[ass].setNome(nome);
			c[ass].setIdade(idade);	 
			c[ass].reserva(ass);	
				 
		     }
		    if(idade > 60){
						
							 
			counti++;
			
			i[ass].setNome(nome);
			i[ass].setIdade(idade);
                        i[ass].reserva(ass);
 
		   }else{
						
							
			countp++;
			
			p[ass].setNome(nome);
			p[ass].setIdade(idade);
						 
			p[ass].reserva(ass);
			 
		   }		
					 					 
                }break;    
                case 2:{
					
		    int a;
					
		    a = 80 - (countp + counti + countc);
	
		    System.out.println("O numerode assentos livres e :" + a);
                     
                }break;
                case 3:{
					
		    int b;
					
		    b = counti + countp + countc;
					
		    System.out.println("O numero de passageiros e :" + b);
                     
                }break;
		case 4:{
					
		    int ver;
		    int j;
					
		    System.out.println("Digite o numero do assento que voce deseja verificar");
		    ver = ler.nextInt();
		    for(j=0; j<80; j++){
                        
		        if(c[j].idade != 0){
							
				System.out.println("nome:" + c[j].getNome());
                                System.out.println("idade:" + c[j].getIdade());
                                System.out.println("assento:" + ver);
				break;
			}
                        if(i[j].idade != 0){
							
				System.out.println("nome:" + i[j].getNome());
                                System.out.println("idade:" + i[j].getIdade());
                                System.out.println("assento:" + ver);
				break;
			}
                        if(p[j].idade != 0){
							
				System.out.println("nome:" + p[j].getNome());
                                System.out.println("idade:" + p[j].getIdade());
                                System.out.println("assento:" + ver);
				break;
			}
                        else{
                            System.out.println("Assento vasio");
                        }
		    }
					
		}break;
		case 5:{
		     System.out.println("Criancas :" + countc + ",Adultos :" + countp + "Idosos" + counti);
					
		}
                case 6:{
                    x=1;
                }
                 
            }
        }
    }
}