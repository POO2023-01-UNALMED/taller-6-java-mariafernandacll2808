package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
    private int numVehiculos = 0;
    

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaFabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricanteVendedor = null;
        int mayor = 0;
        for (int i=0;i<listaFabricantes.size();i++) {
            if (listaFabricantes.get(i).getNumVehiculos()>mayor){
                fabricanteVendedor = listaFabricantes.get(i);
                mayor = listaFabricantes.get(i).getNumVehiculos();
            }
        }
        return fabricanteVendedor;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getNumVehiculos() {
        return this.numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

}
