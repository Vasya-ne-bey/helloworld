//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
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
       System.out.println (dog);
       System.out.println (cat);
       System.out.println (paper);
       dog = dog + 4;
       cat = cat + 4;
       paper = paper + 4;

       System.out.println (dog);
       System.out.println (cat);
       System.out.println (paper);
       dog = dog - 3.5;
       cat = cat - 1.6;
       paper = paper - 7639;
       System.out.println (dog);
       System.out.println (cat);
       System.out.println (paper);
       var friend = 19;
       System.out.println (friend);
       friend = friend + 2;
       System.out.println (friend);
       friend = friend / 7;
       System.out.println (friend);
       var frog = 3.5;
       System.out.println (frog);
       frog = frog * 10;
       System.out.println (frog);
       frog = frog / 3.5;
       System.out.println (frog);
       frog = frog + 4;
       System.out.println (frog);
       var boxera = 78.2;
       var boxerb = 82.7;
       var twoboxers = boxera + boxerb;
       System.out.println (twoboxers + " общая масса");
       var differense = boxerb - boxera;
       System.out.println (differense + "  разница в весе");
       var ostatok = boxerb % boxera;
       System.out.println (ostatok + " остаток от деления весов");
       var allhours = 640;
       var personalhours = 8;
       var allworkers = allhours / personalhours;
       System.out.println ("Всего работников в компании - " + allworkers +" человек" );
}

}