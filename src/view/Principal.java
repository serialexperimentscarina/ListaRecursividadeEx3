package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fatCont = new FatorialController();
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um número até 12: ", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando");
					System.exit(0);
				}
				int num = Integer.parseInt(input);
				if (num <= 12) {
					JOptionPane.showMessageDialog(null, "Fatorial de " + num + " = " + fatCont.fatorial(num));
				} else {
					JOptionPane.showMessageDialog(null, "Numéro ultrapassa o limite de entrada (12)");
					continue;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Número inválido");
				continue;
			}
			break;
		} while(true);
	}

}
