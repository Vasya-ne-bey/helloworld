//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
        homework4();
    }

    public static void homework1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello world!");
            System.out.println("Привет мир!");
        }
    }

    public static void homework2() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxera = 78.2;
        var boxerb = 82.7;
        var twoboxers = boxera + boxerb;
        System.out.println(twoboxers + " общая масса");
        var differense = boxerb - boxera;
        System.out.println(differense + "  разница в весе");
        var ostatok = boxerb % boxera;
        System.out.println(ostatok + " остаток от деления весов");
        var allhours = 640;
        var personalhours = 8;
        var allworkers = allhours / personalhours;
        System.out.println("Всего работников в компании - " + allworkers + " человек");
    }

    public static void homework3() {
        int bugs = 10000;
        System.out.println("Значение переменной bugs с типом int равно " + bugs);
        byte dog = 1;
        System.out.println(" Значение переменной dog с типом byte равно " + dog);
        short states = 200;
        System.out.println("Значение переменной states с типом short равно " + states);
        long stars = 1000000000L;
        System.out.println("Значение переменной stars с типом long равно " + stars);
        float diggers = 1.5f;
        System.out.println("Значение переменной diggers с типом float равно " + diggers);
        double chance = 0.123456789d;
        System.out.println("Значение переменной chance с типом double равно " + chance);
        float that = 27.12f;
        long what = 987678965549L;
        float something = 2.786f;
        short itIs = 569;
        short please = -159;
        short enough = 27897;
        byte theDust = 67;

        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        int allPaper = 480;
        int personalPaper = allPaper / (lpStudents + asStudents + eaStudents);
        System.out.println("На каждого ученика рассчитано " + personalPaper + " листов бумаги");
        short twoMin = 16;
        int twentyMin = twoMin * 10;
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок");
        int day = twentyMin * 72;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За трое суток машина поизвела " + threeDay + " штук бутылок");
        int month = threeDay * 10;
        System.out.println("За месяц машина произвела " + month + "штук бутылок");
        short whitePaint = 2;
        short brownPaint = 4;
        short allPaint = 120;
        int rooms = allPaint / (whitePaint + brownPaint);
        int allWhitePaint = whitePaint * rooms;
        int allBrownPaint = brownPaint * rooms;
        System.out.println("В школе, где " + rooms + " классов, нужно " + allWhitePaint + " банок белой краски и"
                + allBrownPaint + " Банок коричневой краски");

        short bananaz = 5 * 8;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int breakfast = bananaz + milk + iceCream + eggs;
        System.out.println(breakfast + " граммов");
        float kgBreakfast = breakfast / 1000f;
        System.out.println(kgBreakfast + " килограмм");
        short minGramm = 250;
        short maxGramm = 500;
        int overWeight = 7000;
        int result1 = overWeight / minGramm;
        System.out.println(result1 + " Дней понадобится, если терять по 250гр в день");
        int result2 = overWeight / maxGramm;
        System.out.println(result2 + " Дней понадобится, если терять по 500г в день");
        int result3 = (result1 + result2) / 2;
        System.out.println(result3 + " Дней в среднем понадобится для сгонки веса");
        int mashaMoney1 = 67760;
        int denMoney1 = 83690;
        int crisMoney1 = 76230;
        int mashaMoney2 = mashaMoney1 / 10 * 11;
        int denMoney2 = denMoney1 / 10 * 11;
        int crisMoney2 = crisMoney1 / 10 * 11;
        int mashaYearDiff = (mashaMoney2 * 12) - (mashaMoney1 * 12);
        int denYearDiff = (denMoney2 * 12) - (denMoney1 * 12);
        int crisYearDiff = (crisMoney2 * 12) - (crisMoney1 * 12);
        System.out.println(" Маша теперь получает " + mashaMoney2 + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");
        System.out.println(" Денис теперь получает " + denMoney2 + " рублей. Годовой доход вырос на " + denYearDiff + " рублей");
        System.out.println(" Кристина теперь получает " + crisMoney2 + " рублей. Годовой доход вырос на " + crisYearDiff + " рублей");


    }

    public static void homework4 () {
        int age = 18;
        System.out.println( " Человеку 18 или больше лет.");
        if (age >= 18) { System.out.println(" Если возраст человека равен или больше 18, то он совершеннолетний");
        } else {
            System.out.println(" Если возраст человека меньше 18, то он еще не достиг совершеннолетия, надо немного подождать ");
        }

        int temperature = 9;
        if (temperature > 5) { System.out.println("на улице " + temperature + " градусов, сегодня тепло, можно идти без шапки"); }
        else {  System.out.println(" на улице " + temperature + " градусов, нужно надеть шапку"); }

        int speed = 63;
        if (speed > 60) {  System.out.println(" Если скорость выше 60 км/ч, то придется заплатить штраф "); }
        else { System.out.println("Если скорость ниже 60 км/ч, то можно ездить спокойно"); }

        int years = 3;
        if (years > 2 && years <= 6) {  System.out.println(" Если возраст человека равен " + years + " то ему нужно ходить в садик"); }
        years = 10;
        if (years > 6 && years < 18) {  System.out.println(" Если возраст человека равен " + years + " то ему нужно ходить в школу"); }
        years = 20;
        if (years >= 18 && years <= 24) {  System.out.println(" Если возраст человека равен " + years + " то ему нужно ходить в университет"); }
        years = 30;
        if (years > 24) {  System.out.println(" Если возраст человека равен " + years + " то ему пора ходить на работу"); }

        int let = 4;
        if (let < 5) {  System.out.println(" Если возраст ребенка равен " + let + " то ему нельзя кататься на аттракционе "); }
        let = 9;
        if (let > 5 && let < 14) {  System.out.println(" Если возраст ребенка равен " + let + " то ему можно кататься на аттракционе в сопровождении взрослого "); }
        let = 16;
        if (let > 14) {  System.out.println(" Если возраст ребенка равен " + let + " то ему можно кататься на аттракционе без сопровождения взрослого "); }

        int passenger = 86;
        if (passenger < 102 ) {  System.out.println(" В вагоне есть места "); }
        else {  System.out.println(" В вагоне нет мест"); }

        int one = 1;
        int two = 2;
        int three = 3;
        if (three > two && three > one) {  System.out.println(three + " наибольшее число "); }
        else if (two > three && two > one) {  System.out.println(two + " наибольшее число "); }
        else { System.out.println(one + "наибольшее число"); }

    }
}