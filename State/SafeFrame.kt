import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import kotlin.system.exitProcess;

public class SafeFrame(title: String): Frame(title), ActionListener, Context {
    private val textClock: TextField;
    private val textScreen: TextArea;
    private val buttonUse: Button;
    private val buttonAlarm: Button;
    private val buttonPhone: Button;
    private val buttonExit: Button;

    private var state: State;

    init {
        state = DayState.getInstance();

        background = Color.lightGray;
        layout = BorderLayout();

        textClock = TextField(60);
        add(textClock, BorderLayout.NORTH);

        textScreen = TextArea(10, 60);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEnabled(false);

        val panel = Panel();
        buttonUse = Button("金庫使用");
        panel.add(buttonUse);
        buttonAlarm = Button("非常ベル");
        panel.add(buttonAlarm);
        buttonPhone = Button("通常通話");
        panel.add(buttonPhone);
        buttonExit = Button("終了");
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    override public fun actionPerformed(event: ActionEvent) {
        println(event.toString());

        when (event.getSource()) {
            buttonUse -> state.doUse(this);
            buttonAlarm -> state.doAlarm(this);
            buttonPhone -> state.doPhone(this);
            buttonExit -> exitProcess(0);
            else -> println("?");
        }
    }

    override public fun setClock(hour: Int) {
        val clockstring = String.format("現在の時刻は %02d:00", hour);
        println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this, hour);
    }

    override public fun changeState(state: State) {
        println(String.format("%s から %s へ状態が変化しました", this.state, state));
        this.state = state;
    }

    override public fun callSecurityCenter(msg: String) {
        textScreen.append(String.format("call! %s\n", msg));
    }

    override public fun recordLog(msg: String) {
        textScreen.append(String.format("record ... %s\n", msg));
    }
}