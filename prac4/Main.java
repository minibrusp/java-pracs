

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello");

    Student s1 = new Student("Chuckie Finster", 12);
    Student s2 = new Student("Angelica Pickles", 15);
    Student s3 = new Student("Tommy Pickles", 10);
    Student s4 = new Student("Kimi Finster", 12);
    Student s5 = new Student("Susie Carmichael", 15);

    Subject mathSubject = new Subject("English");
    Subject scienceSubject = new Subject("Science");

    mathSubject.displayStudents();

    mathSubject.addStudent(s1);
    mathSubject.addStudent(s2);
    mathSubject.addStudent(s3);
    mathSubject.addStudent(s4);
    mathSubject.addStudent(s5);

    // mathSubject.displayStudents();

    mathSubject.addStudent(s5);

    mathSubject.addGrades(s1, 80);
    mathSubject.addGrades(s2, 87);
    mathSubject.addGrades(s3, 79);
    mathSubject.addGrades(s4, 91);
    mathSubject.addGrades(s5, 95);

    scienceSubject.addStudent(s5);
    scienceSubject.addGrades(s5, 95);


    // mathSubject.displayStudents();
    
    scienceSubject.displayStudents();

    mathSubject.displayGrades();



    

    


  }
}