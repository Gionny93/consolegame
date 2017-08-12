package utils;

import java.nio.charset.Charset;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptUtils {

	private static final Charset ASCII = Charset.forName("UTF-8");
	// totally not the key u are looking for so get out of here!
	private static final String PASSWORD = "L4M4MM4D1F3D3R1C";
	private static final byte[] iv = "1234567812345678".getBytes(ASCII);

	public static String encrypt(String pInput) {
		String encryptedText = null;
		try {
			SecretKeySpec aesKey = new SecretKeySpec(PASSWORD.getBytes("UTF-8"), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, aesKey, new IvParameterSpec(iv));
			byte[] encrypted = cipher.doFinal(pInput.getBytes("UTF-8"));
			encryptedText = Base64.getEncoder().encodeToString(encrypted);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedText;
	}

	public String decrypt(String pInput) {
		String decrypted = null;
		try {
			byte[] encrypted_bytes = Base64.getDecoder().decode(pInput);
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec aesKey = new SecretKeySpec(PASSWORD.getBytes("UTF-8"), "AES");
			cipher.init(Cipher.DECRYPT_MODE, aesKey, new IvParameterSpec(iv));

			byte[] decrypted_bytes = cipher.doFinal(encrypted_bytes);
			decrypted = new String(decrypted_bytes);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return decrypted;
	}
}
