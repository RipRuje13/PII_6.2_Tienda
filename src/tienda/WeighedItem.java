package tienda;
public class WeighedItem extends PurchaseItem{
    private double masa;
    public WeighedItem(String nombre,double precio,double masa){
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
    public double getPrice(){
        return masa*super.getPrice();
    }
    @Override
    public String toString(){
        return super.toString()+" "+masa+" kg"; 
    }
}
