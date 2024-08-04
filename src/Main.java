public class Main {
    public static void main(String[] args) {

        int a = 565;
        byte b = -121;
        short c = 13;
        long d = 11222333L;
        float f = 25.16f;
        double g = 45.3222;
        System.out.println("Значение переменной a с типом int равно " + a );
        System.out.println("Значение переменной b с типом byte равно " + b );
        System.out.println("Значение переменной c с типом short равно " + c );
        System.out.println("Значение переменной d с типом long равно " + d );
        System.out.println("Значение переменной f с типом float равно " + f );
        System.out.println("Значение переменной g с типом double равно " + g );

        float a1 = 27.12f;
        long b1 = 987_678_965_549l;
        double c1 = 2.786;
        short d1 = 569;
        short f1 = -159;
        int g1 = 27897;
        byte h1 = 67;

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        int students = class1 + class2 + class3;
        System.out.println("На каждого ученика расчитано " + paper / students + " листов бумаги");

        byte time = 2;
        byte bottle = 16;
        int operation1 = bottle / time;
        int operation2 = operation1 * 20;
        int operation3 = (operation1 * 60) * 24;
        int operation4 = operation3 * 3;
        int operation5 = operation3 * 30;
        System.out.println("За 20 минут машина произвела " + operation2 + " бутылок");
        System.out.println("За сутки машина произвела " + operation3 + " бутылок");
        System.out.println("За 3 дня машина произвела " + operation4 + " бутылок");
        System.out.println("За месяц машина произвела " + operation5 + " бутылок");

        byte schoolPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classPaint = whitePaint + brownPaint;
        int allClass = schoolPaint / classPaint;
        System.out.println(" В школе, где " + allClass + " классов, нужно " + allClass * whitePaint + " банок белой краски и " + allClass * brownPaint + " банок коричневой краски");

        byte banan = 80;
        byte milk = 105;
        byte plombir = 100;
        byte egg = 70;
        int breakfast = (banan * 5) + (milk * 2) + (plombir * 2) + (egg * 4);
        System.out.println("Завтрак спортсмена составляет " + breakfast + " грамм");
        float breakfast1 = (float) breakfast / 1000;
        System.out.println("Завтрак спортсмена составляет " + breakfast1 + " кг");

        int vesKg = 7;
        int vesGr = 1000;
        int allVes = vesKg * vesGr;
        int minVes = 250;
        int maxVes = 500;
        int minDay = allVes / maxVes;
        int maxDay = allVes / minVes;
        int avgDay = (minDay + maxDay) / 2;
        System.out.println(minDay);
        System.out.println(maxDay);
        System.out.println(avgDay);

        int maryaMonth = 67760;
        int denisMonth = 83690;
        int kristinaMonth = 76230;
        int maryaYear = maryaMonth * 12;
        int denisYear = denisMonth * 12;
        int kristinaYear = kristinaMonth * 12;
        int maryaMonth1 = (maryaMonth * 110) / 100;
        int denisMonth1 = (denisMonth * 110) / 100;
        int kristinaMonth1 = (kristinaMonth * 110) / 100;
        int maryaYear1 = maryaMonth1 * 12;
        int denisYear1 = denisMonth1 * 12;
        int kristinaYear1 = kristinaMonth1 * 12;
        System.out.println("Мария теперь получает " + maryaMonth1 + " рублей. Годовой доход вырос на " + (maryaYear1 - maryaYear) + " рублей.");
        System.out.println("Денис теперь получает " + denisMonth1 + " рублей. Годовой доход вырос на " + (denisYear1 - denisYear) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaMonth1 + " рублей. Годовой доход вырос на " + (kristinaYear1 - kristinaYear) + " рублей.");






            }
}
