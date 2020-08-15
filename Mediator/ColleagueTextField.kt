import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField(text: String, columns: Int): TextField(text, columns), TextListener, Colleague {
    private lateinit var mediator: Mediator;
    
    override public fun setMediator(mediator: Mediator) {
        this.mediator = mediator;
    }

    override public fun setColleagueEnabled(enabled: Boolean) {
        setEnabled(enabled);
        setBackground(if (enabled) Color.white else Color.lightGray);
    }

    override public fun textValueChanged(event: TextEvent) {
        mediator.colleagueChanged();
    }
}