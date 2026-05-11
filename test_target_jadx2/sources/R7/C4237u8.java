package r7;

import D7.InterfaceC0782f;
import V6.AbstractC1292x;
import V6.C1285p;
import V6.C1291w;
import V6.C1294z;
import V6.InterfaceC1293y;
import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: r7.u8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4237u8 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1293y f40315a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f40316b = new AtomicLong(-1);

    C4237u8(Context context, String str) {
        this.f40315a = AbstractC1292x.b(context, C1294z.a().b("mlkit:vision").a());
    }

    public static C4237u8 a(Context context) {
        return new C4237u8(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j10, Exception exc) {
        this.f40316b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f40316b.get() != -1 && elapsedRealtime - this.f40316b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f40315a.h(new C1291w(0, Arrays.asList(new C1285p(i10, i11, 0, j10, j11, null, null, 0)))).d(new InterfaceC0782f() { // from class: r7.t8
            @Override // D7.InterfaceC0782f
            public final void b(Exception exc) {
                C4237u8.this.b(elapsedRealtime, exc);
            }
        });
    }
}
