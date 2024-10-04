import java.util.ArrayList;

public class StudentManage {
ArrayList<Student> students=new ArrayList<>();
    // 추가
    public void add(String name,int score){
        Student student=new Student(name,score);
        students.add(student);
        System.out.println("추가가 완료 되었습니다.");
    }
    // 학생 목록 출력
    public void studentList(){
        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
    }

    // 최고 점수 학생 보기
    public int maxStudent(){
        int max=0;
        if(students.isEmpty()){
            return 0;
        }
        for(int i=0;i<students.size();i++){
            if(students.get(i).getScore()>max){
                max=students.get(i).getScore();
            }
        }
        return max;
    }
    // 최저 점수 학생 보기
    public int minStudent() {
        int min=101;
        if(students.isEmpty()){
            return 0;
        }
        for(int i=0;i<students.size();i++){
            if(min>students.get(i).getScore()){
                min=students.get(i).getScore();
            }
        }
        return min;
    }
    // 평균 점수 보기
    public int avgStudent() {
        int sum=0;
        int cnt=students.size();

        for(int i=0;i<students.size();i++){
            sum+=students.get(i).getScore();
        }
        return sum/cnt;


    }

}
