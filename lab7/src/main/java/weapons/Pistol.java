package weapons;

public class Pistol extends Weapon{
    private String name;
    private String ammo;
    public Pistol(String name, String ammo){
        this.name = name;
        this.ammo = ammo;
    }
    @Override
    public void shot(){
        System.out.println("Пиу!");
    }
    @Override
    public String toString(){
        return "Название: "+this.name+" "+this.ammo;
    }
}
