import java.util.Scanner;

public class Life implements Terms{
    public void NewDay(){
        Stats.food-=5;
        Stats.water-=10;
        if(Stats.food<20||Stats.temperature==0){
            Stats.ill= true;
        }
        Ill();
        Winter();

    }
    public void Menu(){
        Scanner in = new Scanner(System.in);

    }


    public void Winter(){
        Stats.temperature-=10;
    }

    public void Ill(){
        if(Stats.ill){
            Stats.hp-=5+Stats.ill_k;
            Stats.ill_k+=Stats.ill_k<=15?1:0;
        }
    }
}
