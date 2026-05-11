package Ub;

import Tb.g;
import android.content.Context;
import android.util.Base64;
import expo.modules.securestore.SecureStoreOptions;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f10411d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f10412a;

    /* renamed from: b, reason: collision with root package name */
    private final Ub.a f10413b;

    /* renamed from: c, reason: collision with root package name */
    private final SecureRandom f10414c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Context mContext, Ub.a mAESEncryptor) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mAESEncryptor, "mAESEncryptor");
        this.f10412a = mContext;
        this.f10413b = mAESEncryptor;
        this.f10414c = new SecureRandom();
    }

    private final Cipher e() {
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
        return cipher;
    }

    @Override // Ub.c
    public String a(SecureStoreOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return "RSA/None/PKCS1Padding:" + options.getKeychainService();
    }

    @Override // Ub.c
    public String c(SecureStoreOptions options, boolean z10) {
        Intrinsics.checkNotNullParameter(options, "options");
        String str = z10 ? "keystoreAuthenticated" : "keystoreUnauthenticated";
        return a(options) + ":" + str;
    }

    public Object d(String str, JSONObject jSONObject, KeyStore.PrivateKeyEntry privateKeyEntry, SecureStoreOptions secureStoreOptions, Tb.b bVar, d dVar) {
        byte[] decode = Base64.decode(jSONObject.getString("esk"), 0);
        Cipher e10 = e();
        e10.init(2, privateKeyEntry.getPrivateKey());
        return this.f10413b.f(str, jSONObject, new KeyStore.SecretKeyEntry(new SecretKeySpec(e10.doFinal(decode), "AES")), secureStoreOptions, bVar, dVar);
    }

    @Override // Ub.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public KeyStore.PrivateKeyEntry b(KeyStore keyStore, SecureStoreOptions options) {
        Intrinsics.checkNotNullParameter(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(options, "options");
        throw new g("Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn't happen. If you see this message report an issue at https://github.com/expo/expo.");
    }
}
