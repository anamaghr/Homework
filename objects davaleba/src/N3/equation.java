//package N3;
//
//import java.util.Objects;
//
//public class equation {
//    double a;
//    double b;
//    double c;
//    double x1;
//    double x2;
//    boolean solution;
//
//    public boolean equation(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        double d = (b * b) - (4 * a * c);
//        if(d < 0)
//        {
//            solution = false;
////            x1 = x2 = null;
//        }
//        else{
//            solution = true;
//            double squareRootOfD = Math.sqrt(d);
//            x1 = (-b - squareRootOfD) / (2 * a);
//            x2 = (-b + squareRootOfD) / (2 * a);
//        }
//        return false;
//    }
//
//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        equation equation = (equation) o;
//        return Double.compare(a, equation.a) == 0 && Double.compare(b, equation.b) == 0 && Double.compare(c, equation.c) == 0 && Double.compare(x1, equation.x1) == 0 && Double.compare(x2, equation.x2) == 0 && solution == equation.solution;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return a + "x^2 + " + b + "x + " + c + "= 0  " +
//                "solution: " + solution + "x1 = " + x1 + "   x2 = "  + x2;
//    }
//}
