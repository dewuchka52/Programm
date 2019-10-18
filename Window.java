package HanakoLover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Window extends JFrame {
    private JLabel Workers, Stuff, Shop;
    private JButton GetButton1, GetButton2, GetButton3;

    public Window(){
        JPanel Panel = new JPanel();

        Workers = new JLabel("Работники");
        Stuff = new JLabel("Товары");
        Shop = new JLabel("Магазин");

        GetButton1 = new JButton("Получить");
        GetButton2 = new JButton("Получить");
        GetButton3 = new JButton("Получить");

        Panel.add(Workers);
        Panel.add(GetButton1);
        Panel.add(Stuff);
        Panel.add(GetButton2);
        Panel.add(Shop);
        Panel.add(GetButton3);

        Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        Panel.setSize(50,500);
        Panel.setVisible(true);

        setBounds(200,200,200,200);
        setTitle("Получение информации о");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(Panel);
        setVisible(true);
        GetButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { Workers workers = new Workers(){}; }
        });
        GetButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { Shop shop = new Shop(){}; }
        });
        GetButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { Stuff stuff = new Stuff(){}; }
        });
    }
}