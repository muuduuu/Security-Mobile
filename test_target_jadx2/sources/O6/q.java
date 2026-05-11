package O6;

import T6.C1171f;
import T6.C1185o;
import V6.AbstractC1286q;
import V6.AbstractC1287s;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Y6.a f7102a = new Y6.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f7102a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(HVRetakeActivity.CONFIG_TAG, signInConfiguration);
        intent.putExtra(HVRetakeActivity.CONFIG_TAG, bundle);
        return intent;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f7102a.a("getFallbackSignInIntent()", new Object[0]);
        Intent a10 = a(context, googleSignInOptions);
        a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return a10;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f7102a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a10 = a(context, googleSignInOptions);
        a10.setAction("com.google.android.gms.auth.NO_IMPL");
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static S6.j d(S6.h hVar, Context context, GoogleSignInOptions googleSignInOptions, boolean z10) {
        GoogleSignInAccount d10;
        N6.b bVar;
        Y6.a aVar = f7102a;
        aVar.a("silentSignIn()", new Object[0]);
        aVar.a("getEligibleSavedSignInResult()", new Object[0]);
        AbstractC1287s.m(googleSignInOptions);
        GoogleSignInOptions e10 = r.a(context).e();
        if (e10 != null) {
            Account j10 = e10.j();
            Account j11 = googleSignInOptions.j();
            if (j10 != null ? j10.equals(j11) : j11 == null) {
                if (!googleSignInOptions.g1() && ((!googleSignInOptions.a1() || (e10.a1() && AbstractC1286q.a(googleSignInOptions.y0(), e10.y0()))) && new HashSet(e10.I()).containsAll(new HashSet(googleSignInOptions.I())) && (d10 = r.a(context).d()) != null && !d10.o1())) {
                    bVar = new N6.b(d10, Status.f23339f);
                    if (bVar == null) {
                        aVar.a("Eligible saved sign in result found", new Object[0]);
                        return S6.l.b(bVar, hVar);
                    }
                    if (z10) {
                        return S6.l.b(new N6.b(null, new Status(4)), hVar);
                    }
                    aVar.a("trySilentSignIn()", new Object[0]);
                    return new C1185o(hVar.g(new k(hVar, context, googleSignInOptions)));
                }
            }
        }
        bVar = null;
        if (bVar == null) {
        }
    }

    public static S6.k e(S6.h hVar, Context context, boolean z10) {
        f7102a.a("Signing out", new Object[0]);
        h(context);
        return z10 ? S6.l.c(Status.f23339f, hVar) : hVar.h(new m(hVar));
    }

    public static S6.k f(S6.h hVar, Context context, boolean z10) {
        f7102a.a("Revoking access", new Object[0]);
        String e10 = c.b(context).e();
        h(context);
        return z10 ? f.a(e10) : hVar.h(new o(hVar));
    }

    public static N6.b g(Intent intent) {
        if (intent == null) {
            return new N6.b(null, Status.f23341h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new N6.b(googleSignInAccount, Status.f23339f);
        }
        if (status == null) {
            status = Status.f23341h;
        }
        return new N6.b(null, status);
    }

    private static void h(Context context) {
        r.a(context).b();
        Iterator it = S6.h.i().iterator();
        while (it.hasNext()) {
            ((S6.h) it.next()).n();
        }
        C1171f.a();
    }
}
