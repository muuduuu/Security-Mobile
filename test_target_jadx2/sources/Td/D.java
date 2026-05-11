package Td;

import Td.v;
import Td.w;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;
import xc.C5142C;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final w f9864a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9865b;

    /* renamed from: c, reason: collision with root package name */
    private final v f9866c;

    /* renamed from: d, reason: collision with root package name */
    private final E f9867d;

    /* renamed from: e, reason: collision with root package name */
    private final w f9868e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f9869f;

    /* renamed from: g, reason: collision with root package name */
    private C1228d f9870g;

    public D(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        w k10 = builder.k();
        if (k10 == null) {
            throw new IllegalStateException("url == null");
        }
        this.f9864a = k10;
        this.f9865b = builder.i();
        this.f9866c = builder.h().f();
        this.f9867d = builder.f();
        this.f9868e = builder.g();
        this.f9869f = kotlin.collections.G.t(builder.j());
    }

    public final E a() {
        return this.f9867d;
    }

    public final C1228d b() {
        C1228d c1228d = this.f9870g;
        if (c1228d != null) {
            return c1228d;
        }
        C1228d a10 = C1228d.f9974n.a(this.f9866c);
        this.f9870g = a10;
        return a10;
    }

    public final w c() {
        return this.f9868e;
    }

    public final Map d() {
        return this.f9869f;
    }

    public final String e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Wd.j.f(this, name);
    }

    public final v f() {
        return this.f9866c;
    }

    public final List g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Wd.j.h(this, name);
    }

    public final boolean h() {
        return this.f9864a.i();
    }

    public final String i() {
        return this.f9865b;
    }

    public final a j() {
        return new a(this);
    }

    public final Object k() {
        return m(C5142C.b(Object.class));
    }

    public final Object l(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m(AbstractC5011a.e(type));
    }

    public final Object m(kotlin.reflect.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return AbstractC5011a.b(type).cast(this.f9869f.get(type));
    }

    public final w n() {
        return this.f9864a;
    }

    public String toString() {
        return Wd.j.m(this);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private w f9871a;

        /* renamed from: b, reason: collision with root package name */
        private String f9872b;

        /* renamed from: c, reason: collision with root package name */
        private v.a f9873c;

        /* renamed from: d, reason: collision with root package name */
        private E f9874d;

        /* renamed from: e, reason: collision with root package name */
        private w f9875e;

        /* renamed from: f, reason: collision with root package name */
        private Map f9876f;

        public a() {
            this.f9876f = kotlin.collections.G.h();
            this.f9872b = "GET";
            this.f9873c = new v.a();
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return Wd.j.b(this, name, value);
        }

        public D b() {
            return new D(this);
        }

        public a c(C1228d cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            return Wd.j.c(this, cacheControl);
        }

        public final a d(w wVar) {
            this.f9875e = wVar;
            return this;
        }

        public a e() {
            return Wd.j.d(this);
        }

        public final E f() {
            return this.f9874d;
        }

        public final w g() {
            return this.f9875e;
        }

        public final v.a h() {
            return this.f9873c;
        }

        public final String i() {
            return this.f9872b;
        }

        public final Map j() {
            return this.f9876f;
        }

        public final w k() {
            return this.f9871a;
        }

        public a l(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return Wd.j.e(this, name, value);
        }

        public a m(v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Wd.j.g(this, headers);
        }

        public a n(String method, E e10) {
            Intrinsics.checkNotNullParameter(method, "method");
            return Wd.j.i(this, method, e10);
        }

        public a o(E body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return Wd.j.j(this, body);
        }

        public a p(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return Wd.j.k(this, name);
        }

        public final void q(E e10) {
            this.f9874d = e10;
        }

        public final void r(v.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.f9873c = aVar;
        }

        public final void s(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f9872b = str;
        }

        public final void t(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f9876f = map;
        }

        public a u(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            return Wd.j.l(this, AbstractC5011a.e(type), obj);
        }

        public a v(Object obj) {
            return Wd.j.l(this, C5142C.b(Object.class), obj);
        }

        public a w(w url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f9871a = url;
            return this;
        }

        public a x(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return w(w.f10220j.c(Wd.j.a(url)));
        }

        public a y(URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            w.b bVar = w.f10220j;
            String url2 = url.toString();
            Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
            return w(bVar.c(url2));
        }

        public a(D request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f9876f = kotlin.collections.G.h();
            this.f9871a = request.n();
            this.f9872b = request.i();
            this.f9874d = request.a();
            this.f9876f = request.d().isEmpty() ? kotlin.collections.G.h() : kotlin.collections.G.w(request.d());
            this.f9873c = request.f().m();
            this.f9875e = request.c();
        }
    }

    public /* synthetic */ D(w wVar, v vVar, String str, E e10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, (i10 & 2) != 0 ? v.f10217b.b(new String[0]) : vVar, (i10 & 4) != 0 ? "\u0000" : str, (i10 & 8) != 0 ? null : e10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D(w url, v headers, String method, E e10) {
        this(r2.n(method, e10));
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        a m10 = new a().w(url).m(headers);
        if (Intrinsics.b(method, "\u0000")) {
            if (e10 != null) {
                method = "POST";
            } else {
                method = "GET";
            }
        }
    }
}
