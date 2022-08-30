public class ExtinctionMain {
    public static void main(String[] args){

        //디폴트 성성자
        Extinction obj1 = new Extinction();
        System.out.println();

        //사용자 정의 생성자
        Extinction obj2 = new Extinction(10);

        int arr[] = {10,20,30};
        Extinction obj3 = new Extinction("JAVA", arr);

        //소멸자
        Extinction obj4;

        obj4 = new Extinction();
        obj4 = new Extinction();

        System.gc();

        //this
        int ints[] = {10,20,30};
        Extinction obj5 = new Extinction(10, "JAVA", ints);
    }
}
