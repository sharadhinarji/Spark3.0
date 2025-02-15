package ProtectedCase;

import AccessModifier.ProtectedDemo;

public class ProtectedSubclass extends ProtectedDemo {//it is child class
    ProtectedDemo protectedDemo = new ProtectedDemo();
    //System.out.println(protectedDemo.msg)
    //System.out.println(msg)//-->cants access and use in static

    public void showMsg() {
        System.out.println(msg);

    }
}

