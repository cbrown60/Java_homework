public class Bus {
  private int number;
  private Passenger[]persons;

  public Bus(int number){
    this.number = number;
    this.persons = new Passenger[5];

  }

  public int getNumber(){
    return this.number;
  }

  public int personsOnBus(){
    int count = 0;
    for (Passenger passenger : persons){
      if(passenger != null){
        count = count +1;
      }
    }
    return count;
  }

  public void addPeople(Passenger passenger){
    if(isBusFull()){
      return ;
    }
    int index = this.personsOnBus();
    persons[index] = passenger;
  }

  public boolean isBusFull(){
    return personsOnBus() == persons.length;
  }

}