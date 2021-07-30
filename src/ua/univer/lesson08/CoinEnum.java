package ua.univer.lesson08;

public enum CoinEnum {
    CENT(1), PENNY(10), QUARTER(25);

    private int value;
    CoinEnum(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public double getValueInDOLLAR() {
        return value/100;
    }

    @Override
    public String toString() {
        return "CoinEnum{" +
                "value=" + value +
                "} ";
    }
}
