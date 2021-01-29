package tienda;
public class CountedItem extends PurchaseItem{
    private int cantidad;
     public CountedItem(String nombre,double precio,int cantidad){
        super(nombre,precio);
	this.cantidad=cantidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    @Override
    public double getPrice(){
        return cantidad*super.getPrice();
    }
    @Override
    public String toString(){
        return super.toString()+" "+cantidad+" unidades";
    }
}
