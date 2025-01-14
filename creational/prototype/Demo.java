package creational.prototype;

public class Demo {
  public static void main(String[] args) {
    StudentNoteBook topperNote = new StudentNoteBook();
    
    Student ganeshStudent = new Student(topperNote, "Ganesh");
    ganeshStudent.copyNotebook();
    Student PritamStudent = new Student(topperNote, "Pritam");
    PritamStudent.copyNotebook();
    Student nitinStudent = new Student(topperNote, "Sai");
    nitinStudent.copyNotebook();
  }
}
