package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiExemplar {
    private JList txtLivros;
    private JButton btnExemplar;

    public GuiExemplar() {
        btnExemplar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
