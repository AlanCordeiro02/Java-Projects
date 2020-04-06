package json;
  
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.jar.JarException;
import org.json.simple.JSONObject;
import arquivo.ArquivoJson;
  
public class CriarJson {
    
    private static String getHash() {
    	String value = "simplicity is prerequisite for reliability. edsger w. dijkstra";

		String sha1 = "";
		
		// With the java libraries
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(value.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e){
			e.printStackTrace();
		}
	
		return sha1;
	}


	public static void CriacaoJson() throws JarException {
		ArquivoJson arquivo = new ArquivoJson();
	    arquivo.setNumeroDeCasas(4);
	    arquivo.setToken("6d43971217aeaad9bb05187421849d472088782a");
	    arquivo.setCifrado("wmqtpmgmxc mw tviviuymwmxi jsv vipmefmpmxc. ihwkiv a. hmnowxve");
	    arquivo.setDecifrado("simplicity is prerequisite for reliability. edsger w. dijkstra");
	    String sha1 = getHash();
		arquivo.setResumoCripto( sha1 );
	  
	
	    JSONObject arquivoJson = new JSONObject();
	  
	    arquivoJson.put("ArquivoJSON", arquivo);
	
	    System.out.println(arquivoJson);
	}
	
		
}

	    