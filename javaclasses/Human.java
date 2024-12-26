public class Human{

int age ;
char gender;
double height;
String name;

public Human(){

}

public Human(String name, double height, int age , char gender){
this.name= name;
this.height= height ;
this.age= age;
this.gender=gender;
}

public String getName(){
    return this.name;
}

public void setName(){
    this.name= name;
}


}