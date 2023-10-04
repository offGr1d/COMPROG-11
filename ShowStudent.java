public class ShowStudent{
   public static void main(String[] args){
      Student student1 = new Student(20152063, 3, 1.5);
      Student student2 = new Student();

      
      student1.displayIdNumber();
      student1.displayCreditHoursEarned();
      student1.displayPointsEarned();
      student1.displayGradePointAverage();

      student2.displayIdNumber();
      student2.displayCreditHoursEarned();
      student2.displayPointsEarned();
      student2.displayGradePointAverage();
   }
}
