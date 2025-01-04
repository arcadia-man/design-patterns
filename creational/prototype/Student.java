package creational.prototype;

// Concrete Cloner - Student who copies the notebook
public class Student {
  private StudentNoteBook notebook;
  private String name;

  public Student(StudentNoteBook prototype, String name) {
    this.notebook = prototype;
    this.name = name;
  }

  public void copyNotebook() {
    this.notebook = this.notebook.clone();
    notebook.setNoteBookName(this.name);
    System.out.println(this.name + " copied the notebook: ");
    notebook.displayNotebook();
  }
}