package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     * <p>
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     * <p>
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     * <p>
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted) {
        int kode = 9;
        if (encrypted == null) return null;
        StringBuilder encStr = new StringBuilder(encrypted);
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < encStr.length(); i++) {
            char letter = encStr.charAt(i);
            if(letter >= 'A' && letter <= 'Z')
            {
                letter -= kode;
                if(letter < 'A')
                    letter += 26;
            }
            else if(letter >= 'a' && letter <= 'z')
            {
                letter -= kode;
                if(letter < 'a')
                    letter += 26;
            }

            decrypted.append(letter);
        }
        return decrypted.toString();
    }
}