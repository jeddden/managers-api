package com.yunku.demo.tool;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @author Jeddden
 * @create 2019-08-22 17:42
 */
public class AESUtil {

    private static final String src = "wqj*kc5#If$p&_3~%";

    private Key key;

    private Cipher cipher;

    public void setKey(Key key) {
        this.key = key;
    }

    public Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (cipher == null) {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        }
        return cipher;
    }


    public Key getKey() throws NoSuchAlgorithmException {
        if (this.key == null) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//            keyGenerator.init(128);
            keyGenerator.init(128, new SecureRandom(src.getBytes()));
            //使用上面这种初始化方法可以特定种子来生成密钥，这样加密后的密文是唯一固定的。
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] keyBytes = secretKey.getEncoded();
            //Key转换
            key = new SecretKeySpec(keyBytes, "AES");
        }
        return key;
    }

    public String encode(String code) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = getCipher();
        cipher.init(Cipher.ENCRYPT_MODE, getKey());
        byte[] encodeResult = cipher.doFinal(code.getBytes());
        String token = Hex.encodeHexString(encodeResult);
        System.out.println("AESencode : " + token);
        return token;
    }

    public String decode(String code) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, DecoderException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = getCipher();
        cipher.init(Cipher.DECRYPT_MODE, getKey());
        byte[] decodeResult = cipher.doFinal(Hex.decodeHex(code));
        String token = new String(decodeResult);
        System.out.println("AESdecode : " + token);
        return token;

    }


    public static void jdkAES() {
//        try {
        //生成Key
//            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//            keyGenerator.init(128);
//            keyGenerator.init(128, new SecureRandom("seedseedseed".getBytes()));
        //使用上面这种初始化方法可以特定种子来生成密钥，这样加密后的密文是唯一固定的。
//            SecretKey secretKey = keyGenerator.generateKey();
//            byte[] keyBytes = secretKey.getEncoded();
        //Key转换
//            Key key = new SecretKeySpec(keyBytes, "AES");
        //加密

//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.ENCRYPT_MODE, key);
//            byte[] encodeResult = cipher.doFinal(src.getBytes());
//            String token = Hex.encodeHexString(encodeResult);
//            System.out.println("AESencode : " + token);
        //解密
//            cipher.init(Cipher.DECRYPT_MODE, key);
//            byte[] decodeResult = cipher.doFinal(encodeResult);
//            System.out.println("AESdecode : " + new String (decodeResult));
//        } catch (NoSuchAlgorithmException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (NoSuchPaddingException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (InvalidKeyException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (IllegalBlockSizeException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (BadPaddingException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (DecoderException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void bcAES (){
//        try {
//            //使用BouncyCastle 的DES加密
//            Security.addProvider(new BouncyCastleProvider());
//            //生成Key
//            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES","BC");
//            keyGenerator.getProvider();
//            keyGenerator.init(128);
//            SecretKey secretKey = keyGenerator.generateKey();
//            byte[] keyBytes = secretKey.getEncoded();
//            //Key转换
//            Key key = new SecretKeySpec(keyBytes, "AES");
//            //加密
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.ENCRYPT_MODE, key);
//            byte[] encodeResult = cipher.doFinal(src.getBytes());
//            System.out.println("AESencode : " + Hex.toHexString(encodeResult) );
//            //解密
//            cipher.init(Cipher.DECRYPT_MODE, key);
//            byte[] decodeResult = cipher.doFinal(encodeResult);
//            System.out.println("AESdecode : " + new String (decodeResult));
//        } catch (NoSuchAlgorithmException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (NoSuchPaddingException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (InvalidKeyException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (IllegalBlockSizeException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (BadPaddingException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        } catch (NoSuchProviderException e) {
//            // TODO 自动生成的 catch 块
//            e.printStackTrace();
//        }
    }

//    public static String excect(String token) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, DecoderException {
//        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        keyGenerator.init(128, new SecureRandom("seedseedseed".getBytes()));
//        SecretKey secretKey = keyGenerator.generateKey();
//        byte[] keyBytes = secretKey.getEncoded();
//        //Key转换
//        Key key = new SecretKeySpec(keyBytes, "AES");
//        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//        cipher.init(Cipher.DECRYPT_MODE, key);
//        byte[] decodeResult = cipher.doFinal(Hex.decodeHex(token));
//        System.out.println("AESdecode : " + new String(decodeResult));
//        return new String(decodeResult);
//    }

    public static void main(String[] args) {
        jdkAES();
//        bcAES();
    }
}
