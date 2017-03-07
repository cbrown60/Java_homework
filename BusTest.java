import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger; 

  @Before
  public void before(){
    bus = new Bus(23);
    passenger = new Passenger();
  }

  @Test
  public void hasNumber(){
    assertEquals(23, bus.getNumber());
  }

  @Test 
  public void busIsEmpty(){
    assertEquals(0, bus.personsOnBus());
  }

  @Test
  public void addPassengerToBus(){
    bus.addPeople(passenger);
    assertEquals(1, bus.personsOnBus());
  }

  @Test

  public void busIsFull(){
    for (int i = 0; i < 5; i++){
      bus.addPeople(passenger);
    }
    assertEquals(true, bus.isBusFull());
  }

}