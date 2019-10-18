package HanakoLover;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.lang.reflect.Field;
import java.util.Vector;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;

public class Stuff extends JFrame {
    private Object[][] String = new String[][]{};
    private Object[] Column = new String[]{"Имя", "Возраст", "Магазин"};
    private JButton addButton, deleteButton;
    private JTextField NameField, AgeField, ShopField;

    public Stuff() {
        super("Работники");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        DefaultTableModel model = new DefaultTableModel(String, Column);
        JTable Table = new JTable(model);

        addButton = new JButton("Добавить");
        deleteButton = new JButton("Удалить");

        JPanel Buttons = new JPanel();
        Buttons.add(addButton);
        Buttons.add(deleteButton);

        NameField = new JTextField(10);
        AgeField = new JTextField(10);
        ShopField = new JTextField(10);

        JPanel Enter = new JPanel();
        Enter.add(new JScrollPane(NameField));
        Enter.add(new JScrollPane(AgeField));
        Enter.add(new JScrollPane(ShopField));

        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(Table));
        contents.add(new JScrollPane(Buttons));
        contents.add(new JScrollPane(Enter));

        setContentPane(contents);
        setSize(500, 400);
        setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{NameField.getText(), AgeField.getText(), ShopField.getText()});
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model.getRowCount() > 0) {
                    for (int i = model.getRowCount() - 1; i >= 0; i--) {
                        model.removeRow(i);
                    }
                }
            }
        });
    }
}