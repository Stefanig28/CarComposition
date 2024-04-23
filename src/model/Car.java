package model;

import java.util.Arrays;

public class Car {

    private DriveShaft driveShaft;
    private Tire[] tires;

    public Car(DriveShaft driveShaft) {
        this.driveShaft = driveShaft;
        this.tires = new Tire[4];
    }

    public Car() {
    }

    public String createTire(Tire tire) {
        String message = "";
        for (int i = 0; i < tires.length ; i++) {
            if (quantityTire() < 4) {
                if (tires[i] == null){
                    tires[i] = tire;
                    return message = "Nueva llanta agregada";
                }
            }else {
                return message = "No puede tener más de 4 llantas";
            }
        }
        return message;
    }

    public int quantityTire() {
        int count = 0;
        for (Tire tire:tires) {
            if (tire != null) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < tires.length; i++) {
            aux+= tires[i].toString();
        }
        return "***   Información del carro   ***" + "\n"+
                "Información del motor: " + "\n"+ driveShaft.toString() +
                "Información de las llantas: " + "\n"+ aux;
    }
}
