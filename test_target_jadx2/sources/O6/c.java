package O6;

import V6.AbstractC1287s;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f7085c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static c f7086d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f7087a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7088b;

    c(Context context) {
        this.f7088b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        AbstractC1287s.m(context);
        Lock lock = f7085c;
        lock.lock();
        try {
            if (f7086d == null) {
                f7086d = new c(context.getApplicationContext());
            }
            c cVar = f7086d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f7085c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f7087a.lock();
        try {
            this.f7088b.edit().clear().apply();
        } finally {
            this.f7087a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInAccount", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.v1(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInOptions", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m1(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC1287s.m(googleSignInAccount);
        AbstractC1287s.m(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.e2());
        AbstractC1287s.m(googleSignInAccount);
        AbstractC1287s.m(googleSignInOptions);
        String e22 = googleSignInAccount.e2();
        h(i("googleSignInAccount", e22), googleSignInAccount.f2());
        h(i("googleSignInOptions", e22), googleSignInOptions.e2());
    }

    protected final String g(String str) {
        this.f7087a.lock();
        try {
            return this.f7088b.getString(str, null);
        } finally {
            this.f7087a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f7087a.lock();
        try {
            this.f7088b.edit().putString(str, str2).apply();
        } finally {
            this.f7087a.unlock();
        }
    }
}
