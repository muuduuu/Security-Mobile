package androidx.viewpager2.widget;

import androidx.viewpager2.widget.f;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends f.i {

    /* renamed from: a, reason: collision with root package name */
    private final List f18020a;

    b(int i10) {
        this.f18020a = new ArrayList(i10);
    }

    private void e(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.f.i
    public void a(int i10) {
        try {
            Iterator it = this.f18020a.iterator();
            while (it.hasNext()) {
                ((f.i) it.next()).a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void b(int i10, float f10, int i11) {
        try {
            Iterator it = this.f18020a.iterator();
            while (it.hasNext()) {
                ((f.i) it.next()).b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void c(int i10) {
        try {
            Iterator it = this.f18020a.iterator();
            while (it.hasNext()) {
                ((f.i) it.next()).c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            e(e10);
        }
    }

    void d(f.i iVar) {
        this.f18020a.add(iVar);
    }
}
