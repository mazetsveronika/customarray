package by.mazets.array.reader.impl;
import by.mazets.array.reader.CustomArrayReader;
import by.mazets.array.validator.CustomArrayValidator;
import by.mazets.array.validator.impl.CustomArrayValidatorImpl;
import by.mazets.array.exception.CustomArrayException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.lang.String;

public class CustomArrayReaderImpl implements CustomArrayReader {
    static final Logger logger=LogManager.getLogger();
    private static final String REGEX_DELIMITER = "^\\s+";

public String readFile(String pathToFile) throws CustomArrayException {
        File file=new File(pathToFile);
        if (file.exists()&& file.length()==0) {
            return "";
        }

        try (BufferedReader bufferedReader=new BufferedReader(new FileReader(file))){
            CustomArrayValidator validator= CustomArrayValidatorImpl.getInstance();
            String str;//change

        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new CustomArrayException(e);
        }
        logger.error("No valid array found in"+ pathToFile);
        throw new CustomArrayException("No valid array found in"+ pathToFile);
    }
}
//дописать