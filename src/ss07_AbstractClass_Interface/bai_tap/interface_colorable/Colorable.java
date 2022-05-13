package ss07_AbstractClass_Interface.bai_tap.interface_colorable;

public interface Colorable {
    default String howToColor() {
        return "Color all four sides.";
    }
}
