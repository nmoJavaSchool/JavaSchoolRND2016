package ru.sbertech.test.lesson3;
import ru.sbertech.test.lesson2.*;//import all classes from package
/**
 * Created by Student on 14.07.2016.
 */
public class HelloExt {
    class SayHello{
        public void say(){
            System.out.println("Hello lesson2");
        }
    }
    SayHello sh = new SayHello();
}
