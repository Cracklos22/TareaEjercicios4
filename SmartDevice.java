package SmartTech;

public class SmartDevice {
    protected String marca;
    protected String modelo;
    public SmartDevice(){
    }
    public SmartDevice(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public SmartDevice(String s) {
    }

    public void MostrarInformacion() {
        System.out.println("Marca" + marca);
        System.out.println("Modelo" + modelo);
    }
}
