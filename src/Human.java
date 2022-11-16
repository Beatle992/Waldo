import java.util.ArrayList;
import java.util.Arrays;

public class Human{

        private String name;
        private int index;
        private Human nxt;

            public Human(String name, int index){
                this.name = name;
                this.index = index;
            }

            public String getName(){
                return name;
            }

            public int getIndex(){
                return index;
            }

            public void humanNext(Human nxt){
                if(nxt != null) System.out.println(name + " Next is: " + nxt.getName());
                this.nxt = nxt;
                if(nxt == null) System.out.println(name + " you are the last of this list");
             }

            public void WaldoCheck(){
                if(name.equals("Waldo")){
                    System.out.println("Waldo was found with index: " + index);
                } else{
                    nxt.WaldoCheck();
                }
            }

            public void setWaldo(){
                System.out.println("Setting Waldo...: " + name +"; index: "+ index);
                this.name = "Waldo";
            }

}
