package xc;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.AbstractC3574i;
import kotlin.reflect.KTypeProjection;
import org.conscrypt.BuildConfig;

/* renamed from: xc.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5142C {

    /* renamed from: a, reason: collision with root package name */
    private static final C5143D f44963a;

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.d[] f44964b;

    static {
        C5143D c5143d = null;
        try {
            c5143d = (C5143D) Ec.G.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c5143d == null) {
            c5143d = new C5143D();
        }
        f44963a = c5143d;
        f44964b = new kotlin.reflect.d[0];
    }

    public static kotlin.reflect.g a(AbstractC5156i abstractC5156i) {
        return f44963a.a(abstractC5156i);
    }

    public static kotlin.reflect.d b(Class cls) {
        return f44963a.b(cls);
    }

    public static kotlin.reflect.f c(Class cls) {
        return f44963a.c(cls, BuildConfig.FLAVOR);
    }

    public static kotlin.reflect.f d(Class cls, String str) {
        return f44963a.c(cls, str);
    }

    public static kotlin.reflect.i e(n nVar) {
        return f44963a.d(nVar);
    }

    public static kotlin.reflect.o f(Class cls) {
        return f44963a.j(b(cls), Collections.emptyList(), true);
    }

    public static kotlin.reflect.o g(Class cls, KTypeProjection kTypeProjection) {
        return f44963a.j(b(cls), Collections.singletonList(kTypeProjection), true);
    }

    public static kotlin.reflect.o h(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f44963a.j(b(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    public static kotlin.reflect.o i(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f44963a.j(b(cls), AbstractC3574i.m0(kTypeProjectionArr), true);
    }

    public static kotlin.reflect.l j(r rVar) {
        return f44963a.e(rVar);
    }

    public static kotlin.reflect.m k(t tVar) {
        return f44963a.f(tVar);
    }

    public static kotlin.reflect.n l(v vVar) {
        return f44963a.g(vVar);
    }

    public static String m(InterfaceC5155h interfaceC5155h) {
        return f44963a.h(interfaceC5155h);
    }

    public static String n(m mVar) {
        return f44963a.i(mVar);
    }

    public static kotlin.reflect.o o(Class cls) {
        return f44963a.j(b(cls), Collections.emptyList(), false);
    }

    public static kotlin.reflect.o p(Class cls, KTypeProjection kTypeProjection) {
        return f44963a.j(b(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static kotlin.reflect.o q(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f44963a.j(b(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }
}
