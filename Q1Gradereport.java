public class GradeReport{
    public static void executeGradeReport(double score){
        boolean isValid= validateScore(score);
        if (!isValid){
            System.out.println("Invalid score");
            return;
        }
        char grade= calculateLetterGrade(score);

        displayPerformanceMessage(grade);

    }
}






