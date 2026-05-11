package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2227e5 extends AbstractC2360t4 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2245g5 f24489a;

    /* renamed from: b, reason: collision with root package name */
    protected AbstractC2245g5 f24490b;

    protected AbstractC2227e5(AbstractC2245g5 abstractC2245g5) {
        this.f24489a = abstractC2245g5;
        if (abstractC2245g5.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f24490b = abstractC2245g5.l();
    }

    private static void n(Object obj, Object obj2) {
        P5.a().b(obj.getClass()).b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2360t4
    public final /* bridge */ /* synthetic */ AbstractC2360t4 k(byte[] bArr, int i10, int i11) {
        T4 t42 = T4.f24381c;
        int i12 = P5.f24329d;
        x(bArr, 0, i11, T4.f24381c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2360t4
    public final /* bridge */ /* synthetic */ AbstractC2360t4 l(byte[] bArr, int i10, int i11, T4 t42) {
        x(bArr, 0, i11, t42);
        return this;
    }

    protected final void o() {
        if (this.f24490b.j()) {
            return;
        }
        p();
    }

    protected void p() {
        AbstractC2245g5 l10 = this.f24489a.l();
        n(l10, this.f24490b);
        this.f24490b = l10;
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final AbstractC2227e5 clone() {
        AbstractC2227e5 abstractC2227e5 = (AbstractC2227e5) this.f24489a.B(5, null, null);
        abstractC2227e5.f24490b = m1();
        return abstractC2227e5;
    }

    @Override // com.google.android.gms.internal.measurement.G5
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC2245g5 m1() {
        if (!this.f24490b.j()) {
            return this.f24490b;
        }
        this.f24490b.n();
        return this.f24490b;
    }

    public final AbstractC2245g5 v() {
        AbstractC2245g5 m12 = m1();
        if (m12.i()) {
            return m12;
        }
        throw new C2210c6(m12);
    }

    public final AbstractC2227e5 w(AbstractC2245g5 abstractC2245g5) {
        if (!this.f24489a.equals(abstractC2245g5)) {
            if (!this.f24490b.j()) {
                p();
            }
            n(this.f24490b, abstractC2245g5);
        }
        return this;
    }

    public final AbstractC2227e5 x(byte[] bArr, int i10, int i11, T4 t42) {
        if (!this.f24490b.j()) {
            p();
        }
        try {
            P5.a().b(this.f24490b.getClass()).e(this.f24490b, bArr, 0, i11, new C2396x4(t42));
            return this;
        } catch (C2326p5 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2326p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
