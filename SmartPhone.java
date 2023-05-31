package SmartTech;

import SmartTech.SmartDevice;

public class SmartPhone extends SmartDevice {
    private String SistemaOperativo;
    public SmartPhone(){
    }
    public SmartPhone(String marca, String modelo, String sistemaOperativo){
        super(marca, modelo);
        this.SistemaOperativo = sistemaOperativo;
    }

    public SmartPhone(String s) {
    }

    @Override
    public void MostrarInformacion() {
        super.MostrarInformacion();
        System.out.println("Sistema Operativo:" + SistemaOperativo);
    }
}
