package MavenDep;


public class SquareEquation {
    private double a,b,c;
    private double x1,x2;

    public SquareEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        solve();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void solve(){
        double d = Math.sqrt(b*b - 4*a*c);
        x1 = (-b - d)/(2*a);
        x2 = (-b + d)/(2*a);
    }

    @Override
    public String toString() {
        return "SquareEquation{" +
                a + "x^2 + " + b + "x + " + c +
                ", x1=" + x1 +
                ", x2=" + x2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareEquation that = (SquareEquation) o;
        return Double.compare(that.a, a) == 0 &&
                Double.compare(that.b, b) == 0 &&
                Double.compare(that.c, c) == 0 &&
                Double.compare(that.x1, x1) == 0 &&
                Double.compare(that.x2, x2) == 0;
    }

}
