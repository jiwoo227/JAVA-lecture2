public class MainClass {
    public static void main(String[] args){
//        String str = "JAVA";
        String str = new String("JAVA");
        System.out.println("Str : " + str);

        str = str + "_8";
        System.out.println("Str : " + str);

        //StringBuffer
        StringBuffer s1 = new StringBuffer("JAVA");
        System.out.println(s1);
        s1.append("world");
        System.out.println(s1);
        System.out.println(s1.length());
        s1.insert(s1.length(), "~~~");
        System.out.println(s1);

        s1.delete(4,8);
        System.out.println(s1);

        //StringBuilder
        StringBuilder s2 = new StringBuilder("hello world");
        System.out.println(s2);
    }
}
