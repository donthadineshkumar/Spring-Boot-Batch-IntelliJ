package sample;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sample{

    public static void main(String args[]){

         System.out.println("Sample Boot");

         System.out.println("Hello");

         Person person = new Person("Hello");




    }

}
