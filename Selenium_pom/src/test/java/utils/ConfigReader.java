package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties properties = new Properties();
    // dung co che static block: chay 1 lan duy nhast khi class duoc goi lan dau
    static {
    // lay file trong resouces
    // => getResourceAsStream(): phai them dkien try() {
        try(InputStream in = ConfigReader.class.getResourceAsStream("/congig.properties")) {
        properties.load(in);

        } catch (Exception e) {
            throw new RuntimeException(" khong doc duoc file config.properties", e);
        }
    }
   public static String get(String key) {
        return properties.getProperty(key);
   }
}
