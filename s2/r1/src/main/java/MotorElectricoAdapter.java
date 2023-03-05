public class MotorElectricoAdapter extends Motor {
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        motorElectrico = new MotorElectrico();
        System.out.println("Creando motor Electrico adapter");    
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor electrico adapter...");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico adapter...");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el motor electrico adapter...");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}