package J3;

import E3.c;
import V3.d;
import android.graphics.Bitmap;
import android.graphics.Rect;
import c3.AbstractC1721a;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: f, reason: collision with root package name */
    private static final Class f4754f = b.class;

    /* renamed from: a, reason: collision with root package name */
    private final E3.b f4755a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4756b;

    /* renamed from: c, reason: collision with root package name */
    private T3.a f4757c;

    /* renamed from: d, reason: collision with root package name */
    private d f4758d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f4759e;

    public b(E3.b bVar, T3.a aVar, boolean z10) {
        a aVar2 = new a();
        this.f4759e = aVar2;
        this.f4755a = bVar;
        this.f4757c = aVar;
        this.f4756b = z10;
        this.f4758d = new d(aVar, z10, aVar2);
    }

    @Override // E3.c
    public boolean a(int i10, Bitmap bitmap) {
        try {
            this.f4758d.h(i10, bitmap);
            return true;
        } catch (IllegalStateException e10) {
            AbstractC1721a.l(f4754f, e10, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i10));
            return false;
        }
    }

    @Override // E3.c
    public int c() {
        return this.f4757c.getHeight();
    }

    @Override // E3.c
    public void d(Rect rect) {
        T3.a g10 = this.f4757c.g(rect);
        if (g10 != this.f4757c) {
            this.f4757c = g10;
            this.f4758d = new d(g10, this.f4756b, this.f4759e);
        }
    }

    @Override // E3.c
    public int e() {
        return this.f4757c.getWidth();
    }

    class a implements d.b {
        a() {
        }

        @Override // V3.d.b
        public AbstractC3142a b(int i10) {
            return b.this.f4755a.E(i10);
        }

        @Override // V3.d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }
}
