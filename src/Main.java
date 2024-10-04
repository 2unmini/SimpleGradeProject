import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean  excute= true;
        Scanner sc = new Scanner(System.in);
        StudentManage studentManage = new StudentManage();
        while(excute){
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 목록 출력");
            System.out.println("3. 최고 점수 학생 보기");
            System.out.println("4. 최저 점수 학생 보기");
            System.out.println("5. 평균 점수 보기");
            System.out.println("6. 종료");
            int check=sc.nextInt();
            switch (check){
                case 1:
                    String name=sc.next();
                    int score=sc.nextInt();
                    studentManage.add(name,score);
                    break;
                case 2:
                    studentManage.studentList();
                    break;
                case 3:
                    System.out.println("최고점수 : " + studentManage.maxStudent());
                    break;
                case 4:
                    System.out.println("최저점수 : "+studentManage.minStudent());
                    break;
                case 5:
                    System.out.println("평균점수 : "+studentManage.avgStudent());
                    break;
                case 6:
                    excute=false;
                    System.out.println("종료 되었습니다.");

            }


        }

    }
}