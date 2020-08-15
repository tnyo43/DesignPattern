import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm: Frame, ActionListener, Mediator {
    private lateinit var checkGuest: ColleagueCheckbox;
    private lateinit var checkLogin: ColleagueCheckbox;
    private lateinit var textUser: ColleagueTextField;
    private lateinit var textPass: ColleagueTextField;
    private lateinit var buttonOk: ColleagueButton;
    private lateinit var buttonCancel: ColleagueButton;

    constructor(title: String) : super(title) {
        setBackground(Color.lightGray);
        setLayout(GridLayout(4, 2));
        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(Label("Username"));
        add(textUser);
        add(Label("Password"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        colleagueChanged();

        pack();
        setVisible(true);
    }

    override public fun createColleagues() {
        val g = CheckboxGroup();
        checkGuest = ColleagueCheckbox("Guest", g, true);
        checkLogin = ColleagueCheckbox("Login", g, false);

        textUser = ColleagueTextField("", 10);
        textPass = ColleagueTextField("", 10);
        textPass.setEchoChar('*');

        buttonOk = ColleagueButton("OK");
        buttonCancel = ColleagueButton("Cancel");

        // Mediatorのセット
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Listenerのセット
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    override public fun colleagueChanged() {
        if (checkGuest.getState()) { // is Guest
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else { // is Login User
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    private fun userpassChanged() {
        if (textUser.getText().length > 0) {
            textPass.setColleagueEnabled(true);
            buttonOk.setColleagueEnabled(isValidUserAndPass());
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }

    private fun isValidUserAndPass() = textUser.getText().length >= 4 && textPass.getText().length >= 4;

    override public fun actionPerformed(event: ActionEvent) {
        println(event.toString());
    }
}
