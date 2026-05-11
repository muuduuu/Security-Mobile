package p7;

import D7.C0787k;
import S6.a;
import S6.g;
import T6.AbstractC1191v;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import x7.C5127j;
import x7.InterfaceC5125h;

/* renamed from: p7.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3841z extends S6.g implements InterfaceC5125h {
    public C3841z(Context context) {
        super(context, C3837v.f38470l, a.d.f8818Q, g.a.f8847c);
    }

    @Override // x7.InterfaceC5125h
    public final Task a(final PendingIntent pendingIntent) {
        return A(AbstractC1191v.a().b(new T6.r() { // from class: p7.y
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                ((C3809d0) obj).B0(pendingIntent, (C0787k) obj2);
            }
        }).e(2425).a());
    }

    @Override // x7.InterfaceC5125h
    public final Task l(C5127j c5127j, final PendingIntent pendingIntent) {
        final C5127j u10 = c5127j.u(F());
        return A(AbstractC1191v.a().b(new T6.r() { // from class: p7.x
            @Override // T6.r
            public final void a(Object obj, Object obj2) {
                ((C3809d0) obj).v0(C5127j.this, pendingIntent, (C0787k) obj2);
            }
        }).e(2424).a());
    }
}
