package HommeWork5;

  public class Main {
        public static void main(String[] args) {
            Mans[] mans = new Mans[8];
            mans[0] = new Mans("Сергеев Иван Петрович", "Директор", "sergeev@mail.ru",
                    "+79110147457", 40000, 56);
            mans[1] = new Mans("Иващенко Вадив Иванович", "Завхоз", "ivashenko@mail.ru",
                    "+79875656866", 20000, 32);
            mans[2] = new Mans("Иващенко Вадив Иванович", "Завхоз", "ivashenko@mail.ru",
                    "+79875656866", 20000, 32);
            mans[3] = new Mans("Калачева Нина Петровна ", "Бухгалтер", "kalch@mail.ru",
                    "+79111472547", 30000, 38);
            mans[4] = new Mans("Федоров Антон Ильич", "Рабочий", "fedor_off@mail.ru",
                    "+79111471214", 15000, 22);
            mans[5] = new Mans("Макурин Ибрагим Исламович", "Водитель", "ibrag@mail.ru",
                    "+79994445566", 10000, 42);
            mans[6] = new Mans("Маркова Марина Сергеевна", "Экономист", "markova@mail.ru",
                    "+799998574121", 140000, 68);
            mans[7] = new Mans("Карпов Георгий Понтелеевич", "Охранник", "--",
                    "+79995566123", 12500, 72);

            for (Mans man : mans) {
                if (man.getAge() > 40){
                    man.printInfo();
                }



                }


            }

        }

