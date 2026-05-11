package De;

import De.f;
import Td.G;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;

/* renamed from: De.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0817a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1627a = true;

    /* renamed from: De.a$a, reason: collision with other inner class name */
    static final class C0030a implements De.f {

        /* renamed from: a, reason: collision with root package name */
        static final C0030a f1628a = new C0030a();

        C0030a() {
        }

        @Override // De.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G a(G g10) {
            try {
                return E.a(g10);
            } finally {
                g10.close();
            }
        }
    }

    /* renamed from: De.a$d */
    static final class d implements De.f {

        /* renamed from: a, reason: collision with root package name */
        static final d f1631a = new d();

        d() {
        }

        @Override // De.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: De.a$e */
    static final class e implements De.f {

        /* renamed from: a, reason: collision with root package name */
        static final e f1632a = new e();

        e() {
        }

        @Override // De.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Unit a(G g10) {
            g10.close();
            return Unit.f36324a;
        }
    }

    /* renamed from: De.a$f */
    static final class f implements De.f {

        /* renamed from: a, reason: collision with root package name */
        static final f f1633a = new f();

        f() {
        }

        @Override // De.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(G g10) {
            g10.close();
            return null;
        }
    }

    C0817a() {
    }

    @Override // De.f.a
    public De.f c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, A a10) {
        if (Td.E.class.isAssignableFrom(E.h(type))) {
            return b.f1629a;
        }
        return null;
    }

    @Override // De.f.a
    public De.f d(Type type, Annotation[] annotationArr, A a10) {
        if (type == G.class) {
            return E.l(annotationArr, Fe.w.class) ? c.f1630a : C0030a.f1628a;
        }
        if (type == Void.class) {
            return f.f1633a;
        }
        if (!this.f1627a || type != Unit.class) {
            return null;
        }
        try {
            return e.f1632a;
        } catch (NoClassDefFoundError unused) {
            this.f1627a = false;
            return null;
        }
    }

    /* renamed from: De.a$b */
    static final class b implements De.f {

        /* renamed from: a, reason: collision with root package name */
        static final b f1629a = new b();

        b() {
        }

        @Override // De.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Td.E a(Td.E e10) {
            return e10;
        }
    }

    /* renamed from: De.a$c */
    static final class c implements De.f {

        /* renamed from: a, reason: collision with root package name */
        static final c f1630a = new c();

        c() {
        }

        @Override // De.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G a(G g10) {
            return g10;
        }
    }
}
