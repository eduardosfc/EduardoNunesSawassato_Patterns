public class Application {

    private final UIComponentFactory factory;

    // a aplicação só conhece a interface da factory, nunca as classes concretas
    public Application(UIComponentFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        textField.render();
        checkbox.render();
    }
}
