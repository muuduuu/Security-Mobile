package O6;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class x extends s {

    /* renamed from: f, reason: collision with root package name */
    private final Context f7107f;

    public x(Context context) {
        this.f7107f = context;
    }

    private final void k1() {
        if (com.google.android.gms.common.util.r.a(this.f7107f, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    @Override // O6.t
    public final void A() {
        k1();
        r.a(this.f7107f).b();
    }

    @Override // O6.t
    public final void o() {
        k1();
        Context context = this.f7107f;
        c b10 = c.b(context);
        GoogleSignInAccount c10 = b10.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f23243l;
        if (c10 != null) {
            googleSignInOptions = b10.d();
        }
        com.google.android.gms.auth.api.signin.b a10 = com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptions);
        if (c10 != null) {
            a10.N();
        } else {
            a10.O();
        }
    }
}
