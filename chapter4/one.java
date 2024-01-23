class TV{
    private String company; //제조사
    private int year; //생산 년도
    private int size; //모니터 크기
    public TV(String company,int year,int size){
        this.company=company;
        this.year=year;
        this.size=size;
    }
    public void show(){
        System.out.println(company+"에서 만든 "+year+"년형 "+size+"인치 TV");
    }
}
public class one {
    public static void main(String[] args) {
        TV myTV=new TV("LG",2017,32); //LG에서 만든 2017년 32인치
        myTV.show();
    }
}
