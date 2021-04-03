package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //psf
    public static final int a = 10;


    //psvm
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World.1");
        System.out.println("Hello World.2");
        System.out.println("Hello World.3");


        ArrayList<String> str =new ArrayList<String>();


        //sout
        System.out.println();
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm
        System.out.println("Main.main");
        //soutv
        System.out.println("str = " + str);
        //fori
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
        //iter
        for (String s : str) {

        }
        //itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

        //str.fori
        for (int i = 0; i < str.size(); i++) {

        }
        //ifn
        if (str == null) {

        }
        //inn
        if (str != null) {

        }
        //str.nn
        if (str != null) {

        }
        //str.null
        if (str == null) {

        }


    }

}
