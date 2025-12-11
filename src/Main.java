//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Задача №1");
        int a = 3000000;
        byte b = 127;
        short c = 32000;
        long d = 18758;
        float e = 3.78f;
        double f = 8.78954128;
        System.out.println("Значение переменной " + a + " с типом " + "int" + " равно " + "2000000");
        System.out.println("Значение переменной " + b + " с типом " + "byte" + " равно " + "127");
        System.out.println("Значение переменной " + c + " с типом " + "short" + " равно " + "32000");
        System.out.println("Значение переменной " + d + " с типом " + "long" + " равно " + "18758");
        System.out.println("Значение переменной " + e + " с типом " + "float" + " равно " + "3.78f");
        System.out.println("Значение переменной " + f + " с типом " + "double" + " равно " + "8.78954128");

        System.out.println( );

        System.out.println("Задача №2");
        float e1 = 27.12f;
        long d1 = 987678965549L;
        float e2 = 2.786f;
        short c1 = 569;
        short c2 = -159;
        short c3 = 27897;
        byte b1 = 67;

        System.out.println( );

        System.out.println("Задача №3");
        int luda = 23;
        int anna = 27;
        int katya = 30;
        int allPiece = 480;
        int piece = allPiece / (luda + anna + katya);
        System.out.println("На каждого учеика рассчитано " + piece + " листов бумаги");

        System.out.println( );

        System.out.println("Задача №4");
        int quantity = 8;
        int times = 20;
        System.out.println("За " + times + " минут" + " машина произвела " + (quantity * times) + " штук бутылок ");
        times = 60 * 24;
        System.out.println("За сутки машина произвела " + (quantity * times) + " штук бутылок ");
        times = 60 * 3;
        System.out.println("За 3 дня машина произвела " + (quantity * times) + " штук бутылок ");
        times = 60 * 24 * 30;
        System.out.println("За месяц машина произвела " + (quantity * times) + " штук бутылок ");

        System.out.println( );

        System.out.println("Задача №5");
        int all = 120;
        int white = 2;
        int brown = 4;
        int clas = white + brown;
        int allClas = all / clas;
        int brown1 = brown * allClas;
        int white1 = white * allClas;
        System.out.println("В школе, где " + allClas + " классов, нужно " + white1 + " банок белой краски и " + brown1 + " банок коричневой краски"); //Проверка

        System.out.println( );

        System.out.println("Задача №6");
        int banan = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int gram = banan + milk + iceCream + egg;
        float kg = gram / 1000f;
        System.out.println("Количество грамм в завтраке: " + gram);
        System.out.println("Количество килограм в завтраке: " + kg);

        System.out.println( );

        System.out.println("Задача №7");
        int mass = 7 * 1000;
        gram = 250;
        int ves = mass / gram;
        gram = 500;
        int ves1 = mass / gram;
        float ves2 = (ves + ves1) / 2f;
        System.out.println("Количество дней, если сбрасывать по 250г/день: " + ves);
        System.out.println("Количество дней, если сбрасывать по 500г/день: " + ves1);
        System.out.println("Среднее количество дней на сброс веса: " + ves2);

        System.out.println( );

        System.out.println("Задача №8");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int zpM = masha + masha / 100 * 10;
        int zpD = denis + denis / 100 * 10;
        int zpK = kris + kris / 100 * 10;
        int diffM = zpM * 12 - masha * 12;
        int diffD = zpD * 12 - denis * 12;
        int diffK = zpK * 12 - kris * 12;
        System.out.println("Маша теперь получает " + zpM + " рублей. Годовой доход вырос на " + diffM + " рублей");
        System.out.println("Денис теперь получает " + zpD + " рублей. Годовой доход вырос на " + diffD + " рублей");
        System.out.println("Кристина теперь получает " + zpK + " рублей. Годовой доход вырос на " + diffK + " рублей");
    }
}