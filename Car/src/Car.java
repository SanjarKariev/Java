public abstract class Car {
    private String VehicleType;
    private String Mark;
    private int Power;
    private String Model;
    private int Mileage;

    public void setType(Nik type) {
        this.type = type;
    }

    private Nik type;

    public Nik getType() {
        return type;
    }

    public Car(String vehicleType, String mark, int power, String model, int mileage) {
        VehicleType = vehicleType;
        Mark = mark;
        Power = power;
        Model = model;
        Mileage = mileage;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int mileage) {
        Mileage = mileage;
    }

    abstract String GetVehicleType();
    abstract String GetMark();
    abstract int GetPower();
    abstract String GetModel();
    abstract int GetMileage();
}
