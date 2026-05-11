package C8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import j8.C3511e;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f1049c = {"*", "FCM", "GCM", BuildConfig.FLAVOR};

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f1050a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1051b;

    public b(C3511e c3511e) {
        this.f1050a = c3511e.l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f1051b = b(c3511e);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(C3511e c3511e) {
        String f10 = c3511e.q().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = c3511e.q().c();
        if (!c10.startsWith("1:") && !c10.startsWith("2:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f1050a) {
            string = this.f1050a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f1050a) {
            try {
                String string = this.f1050a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey e10 = e(string);
                if (e10 == null) {
                    return null;
                }
                return c(e10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f() {
        synchronized (this.f1050a) {
            try {
                String g10 = g();
                if (g10 != null) {
                    return g10;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f1050a) {
            try {
                for (String str : f1049c) {
                    String string = this.f1050a.getString(a(this.f1051b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
