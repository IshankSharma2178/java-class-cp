public class PenDivision {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int perStudent = pens / students;
        int remainder = pens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remainder);
    }
}


