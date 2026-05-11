package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
final class CryptoUpcalls {
    private static final Logger logger = Logger.getLogger(CryptoUpcalls.class.getName());

    private CryptoUpcalls() {
    }

    static byte[] ecSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        if ("EC".equals(privateKey.getAlgorithm())) {
            return signDigestWithPrivateKey(privateKey, bArr, "NONEwithECDSA");
        }
        throw new RuntimeException("Unexpected key type: " + privateKey.toString());
    }

    private static ArrayList<Provider> getExternalProviders(String str) {
        ArrayList<Provider> arrayList = new ArrayList<>(1);
        for (Provider provider : Security.getProviders(str)) {
            if (!Conscrypt.isConscrypt(provider)) {
                arrayList.add(provider);
            }
        }
        if (arrayList.isEmpty()) {
            logger.warning("Could not find external provider for algorithm: " + str);
        }
        return arrayList;
    }

    static byte[] rsaDecryptWithPrivateKey(PrivateKey privateKey, int i10, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i10, 2, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (org.conscrypt.Conscrypt.isConscrypt(r1.getProvider()) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] rsaOpWithPrivateKey(PrivateKey privateKey, int i10, int i11, byte[] bArr) {
        String str;
        String str2;
        Cipher cipher;
        Iterator<Provider> it;
        String algorithm = privateKey.getAlgorithm();
        if (!"RSA".equals(algorithm)) {
            logger.warning("Unexpected key type: " + algorithm);
            return null;
        }
        if (i10 == 1) {
            str = "PKCS1Padding";
        } else if (i10 == 3) {
            str = "NoPadding";
        } else {
            if (i10 != 4) {
                logger.warning("Unsupported OpenSSL/BoringSSL padding: " + i10);
                return null;
            }
            str = "OAEPPadding";
        }
        str2 = "RSA/ECB/" + str;
        try {
            cipher = Cipher.getInstance(str2);
            cipher.init(i11, privateKey);
        } catch (InvalidKeyException e10) {
            logger.log(Level.WARNING, "Preferred provider doesn't support key:", (Throwable) e10);
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported cipher algorithm: " + str2);
            return null;
        } catch (NoSuchPaddingException unused2) {
            logger.warning("Unsupported cipher algorithm: " + str2);
            return null;
        }
        while (it.hasNext()) {
            try {
                cipher = Cipher.getInstance(str2, it.next());
                cipher.init(i11, privateKey);
                break;
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused3) {
                cipher = null;
            }
        }
        if (cipher == null) {
            logger.warning("Could not find provider for algorithm: " + str2);
            return null;
        }
        try {
            return cipher.doFinal(bArr);
        } catch (Exception e11) {
            logger.log(Level.WARNING, "Exception while decrypting message with " + privateKey.getAlgorithm() + " private key using " + str2 + ":", (Throwable) e11);
            return null;
        }
        cipher = null;
        if (cipher == null) {
            it = getExternalProviders("Cipher." + str2).iterator();
            while (it.hasNext()) {
            }
            if (cipher == null) {
            }
        }
        return cipher.doFinal(bArr);
    }

    static byte[] rsaSignDigestWithPrivateKey(PrivateKey privateKey, int i10, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i10, 1, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (org.conscrypt.Conscrypt.isConscrypt(r1.getProvider()) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] signDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr, String str) {
        Signature signature;
        Iterator<Provider> it;
        RuntimeException runtimeException;
        try {
            signature = Signature.getInstance(str);
            signature.initSign(privateKey);
        } catch (InvalidKeyException e10) {
            logger.warning("Preferred provider doesn't support key:");
            e10.printStackTrace();
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported signature algorithm: " + str);
            return null;
        }
        while (it.hasNext()) {
            try {
                signature = Signature.getInstance(str, it.next());
                signature.initSign(privateKey);
                break;
            } catch (RuntimeException e11) {
                if (runtimeException == null) {
                    runtimeException = e11;
                }
                signature = null;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                signature = null;
            }
        }
        if (signature == null) {
            if (runtimeException != null) {
                throw runtimeException;
            }
            logger.warning("Could not find provider for algorithm: " + str);
            return null;
        }
        try {
            signature.update(bArr);
            return signature.sign();
        } catch (Exception e12) {
            logger.log(Level.WARNING, "Exception while signing message with " + privateKey.getAlgorithm() + " private key:", (Throwable) e12);
            return null;
        }
        signature = null;
        if (signature == null) {
            it = getExternalProviders("Signature." + str).iterator();
            runtimeException = null;
            while (it.hasNext()) {
            }
            if (signature == null) {
            }
        }
        signature.update(bArr);
        return signature.sign();
    }
}
