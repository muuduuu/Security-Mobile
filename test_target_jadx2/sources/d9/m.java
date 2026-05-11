package d9;

import android.graphics.Point;
import android.graphics.Rect;
import c9.InterfaceC1745a;
import r7.X8;

/* loaded from: classes2.dex */
public final class m implements InterfaceC1745a {

    /* renamed from: a, reason: collision with root package name */
    private final X8 f31317a;

    public m(X8 x82) {
        this.f31317a = x82;
    }

    @Override // c9.InterfaceC1745a
    public final Rect a() {
        Point[] Z02 = this.f31317a.Z0();
        if (Z02 == null) {
            return null;
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        for (Point point : Z02) {
            i11 = Math.min(i11, point.x);
            i10 = Math.max(i10, point.x);
            i12 = Math.min(i12, point.y);
            i13 = Math.max(i13, point.y);
        }
        return new Rect(i11, i12, i10, i13);
    }

    @Override // c9.InterfaceC1745a
    public final String b() {
        return this.f31317a.I();
    }

    @Override // c9.InterfaceC1745a
    public final int c() {
        return this.f31317a.u();
    }

    @Override // c9.InterfaceC1745a
    public final String d() {
        return this.f31317a.F();
    }

    @Override // c9.InterfaceC1745a
    public final byte[] e() {
        return this.f31317a.y0();
    }

    @Override // c9.InterfaceC1745a
    public final Point[] f() {
        return this.f31317a.Z0();
    }

    @Override // c9.InterfaceC1745a
    public final int getFormat() {
        return this.f31317a.j();
    }
}
