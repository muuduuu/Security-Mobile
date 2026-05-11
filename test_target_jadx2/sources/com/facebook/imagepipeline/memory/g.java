package com.facebook.imagepipeline.memory;

import e3.k;
import f3.AbstractC3142a;
import j4.v;
import j4.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: a, reason: collision with root package name */
    private final f f20715a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3142a f20716b;

    /* renamed from: c, reason: collision with root package name */
    private int f20717c;

    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ g(f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? fVar.D() : i10);
    }

    private final void b() {
        if (!AbstractC3142a.x(this.f20716b)) {
            throw new a();
        }
    }

    public final void c(int i10) {
        b();
        AbstractC3142a abstractC3142a = this.f20716b;
        if (abstractC3142a == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.d(abstractC3142a);
        if (i10 <= ((v) abstractC3142a.p()).k()) {
            return;
        }
        Object obj = this.f20715a.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "this.pool[newLength]");
        v vVar = (v) obj;
        AbstractC3142a abstractC3142a2 = this.f20716b;
        if (abstractC3142a2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.d(abstractC3142a2);
        ((v) abstractC3142a2.p()).c(0, vVar, 0, this.f20717c);
        AbstractC3142a abstractC3142a3 = this.f20716b;
        Intrinsics.d(abstractC3142a3);
        abstractC3142a3.close();
        this.f20716b = AbstractC3142a.C(vVar, this.f20715a);
    }

    @Override // e3.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC3142a.n(this.f20716b);
        this.f20716b = null;
        this.f20717c = -1;
        super.close();
    }

    @Override // e3.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public x a() {
        b();
        AbstractC3142a abstractC3142a = this.f20716b;
        if (abstractC3142a != null) {
            return new x(abstractC3142a, this.f20717c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // e3.k
    public int size() {
        return this.f20717c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        write(new byte[]{(byte) i10});
    }

    public g(f pool, int i10) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.f20715a = pool;
        this.f20717c = 0;
        this.f20716b = AbstractC3142a.C(pool.get(i10), pool);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= buffer.length) {
            b();
            c(this.f20717c + i11);
            AbstractC3142a abstractC3142a = this.f20716b;
            if (abstractC3142a != null) {
                ((v) abstractC3142a.p()).b(this.f20717c, buffer, i10, i11);
                this.f20717c += i11;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
