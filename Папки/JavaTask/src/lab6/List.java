package lab6;

public class List {
    Node first;
    Node last;
    Node elem;

    public void add(int element){
        Node f = new Node(element);
       // f.Value = element;
        if(first == null){
            first = f;
            last = f;
        }else {
            f.Next = last;
            last = f;
        }
    }

    public void count(){
        Node currLast = last;
        int count = 0;
            while(currLast != null){
                count++;
                currLast = currLast.Next;
        }
        System.out.println(count);
    }

    public void Print(){
        Node f = last;
        while(f != null){
            System.out.print(f.Value + " ");
            f = f.Next;
        }
        System.out.println(" ");
    }

    public void delete() {
        elem = last;

        if (last == null){
            elem = null;
        }else {
            last = last.Next;
            elem = null;
        }
    }
}
