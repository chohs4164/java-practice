import java.util.Scanner;
import static java.lang.Math.*;

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int centerX1=scanner.nextInt();
        int centerY1=scanner.nextInt();
        int radius1=scanner.nextInt();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int centerX2=scanner.nextInt();
        int centerY2= scanner.nextInt();
        int radius2=scanner.nextInt();

        double distance=sqrt(pow(centerX1-centerX2,2)+pow(centerY1-centerY2,2));
        if(radius1+radius2>distance)
            System.out.println("두 원은 서로 겹친다.");
        if(radius1+radius2==distance)
            System.out.println("두 원은 서로 접한다.");
        if(radius1+radius2<distance)
            System.out.println("두 원은 서로 겹치지 않는다.");
    }
}
