import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        double n = 0;

        ArrayList<Car> list = new ArrayList<Car>();
        list.add(new Acar("Aca", "a", 56, "aa", 10));
        list.add(new Acar("Acar", "b", 140, "bb", 20));
        list.add(new Acar("Acar", "c", 160, "cc", 30));

        list.add(new Bus("Bus", "a", 100, "aa", 10));
        list.add(new Bus("Bus", "b", 210, "bb", 20));

        list.add(new Snowmobile("Snowmobile", "a", 40, "aa", 10));
        list.add(new Snowmobile("Snowmobile", "b", 60, "bb", 20));

        for (Car x : list){
            //System.out.println(x.getVehicleType() + " " + x.getMark() + " " + x.getPower() + " " + x.getModel() + " " + x.getMileage());
            n = 0;
            if (x.getType() == Car.сarType.ACAR){
                if(x.getPower() <= 100){
                    n = x.getPower() * 2.5;
                }
                else if (x.getPower() >= 100 && x.getPower() <= 150){
                    n = x.getPower() * 3.5;
                }
                else if (x.getPower() >= 150 && x.getPower() <= 200){
                    n = x.getPower() * 5;
                }
                else if (x.getPower() >= 200 && x.getPower() <= 250){
                    n = x.getPower() * 7.5;
                }
                else if (x.getPower() >= 250){
                    n = x.getPower() * 15;
                }
            }

            if (x.getType() == Car.сarType.BUS){
                if(x.getPower() <= 200){
                    n = x.getPower() * 5;
                }
                else if (x.getPower() >= 200){
                    n = x.getPower() * 10;
                }
            }

            if (x.getType() == Car.сarType.SNOWMOBILE){
                if(x.getPower() <= 50){
                    n = x.getPower() * 2.5;
                }
                else if (x.getPower() >= 50 ){
                    n = x.getPower() * 5;
                }
            }
            System.out.println(x.getVehicleType() + " " + n);

        }
    }
}
