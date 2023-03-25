package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
    private int numVehiculos = 0;
    
    public Pais(String nombre) {
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public static Pais paisMasVendedor(){
        Pais paisVendedor = null;
        int mayor = 0;
        for (int i=0;i<listaPaises.size();i++) {
            if (listaPaises.get(i).getNumVehiculos()>mayor){
                paisVendedor = listaPaises.get(i);
                mayor = listaPaises.get(i).getNumVehiculos();
            }
        }
        return paisVendedor;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVehiculos() {
        return this.numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }
    

}
