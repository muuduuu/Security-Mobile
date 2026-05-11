package D3;

import D3.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private a f1206a;

    /* renamed from: b, reason: collision with root package name */
    private int f1207b = -1;

    /* renamed from: c, reason: collision with root package name */
    private ColorFilter f1208c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f1209d;

    public b(a aVar) {
        this.f1206a = aVar;
    }

    @Override // D3.d
    public int a() {
        a aVar = this.f1206a;
        if (aVar == null) {
            return 0;
        }
        return aVar.a();
    }

    @Override // D3.d
    public int b() {
        a aVar = this.f1206a;
        if (aVar == null) {
            return 0;
        }
        return aVar.b();
    }

    @Override // D3.a
    public int c() {
        a aVar = this.f1206a;
        if (aVar == null) {
            return -1;
        }
        return aVar.c();
    }

    @Override // D3.a
    public void clear() {
        a aVar = this.f1206a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // D3.a
    public void d(Rect rect) {
        a aVar = this.f1206a;
        if (aVar != null) {
            aVar.d(rect);
        }
        this.f1209d = rect;
    }

    @Override // D3.a
    public int e() {
        a aVar = this.f1206a;
        if (aVar == null) {
            return -1;
        }
        return aVar.e();
    }

    @Override // D3.a
    public void g(ColorFilter colorFilter) {
        a aVar = this.f1206a;
        if (aVar != null) {
            aVar.g(colorFilter);
        }
        this.f1208c = colorFilter;
    }

    @Override // D3.d
    public int h() {
        a aVar = this.f1206a;
        if (aVar == null) {
            return 0;
        }
        return aVar.h();
    }

    @Override // D3.d
    public int i() {
        a aVar = this.f1206a;
        if (aVar == null) {
            return 0;
        }
        return aVar.i();
    }

    @Override // D3.a
    public void j(a.InterfaceC0022a interfaceC0022a) {
        a aVar = this.f1206a;
        if (aVar != null) {
            aVar.j(interfaceC0022a);
        }
    }

    @Override // D3.d
    public int k(int i10) {
        a aVar = this.f1206a;
        if (aVar == null) {
            return 0;
        }
        return aVar.k(i10);
    }

    @Override // D3.a
    public void l(int i10) {
        a aVar = this.f1206a;
        if (aVar != null) {
            aVar.l(i10);
        }
        this.f1207b = i10;
    }

    @Override // D3.d
    public int m() {
        a aVar = this.f1206a;
        if (aVar == null) {
            return 0;
        }
        return aVar.m();
    }

    @Override // D3.a
    public boolean n(Drawable drawable, Canvas canvas, int i10) {
        a aVar = this.f1206a;
        return aVar != null && aVar.n(drawable, canvas, i10);
    }
}
