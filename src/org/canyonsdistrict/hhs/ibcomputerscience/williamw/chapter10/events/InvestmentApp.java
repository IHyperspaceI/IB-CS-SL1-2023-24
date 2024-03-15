package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.events;

import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces.BankAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class InvestmentApp {
    private static final double INTEREST_RATE = 6;
    private static final double INITIAL_BALANCE = 1;
    public static void main(String[] args) {
        var frame = new JFrame();
        var button = new JButton("BEEZ NUTS");
        frame.add(button);
        frame.setSize(200, 200);


        var account = new BankAccount(INITIAL_BALANCE);

        class AddInterestListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                double interest = account.getBalance() * INTEREST_RATE / 100;
                account.deposit(interest);
                System.out.printf("Balance: %.2f\n", account.getBalance());

                button.setText(String.format("Balance: %.2f\n", account.getBalance()));

                Random random = new Random();

                frame.setSize(frame.getWidth() + random.nextInt(-50, 50), frame.getHeight() + random.nextInt(-50, 50));
            }
        }

        button.addActionListener(new AddInterestListener());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
