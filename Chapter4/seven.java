import java.util.Scanner;
class MonthSchedule{
    private int day;
    private Day todo[]; //객체에 대한 레퍼런스 생성
    public MonthSchedule(int day){
        this.day=day;
        this.todo = new Day[day+1]; //레퍼런스 배열 생성
        for(int i=1;i<=day;i++){
            todo[i]= new Day(); //날짜 수 만큼의 Day 객체 생성
        }
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("날짜(1~30)?");
        int date=scanner.nextInt(); //날짜 입력받기
        System.out.print("할일(빈칸없이입력)?");
        String work=scanner.next(); //할일 입력받기
        todo[date].set(work);
    }
    public void view(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("날짜(1~30)?");
        int date=scanner.nextInt(); //날짜 입력받기
        System.out.print(date+"일의 할 일은 ");
        todo[date].show();
    }
    public void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
    public void run(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return;
            }
        }
    }
}
class Day{
    private String work;
    public void set(String work){this.work=work;}
    public String get(){return work;}
    public void show(){
        if(work==null) System.out.println("없습니다.");
        else
            System.out.println(work+"입니다");
    }
}
public class seven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램");
        MonthSchedule april = new MonthSchedule(30); //4월달의 할 일
        april.run(); //4월 프로그램 작동 시작
    }
}
