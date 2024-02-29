import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Student  {
  private UUID id;
  private String name;
  private int age;
  Map<UUID, Subject> subjects;
  private List<Grade> grades;

  public Student(String name, int age) {
    this.id = UUID.randomUUID();
    this.name = name;
    this.age = age;
    this.subjects = new Hashtable<UUID, Subject>();
    this.grades = new ArrayList<Grade>();

  }

  public UUID getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public synchronized void addSubject(Subject that) {
    this.subjects.put(that.id, that);
  }

  public synchronized void addGrades(Grade that) {
    this.grades.add(that);
  }

  public void displayStudent() {
    System.out.println(this.toString());
  }

  public String toString() {
    return "\nID: " + this.id + "\nStudent: " + this.name + "\nage: " + this.age + "\nsubjects: " + this.subjects.values() + "\ngrades: " + this.grades;
  }

}
