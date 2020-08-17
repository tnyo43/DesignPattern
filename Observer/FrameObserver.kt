import java.awt.Frame;
import java.awt.TextField;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import kotlin.system.exitProcess

public class FrameObserver(): Frame("Frame Observer"), Observer, ActionListener {
    private val textGraph: GraphText;
    private val canvasGraph: Graphcanvas;
    private val buttonClose: Button;

    init {
        setLayout(BorderLayout());
        setBackground(Color.lightGray);

        textGraph = GraphText(60);
        textGraph.setEditable(false);

        canvasGraph = Graphcanvas();
        canvasGraph.setSize(500, 500);

        buttonClose = Button("Close");
        buttonClose.addActionListener(this);

        add(textGraph, BorderLayout.NORTH);
        add(canvasGraph, BorderLayout.CENTER);
        add(buttonClose, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    override public fun actionPerformed(e: ActionEvent) {
        println(e.toString());
        exitProcess(0);
    }

    override public fun update(generator: NumberGenerator) {
        textGraph.update(generator);
        canvasGraph.update(generator);
    }
}

class GraphText(columns: Int): TextField(columns), Observer {
    override public fun update(generator: NumberGenerator) {
        val number = generator.getNumber();
        val text =  String.format(
            "%d : %s",
            number,
            (1..number).map { _ -> '*' }.joinToString("") { Character.toString(it) }
        )
        setText(text);
    }
}

class Graphcanvas(): Canvas(), Observer {
    private var number: Int = 0;

    override public fun update(generator: NumberGenerator) {
        number = generator.getNumber();
        repaint();
    }

    override public fun paint(g: Graphics) {
        val width = getWidth();
        val height = getHeight();
        g.setColor(Color.white);
        g.fillArc(0, 0, width, height, 0, 360);
        g.setColor(Color.red);
        g.fillArc(0, 0, width, height, 90, - number * 360 / 50);
    }
}