package ar.com.sourcesistemas.fuelle.listeners;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ar.com.sourcesistemas.fuelle.configuracion.SpringContext;
import ar.com.sourcesistemas.fuelle.sonidos.SoundController;

public class SimpleSoundCreator  implements ActionListener{

	

	private SoundController soundController = (SoundController) SpringContext.getContext()
			.getBean("soundController");
	

	public void actionPerformed(ActionEvent arg0) {
			
		
		Button button =(Button)arg0.getSource();
		soundController.play(button.getLabel());
		
		
	}
	
	
}
