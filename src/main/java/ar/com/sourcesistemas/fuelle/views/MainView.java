package ar.com.sourcesistemas.fuelle.views;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ar.com.sourcesistemas.fuelle.configuracion.SpringContext;
import ar.com.sourcesistemas.fuelle.listeners.SimpleSoundCreator;
import ar.com.sourcesistemas.fuelle.sonidos.SoundController;

public class MainView extends JFrame {

	private List<Button> buttons = new LinkedList<Button>();

	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	
	// botones 38 y 33
	public MainView() {

		setLayout(new GridLayout(0, 2));

		for (int i = 0; i < 33; i++) {

			Button button = new Button(String.valueOf(i));
			buttons.add(button);
			leftPanel.add(button);

		}

		for (int i = 34; i < 72; i++) {

			Button button = new Button(String.valueOf(i));
			buttons.add(button);
			rightPanel.add(button);
		}
		
		SimpleSoundCreator ssc = new SimpleSoundCreator();
		for (Button button : buttons) {
			button.addActionListener(ssc);
			
		}
		
		
		
		
		
		
		add(leftPanel);
		add(rightPanel);
		setVisible(true);
		setSize(600, 200);
		setLocation(new Point(400, 400));

	}

}
