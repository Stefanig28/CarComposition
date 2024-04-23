package model;

public class Tire {
    private String typeRim;
    private String markTire;

    Tire(String typeRim, String markTire){
        this.typeRim = typeRim;
        this.markTire = markTire;
    }

    public String getTypeRim() {
        return typeRim;
    }

    public void setTypeRim(String typeRim) {
        this.typeRim = typeRim;
    }

    public String getMarkTire() {
        return markTire;
    }

    public void setMarkTire(String markTire) {
        this.markTire = markTire;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "typeRim='" + typeRim + '\'' +
                ", markTire='" + markTire + '\'' +
                '}';
    }
}
