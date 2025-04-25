import classes.FlipPhone;
import classes.Phone;
import classes.RotaryPhone;
import classes.SmartPhone;
import interfaces.Callable;
import interfaces.Photographable;

public class Main {

    /**
     * author: Shchukin FN
     * date: 2025.04.25
     * task: lesson 06-01 (08)
     * Задача выложена в виде картинки
     * Показать на примере абстрактного класса два дочерних класса,
     * которые еще будут реализовывать 2 интерфейса.
     * Плюс реализовать перечисление с доп.полем
     */

    public static void main(String[] args) {

        RotaryPhone phone = new RotaryPhone();
        System.out.println("========================");
        System.out.println(phone);
        phone.ring();
        phone.makeCall();
        phone.makePhoto();

        FlipPhone phone2 = new FlipPhone("Samsung V2", 1);
        System.out.println("========================");
        System.out.println(phone2);
        phone2.ring();
        phone2.makeCall();
        phone2.makePhoto();

        SmartPhone phone3 = new SmartPhone("Xiaomi T23", 2);
        System.out.println("========================");
        System.out.println(phone3);
        phone3.ring();
        phone3.makeCall();
        phone3.makePhoto();



    }

}
