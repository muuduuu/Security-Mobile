package h9;

import X8.AbstractC1299e;
import X8.C1303i;
import android.content.Context;
import com.google.android.gms.common.C2018j;
import g9.C3205e;
import t7.M5;
import t7.Y5;

/* loaded from: classes2.dex */
public final class f extends AbstractC1299e {

    /* renamed from: b, reason: collision with root package name */
    private final C1303i f33996b;

    public f(C1303i c1303i) {
        this.f33996b = c1303i;
    }

    @Override // X8.AbstractC1299e
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        C3205e c3205e = (C3205e) obj;
        Context b10 = this.f33996b.b();
        M5 b11 = Y5.b(k.b());
        return new i(Y5.b(k.b()), c3205e, (C3300b.a(b10) || C2018j.h().b(b10) >= 204500000) ? new C3300b(b10, c3205e, b11) : new n(b10, c3205e, b11));
    }
}
