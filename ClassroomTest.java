import org.junit.*;
// import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class ClassroomTest {

  Classroom classroom;
  Student student;


  @Before
  public void before() {
    this.classroom = new Classroom("Art", 2);
    this.student = new Student();
  }

  @Test
  public void hasName() {
    String name = this.classroom.getName();
    assertEquals("Art", name);
  }

  @Test
  public void hasNumber() {
    int number = this.classroom.getNumber();
    assertEquals(2, number);
  }
}
