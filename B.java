package PackageA;

public class B {
    public static void main(String[] args) {
        A obj=new A();
        //except private all are accessible within the package
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.w);
    }
}
