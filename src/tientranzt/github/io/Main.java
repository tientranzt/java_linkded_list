package tientranzt.github.io;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        var a = new LinkedList<String>();
        a.add("a");
        a.add("b");
        a.add("c");

        var b = new LinkedList<String>();
        b.add("d");
        b.add("e");
        b.add("f");
        b.add("g");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);


        bIter= b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);

    }

}


