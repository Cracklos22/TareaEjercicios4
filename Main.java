package SmartTech;

public class Main {
    public static void main(String[] args) {
    SmartDevice dispositivo = new SmartDevice("Marca Dispositivo, Modelo Dispositivo");
    dispositivo.MostrarInformacion();
    System.out.println();
    SmartPhone telefono = new SmartPhone("Marca Telefono, Modelo Telefono, Android");
    telefono.MostrarInformacion();
    System.out.println();
    SmartWatch reloj = new SmartWatch("Marca reloj, Modelo reloj, Correa de Silicona");
    reloj.MostrarInformacion();
    }
}