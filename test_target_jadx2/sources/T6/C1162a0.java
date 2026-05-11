package T6;

import D7.C0787k;
import android.app.Activity;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2017i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* renamed from: T6.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1162a0 extends B0 {

    /* renamed from: f, reason: collision with root package name */
    private C0787k f9389f;

    private C1162a0(InterfaceC1179j interfaceC1179j) {
        super(interfaceC1179j, C2017i.q());
        this.f9389f = new C0787k();
        this.f9437a.t("GmsAvailabilityHelper", this);
    }

    public static C1162a0 t(Activity activity) {
        InterfaceC1179j d10 = AbstractC1177i.d(activity);
        C1162a0 c1162a0 = (C1162a0) d10.h("GmsAvailabilityHelper", C1162a0.class);
        if (c1162a0 == null) {
            return new C1162a0(d10);
        }
        if (c1162a0.f9389f.a().m()) {
            c1162a0.f9389f = new C0787k();
        }
        return c1162a0;
    }

    @Override // T6.AbstractC1177i
    public final void g() {
        super.g();
        this.f9389f.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // T6.B0
    protected final void m(C2010b c2010b, int i10) {
        String F10 = c2010b.F();
        if (F10 == null) {
            F10 = "Error connecting to Google Play services";
        }
        this.f9389f.b(new S6.b(new Status(c2010b, F10, c2010b.u())));
    }

    @Override // T6.B0
    protected final void n() {
        Activity j10 = this.f9437a.j();
        if (j10 == null) {
            this.f9389f.d(new S6.b(new Status(8)));
            return;
        }
        int i10 = this.f9338e.i(j10);
        if (i10 == 0) {
            this.f9389f.e(null);
        } else {
            if (this.f9389f.a().m()) {
                return;
            }
            s(new C2010b(i10, null), 0);
        }
    }

    public final Task u() {
        return this.f9389f.a();
    }
}
