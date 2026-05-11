package d9;

import android.graphics.Point;
import android.graphics.Rect;
import c9.InterfaceC1745a;
import r7.C4247v8;

/* loaded from: classes2.dex */
public final class o implements InterfaceC1745a {

    /* renamed from: a, reason: collision with root package name */
    private final C4247v8 f31326a;

    public o(C4247v8 c4247v8) {
        this.f31326a = c4247v8;
    }

    @Override // c9.InterfaceC1745a
    public final Rect a() {
        C4247v8 c4247v8 = this.f31326a;
        if (c4247v8.f40343e == null) {
            return null;
        }
        int i10 = 0;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = c4247v8.f40343e;
            if (i10 >= pointArr.length) {
                return new Rect(i12, i13, i11, i14);
            }
            Point point = pointArr[i10];
            i12 = Math.min(i12, point.x);
            i11 = Math.max(i11, point.x);
            i13 = Math.min(i13, point.y);
            i14 = Math.max(i14, point.y);
            i10++;
        }
    }

    @Override // c9.InterfaceC1745a
    public final String b() {
        return this.f31326a.f40340b;
    }

    @Override // c9.InterfaceC1745a
    public final int c() {
        return this.f31326a.f40342d;
    }

    @Override // c9.InterfaceC1745a
    public final String d() {
        return this.f31326a.f40341c;
    }

    @Override // c9.InterfaceC1745a
    public final byte[] e() {
        return this.f31326a.f40353o;
    }

    @Override // c9.InterfaceC1745a
    public final Point[] f() {
        return this.f31326a.f40343e;
    }

    @Override // c9.InterfaceC1745a
    public final int getFormat() {
        return this.f31326a.f40339a;
    }
}
