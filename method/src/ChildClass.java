public class ChildClass {
    public String name;
    public String gender;
    public int age;

    public ChildClass(){
        System.out.println("ChildClass constructor");
    }
    public void setInfo(String n, String g, int a){
        System.out.println("setInfo start");
        name = n;
        gender = g;
        age = a;
    }
    public void getInfo(){
        System.out.println("getInfo start");
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
    }

    public void getInfo(String s1, String s2){
        name = s1;
        gender = s2;

        System.out.println("getInfo start");
        System.out.println("name : " + s1);
        System.out.println("gender : " + s2);
        System.out.println("age : " + age);
    }
}
