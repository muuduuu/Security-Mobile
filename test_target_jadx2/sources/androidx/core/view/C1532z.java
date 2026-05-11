package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1532z {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f16203a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f16204b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f16205c = new HashMap();

    /* renamed from: androidx.core.view.z$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1592i f16206a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1596m f16207b;

        a(AbstractC1592i abstractC1592i, InterfaceC1596m interfaceC1596m) {
            this.f16206a = abstractC1592i;
            this.f16207b = interfaceC1596m;
            abstractC1592i.a(interfaceC1596m);
        }

        void a() {
            this.f16206a.d(this.f16207b);
            this.f16207b = null;
        }
    }

    public C1532z(Runnable runnable) {
        this.f16203a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(B b10, InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
        if (aVar == AbstractC1592i.a.ON_DESTROY) {
            l(b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(AbstractC1592i.b bVar, B b10, InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
        if (aVar == AbstractC1592i.a.upTo(bVar)) {
            c(b10);
            return;
        }
        if (aVar == AbstractC1592i.a.ON_DESTROY) {
            l(b10);
        } else if (aVar == AbstractC1592i.a.downFrom(bVar)) {
            this.f16204b.remove(b10);
            this.f16203a.run();
        }
    }

    public void c(B b10) {
        this.f16204b.add(b10);
        this.f16203a.run();
    }

    public void d(final B b10, InterfaceC1599p interfaceC1599p) {
        c(b10);
        AbstractC1592i lifecycle = interfaceC1599p.getLifecycle();
        a aVar = (a) this.f16205c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16205c.put(b10, new a(lifecycle, new InterfaceC1596m() { // from class: androidx.core.view.y
            @Override // androidx.lifecycle.InterfaceC1596m
            public final void d(InterfaceC1599p interfaceC1599p2, AbstractC1592i.a aVar2) {
                C1532z.this.f(b10, interfaceC1599p2, aVar2);
            }
        }));
    }

    public void e(final B b10, InterfaceC1599p interfaceC1599p, final AbstractC1592i.b bVar) {
        AbstractC1592i lifecycle = interfaceC1599p.getLifecycle();
        a aVar = (a) this.f16205c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16205c.put(b10, new a(lifecycle, new InterfaceC1596m() { // from class: androidx.core.view.x
            @Override // androidx.lifecycle.InterfaceC1596m
            public final void d(InterfaceC1599p interfaceC1599p2, AbstractC1592i.a aVar2) {
                C1532z.this.g(bVar, b10, interfaceC1599p2, aVar2);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f16204b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).c(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator it = this.f16204b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator it = this.f16204b.iterator();
        while (it.hasNext()) {
            if (((B) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator it = this.f16204b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).d(menu);
        }
    }

    public void l(B b10) {
        this.f16204b.remove(b10);
        a aVar = (a) this.f16205c.remove(b10);
        if (aVar != null) {
            aVar.a();
        }
        this.f16203a.run();
    }
}
