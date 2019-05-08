public class DecryptStringFog {
    
    public static void main(String[] args) {
        String key = args[0];
        String encryptText = args[1];
        String decryptText = decrypt(key, encryptText);
        System.out.println(decryptText);
    }
    
    private static String decrypt(String key, String encryptText) {
        IStringFog stringFog = new StringFogImpl();
        return stringFog.decrypt(encryptText, key);
    }

}








