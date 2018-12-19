package factory.factorymethod;

//bad hack using coordinate system enum
//enum CoordinateSystem{
//    CARTESIAN,
//    POLAR
//}

public class Point {
    private double x,y;
//    public Point(double a, double b, CoordinateSystem cs){
//        switch(cs){
//            case POLAR:
//                x=a*Math.cos(b);
//                y=a*Math.sin(b);
//                break;
//            case CARTESIAN:
//                x=a;
//                y=b;
//                break;
//        }
//    }

    //constructor overloading with same argument types not allowed
//    public Point(double rho, double theta){
//        x=rho*Math.cos(theta);
//        y=rho*Math.sin(theta);
//    }

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public static Point newCartesianPoint(double x, double y){
        return new Point(x,y);
    }

    public static Point newPolarPoint(double rho, double theta){
        return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
    }
}
