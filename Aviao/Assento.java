
package aviao;

public class Assento{
        
    private int Fileira;
    private int Cadeira;
    private int reservado = 0;
	
	public int getreservado(){
		return reservado;
	}
	
	public void setreservado(int reservado){
		this.reservado = reservado;
	}

    public int getFileira() {
        return Fileira;
    }

    public void setFileira(int Fileira) {
        this.Fileira = Fileira;
    }

    public int getCadeira() {
        return Cadeira;
    }

    public void setCadeira(int Cadeira) {
        this.Cadeira = Cadeira;
    }
	
	
}
