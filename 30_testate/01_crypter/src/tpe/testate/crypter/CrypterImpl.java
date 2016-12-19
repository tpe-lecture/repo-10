package tpe.testate.crypter;

/**
 * Klasse, die eine eingegebene Zeichenkette mithilfe eines
 * Codebaumes ver-/entschl�sselt.
 *
 * @author 1615141
 */
public class CrypterImpl implements Crypter {


	/**
	 * Eingegebener Text wird verschl�sselt.
	 *
	 * @param input Text der verschl�sselt werden soll.
	 * @return verschl�sselter Text.
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
				case 'e':  cryptedText=cryptedText+'3'; break;
				case '3':  cryptedText=cryptedText+'e'; break;
				case 'l':  cryptedText=cryptedText+'1'; break;
				case '1':  cryptedText=cryptedText+'l'; break;
				case 'o':  cryptedText=cryptedText+'0'; break;
				case '0':  cryptedText=cryptedText+'o'; break;
				case 'a':  cryptedText=cryptedText+'4'; break;
				case '4':  cryptedText=cryptedText+'a'; break;
				case 't':  cryptedText=cryptedText+'7'; break;
				case '7':  cryptedText=cryptedText+'t'; break;
				default :  cryptedText=cryptedText+array[i]; break;
				}
			}
		}
		return cryptedText;
	}

	/**
	 * Eingegebener Text wird verschl�sselt.
	 *
	 * @param input Text der entschl�sselt werden soll.
	 * @return entschl�sselter Text.
	 * @throws IllegalArgumentException wird geworfen, wenn die Eingabe
     *         ung�ltige Zeichen (Gro�buchstaben) enth�lt.
	 */
	@Override
	 public String decrypt(String input) throws IllegalArgumentException {
		    for (int i = 0; i < input.length(); i++) {
		      if (Character.isUpperCase(input.charAt(i))) {
		        throw new IllegalArgumentException();
		      }
		      if (!((input.charAt(i) >= '0' && input.charAt(i) <= '9')
		          || input.charAt(i) >= 'a' && input.charAt(i) <= 'z'
		          || input.charAt(i) == ' ')) {
		        throw new IllegalArgumentException();
		      }
		    }
		    return encrypt(input);
		}

}