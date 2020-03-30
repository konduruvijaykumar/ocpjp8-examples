package org.pjay.ocpjp8;

/**
 * @author vijayk
 */
public class App1 {

    public static void main(String[] args) {
        Super aSuper = new Sub();
        // 'text' has private access in 'org.pjay.ocpjp8.Super'
        // System.out.println(aSuper.text);
        aSuper.printSentData("Vijay");
        ((Sub) aSuper).subMethod();

        Sub sub = new Sub();
        // 'text' has private access in 'org.pjay.ocpjp8.Super'
        // System.out.println(sub.text);
        sub.printSentData("Pjay");
        sub.subMethod();
    }

}
