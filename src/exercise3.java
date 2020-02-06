public class exercise3 {
    public static void main(String[] args) {
        final double CX = Math.toRadians(35.2270869);
        final double CY = Math.toRadians(-80.8431267);
        final double SX = Math.toRadians(32.0835407);
        final double SY = Math.toRadians(-81.0998342);
        final double AX = Math.toRadians(33.7489954);
        final double AY = Math.toRadians(-84.3879824);
        final double OX = Math.toRadians(28.5383355);
        final double OY = Math.toRadians(-81.3792365);

        final double RADIUS = 6_371.01;

        double a = RADIUS * Math.acos(Math.sin(AX) * Math.sin(CX) +
                Math.cos(AX) * Math.cos(CX) * Math.cos(AY - CY));
        double b = RADIUS * Math.acos(Math.sin(SX) * Math.sin(CX) +
                Math.cos(SX) * Math.cos(CX) * Math.cos(SY - CY));
        double c = RADIUS * Math.acos(Math.sin(AX) * Math.sin(SX) +
                Math.cos(AX) * Math.cos(SX) * Math.cos(AY - SY));
        double d = RADIUS * Math.acos(Math.sin(AX) * Math.sin(OX) +
                Math.cos(AX) * Math.cos(OX) * Math.cos(AY - OY));
        double e = RADIUS * Math.acos(Math.sin(SX) * Math.sin(OX) +
                Math.cos(SX) * Math.cos(OX) * Math.cos(SY - OY));

        double p1 = (a + b + c) / 2;
        double p2 = (c + d + e) / 2;

        double area1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        double area2 = Math.sqrt(p2 * (p2 - c) * (p2 - d) * (p2 - e));

        double fullArea = area1 + area2;

        System.out.println("Are enclosed by four cities is " + fullArea + " km^2");
    }
}
