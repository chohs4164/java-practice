import java.util.Scanner;
public class five {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("정수 3개를 입력하시오>>");
        int side[]=new int[3];
        for(int i=0;i<3;i++) {
            side[i] = scanner.nextInt();
        }
        int index=0;
        int max=side[0];
        for(int i=1;i<3;i++){
            if(max<side[i]) {
                max = side[i];
                index = i;
            }
        }
        switch(index){
            case 0: {
                if (side[0] < side[1] + side[2]) {
                    System.out.println("삼각형이 됩니다.");
                    break;
                } else {
                    System.out.println("삼각형이 안됩니다.");
                    break;
                }
            }
            case 1: {
                if (side[1] < side[0] + side[2]) {
                    System.out.println("삼각형이 됩니다.");
                    break;
                } else {
                    System.out.println("삼각형이 안됩니다");
                    break;
                }
            }
            case 2: {
                if (side[2] < side[0] + side[1]) {
                    System.out.println("삼각형이 됩니다.");
                    break;
                } else {
                    System.out.println("삼각형이 안됩니다.");
                    break;
                }
            }
        }
    }
}
