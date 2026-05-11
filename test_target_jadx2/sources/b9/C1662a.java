package b9;

import V6.AbstractC1287s;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import c9.InterfaceC1745a;
import f9.AbstractC3155b;
import java.util.Arrays;

/* renamed from: b9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1662a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1745a f18880a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f18881b;

    /* renamed from: c, reason: collision with root package name */
    private final Point[] f18882c;

    public C1662a(InterfaceC1745a interfaceC1745a, Matrix matrix) {
        this.f18880a = (InterfaceC1745a) AbstractC1287s.m(interfaceC1745a);
        Rect a10 = interfaceC1745a.a();
        if (a10 != null && matrix != null) {
            AbstractC3155b.f(a10, matrix);
        }
        this.f18881b = a10;
        Point[] f10 = interfaceC1745a.f();
        if (f10 != null && matrix != null) {
            AbstractC3155b.c(f10, matrix);
        }
        this.f18882c = f10;
    }

    public Point[] a() {
        return this.f18882c;
    }

    public String b() {
        return this.f18880a.d();
    }

    public int c() {
        int format = this.f18880a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public byte[] d() {
        byte[] e10 = this.f18880a.e();
        if (e10 != null) {
            return Arrays.copyOf(e10, e10.length);
        }
        return null;
    }

    public String e() {
        return this.f18880a.b();
    }

    public int f() {
        return this.f18880a.c();
    }
}
