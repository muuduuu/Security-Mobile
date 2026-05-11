package co.hyperverge.hypersnapsdk.service.security.encryption;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.io.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import lc.m;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\b\u0006¨\u0006\n"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt;", BuildConfig.FLAVOR, "()V", "TAG", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "TAG$1", "Builder", "Companion", "EncryptionMethod", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HVEncrypt {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = HVEncrypt.class.getCanonicalName();

    /* renamed from: TAG$1, reason: from kotlin metadata */
    private final String TAG = HVEncrypt.class.getCanonicalName();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\u0012\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt$Companion;", BuildConfig.FLAVOR, "()V", "TAG", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "builder", "Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt$Builder;", "method", "Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt$EncryptionMethod;", "generateAesKey", "Ljavax/crypto/SecretKey;", "generateIV", BuildConfig.FLAVOR, "generateRandomKey", "generateRandomUTF8String", "length", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String generateRandomUTF8String(int length) {
            SecureRandom secureRandom = new SecureRandom();
            IntRange intRange = new IntRange(1, length);
            ArrayList arrayList = new ArrayList(CollectionsKt.u(intRange, 10));
            Iterator it = intRange.iterator();
            while (it.hasNext()) {
                ((D) it).a();
                arrayList.add(Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+".charAt(secureRandom.nextInt(76))));
            }
            return CollectionsKt.l0(arrayList, BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);
        }

        static /* synthetic */ String generateRandomUTF8String$default(Companion companion, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 32;
            }
            return companion.generateRandomUTF8String(i10);
        }

        public final Builder builder(EncryptionMethod method) {
            Intrinsics.checkNotNullParameter(method, "method");
            return new Builder(method);
        }

        public final SecretKey generateAesKey() {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            SecretKey generateKey = keyGenerator.generateKey();
            Intrinsics.checkNotNullExpressionValue(generateKey, "keyGen.generateKey()");
            return generateKey;
        }

        public final byte[] generateIV() {
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        }

        public final SecretKey generateRandomKey() {
            byte[] bytes = generateRandomUTF8String$default(this, 0, 1, null).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return new SecretKeySpec(bytes, "AES");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt$EncryptionMethod;", BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "AES_GCM", "RSA", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EncryptionMethod {
        AES_GCM,
        RSA
    }

    private HVEncrypt() {
    }

    public static final Builder builder(EncryptionMethod encryptionMethod) {
        return INSTANCE.builder(encryptionMethod);
    }

    public static final SecretKey generateAesKey() {
        return INSTANCE.generateAesKey();
    }

    public static final byte[] generateIV() {
        return INSTANCE.generateIV();
    }

    public static final SecretKey generateRandomKey() {
        return INSTANCE.generateRandomKey();
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bJ \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0006H\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt$Builder;", BuildConfig.FLAVOR, "method", "Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt$EncryptionMethod;", "(Lco/hyperverge/hypersnapsdk/service/security/encryption/HVEncrypt$EncryptionMethod;)V", "TAG", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "aesKey", "Ljavax/crypto/SecretKey;", "iv", BuildConfig.FLAVOR, "publicKeyBase64", "decrypt", "data", "decryptDataWithAES", "secretKey", "encrypt", "encryptDataWithAES", "encryptFile", "Ljava/io/InputStream;", "fileInputStream", "encryptFileBytesWithAES", "encryptFileWithAES", "encryptWithRsa", "publicKey", "Ljava/security/PublicKey;", "getCipher", "Ljavax/crypto/Cipher;", "mode", BuildConfig.FLAVOR, "parsePublicKey", "base64Key", "pubKeyBase64", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final String TAG;
        private SecretKey aesKey;
        private byte[] iv;
        private final EncryptionMethod method;
        private String publicKeyBase64;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EncryptionMethod.values().length];
                try {
                    iArr[EncryptionMethod.RSA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EncryptionMethod.AES_GCM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Builder(EncryptionMethod method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            this.TAG = HVEncrypt.class.getCanonicalName();
        }

        private final String decryptDataWithAES(byte[] data, SecretKey secretKey, byte[] iv) {
            System.currentTimeMillis();
            byte[] doFinal = getCipher(2, secretKey, iv).doFinal(data);
            Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data)");
            System.currentTimeMillis();
            return new String(doFinal, Charsets.UTF_8);
        }

        private final String encryptDataWithAES(String data, SecretKey secretKey, byte[] iv) {
            System.currentTimeMillis();
            Cipher cipher = getCipher(1, secretKey, iv);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] doFinal = cipher.doFinal(bytes);
            Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(data.toByteArray(Charsets.UTF_8))");
            System.currentTimeMillis();
            String encodeToString = Base64.encodeToString(doFinal, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(encrypted…se64: $it\")\n            }");
            return encodeToString;
        }

        private final String encryptFileBytesWithAES(InputStream fileInputStream, SecretKey secretKey, byte[] iv) {
            System.currentTimeMillis();
            byte[] doFinal = getCipher(1, secretKey, iv).doFinal(b.c(fileInputStream));
            Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(byteArray)");
            System.currentTimeMillis();
            String encodeToString = Base64.encodeToString(doFinal, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(encrypted…se64: $it\")\n            }");
            return encodeToString;
        }

        private final InputStream encryptFileWithAES(InputStream fileInputStream, SecretKey secretKey, byte[] iv) {
            Cipher cipher = getCipher(1, secretKey, iv);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.write(cipher.doFinal());
                    return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                }
                byte[] update = cipher.update(bArr, 0, read);
                if (update != null) {
                    byteArrayOutputStream.write(update);
                }
            }
        }

        private final String encryptWithRsa(byte[] data, PublicKey publicKey) {
            System.currentTimeMillis();
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKey);
            byte[] doFinal = cipher.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(doFinal, "rsaCipher.doFinal(data)");
            System.currentTimeMillis();
            String encodeToString = Base64.encodeToString(doFinal, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(encrypted…oded: $it\")\n            }");
            return encodeToString;
        }

        private final Cipher getCipher(int mode, SecretKey secretKey, byte[] iv) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(mode, secretKey, new GCMParameterSpec(128, iv));
            Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(\"AES/GCM/NoP…erSpec(iv))\n            }");
            return cipher;
        }

        private final PublicKey parsePublicKey(String base64Key) {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(base64Key, 0)));
            Intrinsics.checkNotNullExpressionValue(generatePublic, "keyFactory.generatePubli…cKey: $it\")\n            }");
            return generatePublic;
        }

        public final Builder aesKey(SecretKey aesKey) {
            Intrinsics.checkNotNullParameter(aesKey, "aesKey");
            this.aesKey = aesKey;
            return this;
        }

        public final String decrypt(byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.method.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("RSA decryption is not supported");
            }
            if (i10 != 2) {
                throw new m();
            }
            if (this.iv == null) {
                throw new IllegalArgumentException("IV must be set (iv(...)) when using AES encryption.");
            }
            SecretKey secretKey = this.aesKey;
            if (secretKey == null) {
                throw new IllegalArgumentException("aesKey must be set (aesKey(...)) when using AES encryption.");
            }
            Intrinsics.d(secretKey);
            byte[] bArr = this.iv;
            Intrinsics.d(bArr);
            return decryptDataWithAES(data, secretKey, bArr);
        }

        public final String encrypt(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.method.ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new m();
                }
                if (this.iv == null) {
                    throw new IllegalArgumentException("IV must be set (iv(...)) when using AES encryption.");
                }
                SecretKey secretKey = this.aesKey;
                if (secretKey == null) {
                    throw new IllegalArgumentException("aesKey must be set (aesKey(...)) when using AES encryption.");
                }
                Intrinsics.d(secretKey);
                byte[] bArr = this.iv;
                Intrinsics.d(bArr);
                return encryptDataWithAES(data, secretKey, bArr);
            }
            String str = this.publicKeyBase64;
            if (str != null && !StringsKt.Z(str)) {
                z10 = false;
            }
            if (z10) {
                throw new IllegalArgumentException("PublicKey must be set (setPublicKey(...)) when using RSA encryption.");
            }
            String str2 = this.publicKeyBase64;
            Intrinsics.d(str2);
            PublicKey parsePublicKey = parsePublicKey(str2);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return encryptWithRsa(bytes, parsePublicKey);
        }

        public final InputStream encryptFile(InputStream fileInputStream) {
            Intrinsics.checkNotNullParameter(fileInputStream, "fileInputStream");
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.method.ordinal()];
            if (i10 == 1) {
                throw new UnsupportedOperationException("RSA file encryption typically not done with large streams.");
            }
            if (i10 != 2) {
                throw new m();
            }
            SecretKey secretKey = this.aesKey;
            if (secretKey == null) {
                throw new IllegalStateException("You must call aesKey(...) before encryptFile().");
            }
            byte[] bArr = this.iv;
            if (bArr != null) {
                return encryptFileWithAES(fileInputStream, secretKey, bArr);
            }
            throw new IllegalStateException("You must call iv(...) before encryptFile().");
        }

        public final Builder iv(byte[] iv) {
            Intrinsics.checkNotNullParameter(iv, "iv");
            this.iv = iv;
            return this;
        }

        public final Builder publicKey(String pubKeyBase64) {
            Intrinsics.checkNotNullParameter(pubKeyBase64, "pubKeyBase64");
            this.publicKeyBase64 = pubKeyBase64;
            return this;
        }

        public final String encrypt(byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.method.ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new m();
                }
                throw new IllegalStateException("AES encryption with byteArray is not supported, pass data as String");
            }
            String str = this.publicKeyBase64;
            if (str != null && !StringsKt.Z(str)) {
                z10 = false;
            }
            if (!z10) {
                String str2 = this.publicKeyBase64;
                Intrinsics.d(str2);
                return encryptWithRsa(data, parsePublicKey(str2));
            }
            throw new IllegalArgumentException("PublicKey must be set (setPublicKey(...)) when using RSA encryption.");
        }
    }
}
