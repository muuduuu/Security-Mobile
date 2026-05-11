package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1508m0;
import androidx.core.view.C1504k0;
import androidx.core.view.InterfaceC1506l0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f13379c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC1506l0 f13380d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13381e;

    /* renamed from: b, reason: collision with root package name */
    private long f13378b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC1508m0 f13382f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f13377a = new ArrayList();

    class a extends AbstractC1508m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f13383a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f13384b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC1506l0
        public void b(View view) {
            int i10 = this.f13384b + 1;
            this.f13384b = i10;
            if (i10 == h.this.f13377a.size()) {
                InterfaceC1506l0 interfaceC1506l0 = h.this.f13380d;
                if (interfaceC1506l0 != null) {
                    interfaceC1506l0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.AbstractC1508m0, androidx.core.view.InterfaceC1506l0
        public void c(View view) {
            if (this.f13383a) {
                return;
            }
            this.f13383a = true;
            InterfaceC1506l0 interfaceC1506l0 = h.this.f13380d;
            if (interfaceC1506l0 != null) {
                interfaceC1506l0.c(null);
            }
        }

        void d() {
            this.f13384b = 0;
            this.f13383a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f13381e) {
            Iterator it = this.f13377a.iterator();
            while (it.hasNext()) {
                ((C1504k0) it.next()).c();
            }
            this.f13381e = false;
        }
    }

    void b() {
        this.f13381e = false;
    }

    public h c(C1504k0 c1504k0) {
        if (!this.f13381e) {
            this.f13377a.add(c1504k0);
        }
        return this;
    }

    public h d(C1504k0 c1504k0, C1504k0 c1504k02) {
        this.f13377a.add(c1504k0);
        c1504k02.j(c1504k0.d());
        this.f13377a.add(c1504k02);
        return this;
    }

    public h e(long j10) {
        if (!this.f13381e) {
            this.f13378b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f13381e) {
            this.f13379c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC1506l0 interfaceC1506l0) {
        if (!this.f13381e) {
            this.f13380d = interfaceC1506l0;
        }
        return this;
    }

    public void h() {
        if (this.f13381e) {
            return;
        }
        Iterator it = this.f13377a.iterator();
        while (it.hasNext()) {
            C1504k0 c1504k0 = (C1504k0) it.next();
            long j10 = this.f13378b;
            if (j10 >= 0) {
                c1504k0.f(j10);
            }
            Interpolator interpolator = this.f13379c;
            if (interpolator != null) {
                c1504k0.g(interpolator);
            }
            if (this.f13380d != null) {
                c1504k0.h(this.f13382f);
            }
            c1504k0.l();
        }
        this.f13381e = true;
    }
}
