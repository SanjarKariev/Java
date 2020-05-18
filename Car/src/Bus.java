public class Bus extends Car{

    public Bus(String vehicleType, String mark, int power, String model, int mileage) {
        super(vehicleType, mark, power, model, mileage);
        super.setType(Nik.BUS);
    }

    @Override
    String GetVehicleType() {
        return null;
    }

    @Override
    String GetMark() {
        return null;
    }

    @Override
    int GetPower() {
        return 0;
    }

    @Override
    String GetModel() {
        return null;
    }

    @Override
    int GetMileage() {
        return 0;
    }
}
