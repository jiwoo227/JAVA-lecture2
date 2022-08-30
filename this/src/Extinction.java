public class Extinction {
    int num;
    String str;
    int num5[];

    public Extinction(){
        System.out.println("Default constrouctor");
    }

    public Extinction(int i){
        System.out.println("Custom constructor");
        num = i;
    }
    public Extinction(String s, int i[]){
        System.out.println("UserDefined constructor");
    }
    public Extinction(int i, String s, int is[]){
        System.out.println("final");
        this.num = i;
        this.str = s;
        this.num5 = is;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("final");
        super.finalize();
    }
}
