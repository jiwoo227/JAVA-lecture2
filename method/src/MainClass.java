public class MainClass {
    public static void main(String[] args){

        ChildClass child1 = new ChildClass();
        child1.name ="쥬";
        child1.age =19;
        child1.gender="여자?";

//        child1.setInfo("지우", "남자", 18);
        child1.getInfo();
        child1.getInfo("jiwoo", "woo");
    }
}
