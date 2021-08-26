package ua.univer.lesson15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ProgramGui {
    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(400, 300);
        JPanel panel = new JPanel();
        JButton btn = new JButton("ok");
        JTextField text1 = new JTextField("                ");
        btn.addActionListener(
                e -> {
                    Thread th = new Thread(
                            () -> {
                                while(!Thread.interrupted())
                                for (int i = 0; i < 100; i++) {
                                    text1.setText(i + " ");
                                    try {
                                        Thread.sleep(50);
                                    } catch (InterruptedException interruptedException) {
                                        interruptedException.printStackTrace();
                                    }
                                }
                            });
                    th.start();
                    th.interrupt();
                });

        JTextField text2 = new JTextField("                ");
        JTextField text3 = new JTextField("                ");
        JButton btn1 = new JButton("sum");
        btn1.addActionListener(e -> text3.setText(text1.getText() + text2.getText()));

//        btn.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                btn.setText("click");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                btn.setText("Press");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                btn.setText("Release");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                btn.setText("Enter");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                btn.setText("Exit");
//            }
//        });
        panel.add(btn);
        panel.add(btn1);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        win.setContentPane(panel);
        win.setVisible(true);
    }
}
