package ObjectOrientedProgramming.ObjectClassMethods.Wait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIExample {
    private JFrame frame;
    private JLabel label;
    private JButton startButton;
    private JButton resetButton;

    private boolean isDataReady = false;

    public GUIExample() {
        // Ініціалізація графічного інтерфейсу
        frame = new JFrame("GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        label = new JLabel("Data processing is not ready");
        label.setHorizontalAlignment(JLabel.CENTER);

        startButton = new JButton("Start Data Processing");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startDataProcessing();
            }
        });

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetData();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(startButton);
        buttonPanel.add(resetButton);

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public synchronized void startDataProcessing() {
        // Перевірка, чи дані вже готові
        if (isDataReady) {
            processData();
        } else {
            // Встановлення прапорця, що дані будуть готові
            isDataReady = true;

            // Очікування, доки дані не стануть готовими
            while (!isDataReady) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Обробка даних після очікування
            processData();
        }
    }

    public synchronized void processData() {
        label.setText("Data processing started");

        // Симуляція обробки даних
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        label.setText("Data processing completed");
    }

    public synchronized void resetData() {
        isDataReady = false;
        label.setText("Data processing is not ready");
    }

    public synchronized void setDataReady() {
        isDataReady = true;
        notify();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIExample();
            }
        });
    }
}

