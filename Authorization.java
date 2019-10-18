package HanakoLover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Authorization extends JFrame {
    private JLabel LoginLabel, PassLabel, ErrorLabel;
    private JTextField LoginField, PassField;
    private JButton EnterButton;

    public Authorization() {
        JPanel Panel = new JPanel();

        LoginLabel = new JLabel("Логин");
        LoginField = new JTextField(10);
        PassLabel = new JLabel("Пароль");
        PassField = new JTextField(10);
        ErrorLabel = new JLabel("Неверный логин или пароль");
        EnterButton = new JButton("Войти");

        Panel.add(LoginLabel);
        Panel.add(LoginField);
        Panel.add(PassLabel);
        Panel.add(PassField);
        Panel.add(EnterButton);

        Panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        Panel.setSize(200, 200);
        Panel.setVisible(true);

        setBounds(200, 200, 200, 130);
        setTitle("Ввод");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        EnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (LoginField.getText().equals("Admin") && PassField.getText().equals("pass")) {
                    Window window = new Window() {
                    };
                } else {
                    JOptionPane.showMessageDialog(null, ErrorLabel, "Результат", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        add(Panel);
        setVisible(true);

    }
}