public class Point {
    double x;
    double y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
    }

    public static void main(String[] args){
        Point point1 = new Point(10 , 20);
        point1.display();

        Point point2 = new Point(2.34 , 4.56);
        point2.display();
    }
}
