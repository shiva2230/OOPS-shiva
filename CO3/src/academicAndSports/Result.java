package academicAndSports;


import java.util.Scanner;

interface Sports{

    float score = 0;
    void sportsScore(float score);
}

interface Student{
float score=0;
void academicScore(float score);
}
class Result implements Sports,Student {
    float SportsScore;
    float AcademicScore;
    @Override
    public void sportsScore(float SportsScore) {
        this.SportsScore=SportsScore;
    }

    @Override
    public void academicScore(float AcademicScore) {
        this.AcademicScore=AcademicScore;
    }
    void display(){
        System.out.println("Sports Score: "+ SportsScore);
        System.out.println("Academic Score: "+ AcademicScore);
        System.out.println("Total Score: "+(SportsScore+AcademicScore));
    }

}
class Main{
    public static void main(String[] args) {
        float score;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sports score: ");
        float sportsScore=sc.nextFloat();
        System.out.println("Enter the academic score: ");
        float academicScore= sc.nextFloat();
        Result result=new Result();
        result.sportsScore(sportsScore);
        result.academicScore(academicScore);
        result.display();

    }
}