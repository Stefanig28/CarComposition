package model;

public class DriveShaft {
    private String markDriveShaft;
    private String valveName;

    public DriveShaft(String markDriveShaft, String valveName) {
        this.markDriveShaft = markDriveShaft;
        this.valveName = valveName;
    }

    public String getMarkDriveShaft() {
        return markDriveShaft;
    }

    public String getValveName() {
        return valveName;
    }

    @Override
    public String toString() {
        return " - Marca motor: " + markDriveShaft + '\n' +
                " - Nombre válvula: " + valveName + '\n';
    }
}
