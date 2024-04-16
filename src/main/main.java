package main;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import UserInterface.GUIVerwaltung;
import helper.AusgabeKonsole;

public class main {

	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUIVerwaltung(new AusgabeKonsole());
            }
        });
    }

}
