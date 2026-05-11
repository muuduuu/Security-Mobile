package com.webengage.sdk.android;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes2.dex */
public class l4 {

    /* renamed from: d, reason: collision with root package name */
    private static l4 f30716d;

    /* renamed from: a, reason: collision with root package name */
    private String f30717a = "we-wk-secret";

    /* renamed from: b, reason: collision with root package name */
    private String f30718b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    private SecretKey f30719c = null;

    private l4() {
    }

    public static l4 c() {
        if (f30716d == null) {
            f30716d = new l4();
        }
        return f30716d;
    }

    private SecretKey d() {
        KeyStore keyStore;
        SecretKey secretKey = this.f30719c;
        if (secretKey != null) {
            return secretKey;
        }
        try {
            keyStore = KeyStore.getInstance(this.f30718b);
            keyStore.load(null);
        } catch (Exception unused) {
        }
        if (!keyStore.containsAlias(this.f30717a)) {
            Logger.w("WebEngage", "Key not found in Keystore.");
            return null;
        }
        SecretKey secretKey2 = (SecretKey) keyStore.getKey(this.f30717a, null);
        this.f30719c = secretKey2;
        return secretKey2;
    }

    public void a() {
        try {
            KeyStore keyStore = KeyStore.getInstance(this.f30718b);
            keyStore.load(null);
            keyStore.deleteEntry(this.f30717a);
            this.f30719c = null;
        } catch (Exception e10) {
            Logger.w("WebEngage", "Unable to delete key " + e10);
        }
    }

    public void b() {
        try {
            if (e()) {
                return;
            }
            KeyStore.getInstance(this.f30718b).load(null);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", this.f30718b);
            keyGenerator.init(new KeyGenParameterSpec.Builder(this.f30717a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(true).build());
            this.f30719c = keyGenerator.generateKey();
        } catch (Exception e10) {
            Logger.e("WebEngage", "Unable to create key " + e10);
        }
    }

    public boolean e() {
        try {
            KeyStore keyStore = KeyStore.getInstance(this.f30718b);
            keyStore.load(null);
            return keyStore.containsAlias(this.f30717a);
        } catch (Exception unused) {
            return false;
        }
    }

    public byte[] a(byte[] bArr) {
        try {
            SecretKey d10 = d();
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            byte[] bArr2 = new byte[12];
            int length = bArr.length - 12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, 12);
            System.arraycopy(bArr, 12, bArr3, 0, length);
            cipher.init(2, d10, new GCMParameterSpec(128, bArr2));
            return cipher.doFinal(bArr3);
        } catch (Exception unused) {
            return null;
        }
    }

    public byte[] b(byte[] bArr) {
        SecretKey d10 = d();
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, d10);
        byte[] iv = cipher.getIV();
        byte[] doFinal = cipher.doFinal(bArr);
        byte[] bArr2 = new byte[doFinal.length + 12];
        System.arraycopy(iv, 0, bArr2, 0, 12);
        System.arraycopy(doFinal, 0, bArr2, 12, doFinal.length);
        return bArr2;
    }
}
