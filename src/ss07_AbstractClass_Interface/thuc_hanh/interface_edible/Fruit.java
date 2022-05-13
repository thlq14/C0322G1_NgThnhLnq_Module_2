package ss07_AbstractClass_Interface.thuc_hanh.interface_edible;

public abstract class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
