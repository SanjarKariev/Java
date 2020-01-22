package lab8;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Per(){
        int P;
        if (a + b < c) {
            System.out.println("Не верные пораметры");
        }
        if (a + b >= c) {
            P = a + b + c;
            System.out.println("Периметр:" + "\t"+ P);
        }
    }
    public void S(){
        int S;
        int p;
        if (a + b < c) {
            System.out.println("Не верные пораметры");
        }
        if (a + b >= c) {
            p = 2*(a + b + c);
            S = (int) Math.sqrt( p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь:" + "\t"+ S);
        }
    }
}