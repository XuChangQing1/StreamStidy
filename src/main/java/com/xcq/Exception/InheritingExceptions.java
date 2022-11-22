package com.xcq.Exception;

// exceptions/InheritingExceptions.java
// Creating your own exceptions
class SimpleException extends Exception {
    SimpleException(){
        System.out.println("hhh");
    }
}
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println(
                "Throw SimpleException from f()");
        throw new SimpleException();
    }
    public static void main(String[] args) {
        InheritingExceptions sed =
                new InheritingExceptions();
        try {
            sed.f();
        } catch(SimpleException e) {  // 自动调用基类的无参构造器
            System.out.println("Caught it!");
        }
    }
}