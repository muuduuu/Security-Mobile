package androidx.camera.core.impl;

import A.AbstractC0700h0;
import A.u0;
import androidx.camera.core.impl.Q;

/* loaded from: classes.dex */
public final class K implements U0 {

    /* renamed from: d, reason: collision with root package name */
    private final A.u0 f14420d;

    class a implements A.u0 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f14421d;

        a(long j10) {
            this.f14421d = j10;
        }

        @Override // A.u0
        public long c() {
            return this.f14421d;
        }

        @Override // A.u0
        public u0.c f(u0.b bVar) {
            return bVar.c() == 1 ? u0.c.f238d : u0.c.f239e;
        }
    }

    public static final class b implements U0 {

        /* renamed from: d, reason: collision with root package name */
        private final A.u0 f14423d;

        public b(long j10) {
            this.f14423d = new K(j10);
        }

        @Override // A.u0
        public long c() {
            return this.f14423d.c();
        }

        @Override // androidx.camera.core.impl.U0
        public A.u0 e(long j10) {
            return new b(j10);
        }

        @Override // A.u0
        public u0.c f(u0.b bVar) {
            if (this.f14423d.f(bVar).d()) {
                return u0.c.f239e;
            }
            Throwable d10 = bVar.d();
            if (d10 instanceof Q.b) {
                AbstractC0700h0.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((Q.b) d10).a() > 0) {
                    return u0.c.f241g;
                }
            }
            return u0.c.f238d;
        }
    }

    public K(long j10) {
        this.f14420d = new f1(j10, new a(j10));
    }

    @Override // A.u0
    public long c() {
        return this.f14420d.c();
    }

    @Override // androidx.camera.core.impl.U0
    public A.u0 e(long j10) {
        return new K(j10);
    }

    @Override // A.u0
    public u0.c f(u0.b bVar) {
        return this.f14420d.f(bVar);
    }
}
