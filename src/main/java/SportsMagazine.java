import java.util.ArrayList;
import java.util.List;

public class SportsMagazine {
    public static void main(String[] args) {
        List<Athletes> athletes = new ArrayList<Athletes>();
        athletes.add(new Athletes("Alina Zagitova", false, true, true));
        athletes.add(new Athletes("Robert Lewandowski", true, true, false ));
        athletes.add(new Athletes("Mariusz Pudzianowski", false, false, true));

        print(athletes,new CheckIfFastRun());
    }

    private static void print(List<Athletes> athletes, CheckSkills checker){
        for (Athletes athelete:athletes
             ) {
            if (checker.test(athelete)){
                System.out.println(athelete + " ");
            }
            System.out.println();
        }
    }
}
