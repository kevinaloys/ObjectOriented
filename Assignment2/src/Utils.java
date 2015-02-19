import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.net.URL;


public class Utils {

		public static Font createFont(String path)
		{
			URL url = System.class.getResource(path);
			
			if (url == null)
			{
				System.out.println("Unable to load font " + path);
			}
			
			Font font = null;
			try {
				font = Font.createFont(Font.TRUETYPE_FONT, url.openStream());
			} catch (FontFormatException e) {
				System.out.println("Bad format in font file");
			} catch (IOException e) {
				System.out.println("Unable to read font file");
			}
			
			return font;
		}
}