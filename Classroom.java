class Classroom{

  private String name;
  private int number;
  private Student[] room;

  public Classroom(String name, int number){
    this.name = name;
    this.number = number;
    this.room = new Student[15];
  }

  public String getName(){
    return this.name;
  }

  public int getNumber(){
    return this.number;
  }

  public int roomCount(){
    int count = 0;
    for(Student student : room){
      if(student != null){
        count++;
      }
    }
    return count;
  }
}
