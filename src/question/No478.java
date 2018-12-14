package question;

public class No478 {
    //TODO
    double radius;
    double x_center;
    double y_center;
    public No478(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double x_min = x_center - radius;
        double x = Math.random() * 2 * radius + x_min;
        double x_distance = Math.abs(x- x_center);
        double fy = Math.pow(radius*radius - x_distance * x_distance,0.5);
        double y_min = y_center - fy;
        double y = Math.random() * 2 * fy + y_min;
        return new double[]{x,y};
    }
}
