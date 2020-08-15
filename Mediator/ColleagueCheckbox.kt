import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox(caption: String, group: CheckboxGroup, state: Boolean)
                : Checkbox(caption, group, state), ItemListener, Colleague {

    private lateinit var mediator: Mediator;

    override public fun setMediator(mediator: Mediator) {
        this.mediator = mediator;
    }

    override public fun setColleagueEnabled(enabled: Boolean) {
        setEnabled(enabled);
    }

    override public fun itemStateChanged(event: ItemEvent) {
        mediator.colleagueChanged();
    }
}