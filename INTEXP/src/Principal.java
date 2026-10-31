
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import java.util.Arrays;

public class Principal {

    private static void mostrar_arbol_analisis(Anasint anasint,ParseTree arbol){
        JFrame frame = new JFrame("Antlr ParseTree (Lexchange)");
        TreeViewer v = new TreeViewer(Arrays.asList(anasint.getRuleNames()),arbol);
        JScrollPane panel = new JScrollPane(v);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1000,300);
        frame.setVisible(true);

    }
    public static void main(String[] args) throws Exception{
        CharStream f = CharStreams.fromFileName(args[0]);
        Analex analex = new Analex(f);
        CommonTokenStream ts = new CommonTokenStream(analex);
        Anasint anasint = new Anasint(ts);
        ParseTree arbol = anasint.programa();

        mostrar_arbol_analisis(anasint,arbol);  //mostrar �rbol de derivaci�n

    }
}