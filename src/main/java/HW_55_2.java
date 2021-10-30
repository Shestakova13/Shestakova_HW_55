public class HW_55_2 {
    public static void main(String[] args){
        int a = 100; // Начальное значение диапазона - "от"
        int b = 999; // Конечное значение диапазона - "до"
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("Случайное число: " + random_number1);
        int first = random_number1 / 100;
        int secondBegin = random_number1 / 10;
        int second = secondBegin % 10;
        int third = random_number1 % 10;
        if (first > second && first > third) {
            System.out.println ("Большая цифра: " + first);
        } else if (second > first && second > third) {
            System.out.println ("Большая цифра: " + second);
        } else {
            System.out.println ("Большая цифра: " + third);
        }


    }

}
