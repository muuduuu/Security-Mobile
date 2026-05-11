package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.y;

/* loaded from: classes3.dex */
public abstract class i extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36504a;

        static {
            int[] iArr = new int[y.c.values().length];
            f36504a = iArr;
            try {
                iArr[y.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36504a[y.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b extends a.AbstractC0531a {

        /* renamed from: a, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f36505a = kotlin.reflect.jvm.internal.impl.protobuf.d.f36469a;

        protected b() {
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.d i() {
            return this.f36505a;
        }

        public abstract b k(i iVar);

        public final b l(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f36505a = dVar;
            return this;
        }
    }

    public static abstract class c extends b implements q {

        /* renamed from: b, reason: collision with root package name */
        private h f36506b = h.g();

        /* renamed from: c, reason: collision with root package name */
        private boolean f36507c;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public h n() {
            this.f36506b.q();
            this.f36507c = false;
            return this.f36506b;
        }

        private void o() {
            if (this.f36507c) {
                return;
            }
            this.f36506b = this.f36506b.clone();
            this.f36507c = true;
        }

        protected final void p(d dVar) {
            o();
            this.f36506b.r(dVar.f36508b);
        }
    }

    static final class e implements h.b {

        /* renamed from: a, reason: collision with root package name */
        final j.b f36513a;

        /* renamed from: b, reason: collision with root package name */
        final int f36514b;

        /* renamed from: c, reason: collision with root package name */
        final y.b f36515c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f36516d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f36517e;

        e(j.b bVar, int i10, y.b bVar2, boolean z10, boolean z11) {
            this.f36513a = bVar;
            this.f36514b = i10;
            this.f36515c = bVar2;
            this.f36516d = z10;
            this.f36517e = z11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public p.a a(p.a aVar, p pVar) {
            return ((b) aVar).k((i) pVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f36514b - eVar.f36514b;
        }

        public j.b c() {
            return this.f36513a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public int getNumber() {
            return this.f36514b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public boolean isPacked() {
            return this.f36517e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public boolean j() {
            return this.f36516d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public y.b k() {
            return this.f36515c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public y.c l() {
            return this.f36515c.getJavaType();
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final p f36518a;

        /* renamed from: b, reason: collision with root package name */
        final Object f36519b;

        /* renamed from: c, reason: collision with root package name */
        final p f36520c;

        /* renamed from: d, reason: collision with root package name */
        final e f36521d;

        /* renamed from: e, reason: collision with root package name */
        final Class f36522e;

        /* renamed from: f, reason: collision with root package name */
        final Method f36523f;

        f(p pVar, Object obj, p pVar2, e eVar, Class cls) {
            if (pVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.k() == y.b.MESSAGE && pVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f36518a = pVar;
            this.f36519b = obj;
            this.f36520c = pVar2;
            this.f36521d = eVar;
            this.f36522e = cls;
            if (j.a.class.isAssignableFrom(cls)) {
                this.f36523f = i.h(cls, "valueOf", Integer.TYPE);
            } else {
                this.f36523f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f36521d.j()) {
                return e(obj);
            }
            if (this.f36521d.l() != y.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public p b() {
            return this.f36518a;
        }

        public p c() {
            return this.f36520c;
        }

        public int d() {
            return this.f36521d.getNumber();
        }

        Object e(Object obj) {
            return this.f36521d.l() == y.c.ENUM ? i.i(this.f36523f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f36521d.l() == y.c.ENUM ? Integer.valueOf(((j.a) obj).getNumber()) : obj;
        }
    }

    protected i() {
    }

    static Method h(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object i(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f k(p pVar, p pVar2, j.b bVar, int i10, y.b bVar2, boolean z10, Class cls) {
        return new f(pVar, Collections.emptyList(), pVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f l(p pVar, Object obj, p pVar2, j.b bVar, int i10, y.b bVar2, Class cls) {
        return new f(pVar, obj, pVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(h hVar, p pVar, kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, g gVar, int i10) {
        boolean z10;
        boolean z11;
        Object c10;
        p pVar2;
        int b10 = y.b(i10);
        f b11 = gVar.b(pVar, y.a(i10));
        if (b11 != null) {
            if (b10 == h.l(b11.f36521d.k(), false)) {
                z11 = false;
                z10 = false;
            } else {
                e eVar2 = b11.f36521d;
                if (eVar2.f36516d && eVar2.f36515c.isPackable() && b10 == h.l(b11.f36521d.k(), true)) {
                    z10 = true;
                    z11 = false;
                }
            }
            if (!z11) {
                return eVar.O(i10, fVar);
            }
            if (z10) {
                int i11 = eVar.i(eVar.z());
                if (b11.f36521d.k() == y.b.ENUM) {
                    while (eVar.e() > 0) {
                        j.a a10 = b11.f36521d.c().a(eVar.m());
                        if (a10 == null) {
                            return true;
                        }
                        hVar.a(b11.f36521d, b11.f(a10));
                    }
                } else {
                    while (eVar.e() > 0) {
                        hVar.a(b11.f36521d, h.u(eVar, b11.f36521d.k(), false));
                    }
                }
                eVar.h(i11);
            } else {
                int i12 = a.f36504a[b11.f36521d.l().ordinal()];
                if (i12 == 1) {
                    p.a b12 = (b11.f36521d.j() || (pVar2 = (p) hVar.h(b11.f36521d)) == null) ? null : pVar2.b();
                    if (b12 == null) {
                        b12 = b11.c().newBuilderForType();
                    }
                    if (b11.f36521d.k() == y.b.GROUP) {
                        eVar.q(b11.d(), b12, gVar);
                    } else {
                        eVar.u(b12, gVar);
                    }
                    c10 = b12.c();
                } else if (i12 != 2) {
                    c10 = h.u(eVar, b11.f36521d.k(), false);
                } else {
                    int m10 = eVar.m();
                    j.a a11 = b11.f36521d.c().a(m10);
                    if (a11 == null) {
                        fVar.n0(i10);
                        fVar.x0(m10);
                        return true;
                    }
                    c10 = a11;
                }
                if (b11.f36521d.j()) {
                    hVar.a(b11.f36521d, b11.f(c10));
                } else {
                    hVar.v(b11.f36521d, b11.f(c10));
                }
            }
            return true;
        }
        z11 = true;
        z10 = false;
        if (!z11) {
        }
    }

    protected void j() {
    }

    protected boolean m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, g gVar, int i10) {
        return eVar.O(i10, fVar);
    }

    public static abstract class d extends i implements q {

        /* renamed from: b, reason: collision with root package name */
        private final h f36508b;

        protected class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator f36509a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry f36510b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f36511c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
                while (true) {
                    Map.Entry entry = this.f36510b;
                    if (entry == null || ((e) entry.getKey()).getNumber() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f36510b.getKey();
                    if (this.f36511c && eVar.l() == y.c.MESSAGE && !eVar.j()) {
                        fVar.e0(eVar.getNumber(), (p) this.f36510b.getValue());
                    } else {
                        h.z(eVar, this.f36510b.getValue(), fVar);
                    }
                    if (this.f36509a.hasNext()) {
                        this.f36510b = (Map.Entry) this.f36509a.next();
                    } else {
                        this.f36510b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator p10 = d.this.f36508b.p();
                this.f36509a = p10;
                if (p10.hasNext()) {
                    this.f36510b = (Map.Entry) p10.next();
                }
                this.f36511c = z10;
            }
        }

        protected d() {
            this.f36508b = h.t();
        }

        private void w(f fVar) {
            if (fVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i
        protected void j() {
            this.f36508b.q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i
        protected boolean m(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, g gVar, int i10) {
            return i.n(this.f36508b, getDefaultInstanceForType(), eVar, fVar, gVar, i10);
        }

        protected boolean p() {
            return this.f36508b.n();
        }

        protected int q() {
            return this.f36508b.k();
        }

        public final Object r(f fVar) {
            w(fVar);
            Object h10 = this.f36508b.h(fVar.f36521d);
            return h10 == null ? fVar.f36519b : fVar.a(h10);
        }

        public final Object s(f fVar, int i10) {
            w(fVar);
            return fVar.e(this.f36508b.i(fVar.f36521d, i10));
        }

        public final int t(f fVar) {
            w(fVar);
            return this.f36508b.j(fVar.f36521d);
        }

        public final boolean u(f fVar) {
            w(fVar);
            return this.f36508b.m(fVar.f36521d);
        }

        protected a v() {
            return new a(this, false, null);
        }

        protected d(c cVar) {
            this.f36508b = cVar.n();
        }
    }

    protected i(b bVar) {
    }
}
