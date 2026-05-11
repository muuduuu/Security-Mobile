package p7;

import D7.C0787k;
import T6.AbstractC1192w;
import T6.InterfaceC1173g;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class M extends InterfaceC1173g.a {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f38381f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C0787k f38382g;

    M(C3809d0 c3809d0, Object obj, C0787k c0787k) {
        this.f38381f = obj;
        this.f38382g = c0787k;
    }

    @Override // T6.InterfaceC1173g
    public final void F(Status status) {
        AbstractC1192w.b(status, this.f38381f, this.f38382g);
    }
}
