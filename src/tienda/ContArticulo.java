package tienda;
public class ContArticulo extends AdquirirArtículo{
    private int cantidad;
     public ContArticulo(String nombre,double precio,int cantidad){
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
    public String toString(){
        return "Cantidad"+super.toString()+" "+cantidad+"unidades";
    }
}
