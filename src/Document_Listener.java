import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Document_Listener {
public static void main(String[]args) {
	document_frame objframe = new document_frame();
}
}
 class document_frame extends JFrame{
	public document_frame() {
		setBounds(600, 200, 600, 400);
		document_panel objPanel = new document_panel();
		add(objPanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
 
 class document_panel extends JPanel{
		public document_panel() {
			textF = new JTextField(20);
			Document doc = textF.getDocument();
			doc.addDocumentListener(new DocumentEdit());
			this.add(textF);
			
	}
		JTextField textF;
		
		private class DocumentEdit implements DocumentListener{

			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("Text has been inserted");
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				System.out.println("Text has been removed");
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("Text has been updated");
			}
			
		}
 }
