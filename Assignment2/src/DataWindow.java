import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * 
 * @author Kevin Aloysius
 *
 */

public class DataWindow extends JPanel {
	public DataWindow()
	{
		Border inner;
		Font myUbuntuFont;
		myUbuntuFont = Utils.createFont("/fonts/Ubuntu-L.ttf").deriveFont(Font.BOLD, 20);
		inner = BorderFactory.createTitledBorder(null,"Set Temperature", 0, 0, myUbuntuFont, new Color(185,188,209));
		Border outer = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(outer, inner));
	}
}