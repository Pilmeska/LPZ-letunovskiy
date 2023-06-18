package weapons;

public class WaterGun extends Weapon {
    private String name;
    private String ammo;
    public WaterGun(String name, String ammo){
        this.name = name;
        this.ammo = ammo;

    }
    @Override
    public void shot(){
        System.out.println("Звук летящего камня");
    }
    @Override
    public String toString(){
        return "Название: "+this.name+" "+this.ammo;
    }
}
