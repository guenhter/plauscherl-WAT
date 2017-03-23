package org.guenhter.plauscherl.wat;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class UrlHashWat {

    public static void main(String[] args) throws Exception {
        Set<URL> mySet = new HashSet<>();
        mySet.add(new URL("http://www.google.com"));

        while (true) {
            System.out.println(mySet.contains(new URL("http://www.google.com")));
            System.in.read();
        }
    }
}
