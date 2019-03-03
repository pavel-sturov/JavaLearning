package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    private JTextField output = new JTextField();
    private JTextField message = new JTextField();
    private JTextField tryField = new JTextField();
    private JButton key[] = new JButton[33];
    private JButton ok = new JButton("Ok");
    private String star = "**";
    private String space = "     ";
    private int countOfTry = 5;
    private String tryes= "Количество попыток: ";
    private boolean getWord = false;
    private ArrayList word = new ArrayList();
    private ArrayList stars = new ArrayList();
    private boolean end = false;
    private JButton begin = new JButton("Начать заново");
    private Image img1;

    public MyFrame(){
        setTitle("Виселица");
        setSize(830, 300);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);


        output.setBounds(330, 20, 330, 60);
        add(output);
        output.setEditable(false);
        output.setHorizontalAlignment(JTextField.CENTER);
        output.setText("Введите слово тут!");

        message.setBounds(270, 240, 330, 35);
        add(message);
        message.setEditable(false);
        message.setHorizontalAlignment(JTextField.CENTER);
        message.setText("Начнем? Загадайте слово!");

        tryField.setBounds(620, 240, 190, 35);
        add(tryField);
        tryField.setEditable(false);
        tryField.setHorizontalAlignment(JTextField.CENTER);
        tryField.setText(tryes);

        key[0] = new JButton("Й");
        key[0].setBounds(230, 100, 30, 30);
        add(key[0]);
        key[1] = new JButton("Ф");
        key[1].setBounds(230, 150, 30, 30);
        add(key[1]);
        key[2] = new JButton("Я");
        key[2].setBounds(230, 200, 30, 30);
        add(key[2]);
        key[3] = new JButton("Ц");
        key[3].setBounds(280, 100, 30, 30);
        add(key[3]);
        key[4] = new JButton("Ы");
        key[4].setBounds(280, 150, 30, 30);
        add(key[4]);
        key[5] = new JButton("Ч");
        key[5].setBounds(280, 200, 30, 30);
        add(key[5]);
        key[6] = new JButton("У");
        key[6].setBounds(330, 100, 30, 30);
        add(key[6]);
        key[7] = new JButton("В");
        key[7].setBounds(330, 150, 30, 30);
        add(key[7]);
        key[8] = new JButton("С");
        key[8].setBounds(330, 200, 30, 30);
        add(key[8]);
        key[9] = new JButton("К");
        key[9].setBounds(380, 100, 30, 30);
        add(key[9]);
        key[10] = new JButton("А");
        key[10].setBounds(380, 150, 30, 30);
        add(key[10]);
        key[11] = new JButton("М");
        key[11].setBounds(380, 200, 30, 30);
        add(key[11]);
        key[12] = new JButton("Е");
        key[12].setBounds(430, 100, 30, 30);
        add(key[12]);
        key[13] = new JButton("П");
        key[13].setBounds(430, 150, 30, 30);
        add(key[13]);
        key[14] = new JButton("И");
        key[14].setBounds(430, 200, 30, 30);
        add(key[14]);
        key[15] = new JButton("Н");
        key[15].setBounds(480, 100, 30, 30);
        add(key[15]);
        key[16] = new JButton("Р");
        key[16].setBounds(480, 150, 30, 30);
        add(key[16]);
        key[17] = new JButton("Т");
        key[17].setBounds(480, 200, 30, 30);
        add(key[17]);
        key[18] = new JButton("Г");
        key[18].setBounds(530, 100, 30, 30);
        add(key[18]);
        key[19] = new JButton("О");
        key[19].setBounds(530, 150, 30, 30);
        add(key[19]);
        key[20] = new JButton("Ь");
        key[20].setBounds(530, 200, 30, 30);
        add(key[20]);
        key[21] = new JButton("Ш");
        key[21].setBounds(580, 100, 30, 30);
        add(key[21]);
        key[22] = new JButton("Л");
        key[22].setBounds(580, 150, 30, 30);
        add(key[22]);
        key[23] = new JButton("Б");
        key[23].setBounds(580, 200, 30, 30);
        add(key[23]);
        key[24] = new JButton("Щ");
        key[24].setBounds(630, 100, 30, 30);
        add(key[24]);
        key[25] = new JButton("Д");
        key[25].setBounds(630, 150, 30, 30);
        add(key[25]);
        key[26] = new JButton("Ю");
        key[26].setBounds(630, 200, 30, 30);
        add(key[26]);
        key[27] = new JButton("З");
        key[27].setBounds(680, 100, 30, 30);
        add(key[27]);
        key[28] = new JButton("Ж");
        key[28].setBounds(680, 150, 30, 30);
        add(key[28]);
        key[29] = new JButton("Х");
        key[29].setBounds(680, 200, 30, 30);
        add(key[29]);
        key[30] = new JButton("Ъ");
        key[30].setBounds(730, 100, 30, 30);
        add(key[30]);
        key[31] = new JButton("Э");
        key[31].setBounds(730, 150, 30, 30);
        add(key[31]);
        key[32] = new JButton("Ё");
        key[32].setBounds(730, 200, 30, 30);
        add(key[32]);
        ok.setBounds(690, 30, 40, 40);
        add(ok);
        begin.setBounds(690, 30, 120, 40);
        begin.setVisible(false);
        add(begin);
        setVisible(true);

        ActionListener okClick = (ActionEvent e) ->{
            String temp = output.getText().replace(space, "");
            for (int i = 0; i < temp.length(); i++){
                stars.add(star + space);
            }
            output.setText(stars.toString().replace("[", "").replace("]", "").replace(",", ""));
            System.out.println(word);
            System.out.println(stars);
            message.setText("Теперь отгадайте слово!");
            getWord = true;
            ok.setVisible(false);
            tryField.setText(tryes + countOfTry);
        };
        ok.addActionListener(okClick);
        ActionListener beginClick = (ActionEvent e) ->{
            message.setText("Загадайте еще слово!");
            for (JButton b : key){
                b.setVisible(true);
            }
            output.setText("Введите слово тут!");
            getWord = false;
            ok.setVisible(true);
            begin.setVisible(false);
            countOfTry = 5;
            word.clear();
            stars.clear();
            end = false;
            tryField.setText("Количество попыток: ");
        };
        begin.addActionListener(beginClick);
        ActionListener keyClick = (ActionEvent e) -> {
            JButton b = (JButton)e.getSource();
            String userInput = b.getText();
            if (!getWord) {
                if (output.getText().equals("Введите слово тут!")) {
                    output.setText(userInput + space);
                    word.add(userInput);
                }
                else {
                    output.setText(output.getText()  + userInput + space);
                    word.add(userInput);
                }
            }
            if (getWord && countOfTry > 0){
                if (word.contains(userInput)){
                    for (int i = 0; i < word.size(); i++){
                            if (word.contains(userInput)){
                                int ind = word.indexOf(userInput);
                                word.remove(ind);
                                word.add(ind, "");
                                stars.remove(ind);
                                stars.add(ind, userInput + space);
                        }
                    }
                    b.setVisible(false);
                    System.out.println(stars);
                    System.out.println(word);
                    output.setText(stars.toString().replace("[", "").replace("]", "").replace(",", ""));
                    tryField.setText(tryes + countOfTry);
                }
                else if (!end){
                    countOfTry --;
                    tryField.setText(tryes + countOfTry);
                }
            }
            if (getWord && countOfTry < 1 && !end){
                message.setText("Увы, слово оказалось слишком непростым!");
                end = true;
                begin.setVisible(true);
            }
            if (getWord && !stars.contains(star + space) && !end){
                message.setText("Вы настощий знаток!");
                end = true;
                begin.setVisible(true);
            }
        };
        for (JButton b : key){
            b.addActionListener(keyClick);
        }
    }


}
