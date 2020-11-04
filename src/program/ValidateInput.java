package program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {

    public boolean isValidate(String regex,String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
