package com.growwwealth.tech;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.text.Charsets;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/growwwealth/tech/EncryptedKeyModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "encryptedKeyPref", BuildConfig.FLAVOR, "keyAlias", "prefsName", "getEncryptedKey", "getName", "hasEncryptedKey", BuildConfig.FLAVOR, "setEncryptedKey", "key", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EncryptedKeyModule extends ReactContextBaseJavaModule {
    private final String encryptedKeyPref;
    private final String keyAlias;
    private final String prefsName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedKeyModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.keyAlias = "w_encrypted_key";
        this.prefsName = "w_secure_prefs";
        this.encryptedKeyPref = "encrypted_key";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String getEncryptedKey() {
        String str;
        SharedPreferences sharedPreferences = getReactApplicationContext().getSharedPreferences(this.prefsName, 0);
        String string = sharedPreferences.getString(this.encryptedKeyPref, null);
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias(this.keyAlias)) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(this.keyAlias, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).build());
                keyGenerator.generateKey();
            } catch (Exception e10) {
                Log.e("EncryptedKey", "Failed to generate KeyStore key: " + e10.getMessage());
            }
        }
        try {
            if (string == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                str = Base64.encodeToString(bArr, 2);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, keyStore.getKey(this.keyAlias, null));
                byte[] iv = cipher.getIV();
                Intrinsics.d(str);
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                byte[] doFinal = cipher.doFinal(bytes);
                byte[] bArr2 = new byte[iv.length + doFinal.length];
                System.arraycopy(iv, 0, bArr2, 0, iv.length);
                System.arraycopy(doFinal, 0, bArr2, iv.length, doFinal.length);
                sharedPreferences.edit().putString(this.encryptedKeyPref, Base64.encodeToString(bArr2, 2)).apply();
            } else {
                byte[] decode = Base64.decode(string, 2);
                Intrinsics.d(decode);
                byte[] b02 = AbstractC3574i.b0(decode, d.p(0, 12));
                byte[] b03 = AbstractC3574i.b0(decode, d.p(12, decode.length));
                Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher2.init(2, keyStore.getKey(this.keyAlias, null), new GCMParameterSpec(128, b02));
                byte[] doFinal2 = cipher2.doFinal(b03);
                Intrinsics.d(doFinal2);
                str = new String(doFinal2, Charsets.UTF_8);
            }
            return str;
        } catch (Exception e11) {
            Log.e("EncryptedKey", "Operation failed: " + e11.getMessage());
            return "error_key_operation_failed";
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "EncryptedKey";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean hasEncryptedKey() {
        return getReactApplicationContext().getSharedPreferences(this.prefsName, 0).contains(this.encryptedKeyPref);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String setEncryptedKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(this.keyAlias)) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(this.keyAlias, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).build());
                keyGenerator.generateKey();
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, keyStore.getKey(this.keyAlias, null));
            byte[] iv = cipher.getIV();
            byte[] bytes = key.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] doFinal = cipher.doFinal(bytes);
            byte[] bArr = new byte[iv.length + doFinal.length];
            System.arraycopy(iv, 0, bArr, 0, iv.length);
            System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
            getReactApplicationContext().getSharedPreferences(this.prefsName, 0).edit().putString(this.encryptedKeyPref, Base64.encodeToString(bArr, 2)).apply();
            Log.d("EncryptedKey", "Key successfully migrated and saved natively");
            return "success";
        } catch (Exception e10) {
            Log.e("EncryptedKey", "Failed to set/migrate key: " + e10.getMessage());
            return "error: " + e10.getMessage();
        }
    }
}
