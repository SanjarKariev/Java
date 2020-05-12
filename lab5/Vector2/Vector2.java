package lab5.Vector2;

public class Vector2 {

    int x;
    int y;

    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Square{
    Vector2 first;
    Vector2 last;

    public Square(Vector2 first, Vector2 last){
        this.first = first;
        this.last = last;
    }

    public int per(){

        return  2 * ((last.x + first.y) + (first.x + last.y));
    }

    public int sur(){

        return Math.abs(last.x - first.x) * (first.x - last.y);
    }
}
class Main{
    public static void main(String[] args) {
        Square squa = new Square (new Vector2(2, 2), new Vector2(1, 1));
        System.out.println("Выведи: " + squa.per()+ "\n" + "Выведи: " + squa.sur());
    }
}
