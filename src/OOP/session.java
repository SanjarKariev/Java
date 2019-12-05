package OOP;

import java.util.ArrayList;

public class session {
    String sassion;
    String offset;
    String exam;

    public String getSassion() {
        return sassion;
    }

    public void setSassion(String sassion) {
        this.sassion = sassion;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public session(String sassion, String offset, String exam) {
        this.sassion = sassion;
        this.offset = offset;
        this.exam = exam;
    }
}
class Sout{

    public static void main(String[] args) {
        ArrayList<session> list = new ArrayList<>();
        list.add(new session("1 семестр", "Математика","Java"));
        list.add(new session("1 семестр", "Физ-ра","SQL"));
        list.add(new session("1 семестр", "Англ.яз","C#"));

        list.add(new session("2 семестр", "C#","Физ-ра"));
        list.add(new session("2 семестр", "Англ.яз","Java"));
        list.add(new session("2 семестр", "SQL","Математика"));
        System.out.println("Сессия группы 4П1.17:" + "\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Сессия: " + list.get(i).getSassion() + "\t" + "|" +
                               "Зачёт: " + list.get(i).getOffset() + "\t" + "|" +
                               "Экзамен: " + list.get(i).getExam());
        }
    }
}
