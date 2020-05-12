package lab8;

public class RightTriangle extends Triangle{

    public RightTriangle(int a, int b, int c) {
        super(a, b, c);
    }

    public void Сorner() {
        if (c > 0 && c == Math.sqrt((a * a) + (b * b))){
            S();
        } else {
            System.out.println("Не существует треугольник");
        }
    }

    public void S(){
        int S;
        if(a != b){
            S = (a * b) / 2;
            System.out.println("Площадь:" + S);
        }
    }
}