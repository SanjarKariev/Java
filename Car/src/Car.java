public abstract class Car {
    private String VehicleType;
    private String Mark;
    private int Power;
    private String Model;
    private int Mileage;

    public Car(String vehicleType, String mark, int power, String model, int mileage) {
        this.VehicleType = vehicleType;
        this.Mark = mark;
        this.Power = power;
        this.Model = model;
        this.Mileage = mileage;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public String getMark() {
        return Mark;
    }

    public int getPower() {
        return Power;
    }

    public String getModel() {
        return Model;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public void setPower(int power) {
        Power = power;
    }

    public void setModel(String model) {
        Model = model;
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
