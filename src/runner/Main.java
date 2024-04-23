package runner;

import model.Car;
import model.DriveShaft;
import model.Tire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DriveShaft driveShaft;
        Tire[] tire;

        int initialMenu = 0;
        boolean option= false;
        int menu = 0;

        System.out.println("¿Quiere crear un carro?" + "\n" + "1. Si" + "\n" + "2. No");
        initialMenu = scanner.nextInt();

        if (initialMenu==1){
            System.out.println("Ingrese la marca del motor");
            String markDriveShat = scanner.next();
            System.out.println("Ingrese nombre de la válvula");
            String valve = scanner.next();

            driveShaft = new DriveShaft(markDriveShat, valve);
            Car car =  new Car(driveShaft);

            System.out.println("Ingrese la información de las llantas");

            while (!option){
                System.out.println("1. Agregar llanta" + "\n"+ "2. Salir");
                menu = scanner.nextInt();
                switch (menu){
                    case 1:
                        if (car.quantityTire()==4){
                            System.out.println("\n" + "No puede agregar más de 4 llantas"+ "\n");
                            option = true;
                        }else {
                            System.out.println("Ingrese el tipo de rin");
                            String rim = scanner.next();
                            System.out.println("Ingrese la marca de la llanta");
                            String markRim  =scanner.next();
                            System.out.println(car.createTire(new Tire(rim, markRim)));
                        }
                        break;
                    case 2:
                        if(car.quantityTire()<4){
                            System.out.println("No puede crear un carro con menos de 4 llantas");
                        }else {
                            option = true;
                        }
                        break;
                }
            }
            System.out.println(car.toString());
        }
    }
}
