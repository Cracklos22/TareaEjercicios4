package SmartTech;

import SmartTech.SmartDevice;

public class SmartWatch extends SmartDevice {
    private String tipoCorrea;
    public SmartWatch(){
    }
    public SmartWatch(String marca, String modelo, String tipoCorrea){
        super(marca, modelo);
        this.tipoCorrea = tipoCorrea;
    }

    public SmartWatch(String s) {
    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Tipo de Correa:" + tipoCorrea);
    }
}
