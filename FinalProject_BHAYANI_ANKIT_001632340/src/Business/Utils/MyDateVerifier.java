package Business.Utils;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author kedarvdm
 */
public class MyDateVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        Pattern pattern = Pattern.compile("(0[1-9]|1[012])[\\/](0[1-9]|[12][0-9]|3[01])[\\/](19|20)\\d\\d");
        Matcher matcher = pattern.matcher(text);
        
        if (text.length() > 0) {
            //if (text.toLowerCase().startsWith(" ") || text.length() == 0) {     //|| text.matches(pattern) != true
            if(!matcher.find()){  
                input.setBackground(Color.YELLOW);
                JOptionPane.showMessageDialog(input, "Please enter valid Date in MM/DD/YYYY format", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.red);
            return false;
        }
    }
}
