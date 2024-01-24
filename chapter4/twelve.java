import java.util.Scanner;

class Reservation {
    private String seatS[]=new String[10];
    private String seatA[]=new String[10];
    private String seatB[]=new String[10];
    public Reservation(){
        for(int i=0;i<10;i++){
            seatS[i]=new String("--- ");
        }
        for(int i=0;i<10;i++){
            seatA[i]=new String("--- ");
        }
        for(int i=0;i<10;i++){
            seatB[i]=new String("--- ");
        }
    }
    public void reserve(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int division=scanner.nextInt();
        switch (division){
            case 1: //s석을 고른 경우
                System.out.print("S>> ");
                for(int i=0;i<10;i++){
                    System.out.print(seatS[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name1= scanner.next();
                System.out.print("번호>>");
                int number1= scanner.nextInt();
                seatS[number1-1]=name1;
                break;
            case 2: //a석을 고른 경우
                System.out.print("A>> ");
                for(int i=0;i<10;i++){
                    System.out.print(seatA[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name2= scanner.next();
                System.out.print("번호>>");
                int number2= scanner.nextInt();
                seatA[number2-1]=name2;
                break;
            case 3: //b석을 고른 경우
                System.out.print("B>> ");
                for(int i=0;i<10;i++){
                    System.out.print(seatB[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name3= scanner.next();
                System.out.print("번호>>");
                int number3= scanner.nextInt();
                seatB[number3-1]=name3;
                break;
        }
    }
    public void inquire(){
        System.out.print("S>> ");
        for(int i=0;i<10;i++) {
            System.out.print(seatS[i]+" ");
        }
        System.out.println();
        System.out.print("A>> ");
        for(int i=0;i<10;i++) {
            System.out.print(seatA[i]+" ");
        }
        System.out.println();
        System.out.print("B>> ");
        for(int i=0;i<10;i++) {
            System.out.print(seatB[i]+" ");
        }
        System.out.println();;
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    public void cancel(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("좌석 S:1, A:2, B:3>>");
        int division=scanner.nextInt();
        switch (division){
            case 1: //s석을 고른 경우
                System.out.print("S>> ");
                for(int i=0;i<10;i++){
                    System.out.print(seatS[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name1= scanner.next();
                for(int i=0;i<10;i++){
                    if(seatS[i].equals(name1)) {
                        seatS[i] = "--- ";
                        break;
                    }
                }
                break;
            case 2: //a석을 고른 경우
                System.out.print("A>> ");
                for(int i=0;i<10;i++){
                    System.out.print(seatA[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name2= scanner.next();
                for(int i=0;i<10;i++){
                    if(seatA[i].equals(name2)) {
                        seatA[i] = "--- ";
                        break;
                    }
                }
                break;
            case 3: //b석을 고른 경우
                System.out.print("B>> ");
                for(int i=0;i<10;i++){
                    System.out.print(seatB[i]+" ");
                }
                System.out.println();
                System.out.print("이름>>");
                String name3=scanner.next();
                for(int i=0;i<10;i++){
                    if(seatB[i].equals(name3)) {
                        seatB[i] = "--- ";
                        break;
                    }
                }
                break;
        }
    }

}
public class twelve {
    public static void main(String[] args) {
        Reservation re= new Reservation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int input=scanner.nextInt();
            switch (input){
                case 1:
                    re.reserve();
                    break;
                case 2:
                    re.inquire();
                    break;
                case 3:
                    re.cancel();
                    break;
                case 4:
                    return;
            }
        }
    }
}
