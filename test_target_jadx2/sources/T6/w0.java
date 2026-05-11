package T6;

import S6.h;
import android.util.Log;
import com.google.android.gms.common.C2010b;

/* loaded from: classes2.dex */
final class w0 implements h.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f9486f;

    /* renamed from: g, reason: collision with root package name */
    public final S6.h f9487g;

    /* renamed from: h, reason: collision with root package name */
    public final h.c f9488h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ x0 f9489i;

    public w0(x0 x0Var, int i10, S6.h hVar, h.c cVar) {
        this.f9489i = x0Var;
        this.f9486f = i10;
        this.f9487g = hVar;
        this.f9488h = cVar;
    }

    @Override // T6.InterfaceC1184n
    public final void onConnectionFailed(C2010b c2010b) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(c2010b)));
        this.f9489i.s(c2010b, this.f9486f);
    }
}
