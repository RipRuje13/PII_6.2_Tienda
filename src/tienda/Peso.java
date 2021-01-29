package tienda;
public class Peso extends AdquirirArtículo{
    private double masa;
    public Peso(String nombre,double precio,double masa){
        super(nombre,precio);
	this.masa=masa;
    }
    public double getMasa(){
        return masa;
    }
    public void setMasa(double masa){
        this.masa=masa;
    }
    @Override
    public String toString(){
        return super.toString()+" "+this.masa+"kg"; 
    }
}
