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
public class MyAlphanumericVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");
        Matcher matcher = pattern.matcher(text);
        
        if (text.length() > 0) {
            //if (text.toLowerCase().startsWith(" ") || text.length() == 0) {     //|| text.matches(pattern) != true
            if(!matcher.find()){  
                input.setBackground(Color.YELLOW);
                JOptionPane.showMessageDialog(input, "Special Characters are allowed in this field", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
        }
        else
        {
            input.setBackground(Color.YELLOW);
            return false;
        }
    }
}
