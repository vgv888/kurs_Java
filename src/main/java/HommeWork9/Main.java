package HommeWork9;

public class Main {

        public static void main(String[] args) {
            String[][] array = new String[][]{{"1","2","3","4"},{"1","f","3","4"},{"1","2","3","4"},{"1","2","3","4"}};

            try {
                System.out.println("Сумма ячеек массива = "+ sumArray(array));
            }catch (MyArraySizeException | MyArrayDataException e){
                e.printStackTrace();
            }
        }

        private static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
            Suze(array,4,4);
            return Data(array);
        }
        private static void Suze(String[][] array, int len, int height) throws MyArraySizeException{
            if (array.length == len)
                for (int i = 0; i < array.length; i++) {
                    if (array[i].length !=height) break;;
                    if(i == array.length - 1) return;
                }
            throw new MyArraySizeException("Не верный размер массива");
        }
        private static int Data(String[][] array)throws MyArrayDataException{
            int sum = 0;
            for (int i = 0; i < array.length;  i++) {
                for (int j = 0; j < array.length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    }catch (NumberFormatException e){
                        throw new MyArrayDataException("Не верные данные!!! Массив должен содержать только числа!!!");
                    }
                }
            }
            return sum;
        }
    }


