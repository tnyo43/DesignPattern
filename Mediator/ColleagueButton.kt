import java.awt.Button;

public class ColleagueButton(caption: String): Button(caption), Colleague {
    private lateinit var mediator: Mediator;

    override public fun setMediator(mediator: Mediator) {
        this.mediator = mediator;
    }

    override public fun setColleagueEnabled(enabled: Boolean) {
        setEnabled(enabled);
    }
}