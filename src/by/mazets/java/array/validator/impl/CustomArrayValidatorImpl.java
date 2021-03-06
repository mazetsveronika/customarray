package by.mazets.java.array.validator.impl;
import by.mazets.java.array.validator.CustomArrayValidator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public  class CustomArrayValidatorImpl implements CustomArrayValidator {
    public static final String REGEX_OF_ARRAY = "^\\s*(([+-]?\\d+\\s+)*([+-]?\\d+)?)\\s*$";
    public static CustomArrayValidatorImpl instance = null;
    private CustomArrayValidatorImpl() {
    };
    public static CustomArrayValidatorImpl getInstance() {
        if (instance == null) {
            instance = new CustomArrayValidatorImpl();
        }
        return instance;
    }

    @Override
        public boolean validateToArray(String arrayValidate) {
            Pattern pattern = Pattern.compile(REGEX_OF_ARRAY);
            Matcher matcher = pattern.matcher(arrayValidate);
            return matcher.matches();
        }
    }

