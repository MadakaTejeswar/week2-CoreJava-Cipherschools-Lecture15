package PackageB;

import PackageA.A;

public class C extends A {
    public static void main(String[] args) {
        A obj=new A();
        C childObj = new C();
        //default and private are not accessible outside packge
         System.out.println(obj.x);
         System.out.println(childObj.x);
         System.out.println(obj.y);
         System.out.println(childObj.y);
         System.out.println(obj.z);
         System.out.println(childObj.w);
    }
}
