
// 6. Create and access default and static method of an interface.


interface ModernInterface {
    void mustImplementMe();

    default void canIgnoreImplementingMe(){
        System.out.println("Default method: 'Classes may or may not implement my definition'");
    }

    static void cannotOverrideMe(){
        System.out.println("Static method: 'Classes my or may not implement my definition but CANNOT change my implementation");
    }
}

public class ans6 implements ModernInterface{
    @Override
    public void mustImplementMe() {
        System.out.println("Normal method: 'Classes must implement methods that aren't default or static.'");
    }

    public static void main(String[] args) {
        ans6 app = new ans6();
        app.mustImplementMe();
        app.canIgnoreImplementingMe();
        ModernInterface.cannotOverrideMe();

    }
}

