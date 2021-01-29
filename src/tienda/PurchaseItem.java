package tienda;
public class PurchaseItem{
    private String nombre;
    private double unitPrice;
    public PurchaseItem(){
        nombre=null;
        unitPrice=0;
    }
    public PurchaseItem(String nombre,double precio){
        this.nombre=nombre;
        this.unitPrice=precio;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrice(){
        return unitPrice;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrice(double precio){
        this.unitPrice=unitPrice;
    }
   
  
    @Override
    public String toString(){
        return nombre+"@"+" "+unitPrice;
    }
}
