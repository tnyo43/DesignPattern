public abstract class Border: Display {
    protected val display: Display;

    protected constructor(display: Display): super() {
        this.display = display
    }
}