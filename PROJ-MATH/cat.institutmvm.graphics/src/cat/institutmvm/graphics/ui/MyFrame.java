package cat.institutmvm.graphics.ui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        //<editor-fold desc="Centrar frame">
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth/2, screenHeight);
        setLocation(screenWidth/4, screenHeight/4);
        //</editor-fold>

        String[] optionsToChoose = new String[]{"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

        this.setTitle("CatSharks.org");
        Image myIcon = screen.getImage("src/cat/mvm/graphics/icon.gif");
        setIconImage(myIcon);

        //Creem els botons
        JPanel buttons = new JPanel();
        JButton hello = new JButton("Digues Hola");
        JButton bye = new JButton("Digues Adeu");
        JComboBox<String> JComboBox1 = new JComboBox<>(optionsToChoose);
        Cursor cu = new Cursor(Cursor.HAND_CURSOR);
        JComboBox1.setCursor(cu);
        buttons.add(hello);
        buttons.add(bye);
        buttons.add(JComboBox1);
        hello.setCursor(cu);
        bye.setCursor(cu);

        //Creem el camp de text
        JTextField txtOut = new JTextField("Pulsa un botó");
        JFrame frm = new JFrame();

        //Afegim els listeners als components
        hello.addActionListener(
                ev -> txtOut.setText(" Hola!"));

        bye.addActionListener(
                ev -> txtOut.setText(" Adeu!"));

        JComboBox1.addActionListener(e -> {String selectedFruit = "Has seleccionado " +
                JComboBox1.getItemAt(JComboBox1.getSelectedIndex());
            //             item de array     indice de array
            txtOut.setText(selectedFruit + JComboBox1.getSelectedIndex());});

        JSplitPane mainPanel =
                new JSplitPane(JSplitPane.VERTICAL_SPLIT,buttons,txtOut);
        getContentPane().add(mainPanel);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

