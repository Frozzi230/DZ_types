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
        long d = 18758L;
        float e = 3.78f;
        double f = 8.78954128;
        System.out.println("Значение переменной " + a + " с типом " + "int" + " равно " + a);
        System.out.println("Значение переменной " + b + " с типом " + "byte" + " равно " + b);
        System.out.println("Значение переменной " + c + " с типом " + "short" + " равно " + c);
        System.out.println("Значение переменной " + d + " с типом " + "long" + " равно " + d);
        System.out.println("Значение переменной " + e + " с типом " + "float" + " равно " + e);
        System.out.println("Значение переменной " + f + " с типом " + "double" + " равно " + f);

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
        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        short allPiece = 480;
        int piece = allPiece / (luda + anna + katya);
        System.out.println("На каждого учеика рассчитано " + piece + " листов бумаги");

        System.out.println( );

        System.out.println("Задача №4");
        byte quantity = 16;
        byte time = 2;
        int quantityOne = quantity / time;
        int times = 20;
        int quantityAll = quantityOne * times;
        System.out.println("За " + times + " минут" + " машина произвела " + quantityAll + " штук бутылок ");
        times = 60 * 24; //Выясняем сколько минут в сутках
        quantityAll = quantityOne * times;
        System.out.println("За сутки машина произвела " + quantityAll + " штук бутылок ");
        times = 60 * 3;//Выясняем сколько минут в 3х днях
        quantityAll = quantityOne * times;
        System.out.println("За 3 дня машина произвела " + quantityAll + " штук бутылок ");
        times = 60 * 24 * 30;//Выясняем сколько минут в месяце
        quantityAll = quantityOne * times;
        System.out.println("За месяц машина произвела " + quantityAll + " штук бутылок ");

        System.out.println( );

        System.out.println("Задача №5");
        byte all = 120;
        byte white = 2;
        byte brown = 4;
        int clas = white + brown;
        int allClas = all / clas;
        int brown1 = brown * allClas;
        int white1 = white * allClas;
        System.out.println("В школе, где " + allClas + " классов, нужно " + white1 + " банок белой краски и " + brown1 + " банок коричневой краски"); //Проверка

        System.out.println( );

        System.out.println("Задача №6");
        short banan = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        int gram = banan + milk + iceCream + egg;
        float kg = gram / 1000f;
        System.out.println("Количество грамм в завтраке: " + gram);
        System.out.println("Количество килограм в завтраке: " + kg);

        System.out.println( );

        System.out.println("Задача №7");
        short mass = 7 * 1000;
        int losePerDay250 = 250;
        int days250 = mass / losePerDay250;
        int losePerDay500 = 500;
        int days500 = mass / losePerDay500;
        float averageDays = (days250 + days500) / 2f;
        System.out.println("Количество дней, если сбрасывать по 250г/день: " + losePerDay250);
        System.out.println("Количество дней, если сбрасывать по 500г/день: " + losePerDay500);
        System.out.println("Среднее количество дней на сброс веса: " + averageDays);

        System.out.println( );

        System.out.println("Задача №8");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        float zpM = (float) (masha + masha / 100 * 10);
        float zpD = (float) (denis + denis / 100 * 10);
        float zpK = (float) (kris + kris / 100 * 10);
        float diffM = zpM * 12 - masha * 12;
        float diffD = zpD * 12 - denis * 12;
        float diffK = zpK * 12 - kris * 12;
        System.out.println("Маша теперь получает " + zpM + " рублей. Годовой доход вырос на " + diffM + " рублей");
        System.out.println("Денис теперь получает " + zpD + " рублей. Годовой доход вырос на " + diffD + " рублей");
        System.out.println("Кристина теперь получает " + zpK + " рублей. Годовой доход вырос на " + diffK + " рублей");

    }
}