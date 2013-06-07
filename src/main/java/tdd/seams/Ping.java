package tdd.seams;

import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class Ping {

    public boolean ping(String url) {
        
        try{
            
            InputStream response = new URL(url).openStream();
            String responseText = IOUtils.toString(response);
            System.err.println(responseText);
            return responseText.contains("Status: OK");
            
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
}
