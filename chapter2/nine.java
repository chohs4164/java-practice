import java.util.Scanner;
import static java.lang.Math.*;

public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>>");
        int centerX = scanner.nextInt();
        int centerY = scanner.nextInt();
        double radius = scanner.nextDouble();
        System.out.print("점 입력>>");
        double pointX = scanner.nextDouble();
        double pointY = scanner.nextDouble();
        //원 위에 있는 것도 안에 있는 것으로 간주함
        double distance=sqrt((pow(pointX-centerX,2)+pow(pointY-centerY,2)));
        if(distance>radius)
            System.out.println("점 ("+pointX+","+pointY+")는 원 밖에 있다.");
        else
            System.out.println("점 ("+pointX+","+pointY+")는 원 안에 있다.");

        scanner.close();
    }
}
