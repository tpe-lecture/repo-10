package tpe.testate.crypter;

/**
 * Klasse, die eine eingegebene Zeichenkette mithilfe eines 
 * Codebaumes ver-/entschlüsselt.
 * 
 * @author 1615141
 */
public class CrypterImpl implements Crypter {


	/**
	 * Eingegebener Text wird verschlüsselt.
	 * 
	 * @param input Text der verschlüsselt werden soll.
	 * @return verschlüsselter Text.
	 */
	@Override
	public String encrypt(String input) {
		String cryptedText = "";
		char[] array = (input.toLowerCase()).toCharArray();
		for (int i = 0; i < array.length; i++) {
			if ((array[i] >= '0' && array[i] <= '9') || 
			    (array[i] >= 'a' && array[i] <= 'z') || 
			     array[i] == ' ') {
				switch(array[i]){
				case 'e': { cryptedText=cryptedText+'3'; break;}
				case '3': { cryptedText=cryptedText+'3'; break;}
				case 'l': { cryptedText=cryptedText+'l'; break;}
				case '1': { cryptedText=cryptedText+'1'; break;}
				case 'o': { cryptedText=cryptedText+'0'; break;}
				case '0': { cryptedText=cryptedText+'o'; break;}
				case 'a': { cryptedText=cryptedText+'4'; break;}
				case '4': { cryptedText=cryptedText+'a'; break;}
				case 't': { cryptedText=cryptedText+'7'; break;}
				case '7': { cryptedText=cryptedText+'t'; break;}
				default :  { cryptedText= cryptedText+array[i]; break;}
				}
			}
		}
		return cryptedText;
	}
	
	/**
	 * Eingegebener Text wird verschlüsselt.
	 * 
	 * @param input Text der entschlüsselt werden soll.
	 * @return entschlüsselter Text.
	 * @throws IllegalArgumentException wird geworfen, wenn die Eingabe
     *         ungültige Zeichen (Großbuchstaben) enthält.
	 */
	@Override
	 public String decrypt(String input) throws IllegalArgumentException {
		    for (int i = 0; i < input.length(); i++) {
		      if (Character.isUpperCase(input.charAt(i))) {
		        throw new IllegalArgumentException();
		      }
		      if (!((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') 
		          || input.charAt(i) >= '0' && input.charAt(i) <= '9' 
		          || input.charAt(i) == ' ')) {
		        throw new IllegalArgumentException();
		      }
		    }
		    return encrypt(input);
		}
		
}