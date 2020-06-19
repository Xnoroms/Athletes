import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SportsMagazine {
    public static void main(String[] args) {
        List<Athletes> athletes = new ArrayList<Athletes>();
        athletes.add(new Athletes("Alina Zagitova", false, true, true));
        athletes.add(new Athletes("Robert Lewandowski", true, true, false ));
        athletes.add(new Athletes("Mariusz Pudzianowski", false, false, true));



        //lambda

        System.out.println("dancers:");
        print(athletes,a -> a.isCanDance());
        System.out.println("high-jumpers:");
        print(athletes,a -> a.isCanHighJump());
        System.out.println("fast-runners: ");
        print(athletes,a -> a.isCanFastRun());

        System.out.println("Winter sports: ");

        // loop -> lambda

        String[] a = {"skiing", "skating", "hockey","biathlon"};
        List<String> winterSports = Arrays.asList(a);

        winterSports.forEach((winterSport) -> System.out.println(winterSport));
    }


    //Predicate
    private static void print(List<Athletes> athletes, Predicate<Athletes> checker){
        for (Athletes athelete:athletes
             ) {
            if (checker.test(athelete)){
                System.out.println(athelete + " ");
                }
            System.out.println();
        }

    }

}
