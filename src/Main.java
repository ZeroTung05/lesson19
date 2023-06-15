public class Main {
    public static void main(String[] args){
        Human human1 = new Human();
        human1.setAge(20);
        human1.setName("Александр");
        human1.getInfo();
        Human human2 = new Human();
        human1.setAge(28);
        human1.setName("Ivan");
        human1.getInfo();
    }
}
    class Human{
    String name;
    int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name+","+age);;
    }
}