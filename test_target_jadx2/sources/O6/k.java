package O6;

import S6.a;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class k extends p {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Context f7098r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f7099s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(S6.h hVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(hVar);
        this.f7098r = context;
        this.f7099s = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ S6.o g(Status status) {
        return new N6.b(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2006a
    protected final /* bridge */ /* synthetic */ void r(a.b bVar) {
        w wVar = (w) ((i) bVar).I();
        Context context = this.f7098r;
        GoogleSignInOptions googleSignInOptions = this.f7099s;
        wVar.l1(new j(this, context, googleSignInOptions), googleSignInOptions);
    }
}
