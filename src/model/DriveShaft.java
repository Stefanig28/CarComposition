package model;

public class DriveShaft {
    private String markDriveShaft;
    private String valveName;

    DriveShaft(String markDriveShaft, String valveName) {
        this.markDriveShaft = markDriveShaft;
        this.valveName = valveName;
    }

    public String getMarkDriveShaft() {
        return markDriveShaft;
    }

    public void setMarkDriveShaft(String markDriveShaft) {
        this.markDriveShaft = markDriveShaft;
    }

    public String getValveName() {
        return valveName;
    }

    public void setValveName(String valveName) {
        this.valveName = valveName;
    }
}
