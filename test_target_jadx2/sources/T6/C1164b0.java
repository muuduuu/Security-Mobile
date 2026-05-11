package T6;

import V6.AbstractC1267c;
import V6.C1273f;
import V6.C1285p;
import V6.C1288t;
import V6.C1289u;
import android.os.SystemClock;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: T6.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1164b0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    private final C1171f f9394a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9395b;

    /* renamed from: c, reason: collision with root package name */
    private final C1163b f9396c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9397d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9398e;

    C1164b0(C1171f c1171f, int i10, C1163b c1163b, long j10, long j11, String str, String str2) {
        this.f9394a = c1171f;
        this.f9395b = i10;
        this.f9396c = c1163b;
        this.f9397d = j10;
        this.f9398e = j11;
    }

    static C1164b0 a(C1171f c1171f, int i10, C1163b c1163b) {
        boolean z10;
        if (!c1171f.e()) {
            return null;
        }
        C1289u a10 = C1288t.b().a();
        if (a10 == null) {
            z10 = true;
        } else {
            if (!a10.F()) {
                return null;
            }
            z10 = a10.I();
            N t10 = c1171f.t(c1163b);
            if (t10 != null) {
                if (!(t10.t() instanceof AbstractC1267c)) {
                    return null;
                }
                AbstractC1267c abstractC1267c = (AbstractC1267c) t10.t();
                if (abstractC1267c.O() && !abstractC1267c.e()) {
                    C1273f b10 = b(t10, abstractC1267c, i10);
                    if (b10 == null) {
                        return null;
                    }
                    t10.E();
                    z10 = b10.y0();
                }
            }
        }
        return new C1164b0(c1171f, i10, c1163b, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C1273f b(N n10, AbstractC1267c abstractC1267c, int i10) {
        int[] u10;
        int[] F10;
        C1273f M10 = abstractC1267c.M();
        if (M10 == null || !M10.I() || ((u10 = M10.u()) != null ? !com.google.android.gms.common.util.b.a(u10, i10) : !((F10 = M10.F()) == null || !com.google.android.gms.common.util.b.a(F10, i10))) || n10.r() >= M10.j()) {
            return null;
        }
        return M10;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        N t10;
        int i10;
        int i11;
        int i12;
        int u10;
        long j10;
        long j11;
        int i13;
        if (this.f9394a.e()) {
            C1289u a10 = C1288t.b().a();
            if ((a10 == null || a10.F()) && (t10 = this.f9394a.t(this.f9396c)) != null && (t10.t() instanceof AbstractC1267c)) {
                AbstractC1267c abstractC1267c = (AbstractC1267c) t10.t();
                int i14 = 0;
                boolean z10 = this.f9397d > 0;
                int E10 = abstractC1267c.E();
                int i15 = 100;
                if (a10 != null) {
                    z10 &= a10.I();
                    int j12 = a10.j();
                    int u11 = a10.u();
                    i10 = a10.y0();
                    if (abstractC1267c.O() && !abstractC1267c.e()) {
                        C1273f b10 = b(t10, abstractC1267c, this.f9395b);
                        if (b10 == null) {
                            return;
                        }
                        boolean z11 = b10.y0() && this.f9397d > 0;
                        u11 = b10.j();
                        z10 = z11;
                    }
                    i12 = j12;
                    i11 = u11;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                C1171f c1171f = this.f9394a;
                if (task.isSuccessful()) {
                    u10 = 0;
                } else {
                    if (!task.l()) {
                        Exception exception = task.getException();
                        if (exception instanceof S6.b) {
                            Status a11 = ((S6.b) exception).a();
                            i15 = a11.u();
                            C2010b j13 = a11.j();
                            if (j13 != null) {
                                u10 = j13.u();
                                i14 = i15;
                            }
                        } else {
                            i14 = 101;
                            u10 = -1;
                        }
                    }
                    i14 = i15;
                    u10 = -1;
                }
                if (z10) {
                    long j14 = this.f9397d;
                    long j15 = this.f9398e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - j15);
                    j11 = currentTimeMillis;
                    j10 = j14;
                } else {
                    j10 = 0;
                    j11 = 0;
                    i13 = -1;
                }
                c1171f.E(new C1285p(this.f9395b, i14, u10, j10, j11, null, null, E10, i13), i10, i12, i11);
            }
        }
    }
}
