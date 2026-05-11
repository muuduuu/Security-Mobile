package V6;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import java.util.Objects;

/* loaded from: classes2.dex */
final class l0 extends n7.p {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1267c f10981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(AbstractC1267c abstractC1267c, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC1267c);
        this.f10981b = abstractC1267c;
    }

    private static final void a(Message message) {
        m0 m0Var = (m0) message.obj;
        if (m0Var != null) {
            m0Var.c();
        }
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC1267c abstractC1267c = this.f10981b;
        if (abstractC1267c.f10893C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !abstractC1267c.y()) || message.what == 5)) && !abstractC1267c.e()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            abstractC1267c.l0(new C2010b(message.arg2));
            if (abstractC1267c.e0() && !abstractC1267c.m0()) {
                abstractC1267c.b0(3, null);
                return;
            }
            C2010b k02 = abstractC1267c.k0() != null ? abstractC1267c.k0() : new C2010b(8);
            abstractC1267c.f10909p.a(k02);
            abstractC1267c.Q(k02);
            return;
        }
        if (i11 == 5) {
            C2010b k03 = abstractC1267c.k0() != null ? abstractC1267c.k0() : new C2010b(8);
            abstractC1267c.f10909p.a(k03);
            abstractC1267c.Q(k03);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C2010b c2010b = new C2010b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC1267c.f10909p.a(c2010b);
            abstractC1267c.Q(c2010b);
            return;
        }
        if (i11 == 6) {
            abstractC1267c.b0(5, null);
            if (abstractC1267c.i0() != null) {
                abstractC1267c.i0().onConnectionSuspended(message.arg2);
            }
            abstractC1267c.R(message.arg2);
            abstractC1267c.c0(5, 1, null);
            return;
        }
        if (i11 == 2 && !abstractC1267c.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((m0) message.obj).b();
            return;
        }
        int i12 = message.what;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i12);
        Log.wtf("GmsClient", sb2.toString(), new Exception());
    }
}
