import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class BarTest{
    Bar bar;
    Patrons patrons;

  @Before
  public void before(){
    bar = new Bar("CodeBAR");
    patrons = new Patrons();
  }

  @Test
    public void barHasName(){
      assertEquals("CodeBAR", bar.getName());
    }
   

}