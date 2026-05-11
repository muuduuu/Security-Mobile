package Ub;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import expo.modules.securestore.SecureStoreOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import java.security.UnrecoverableEntryException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;
import pc.AbstractC3868b;

/* loaded from: classes2.dex */
public final class a implements Ub.c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0197a f10400a = new C0197a(null);

    /* renamed from: Ub.a$a, reason: collision with other inner class name */
    public static final class C0197a {
        public /* synthetic */ C0197a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0197a() {
        }
    }

    static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f10401a;

        /* renamed from: b, reason: collision with root package name */
        Object f10402b;

        /* renamed from: c, reason: collision with root package name */
        Object f10403c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10404d;

        /* renamed from: f, reason: collision with root package name */
        int f10406f;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10404d = obj;
            this.f10406f |= Integer.MIN_VALUE;
            return a.this.d(null, null, false, null, null, this);
        }
    }

    static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f10407a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10408b;

        /* renamed from: d, reason: collision with root package name */
        int f10410d;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10408b = obj;
            this.f10410d |= Integer.MIN_VALUE;
            return a.this.f(null, null, null, null, null, this);
        }
    }

    @Override // Ub.c
    public String a(SecureStoreOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return "AES/GCM/NoPadding:" + options.getKeychainService();
    }

    @Override // Ub.c
    public String c(SecureStoreOptions options, boolean z10) {
        Intrinsics.checkNotNullParameter(options, "options");
        String str = z10 ? "keystoreAuthenticated" : "keystoreUnauthenticated";
        return a(options) + ":" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, KeyStore.SecretKeyEntry secretKeyEntry, boolean z10, String str2, Tb.b bVar, kotlin.coroutines.d dVar) {
        b bVar2;
        int i10;
        GCMParameterSpec gCMParameterSpec;
        a aVar;
        if (dVar instanceof b) {
            bVar2 = (b) dVar;
            int i11 = bVar2.f10406f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar2.f10406f = i11 - Integer.MIN_VALUE;
                Object obj = bVar2.f10404d;
                Object e10 = AbstractC3868b.e();
                i10 = bVar2.f10406f;
                if (i10 != 0) {
                    p.b(obj);
                    Key secretKey = secretKeyEntry.getSecretKey();
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(1, secretKey);
                    gCMParameterSpec = (GCMParameterSpec) cipher.getParameters().getParameterSpec(GCMParameterSpec.class);
                    Intrinsics.d(cipher);
                    bVar2.f10401a = this;
                    bVar2.f10402b = str;
                    bVar2.f10403c = gCMParameterSpec;
                    bVar2.f10406f = 1;
                    obj = bVar.c(cipher, z10, str2, bVar2);
                    if (obj == e10) {
                        return e10;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    GCMParameterSpec gCMParameterSpec2 = (GCMParameterSpec) bVar2.f10403c;
                    String str3 = (String) bVar2.f10402b;
                    aVar = (a) bVar2.f10401a;
                    p.b(obj);
                    gCMParameterSpec = gCMParameterSpec2;
                    str = str3;
                }
                Intrinsics.d(gCMParameterSpec);
                return aVar.e(str, (Cipher) obj, gCMParameterSpec);
            }
        }
        bVar2 = new b(dVar);
        Object obj2 = bVar2.f10404d;
        Object e102 = AbstractC3868b.e();
        i10 = bVar2.f10406f;
        if (i10 != 0) {
        }
        Intrinsics.d(gCMParameterSpec);
        return aVar.e(str, (Cipher) obj2, gCMParameterSpec);
    }

    public final JSONObject e(String plaintextValue, Cipher cipher, GCMParameterSpec gcmSpec) {
        Intrinsics.checkNotNullParameter(plaintextValue, "plaintextValue");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(gcmSpec, "gcmSpec");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = plaintextValue.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        String encodeToString2 = Base64.encodeToString(gcmSpec.getIV(), 2);
        JSONObject put = new JSONObject().put("ct", encodeToString).put("iv", encodeToString2).put("tlen", gcmSpec.getTLen());
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(String str, JSONObject jSONObject, KeyStore.SecretKeyEntry secretKeyEntry, SecureStoreOptions secureStoreOptions, Tb.b bVar, kotlin.coroutines.d dVar) {
        c cVar;
        int i10;
        byte[] bArr;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.f10410d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f10410d = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f10408b;
                Object e10 = AbstractC3868b.e();
                i10 = cVar.f10410d;
                if (i10 != 0) {
                    p.b(obj);
                    String string = jSONObject.getString("ct");
                    String string2 = jSONObject.getString("iv");
                    int i12 = jSONObject.getInt("tlen");
                    byte[] decode = Base64.decode(string, 0);
                    AlgorithmParameterSpec gCMParameterSpec = new GCMParameterSpec(i12, Base64.decode(string2, 0));
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    boolean optBoolean = jSONObject.optBoolean("requireAuthentication");
                    if (i12 < 96) {
                        throw new Tb.d("Authentication tag length must be at least 96 bits long", str, secureStoreOptions.getKeychainService(), null, 8, null);
                    }
                    cipher.init(2, secretKeyEntry.getSecretKey(), gCMParameterSpec);
                    Intrinsics.d(cipher);
                    String authenticationPrompt = secureStoreOptions.getAuthenticationPrompt();
                    cVar.f10407a = decode;
                    cVar.f10410d = 1;
                    Object c10 = bVar.c(cipher, optBoolean, authenticationPrompt, cVar);
                    if (c10 == e10) {
                        return e10;
                    }
                    obj = c10;
                    bArr = decode;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bArr = (byte[]) cVar.f10407a;
                    p.b(obj);
                }
                byte[] doFinal = ((Cipher) obj).doFinal(bArr);
                Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                return new String(doFinal, UTF_8);
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.f10408b;
        Object e102 = AbstractC3868b.e();
        i10 = cVar.f10410d;
        if (i10 != 0) {
        }
        byte[] doFinal2 = ((Cipher) obj2).doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(doFinal2, "doFinal(...)");
        Charset UTF_82 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
        return new String(doFinal2, UTF_82);
    }

    @Override // Ub.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public KeyStore.SecretKeyEntry b(KeyStore keyStore, SecureStoreOptions options) {
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(options, "options");
        String c10 = c(options, options.getRequireAuthentication());
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(c10, 3).setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(options.getRequireAuthentication()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", keyStore.getProvider());
        keyGenerator.init(build);
        keyGenerator.generateKey();
        KeyStore.Entry entry = keyStore.getEntry(c10, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            return secretKeyEntry;
        }
        throw new UnrecoverableEntryException("Could not retrieve the newly generated secret key entry");
    }
}
