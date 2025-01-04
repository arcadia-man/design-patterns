package creational.prototype;

class StudentNoteBook implements Notebook, Cloneable {
  // Generic data for the prototype.
  private String textbookContent;
  private String researchPaperContent;
  private String experimentContent;
  private String handwrittenNotes;

  // Keeping object specific data.
  private String noteBookName = "topper's notebook";

  public StudentNoteBook() {
    // It takes 5, 10, 20, and 2 days, respectively. It is not necessary to repeat for every object.
    this.textbookContent = "Textbook Content: Detailed theory.";
    this.researchPaperContent = "Research Paper: Latest advancements.";
    this.experimentContent = "Experiment: Results and observations.";
    this.handwrittenNotes = "Handwritten Notes: Neatly written notes by the topper.";
    System.out.println("Origin Execution.");
  }

  @Override
  public StudentNoteBook clone() {
    try {
      // Perform a shallow copy first and return deep copy
      return (StudentNoteBook) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public void setNoteBookName(String name) {
    this.noteBookName = name + "'s notebook";
  }

  public void displayNotebook() {
    System.out.println(this.noteBookName + " " + textbookContent);
    System.out.println(this.noteBookName + " " + researchPaperContent);
    System.out.println(this.noteBookName + " " + experimentContent);
    System.out.println(this.noteBookName + " " + handwrittenNotes);
  }
}