import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SportsMagazine {
    public static void main(String[] args) {
        List<Athletes> athletes = new ArrayList<Athletes>();
        athletes.add(new Athletes("Alina Zagitova", false, true, true));
        athletes.add(new Athletes("Robert Lewandowski", true, true, false ));
        athletes.add(new Athletes("Mariusz Pudzianowski", false, false, true));



        //lambda
        print(athletes,c -> c.isCanDance());
        print(athletes,c -> c.isCanHighJump());
        print(athletes, c -> c.isCanFastRun());
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
