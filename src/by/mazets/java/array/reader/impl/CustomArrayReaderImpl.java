package by.mazets.java.array.reader.impl;
import by.mazets.java.array.exception.CustomArrayException;
import by.mazets.java.array.reader.CustomArrayReader;
import by.mazets.java.array.validator.CustomArrayValidator;
import by.mazets.java.array.validator.impl.CustomArrayValidatorImpl;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.lang.String;


public class CustomArrayReaderImpl implements CustomArrayReader {

    static final Logger logger = LogManager.getLogger();

    @Override
    public String readArrayStrFromFile(String filePath) throws CustomArrayException {

        File file = new File(filePath);
        if (file.exists() && file.length() == 0) {
            return "";
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            CustomArrayValidator validator = CustomArrayValidatorImpl.getInstance();

            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if (validator.validateToArray(str)) {
                    return str;
                }
            }

        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new CustomArrayException(e);
        }

        logger.error("No valid array found in " + filePath);
        throw new CustomArrayException("No valid array found in " + filePath);
    }
}
