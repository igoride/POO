
package aviao;

public class Transporte {
    
    private Assento[][] Assentos = new Assento[20][4];
	
    private int TotalAssentos = 80;
    private int AssentosPref = 8;
    private int AssentosNormais = 72;

    public int getTotalAssentos() {
        return TotalAssentos;
    }

    public void setTotalAssentos(int TotalAssentos) {
        this.TotalAssentos = TotalAssentos;
    }

    public int getAssentosPref() {
        return AssentosPref;
    }

    public void setAssentosPref(int AssentosPref) {
        this.AssentosPref = AssentosPref;
    }

    public Assento[][] getAssentos() {
        return Assentos;
    }

    public void setAssentos(Assento[][] Assentos) {
        this.Assentos = Assentos;
    }

    public int getAssentosNormais() {
        return AssentosNormais;
    }

    public void setAssentosNormais(int AssentosNormais) {
        this.AssentosNormais = AssentosNormais;
    }
    
    
}