
class Student1 {
    private String name;
    private int roll;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = 22;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = 56;
    }

}

class Student{
    public static void main(String args[]){
        Student1 s1 = new Student1();
        s1.setName("Priyanshu");
        s1.setAge(22);
        s1.setRoll(56);
        System.out.println("Student Details :");
        System.out.println("Name :"+s1.getName());
        System.out.println("Age :"+ s1.getAge());
        System.out.println("Roll No :"+ s1.getRoll());

    }
}