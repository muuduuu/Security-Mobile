package J6;

import O6.i;
import S6.a;
import S6.h;
import V6.C1271e;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class e extends a.AbstractC0172a {
    e() {
    }

    @Override // S6.a.e
    public final /* bridge */ /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.I();
    }

    @Override // S6.a.AbstractC0172a
    public final /* synthetic */ a.f c(Context context, Looper looper, C1271e c1271e, Object obj, h.b bVar, h.c cVar) {
        return new i(context, looper, c1271e, (GoogleSignInOptions) obj, bVar, cVar);
    }
}
