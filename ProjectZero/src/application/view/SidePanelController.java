package application.view;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Diese Methode legt die SidePanels fest
 * 
 * @author Dorsch, Paul, Deutsch, Penner, Kramer
 */
public class SidePanelController {
	@FXML
	private JFXButton spielebibliothekB;
	@FXML
	private JFXButton terminplanerB;
	@FXML
	private JFXButton gruppenB;
	@FXML
	private JFXButton chatr�umeB;
	@FXML
	private JFXButton notizenB;
	@FXML
	private JFXButton logoutB;
	@FXML
	private JFXButton closeB;

	/**
	 * Diese Methode ver�ndert die AnchorPanes je nach Event
	 * 
	 * @param event
	 */
	@FXML
	private void changeAction(ActionEvent event) {
		JFXButton btn = (JFXButton) event.getSource();
		switch (btn.getText()) {
		case "Spielebibliothek":
			MainLayoutController.rootTerminplanerAnchor.setVisible(false);
			MainLayoutController.rootChatr�umeAnchor.setVisible(false);
			MainLayoutController.rootGruppenAnchor.setVisible(false);
			MainLayoutController.rootNotizenAnchor.setVisible(false);
			MainLayoutController.rootSpielebibliothekAnchor.setVisible(true);
			;
			break;
		case "Terminplaner":
			MainLayoutController.rootTerminplanerAnchor.setVisible(true);
			MainLayoutController.rootChatr�umeAnchor.setVisible(false);
			MainLayoutController.rootGruppenAnchor.setVisible(false);
			MainLayoutController.rootNotizenAnchor.setVisible(false);
			MainLayoutController.rootSpielebibliothekAnchor.setVisible(false);
			;
			break;
		case "Gruppen":
			MainLayoutController.rootTerminplanerAnchor.setVisible(false);
			MainLayoutController.rootChatr�umeAnchor.setVisible(false);
			MainLayoutController.rootGruppenAnchor.setVisible(true);
			MainLayoutController.rootNotizenAnchor.setVisible(false);
			MainLayoutController.rootSpielebibliothekAnchor.setVisible(false);
			;
			break;
		case "Chatr�ume":
			MainLayoutController.rootTerminplanerAnchor.setVisible(false);
			MainLayoutController.rootChatr�umeAnchor.setVisible(true);
			MainLayoutController.rootGruppenAnchor.setVisible(false);
			MainLayoutController.rootNotizenAnchor.setVisible(false);
			MainLayoutController.rootSpielebibliothekAnchor.setVisible(false);
			;
			break;
		case "Notizen":
			MainLayoutController.rootTerminplanerAnchor.setVisible(false);
			MainLayoutController.rootChatr�umeAnchor.setVisible(false);
			MainLayoutController.rootGruppenAnchor.setVisible(false);
			MainLayoutController.rootNotizenAnchor.setVisible(true);
			MainLayoutController.rootSpielebibliothekAnchor.setVisible(false);
			;
			break;
		case "Abmelden":
			System.exit(0);
			;
			break;
		case "Beenden":
			System.exit(0);
			;
			break;
		}
	}

}
