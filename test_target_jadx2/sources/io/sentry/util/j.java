package io.sentry.util;

import io.sentry.A;
import io.sentry.ILogger;
import io.sentry.util.j;

/* loaded from: classes2.dex */
public abstract class j {

    public interface a {
        void accept(Object obj);
    }

    public interface b {
        void a(Object obj, Class cls);
    }

    public interface c {
        void accept(Object obj);
    }

    public static A e(Object obj) {
        A a10 = new A();
        t(a10, obj);
        return a10;
    }

    public static io.sentry.hints.g f(A a10) {
        return (io.sentry.hints.g) a10.e("sentry:eventDropReason", io.sentry.hints.g.class);
    }

    public static Object g(A a10) {
        return a10.d("sentry:typeCheckHint");
    }

    public static boolean h(A a10, Class cls) {
        return cls.isInstance(g(a10));
    }

    public static boolean i(A a10) {
        return Boolean.TRUE.equals(a10.e("sentry:isFromHybridSdk", Boolean.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, Class cls) {
    }

    public static void n(A a10, Class cls, final c cVar) {
        p(a10, cls, new a() { // from class: io.sentry.util.g
            @Override // io.sentry.util.j.a
            public final void accept(Object obj) {
                j.j(obj);
            }
        }, new b() { // from class: io.sentry.util.h
            @Override // io.sentry.util.j.b
            public final void a(Object obj, Class cls2) {
                j.c.this.accept(obj);
            }
        });
    }

    public static void o(A a10, Class cls, a aVar) {
        p(a10, cls, aVar, new b() { // from class: io.sentry.util.f
            @Override // io.sentry.util.j.b
            public final void a(Object obj, Class cls2) {
                j.l(obj, cls2);
            }
        });
    }

    public static void p(A a10, Class cls, a aVar, b bVar) {
        Object g10 = g(a10);
        if (!h(a10, cls) || g10 == null) {
            bVar.a(g10, cls);
        } else {
            aVar.accept(g10);
        }
    }

    public static void q(A a10, Class cls, final ILogger iLogger, a aVar) {
        p(a10, cls, aVar, new b() { // from class: io.sentry.util.i
            @Override // io.sentry.util.j.b
            public final void a(Object obj, Class cls2) {
                m.a(cls2, obj, ILogger.this);
            }
        });
    }

    public static void r(A a10, io.sentry.hints.g gVar) {
        a10.k("sentry:eventDropReason", gVar);
    }

    public static void s(A a10, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            a10.k("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void t(A a10, Object obj) {
        a10.k("sentry:typeCheckHint", obj);
    }

    public static boolean u(A a10) {
        return !(h(a10, io.sentry.hints.e.class) || h(a10, io.sentry.hints.c.class)) || h(a10, io.sentry.hints.b.class);
    }
}
