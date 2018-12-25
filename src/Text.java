public class Text implements Terms{

    @Override
    public void NewDay() {
        System.out.println("Наступил новый день\nВаше самочувствие:\nСытость: "+Stats.food+"%\nВода: "+Stats.water+
                "%\nТепло: "+Stats.temperature+"%\nЗдоровье: "+Stats.hp+"%");
    }

    @Override
    public void Winter() {
        if(Stats.winter) System.out.println("Наступила Зима. Переживёте ли вы её?");
        else System.out.println("Зима закончилась!");
    }

    @Override
    public void Ill() {
        if(Stats.winter) System.out.println("Вы заболели. Пора закупиться таблетками.");
        else System.out.println("В таких условиях трудно справиться с болезнью, но вы справились!");
    }
    public void Menu(){
        System.out.println("Сегодня ты можешь:");
    }
}
