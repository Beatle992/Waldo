import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {

        int index = 0;

            ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(
                    "Carlos", "GianFranco", "Leonie",
                    "Michael", "Cassian", "Florian",
                    "Hanna", "Lena", "Yannis",
                    "Leo", "Carina", "David",
                    "Sarah", "Felix", "Niki",
                    "Vittorio", "Betram"));
            System.out.println(nameList);

             ArrayList<Human> humans = new ArrayList<Human>();

            Iterator<String> smth = nameList.iterator();

            while(smth.hasNext()){
                Human human = new Human(smth.next(), index);
                humans.add(human);
                index++;
            }

            Iterator<Human> sthm1 = humans.iterator();

            while(sthm1.hasNext()){
                Human human = sthm1.next();
                if(human.getIndex() == humans.size()-1){
                    human.humanNext(null);
                }else {
                    human.humanNext(humans.get(human.getIndex()+1));
                }
            }

            Random random = new Random();
            int rand = random.nextInt(humans.size());

            humans.get(rand).setWaldo();
            humans.get(0).WaldoCheck();
    }
}