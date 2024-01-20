import java.util.Scanner;
public class three {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money=scanner.nextInt();
        int fiftyThousand=money/50000;
        int tenThousand=money%50000/10000;
        int thousand=money%50000%10000/1000;
        int hundred=money%50000%10000%1000/100;
        int fifty=money%50000%10000%1000%100/50;
        int ten=money%50000%10000%1000%100%50/10;
        int one=money%50000%10000%1000%100%50%10;
        System.out.println("오만원권 "+fiftyThousand+"매\n"+"만원권 "+tenThousand+"매\n"+"천원권 "+thousand+"매\n"+"백원 "+hundred+"개\n"+"오십원 "+fifty+"개\n"+"십원 "+ten+"개\n"+"일원 "+one+"개");
    }
}
