package sample;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.StringJoiner;

@SpringBootApplication
public class Sample implements Ifc{

    @Override
    public String getMessage() {
        return "Master";
    }

    public static void main(String args[]) {

        System.out.println("Sample Boot");

        System.out.println("Hello");

        //Person person = new Person("Hello");


        StringJoiner joiner = new StringJoiner(":", "{", "}");

        joiner.add("Dinesh").add("Dontha");

        System.out.println(joiner);

        System.out.println(printMsg());

    }

    public static String printMsg() {
        return "Hello";
    }


}
