import java.util.Scanner;
class Circle1{
    private double x,y;
    private int radius;
    public Circle1(double x,double y,int radius){
        this.x=x; this.y=y; this.radius=radius;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
}
public class six {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Circle1 c [] = new Circle1[3];
        for(int i=0;i<c.length;i++){
            System.out.print("x, y, radius >>");
            double x=scanner.nextDouble();
            double y=scanner.nextDouble();
            int radius= scanner.nextInt();
            c[i]=new Circle1(x,y,radius);
        }
        Circle1 most = new Circle1(c[0].getX(),c[0].getY(),c[0].getRadius()); //첫번째 값을 최대라고 생각하고
        for(int i=1;i<c.length;i++){
            if(Math.pow(most.getRadius(),2)<Math.pow(c[i].getRadius(),2))
                most=c[i];
        }
        System.out.println("가장 면적이 큰 원은 ("+most.getX()+","+most.getY()+")"+most.getRadius());
        scanner.close();
    }
}
