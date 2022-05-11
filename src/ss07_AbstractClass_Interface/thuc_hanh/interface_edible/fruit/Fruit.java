package ss07_AbstractClass_Interface.thuc_hanh.interface_edible.fruit;

import ss07_AbstractClass_Interface.thuc_hanh.interface_edible.edible.Edible;

public abstract class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
