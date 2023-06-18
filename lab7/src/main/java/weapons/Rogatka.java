package weapons;

public class Rogatka extends Weapon{
    private String name;
    private String ammo;

    public Rogatka(String name, String ammo){
        this.name = name;
        this.ammo = ammo;

    }
    @Override
    public void shot(){
        System.out.println("Фить");
    }
    @Override
    public String toString(){
        return "Название: "+this.name+" "+this.ammo;
    }
}
