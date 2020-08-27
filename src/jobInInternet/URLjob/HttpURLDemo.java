package jobInInternet.URLjob;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL u = new URL("http://www.google.com");
        HttpURLConnection httpURL = (HttpURLConnection) u.openConnection();
        System.out.println("method request: "+ httpURL.getRequestMethod());
        System.out.println("Cod answer: "+ httpURL.getResponseCode());
        System.out.println("SMS : "+ httpURL.getResponseMessage());
        // получить список полей и множе ство ключей из заголовкa
        Map<String, List<String>> hdrMap = httpURL.getHeaderFields();
        Set<String> hrdField = hdrMap.keySet();
        for (String k : hrdField) {
            System.out.println("Kay :"+ k+ " Value :"+hdrMap.get(k));
        }
    }
}
