package Dc;

import Ec.A;
import Ec.AbstractC0831j;
import Ec.L;
import Ec.y;
import Fc.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.g;
import kotlin.reflect.h;
import kotlin.reflect.k;
import kotlin.reflect.o;
import kotlin.reflect.t;

/* loaded from: classes3.dex */
public abstract class c {
    public static final Constructor a(g gVar) {
        e L10;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC0831j b10 = L.b(gVar);
        Member a10 = (b10 == null || (L10 = b10.L()) == null) ? null : L10.a();
        if (a10 instanceof Constructor) {
            return (Constructor) a10;
        }
        return null;
    }

    public static final Field b(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        y d10 = L.d(kVar);
        if (d10 != null) {
            return d10.X();
        }
        return null;
    }

    public static final Method c(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return d(kVar.d());
    }

    public static final Method d(g gVar) {
        e L10;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC0831j b10 = L.b(gVar);
        Member a10 = (b10 == null || (L10 = b10.L()) == null) ? null : L10.a();
        if (a10 instanceof Method) {
            return (Method) a10;
        }
        return null;
    }

    public static final Method e(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return d(hVar.l());
    }

    public static final Type f(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Type s10 = ((A) oVar).s();
        return s10 == null ? t.f(oVar) : s10;
    }
}
