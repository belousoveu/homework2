public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog+=4;
        cat+=4;
        paper+=4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);
        var boxer1=78.2;
        var boxer2=82.7;
        System.out.println("Общий вес двух бойцов "+(boxer1+boxer2)+" кг");
        System.out.println("Разница веса двух бойцов "+Math.abs(boxer1-boxer2)+" кг");
        System.out.println("Остаток от деления весов двух бойцов "+(Math.max(boxer2,boxer1)%Math.min(boxer1,boxer2))+" кг");

        var totalWorkingTime=640;
        var onePersonWorkingTime=8;
        System.out.println("Всего работников в компании "+(totalWorkingTime/onePersonWorkingTime)+" человек");
        var totalPersons=totalWorkingTime/onePersonWorkingTime+94;
        System.out.println("Если в компании работает  "+totalPersons+" человек, то всего "+(totalPersons*onePersonWorkingTime)+" часов работы может быть поделено между сотрудниками");

    }
}