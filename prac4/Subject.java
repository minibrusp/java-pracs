import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Subject {
  UUID id;
  String name;
  List<Student> students;
  ArrayList<Grade> grades;

  public Subject(String name) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.students = new ArrayList<Student>();
    this.grades = new ArrayList<Grade>();
  }

  public String getName() {
    return this.name;
  }

  public synchronized void addStudent(Student that) {
    if (students.contains(that))
      System.out.println("\n" + that.getName() + " is already enrolled on this subject.");
    else {
      this.students.add(that);
      that.addSubject(this);
    }
  }

  public synchronized void addGrades(Student that, int grade) {
    Grade StudentGrade = new Grade(that, this, grade);
    that.addGrades(StudentGrade);
    this.grades.add(StudentGrade);
  }

  public void displayStudents() {
    if(this.students.size() == 0)
      System.out.println("\nThere are no student/s enrolled at this class yet.");
    else {
      for (Student s : this.students)
        System.out.println(s);
    }
  }

  public void sortHighest() {
    Collections.sort(grades);
  }

  public void sortReverse() {
    Collections.reverse(grades);
  }

  public void displayGrades() {

    this.sortHighest();

    this.sortReverse();

    if(this.students.size() != 0) {
      for (Grade g : this.grades) {
        for (Student s : this.students) {
          if (g.studentId == s.getId())
            System.out.println(g.student.getName() + " : " + g.getGrade());
        }
      }
    }
  }

  public String toString() {
    return this.name;
  }

}
