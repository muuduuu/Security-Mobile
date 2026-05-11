package f3;

import android.graphics.Bitmap;
import b3.AbstractC1647b;
import b3.l;
import c3.AbstractC1721a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3142a implements Cloneable, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private static int f32864f;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f32867a = false;

    /* renamed from: b, reason: collision with root package name */
    protected final i f32868b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f32869c;

    /* renamed from: d, reason: collision with root package name */
    protected final Throwable f32870d;

    /* renamed from: e, reason: collision with root package name */
    private static Class f32863e = AbstractC3142a.class;

    /* renamed from: g, reason: collision with root package name */
    private static final h f32865g = new C0481a();

    /* renamed from: h, reason: collision with root package name */
    private static final c f32866h = new b();

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    class C0481a implements h {
        C0481a() {
        }

        @Override // f3.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Closeable closeable) {
            try {
                AbstractC1647b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f3.a$b */
    class b implements c {
        b() {
        }

        @Override // f3.AbstractC3142a.c
        public void a(i iVar, Throwable th) {
            Object f10 = iVar.f();
            AbstractC1721a.H(AbstractC3142a.f32863e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), f10 == null ? null : f10.getClass().getName());
        }

        @Override // f3.AbstractC3142a.c
        public boolean b() {
            return false;
        }
    }

    /* renamed from: f3.a$c */
    public interface c {
        void a(i iVar, Throwable th);

        boolean b();
    }

    protected AbstractC3142a(i iVar, c cVar, Throwable th) {
        this.f32868b = (i) l.g(iVar);
        iVar.b();
        this.f32869c = cVar;
        this.f32870d = th;
    }

    public static AbstractC3142a C(Object obj, h hVar) {
        return H(obj, hVar, f32866h);
    }

    public static AbstractC3142a H(Object obj, h hVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return K(obj, hVar, cVar, cVar.b() ? new Throwable() : null);
    }

    public static AbstractC3142a K(Object obj, h hVar, c cVar, Throwable th) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof InterfaceC3145d)) {
            int i10 = f32864f;
            if (i10 == 1) {
                return new C3144c(obj, hVar, cVar, th);
            }
            if (i10 == 2) {
                return new g(obj, hVar, cVar, th);
            }
            if (i10 == 3) {
                return new e(obj);
            }
        }
        return new C3143b(obj, hVar, cVar, th);
    }

    public static AbstractC3142a i(AbstractC3142a abstractC3142a) {
        if (abstractC3142a != null) {
            return abstractC3142a.d();
        }
        return null;
    }

    public static List l(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(i((AbstractC3142a) it.next()));
        }
        return arrayList;
    }

    public static void n(AbstractC3142a abstractC3142a) {
        if (abstractC3142a != null) {
            abstractC3142a.close();
        }
    }

    public static void o(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                n((AbstractC3142a) it.next());
            }
        }
    }

    public static boolean x(AbstractC3142a abstractC3142a) {
        return abstractC3142a != null && abstractC3142a.s();
    }

    public static AbstractC3142a y(Closeable closeable) {
        return C(closeable, f32865g);
    }

    public static AbstractC3142a z(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return K(closeable, f32865g, cVar, cVar.b() ? new Throwable() : null);
    }

    /* renamed from: b */
    public abstract AbstractC3142a clone();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f32867a) {
                    return;
                }
                this.f32867a = true;
                this.f32868b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized AbstractC3142a d() {
        if (!s()) {
            return null;
        }
        return clone();
    }

    public synchronized Object p() {
        l.i(!this.f32867a);
        return l.g(this.f32868b.f());
    }

    public int q() {
        if (s()) {
            return System.identityHashCode(this.f32868b.f());
        }
        return 0;
    }

    public synchronized boolean s() {
        return !this.f32867a;
    }

    protected AbstractC3142a(Object obj, h hVar, c cVar, Throwable th, boolean z10) {
        this.f32868b = new i(obj, hVar, z10);
        this.f32869c = cVar;
        this.f32870d = th;
    }
}
