package p;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.core.hardware.fingerprint.a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import p.n;

/* loaded from: classes.dex */
abstract class q {

    private static class a {
        static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
            return builder.build();
        }

        static KeyGenParameterSpec.Builder b(String str, int i10) {
            return new KeyGenParameterSpec.Builder(str, i10);
        }

        static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
            keyGenerator.init(keyGenParameterSpec);
        }

        static void d(KeyGenParameterSpec.Builder builder) {
            builder.setBlockModes("CBC");
        }

        static void e(KeyGenParameterSpec.Builder builder) {
            builder.setEncryptionPaddings("PKCS7Padding");
        }
    }

    private static class b {
        static BiometricPrompt.CryptoObject a(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        static BiometricPrompt.CryptoObject b(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        static BiometricPrompt.CryptoObject c(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }

        static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }
    }

    private static class c {
        static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    static n.c a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b10 = a.b("androidxBiometric", 3);
            a.d(b10);
            a.e(b10);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            a.c(keyGenerator, a.a(b10));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new n.c(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e10) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e10);
            return null;
        }
    }

    static n.c b(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential b10;
        if (cryptoObject == null) {
            return null;
        }
        Cipher d10 = b.d(cryptoObject);
        if (d10 != null) {
            return new n.c(d10);
        }
        Signature f10 = b.f(cryptoObject);
        if (f10 != null) {
            return new n.c(f10);
        }
        Mac e10 = b.e(cryptoObject);
        if (e10 != null) {
            return new n.c(e10);
        }
        if (Build.VERSION.SDK_INT < 30 || (b10 = c.b(cryptoObject)) == null) {
            return null;
        }
        return new n.c(b10);
    }

    static n.c c(a.e eVar) {
        if (eVar == null) {
            return null;
        }
        Cipher a10 = eVar.a();
        if (a10 != null) {
            return new n.c(a10);
        }
        Signature c10 = eVar.c();
        if (c10 != null) {
            return new n.c(c10);
        }
        Mac b10 = eVar.b();
        if (b10 != null) {
            return new n.c(b10);
        }
        return null;
    }

    static BiometricPrompt.CryptoObject d(n.c cVar) {
        IdentityCredential b10;
        if (cVar == null) {
            return null;
        }
        Cipher a10 = cVar.a();
        if (a10 != null) {
            return b.b(a10);
        }
        Signature d10 = cVar.d();
        if (d10 != null) {
            return b.a(d10);
        }
        Mac c10 = cVar.c();
        if (c10 != null) {
            return b.c(c10);
        }
        if (Build.VERSION.SDK_INT < 30 || (b10 = cVar.b()) == null) {
            return null;
        }
        return c.a(b10);
    }

    static a.e e(n.c cVar) {
        if (cVar == null) {
            return null;
        }
        Cipher a10 = cVar.a();
        if (a10 != null) {
            return new a.e(a10);
        }
        Signature d10 = cVar.d();
        if (d10 != null) {
            return new a.e(d10);
        }
        Mac c10 = cVar.c();
        if (c10 != null) {
            return new a.e(c10);
        }
        if (Build.VERSION.SDK_INT >= 30 && cVar.b() != null) {
            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        }
        return null;
    }
}
