package JavaConcepts;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Base64.Decoder;

import javax.crypto.Cipher;

public class TokenEncryptor {

	public static final String ALGORITHM = "RSA";

	public static String encrypt(final String data, final String publicKey) {
		String value = null;
		try {
			Base64.Encoder encoder = Base64.getEncoder();
			value = new String(encoder.encodeToString(encrypt(data.getBytes(), getPublicKey(publicKey))));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	private static byte[] encrypt(byte[] data, PublicKey key) throws Exception {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		return cipher.doFinal(data);
	}

	private static PublicKey getPublicKey(final String publicKey) throws IOException, GeneralSecurityException {
		Decoder decoder = Base64.getDecoder();
		byte[] key = decoder.decode(publicKey.getBytes());
		KeyFactory kf = KeyFactory.getInstance(ALGORITHM);
		return kf.generatePublic(new X509EncodedKeySpec(key));
	}

	public static void main(String[] args) {

		
//		System.out.println(System.currentTimeMillis());

//		System.out.println(encrypt("" + System.currentTimeMillis(),
//				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiavCaH9+kQenSkxjzkuLq4zBE/CNTF0d78pqcKXTljF9fUX8GZDpinYH+BznSU1d0b1v72SYOVSPq3/lBsF+VETf4obheM3WmXjjKLxIVKFAwvGu0UhQsgncNoatNomNSUDhOhkPrY9jcVkQ4VKq8m5UG4pIDLHWWot5gFR3RjUk4dYxWVWUcHF2UN9tgX+bOnpNZzr5lNmyuaBCeMYqBdPf9Vmea9ZSM0WmJE82i/s5/4URoDZMGZg6aPfkNKKONOGDseK3nYZ2hcyeZZjyXX8dpoLD4hn+Gf3gIWENr7fyw+YaNyRjrcwukVO4oUU8qrOaNhWqr+BRD7/OXJFSwQIDAQAB"));
//		System.out.println(encrypt("" + System.currentTimeMillis(),
//				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiavCaH9+kQenSkxjzkuLq4zBE/CNTF0d78pqcKXTljF9fUX8GZDpinYH+BznSU1d0b1v72SYOVSPq3/lBsF+VETf4obheM3WmXjjKLxIVKFAwvGu0UhQsgncNoatNomNSUDhOhkPrY9jcVkQ4VKq8m5UG4pIDLHWWot5gFR3RjUk4dYxWVWUcHF2UN9tgX+bOnpNZzr5lNmyuaBCeMYqBdPf9Vmea9ZSM0WmJE82i/s5/4URoDZMGZg6aPfkNKKONOGDseK3nYZ2hcyeZZjyXX8dpoLD4hn+Gf3gIWENr7fyw+YaNyRjrcwukVO4oUU8qrOaNhWqr+BRD7/OXJFSwQIDAQAB"));
	
		System.out.println(encrypt("" + System.currentTimeMillis(),
				"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiJCNZj6bx56WPcoSF/OwFmudiJFm9PueB6tZHP0ZGr3mFYTD1wfGVyq2JdShOfc09EHvpPkevCmpTqSb9qoY0W2Tzbs0cFwiHaUd+8WWZ/xR2o79jVCU4G6meHp6Tz4RYXYyMwPYF6rGo4z4XESmyDc8ug6RajO9te4psGHp9lrc5fC4GyvpK+yczNcHagZhr+N1zV56Y/4pwXdvk14f6Gg2gZp7b9jhP9F8NJL9YiXl/6aYR61gWPEkSU1+8Z7l4TnqhdgdZfmBnxzrLSF5JOXBIhGsmJhgC3WDU1X1LekN9JNu+b9l3OKOwWgv/89tFJGSfDeDvtT3+EsikfBhWwIDAQAB"));	
	}
	
//	public static void main(String[] args) {
//		System.out.println(EncryptionUtil.getEncryptedString("test", "az11@test.com"));
//	}
}
