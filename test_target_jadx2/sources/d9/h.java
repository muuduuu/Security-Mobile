package d9;

import X8.AbstractC1299e;
import X8.C1303i;
import android.content.Context;
import com.google.android.gms.common.C2018j;
import r7.C4217s8;
import r7.E8;

/* loaded from: classes2.dex */
public final class h extends AbstractC1299e {

    /* renamed from: b, reason: collision with root package name */
    private final C1303i f31301b;

    public h(C1303i c1303i) {
        this.f31301b = c1303i;
    }

    @Override // X8.AbstractC1299e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Z8.b bVar = (Z8.b) obj;
        Context b10 = this.f31301b.b();
        C4217s8 b11 = E8.b(c.d());
        return new k(this.f31301b, bVar, (n.c(b10) || C2018j.h().b(b10) >= 204500000) ? new n(b10, bVar, b11) : new p(b10, bVar, b11), b11);
    }
}
