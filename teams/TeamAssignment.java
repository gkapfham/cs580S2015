import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class TeamAssignment 
{
    static final Map<Integer, String> STUDENTS = new HashMap<Integer, String>() {{
        put(1, "Ballinger");
        put(2, "Beisler");
        put(3, "Blake");
        put(4, "Chaffee");
        put(5, "Clive");
        put(6, "Craft");
        put(7, "Ginoza");
        put(8, "Kelly");
        put(9, "Kinneer");
        put(10, "Landgrebe");
        put(11, "Means");
        put(12, "Shudy");
        put(13, "Smith");
        put(14, "Weisman");
        put(15, "Zheng");
    }};

    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<Integer>();

        // populate the arraylist with the integers
        for(int i = 1; i <= 15; i++) {
            Integer I = new Integer(i);
            students.add(I);
        }

        // pick the ordering for the talks today
        ArrayList<Integer> studentsTodaysOrdering = (ArrayList<Integer>)students.clone();
        Collections.shuffle(studentsTodaysOrdering);
        System.out.println("Today's random ordering of the students: "); // + studentsTodaysOrdering);
        System.out.println();

        for(Integer studentToday : studentsTodaysOrdering) {

            System.out.println(STUDENTS.get(studentToday));

        }

        System.out.println();

        System.out.println("These are the teams for today's laboratory assignment:");

        int i = 0;
        int team = 1;
        for(Integer studentToday : studentsTodaysOrdering) {

            if(i % 5 == 0) {

                System.out.println();
                System.out.println("Team " + team);
                team++;

            }

            System.out.println(STUDENTS.get(studentToday));

            i++;

        }

    }

}
