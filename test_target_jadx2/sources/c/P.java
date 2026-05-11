package C;

import A.W;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class P {

    /* renamed from: a, reason: collision with root package name */
    private final int f613a;

    /* renamed from: b, reason: collision with root package name */
    private final W.g f614b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f615c;

    /* renamed from: d, reason: collision with root package name */
    private final int f616d;

    /* renamed from: e, reason: collision with root package name */
    private final int f617e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f618f;

    /* renamed from: g, reason: collision with root package name */
    private final V f619g;

    /* renamed from: h, reason: collision with root package name */
    private final String f620h;

    /* renamed from: j, reason: collision with root package name */
    final h8.d f622j;

    /* renamed from: k, reason: collision with root package name */
    private int f623k = -1;

    /* renamed from: i, reason: collision with root package name */
    private final List f621i = new ArrayList();

    P(androidx.camera.core.impl.S s10, W.g gVar, Rect rect, int i10, int i11, Matrix matrix, V v10, h8.d dVar, int i12) {
        this.f613a = i12;
        this.f614b = gVar;
        this.f617e = i11;
        this.f616d = i10;
        this.f615c = rect;
        this.f618f = matrix;
        this.f619g = v10;
        this.f620h = String.valueOf(s10.hashCode());
        List a10 = s10.a();
        Objects.requireNonNull(a10);
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            this.f621i.add(Integer.valueOf(((androidx.camera.core.impl.U) it.next()).getId()));
        }
        this.f622j = dVar;
    }

    h8.d a() {
        return this.f622j;
    }

    Rect b() {
        return this.f615c;
    }

    int c() {
        return this.f617e;
    }

    W.g d() {
        return this.f614b;
    }

    public int e() {
        return this.f613a;
    }

    int f() {
        return this.f616d;
    }

    Matrix g() {
        return this.f618f;
    }

    List h() {
        return this.f621i;
    }

    String i() {
        return this.f620h;
    }

    boolean j() {
        return this.f619g.a();
    }

    boolean k() {
        return d() == null;
    }

    void l(A.X x10) {
        this.f619g.d(x10);
    }

    void m(int i10) {
        if (this.f623k != i10) {
            this.f623k = i10;
            this.f619g.onCaptureProcessProgressed(i10);
        }
    }

    void n() {
        this.f619g.onCaptureStarted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(W.h hVar) {
        this.f619g.f(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(androidx.camera.core.n nVar) {
        this.f619g.e(nVar);
    }

    void q() {
        if (this.f623k != -1) {
            m(100);
        }
        this.f619g.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Bitmap bitmap) {
        this.f619g.onPostviewBitmapAvailable(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(A.X x10) {
        this.f619g.c(x10);
    }
}
