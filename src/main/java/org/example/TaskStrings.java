package org.example;

import java.util.regex.Pattern;

public class TaskStrings extends Task{

    public static final String PHONE_NUMBER = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$";
    public static final String EMAIL_ADDRESS = "[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+";
    public static final String IP_ADDRESS = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}";

    public TaskStrings()
    {
        _title = "Strings";
    }

    public boolean CheckRegular(String regex, String str) {
        return Pattern.compile(regex).matcher(str).matches();
    }

    public  void CompareStrings(String first_string, String second_string) throws ValidationException {
        if (first_string.equals(second_string)) {
            Printer.PrintMessage("Strings are equals ");
        } else throw new ValidationException("strings not equal");
    }

    public  void PalindromeCheck(String first_string, String second_string) throws ValidationException{
        if (first_string.equals(new StringBuilder(second_string).reverse().toString())) {
            Printer.PrintMessage("String is Palindrome");
        } else throw new ValidationException("no palindrome");
    }

    public  void ModifiedStrings(String first_string, String second_string) throws ValidationException{
        String first_modified_string = first_string.toUpperCase().trim().replaceAll("\\s+"," ");
        String second_modified_string = second_string.toUpperCase().trim().replaceAll("\\s+"," ");
        if (first_modified_string.equals(second_modified_string)) {
            Printer.PrintMessage("Strings are equals in same case without first and double space");
        } else throw new ValidationException("strings not equal in same case without first and double space");
    }

    public  void SpecificityCheck(String regex, String string, String type) throws ValidationException{
        if (CheckRegular(regex, string))
            Printer.PrintMessage(string + " " + type);
        else throw new ValidationException(string + " not " + type);
    }

    public  void CheckEmail(String string) throws ValidationException{
            SpecificityCheck(EMAIL_ADDRESS, string, "email address");
    }

    public  void CheckNumber(String string) throws ValidationException{
            SpecificityCheck(PHONE_NUMBER, string, "phone number");
    }

     public  void CheckIP(String string) throws ValidationException{
             SpecificityCheck(IP_ADDRESS, string, "IP_ADDRESS");
     }

        @Override
        public void execute() {

            Printer.PrintMessage("Enter first string ");
            String first_string = Reader.getString();
            Printer.PrintMessage("Enter second string ");
            String second_string = Reader.getString();

            try{
                CompareStrings(first_string,second_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                ModifiedStrings(first_string,second_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                PalindromeCheck(first_string,second_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                CheckEmail(first_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                CheckEmail(second_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                CheckNumber(first_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                CheckNumber(second_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                CheckIP(first_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

            try{
                CheckIP(second_string);
            }
            catch (ValidationException e){
                Printer.PrintMessage(e.getMessage());
            }

        }
}

