package ua.univer.lesson13;

public class UserKMDA {
    private String name;
    private String posada;
    private double oklad;

    public UserKMDA(String name, String posada, double oklad) {
        this.name = name;
        this.posada = posada;
        this.oklad = oklad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosada() {
        return posada;
    }

    public void setPosada(String posada) {
        this.posada = posada;
    }

    public double getOklad() {
        return oklad;
    }

    public void setOklad(double oklad) {
        this.oklad = oklad;
    }

    @Override
    public String toString() {
        return "\nUserKMDA{" +
                "name='" + name + '\'' +
                ", posada='" + posada + '\'' +
                ", oklad=" + oklad +
                '}';
    }
}
