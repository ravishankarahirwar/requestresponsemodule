package library.ravishankar.requestresponsemodule.factory;

/**
 * @author Chandni Patel
 * @since 11/30/2016.
 */


import java.util.Map;

public interface Connector {
     void setPostParams(Map<String, String> postParams);
     void setHeaderParams(Map<String, String> postParams);
     void connect();
     void parseJson(String response);

}
