import java.util.UUID;

public class Grade implements Comparable<Grade> {
  UUID id;
  UUID studentId;
  UUID subjectId;
  Subject subject;
  Student student;
  private int grade;

  public Grade(Student student, Subject subject, int grade) {
    this.id = UUID.randomUUID();
    this.studentId = student.getId();
    this.subjectId = subject.id;
    this.student = student;
    this.subject = subject;
    this.grade = grade;
  }

  public int getGrade() {
    return this.grade;
  }

  public String toString() {
    // return "ID: " + id + " Student ID: " + studentId + " Grade: " + grade;
    return this.subject.getName() + " : " + this.grade;
  }

  @Override
  public int compareTo(Grade that) {
    return this.grade == that.grade ? 1 : -1;
  }
}
