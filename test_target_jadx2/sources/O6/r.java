package O6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    private static r f7103d;

    /* renamed from: a, reason: collision with root package name */
    final c f7104a;

    /* renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f7105b;

    /* renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f7106c;

    private r(Context context) {
        c b10 = c.b(context);
        this.f7104a = b10;
        this.f7105b = b10.c();
        this.f7106c = b10.d();
    }

    public static synchronized r a(Context context) {
        r f10;
        synchronized (r.class) {
            f10 = f(context.getApplicationContext());
        }
        return f10;
    }

    private static synchronized r f(Context context) {
        synchronized (r.class) {
            r rVar = f7103d;
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r(context);
            f7103d = rVar2;
            return rVar2;
        }
    }

    public final synchronized void b() {
        this.f7104a.a();
        this.f7105b = null;
        this.f7106c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f7104a.f(googleSignInAccount, googleSignInOptions);
        this.f7105b = googleSignInAccount;
        this.f7106c = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount d() {
        return this.f7105b;
    }

    public final synchronized GoogleSignInOptions e() {
        return this.f7106c;
    }
}
