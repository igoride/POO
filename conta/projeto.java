import java.util.Scanner;


public class projeto {
	

	
	Scanner ler = new Scanner(System.in);
	//dados da conta
	int id;
	long rg;
	long cpf;
	String nome;
	double saldo;
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int j;
		int opc;
		int token = 0;
		int numb;
		int count = 1;
		double valor;
		
		System.out.println("Crie sua conta");// criação da conta
		
		projeto conta[];
	    conta = new projeto[20];
		
		for(j=0; j<20; j++){
			conta[j] = new projeto();
		}
		
		//////////////
		
		projeto conta2;// conta pre feita para uso da transferencia
		conta2 = new projeto();
  		
		
		//Menu
		while(token != 1){
			
			System.out.println("MENU");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Transferencia");
			System.out.println("5 - Ver dados da conta");
			System.out.println("6 - Sair da aplicacao");
			
			opc = ler.nextInt();
			
			switch(opc){//switch com a chamada dos metodos
			    case 1:{
					System.out.println(count);
					conta[count].id = count;//id da conta criada
		            System.out.println("O id da sua conta e " + conta[count].id);
		            System.out.println("Digite seu nome");
		            conta[count].nome = ler.next();
		            System.out.println("Digite seu Rg");
		            conta[count].rg = ler.nextLong();
		            System.out.println("Digite seu Cpf");
		            conta[count].cpf = ler.nextLong();
		            conta[count].saldo = 0;
					count = count + 1;
				}break;
				case 2:{
			        
					System.out.println("Digite o id da conta que deseja sacar");
					numb = ler.nextInt();
					
					System.out.println("Digite o valor a ser sacado");
		            valor = ler.nextDouble();
		
		            if(conta[numb].saldo < valor){//verifica se o saldo e suficiente
			 
			             System.out.println("Saldo insuficiente");
			
		            }
		            else{
		
		                 conta[numb].saldo = conta[numb].saldo - valor;//pega o saldo da conta chamada e subtrai o valor do giba
		
		            }
					
				}break;
				case 3:{
					
					System.out.println("Digite o id da conta que deseja depositar");
					numb = ler.nextInt();
					
				    System.out.println("Digite o valor a ser depositado");
		            valor = ler.nextDouble();
		
		            conta[numb].saldo += valor;
					
				}break;
				case 4:{
					
					int i;
					
					System.out.println("Digite o id da conta que deseja transferir");
					numb = ler.nextInt();
					System.out.println("Digite o id da conta que deseja transferir para");
					
					i = ler.nextInt();
					
					System.out.println("Digite o valor a ser transferido");
		            
					valor = ler.nextDouble();
		                    						
		            if(conta[numb].saldo < valor){
			
			             System.out.println("Saldo insuficiente para transferencia ");
			
		            }
		            else{
			
		                conta[numb].saldo = conta[numb].saldo - valor;
		                conta[i].saldo += valor;
		
		            }   
					
				}break;
				case 5:{
					
					System.out.println("Digite o id da conta que deseja consultar");
					numb = ler.nextInt();
					
				    System.out.println("Id da conta :" + conta[numb].id);
		            System.out.println("Nome do propietario :" + conta[numb].nome);
		            System.out.println("RG :" + conta[numb].rg);
		            System.out.println("CPF :" + conta[numb].cpf);
		            System.out.println("Saldo :" + conta[numb].saldo);
					
				}break;
				case 6:{
					
					token = 1;
				
				}break;
				default : {
					
					System.out.println("Opcao invalida");
				
				}break;
			
			
			
		    }
		
	    }
		
    }	

}