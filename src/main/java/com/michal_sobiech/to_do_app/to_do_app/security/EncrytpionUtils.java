package com.michal_sobiech.to_do_app.to_do_app.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.UUID;

import com.nimbusds.jose.jwk.RSAKey;

public class EncrytpionUtils {
    
    private EncrytpionUtils() {}

    static KeyPair generateRSAKeyPair() {
        KeyPair keyPair = new KeyPair(null, null);
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Invalid encrytpion algorithm");
        }
        return keyPair;
    }

    static RSAKey generateRSAKey(KeyPair RSAKeyPair) {
        RSAPublicKey publicKey = (RSAPublicKey) RSAKeyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) RSAKeyPair.getPrivate();
        return new RSAKey.Builder(publicKey)
            .privateKey(privateKey)
            .keyID(UUID.randomUUID().toString())
            .build();
    }

}
