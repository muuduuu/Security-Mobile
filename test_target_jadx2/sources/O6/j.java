package O6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: classes2.dex */
final class j extends e {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f7095f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f7096g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ k f7097h;

    j(k kVar, Context context, GoogleSignInOptions googleSignInOptions) {
        this.f7095f = context;
        this.f7096g = googleSignInOptions;
        Objects.requireNonNull(kVar);
        this.f7097h = kVar;
    }

    @Override // O6.e, O6.v
    public final void C(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            Context context = this.f7095f;
            r.a(context).c(this.f7096g, googleSignInAccount);
        }
        this.f7097h.k(new N6.b(googleSignInAccount, status));
    }
}
