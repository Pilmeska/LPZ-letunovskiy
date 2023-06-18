package weapons;

public class RPG extends Weapon  {
    private String name;
    private String ammo;

    public RPG(String name, String ammo){
        this.ammo = ammo;
        this.name = name;

    }
    @Override
    public void shot(){
        System.out.println("БАБАААААХ");
    }
    @Override
    public String toString(){
        return "Название: "+this.name+" "+this.ammo;
    }
}
