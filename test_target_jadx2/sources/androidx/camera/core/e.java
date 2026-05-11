package androidx.camera.core;

import A.Y;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e implements n {

    /* renamed from: b, reason: collision with root package name */
    protected final n f14357b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f14356a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Set f14358c = new HashSet();

    public interface a {
        void b(n nVar);
    }

    protected e(n nVar) {
        this.f14357b = nVar;
    }

    @Override // androidx.camera.core.n
    public Image E1() {
        return this.f14357b.E1();
    }

    @Override // androidx.camera.core.n
    public Y G() {
        return this.f14357b.G();
    }

    @Override // androidx.camera.core.n
    public n.a[] S() {
        return this.f14357b.S();
    }

    public void a(a aVar) {
        synchronized (this.f14356a) {
            this.f14358c.add(aVar);
        }
    }

    protected void b() {
        HashSet hashSet;
        synchronized (this.f14356a) {
            hashSet = new HashSet(this.f14358c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this);
        }
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        this.f14357b.close();
        b();
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        return this.f14357b.getFormat();
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        return this.f14357b.getHeight();
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        return this.f14357b.getWidth();
    }

    @Override // androidx.camera.core.n
    public void j1(Rect rect) {
        this.f14357b.j1(rect);
    }
}
