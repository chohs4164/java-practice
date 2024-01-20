import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int pointX=scanner.nextInt();
        int pointY=scanner.nextInt();
        //직사각형의 선 위에 걸쳐 있는 것도 안에 있는 것으로 판단
        if(pointX>=100&&pointX<=200) {
            if (pointY >= 100 && pointY <= 200)
                System.out.println("(" + pointX + "," + pointY + ")는 사각형 안에 있습니다.");
            else
                System.out.println("(" + pointX + "," + pointY + ")는 사각형 안에 없습니다.");
        }
        else
            System.out.println("(" + pointX + "," + pointY + ")는 사각형 안에 없습니다.");
    }
}
