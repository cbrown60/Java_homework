public class Bar {
 private String name;
 private Patrons[]people; 

public Bar(String name){
  this.name = name;
  this.people = new Patrons[50];
}

public String getName(){
  return this.name;
}

}