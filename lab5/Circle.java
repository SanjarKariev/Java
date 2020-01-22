package lab5;

public class Circle {
    int x;
    int y;
    double radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double S(){
        return Math.PI * radius * radius;
    }

    public double L(){
        return 2 * Math.PI * radius;

    }

    public double Li(){
        return Math.sqrt(x * x + y * y);
    }
    public double D() {
        if (radius > Li()) {
            System.out.println("Выходит за гранницы окружности");
        }

        if (radius < Li()) {
            System.out.println("Не выходит за гранницы окружности");
        }

        if (radius == Li()) {
            System.out.println("Лежит на окружности");
        }
        return 0;
    }
}


class Main {
    public static void main(String[] args) {
        Circle radiu = new Circle (2,2, 10);
        System.out.println("Выведи: " + radiu.S());
        System.out.println("\n" + "Выведи: " + radiu.L());
        System.out.println("\n" + "Выведи: " + radiu.D());
    }
}
