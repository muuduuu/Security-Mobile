package Q0;

import Q0.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: A, reason: collision with root package name */
    private g f7883A;

    /* renamed from: B, reason: collision with root package name */
    private float f7884B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f7885C;

    public f(e eVar) {
        super(eVar);
        this.f7883A = null;
        this.f7884B = Float.MAX_VALUE;
        this.f7885C = false;
    }

    private void s() {
        g gVar = this.f7883A;
        if (gVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a10 = gVar.a();
        if (a10 > this.f7869g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (a10 < this.f7870h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // Q0.b
    public void c() {
        super.c();
        float f10 = this.f7884B;
        if (f10 != Float.MAX_VALUE) {
            g gVar = this.f7883A;
            if (gVar == null) {
                this.f7883A = new g(f10);
            } else {
                gVar.e(f10);
            }
            this.f7884B = Float.MAX_VALUE;
        }
    }

    @Override // Q0.b
    public void l() {
        s();
        this.f7883A.g(f());
        super.l();
    }

    @Override // Q0.b
    boolean n(long j10) {
        if (this.f7885C) {
            float f10 = this.f7884B;
            if (f10 != Float.MAX_VALUE) {
                this.f7883A.e(f10);
                this.f7884B = Float.MAX_VALUE;
            }
            this.f7864b = this.f7883A.a();
            this.f7863a = 0.0f;
            this.f7885C = false;
            return true;
        }
        if (this.f7884B != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            b.p h10 = this.f7883A.h(this.f7864b, this.f7863a, j11);
            this.f7883A.e(this.f7884B);
            this.f7884B = Float.MAX_VALUE;
            b.p h11 = this.f7883A.h(h10.f7877a, h10.f7878b, j11);
            this.f7864b = h11.f7877a;
            this.f7863a = h11.f7878b;
        } else {
            b.p h12 = this.f7883A.h(this.f7864b, this.f7863a, j10);
            this.f7864b = h12.f7877a;
            this.f7863a = h12.f7878b;
        }
        float max = Math.max(this.f7864b, this.f7870h);
        this.f7864b = max;
        float min = Math.min(max, this.f7869g);
        this.f7864b = min;
        if (!r(min, this.f7863a)) {
            return false;
        }
        this.f7864b = this.f7883A.a();
        this.f7863a = 0.0f;
        return true;
    }

    public void o(float f10) {
        if (g()) {
            this.f7884B = f10;
            return;
        }
        if (this.f7883A == null) {
            this.f7883A = new g(f10);
        }
        this.f7883A.e(f10);
        l();
    }

    public boolean p() {
        return this.f7883A.f7887b > 0.0d;
    }

    public g q() {
        return this.f7883A;
    }

    boolean r(float f10, float f11) {
        return this.f7883A.c(f10, f11);
    }

    public f t(g gVar) {
        this.f7883A = gVar;
        return this;
    }

    public void u() {
        if (!p()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f7868f) {
            this.f7885C = true;
        }
    }

    public f(e eVar, float f10) {
        super(eVar);
        this.f7883A = null;
        this.f7884B = Float.MAX_VALUE;
        this.f7885C = false;
        this.f7883A = new g(f10);
    }

    public f(Object obj, d dVar) {
        super(obj, dVar);
        this.f7883A = null;
        this.f7884B = Float.MAX_VALUE;
        this.f7885C = false;
    }
}
