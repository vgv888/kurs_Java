package HommeWork6;

import javax.print.attribute.standard.PrinterInfo;

public class Main {


    public static void main(String[] args) {

        Cats cat = new Cats("Пуся",180, 0);
        Cats cat1 = new Cats("Барсик", 140,0);
        Dogs dog = new Dogs("Палкан", 480,8);
        Dogs dog1 = new Dogs("Зверь", 450,10);

        Animals [] animals = {cat,cat1,dog,dog1};
        for (Animals animal:animals) {

                animal.printInfo();

        }

        }

    }
