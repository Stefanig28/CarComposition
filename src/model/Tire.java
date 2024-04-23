package model;

public class Tire {
    private String typeRim;
    private String markTire;

    public Tire(String typeRim, String markTire){
        this.typeRim = typeRim;
        this.markTire = markTire;
    }

    public String getTypeRim() {
        return typeRim;
    }

    public String getMarkTire() {
        return markTire;
    }

    @Override
    public String toString() {
        return " - Tipo de rin: " + typeRim  +
                " - Marca rin: " + markTire + '\n';
    }
}
