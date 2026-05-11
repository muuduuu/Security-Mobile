package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C1607y;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.InterfaceC1608z;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.loader.app.a;
import b1.AbstractC1641b;
import j0.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f17178c = false;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1599p f17179a;

    /* renamed from: b, reason: collision with root package name */
    private final c f17180b;

    public static class a extends C1607y implements AbstractC1641b.a {

        /* renamed from: l, reason: collision with root package name */
        private final int f17181l;

        /* renamed from: m, reason: collision with root package name */
        private final Bundle f17182m;

        /* renamed from: n, reason: collision with root package name */
        private final AbstractC1641b f17183n;

        /* renamed from: o, reason: collision with root package name */
        private InterfaceC1599p f17184o;

        /* renamed from: p, reason: collision with root package name */
        private C0295b f17185p;

        /* renamed from: q, reason: collision with root package name */
        private AbstractC1641b f17186q;

        a(int i10, Bundle bundle, AbstractC1641b abstractC1641b, AbstractC1641b abstractC1641b2) {
            this.f17181l = i10;
            this.f17182m = bundle;
            this.f17183n = abstractC1641b;
            this.f17186q = abstractC1641b2;
            abstractC1641b.s(i10, this);
        }

        @Override // b1.AbstractC1641b.a
        public void a(AbstractC1641b abstractC1641b, Object obj) {
            if (b.f17178c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(obj);
                return;
            }
            if (b.f17178c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            m(obj);
        }

        @Override // androidx.lifecycle.AbstractC1604v
        protected void k() {
            if (b.f17178c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f17183n.v();
        }

        @Override // androidx.lifecycle.AbstractC1604v
        protected void l() {
            if (b.f17178c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f17183n.w();
        }

        @Override // androidx.lifecycle.AbstractC1604v
        public void n(InterfaceC1608z interfaceC1608z) {
            super.n(interfaceC1608z);
            this.f17184o = null;
            this.f17185p = null;
        }

        @Override // androidx.lifecycle.C1607y, androidx.lifecycle.AbstractC1604v
        public void o(Object obj) {
            super.o(obj);
            AbstractC1641b abstractC1641b = this.f17186q;
            if (abstractC1641b != null) {
                abstractC1641b.t();
                this.f17186q = null;
            }
        }

        AbstractC1641b p(boolean z10) {
            if (b.f17178c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f17183n.c();
            this.f17183n.b();
            C0295b c0295b = this.f17185p;
            if (c0295b != null) {
                n(c0295b);
                if (z10) {
                    c0295b.d();
                }
            }
            this.f17183n.x(this);
            if ((c0295b == null || c0295b.c()) && !z10) {
                return this.f17183n;
            }
            this.f17183n.t();
            return this.f17186q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f17181l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f17182m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f17183n);
            this.f17183n.h(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f17185p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f17185p);
                this.f17185p.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().e(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        AbstractC1641b r() {
            return this.f17183n;
        }

        void s() {
            InterfaceC1599p interfaceC1599p = this.f17184o;
            C0295b c0295b = this.f17185p;
            if (interfaceC1599p == null || c0295b == null) {
                return;
            }
            super.n(c0295b);
            i(interfaceC1599p, c0295b);
        }

        AbstractC1641b t(InterfaceC1599p interfaceC1599p, a.InterfaceC0294a interfaceC0294a) {
            C0295b c0295b = new C0295b(this.f17183n, interfaceC0294a);
            i(interfaceC1599p, c0295b);
            InterfaceC1608z interfaceC1608z = this.f17185p;
            if (interfaceC1608z != null) {
                n(interfaceC1608z);
            }
            this.f17184o = interfaceC1599p;
            this.f17185p = c0295b;
            return this.f17183n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f17181l);
            sb2.append(" : ");
            Class<?> cls = this.f17183n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0295b implements InterfaceC1608z {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1641b f17187a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0294a f17188b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f17189c = false;

        C0295b(AbstractC1641b abstractC1641b, a.InterfaceC0294a interfaceC0294a) {
            this.f17187a = abstractC1641b;
            this.f17188b = interfaceC0294a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f17189c);
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        public void b(Object obj) {
            if (b.f17178c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f17187a + ": " + this.f17187a.e(obj));
            }
            this.f17189c = true;
            this.f17188b.c(this.f17187a, obj);
        }

        boolean c() {
            return this.f17189c;
        }

        void d() {
            if (this.f17189c) {
                if (b.f17178c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f17187a);
                }
                this.f17188b.b(this.f17187a);
            }
        }

        public String toString() {
            return this.f17188b.toString();
        }
    }

    static class c extends S {

        /* renamed from: d, reason: collision with root package name */
        private static final V.c f17190d = new a();

        /* renamed from: b, reason: collision with root package name */
        private j f17191b = new j();

        /* renamed from: c, reason: collision with root package name */
        private boolean f17192c = false;

        static class a implements V.c {
            a() {
            }

            @Override // androidx.lifecycle.V.c
            public S a(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(W w10) {
            return (c) new V(w10, f17190d).a(c.class);
        }

        @Override // androidx.lifecycle.S
        protected void d() {
            super.d();
            int o10 = this.f17191b.o();
            for (int i10 = 0; i10 < o10; i10++) {
                ((a) this.f17191b.p(i10)).p(true);
            }
            this.f17191b.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f17191b.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f17191b.o(); i10++) {
                    a aVar = (a) this.f17191b.p(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f17191b.m(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.f17192c = false;
        }

        a h(int i10) {
            return (a) this.f17191b.i(i10);
        }

        boolean i() {
            return this.f17192c;
        }

        void j() {
            int o10 = this.f17191b.o();
            for (int i10 = 0; i10 < o10; i10++) {
                ((a) this.f17191b.p(i10)).s();
            }
        }

        void k(int i10, a aVar) {
            this.f17191b.n(i10, aVar);
        }

        void l() {
            this.f17192c = true;
        }
    }

    b(InterfaceC1599p interfaceC1599p, W w10) {
        this.f17179a = interfaceC1599p;
        this.f17180b = c.g(w10);
    }

    private AbstractC1641b e(int i10, Bundle bundle, a.InterfaceC0294a interfaceC0294a, AbstractC1641b abstractC1641b) {
        try {
            this.f17180b.l();
            AbstractC1641b a10 = interfaceC0294a.a(i10, bundle);
            if (a10 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (a10.getClass().isMemberClass() && !Modifier.isStatic(a10.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a10);
            }
            a aVar = new a(i10, bundle, a10, abstractC1641b);
            if (f17178c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f17180b.k(i10, aVar);
            this.f17180b.f();
            return aVar.t(this.f17179a, interfaceC0294a);
        } catch (Throwable th) {
            this.f17180b.f();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f17180b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public AbstractC1641b c(int i10, Bundle bundle, a.InterfaceC0294a interfaceC0294a) {
        if (this.f17180b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a h10 = this.f17180b.h(i10);
        if (f17178c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (h10 == null) {
            return e(i10, bundle, interfaceC0294a, null);
        }
        if (f17178c) {
            Log.v("LoaderManager", "  Re-using existing loader " + h10);
        }
        return h10.t(this.f17179a, interfaceC0294a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f17180b.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f17179a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
