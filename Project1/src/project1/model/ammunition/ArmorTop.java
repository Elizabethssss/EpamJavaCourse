package project1.model.ammunition;

public class ArmorTop extends Ammunition {
    private int armor;

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public ArmorTop(String name, double price, Material material, TypeOfAmmo typeOfAmmo, int armor) {
        super(name, price, material, typeOfAmmo);
        this.armor = armor;
    }

    @Override
    public String toString() {
        return super.toString() + ", armor = " + armor;
    }
}
