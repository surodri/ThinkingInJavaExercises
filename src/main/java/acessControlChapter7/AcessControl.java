package acessControlChapter7;
import access.mypackage.Widget;

import java.util.Vector;
//import net.mindview.simple.*;

public class AcessControl {


    public void main(String []args){
        Vector exercise2 = new Vector();

        java.util.Vector exe2 = new java.util.Vector();

        JavaAccessSpecifiers exercise4 = new JavaAccessSpecifiers();
        exercise4.exercise4NoAccessOutsideOfPackage();

        access.mypackage.AccessClassMembers exercise5 = new access.mypackage.AccessClassMembers();

        Widget widget = new Widget();
    }
}
