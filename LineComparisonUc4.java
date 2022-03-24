package linecomparisonproblem;

class Line1  {
    public void method(int x1, int x2, int y1, int y2) {
        double LENGTH_OF_LINE1 = Math.sqrt((x2 - x1) * (x2 + x1) + (y2 - y1) * (y2 + y1));
        System.out.println("Using Cartesian System calculated Length1 of line is :  " +LENGTH_OF_LINE1);
    }

    public void method2(int x3, int x4, int y3, int y4) {
        double LENGTH_OF_LINE2 = Math.sqrt((x4 - x3) * (x4 + x3) + (y4 - y3) * (y4 + y3));
        System.out.println("Using Cartesian System calculated Length2 of line is :  " +LENGTH_OF_LINE2);
    }
}

public class LineComparisonUc4 {
    public static void main(String[] args) {
        Line1 line1 = new Line1();
        line1.method(5,5,6,7);
        line1.method2(4,6,7,8);
    }
}
