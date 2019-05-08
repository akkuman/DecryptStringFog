public interface IStringFog {

    /**
     * Encrypt the data by the special key.
     *
     * @param data The original data.
     * @param key Encrypt key.
     * @return The encrypted data.
     */
    String encrypt(String data, String key);

    /**
     * Decrypt the data to origin by the special key.
     *
     * @param data The encrypted data.
     * @param key Encrypt key.
     * @return The original data.
     */
    String decrypt(String data, String key);

    /**
     * Whether the encrypted string length is over 65535.
     *
     * @param data The original data.
     * @param key Encrypt key.
     * @return Ignore this value if the encrypted string is overflow 65535.
     */
    boolean overflow(String data, String key);

}