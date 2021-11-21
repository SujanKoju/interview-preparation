package com.example.interviewpreparation;

/**
 * @author kojusujan1111@gmail.com 05/11/21
 */

public class B extends A {
    public static String test() {
        return "B-TEST";
    }

    public static String test(String a) {
        return "B-TEST STATIC"+a;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(" OBJECT OF B REMOVED FROM MEMORY");
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(B.test("SUJAN"));
    }
}
