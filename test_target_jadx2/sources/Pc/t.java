package Pc;

import Kc.m0;
import Kc.n0;
import Zc.InterfaceC1328a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class t extends p implements h, v, Zc.q {
    @Override // Pc.h
    public AnnotatedElement C() {
        Member Y10 = Y();
        Intrinsics.e(Y10, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) Y10;
    }

    @Override // Pc.v
    public int J() {
        return Y().getModifiers();
    }

    @Override // Zc.s
    public boolean O() {
        return Modifier.isAbstract(J());
    }

    @Override // Zc.q
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public l W() {
        Class<?> declaringClass = Y().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return new l(declaringClass);
    }

    public abstract Member Y();

    protected final List Z(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List b10 = C1121c.f7734a.b(Y());
        int size = b10 != null ? b10.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            z a10 = z.f7775a.a(parameterTypes[i10]);
            if (b10 != null) {
                str = (String) CollectionsKt.f0(b10, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + a10 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new B(a10, parameterAnnotations[i10], str, z10 && i10 == AbstractC3574i.D(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Intrinsics.b(Y(), ((t) obj).Y());
    }

    @Override // Zc.t
    public id.f getName() {
        String name = Y().getName();
        id.f o10 = name != null ? id.f.o(name) : null;
        return o10 == null ? id.h.f34195b : o10;
    }

    @Override // Zc.s
    public n0 h() {
        int J10 = J();
        return Modifier.isPublic(J10) ? m0.h.f5580c : Modifier.isPrivate(J10) ? m0.e.f5577c : Modifier.isProtected(J10) ? Modifier.isStatic(J10) ? Nc.c.f6742c : Nc.b.f6741c : Nc.a.f6740c;
    }

    public int hashCode() {
        return Y().hashCode();
    }

    @Override // Zc.InterfaceC1331d
    public /* bridge */ /* synthetic */ Collection i() {
        return i();
    }

    @Override // Zc.s
    public boolean o() {
        return Modifier.isStatic(J());
    }

    @Override // Zc.InterfaceC1331d
    public /* bridge */ /* synthetic */ InterfaceC1328a p(id.c cVar) {
        return p(cVar);
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return false;
    }

    public String toString() {
        return getClass().getName() + ": " + Y();
    }

    @Override // Zc.s
    public boolean u() {
        return Modifier.isFinal(J());
    }

    @Override // Pc.h, Zc.InterfaceC1331d
    public List i() {
        Annotation[] declaredAnnotations;
        List b10;
        AnnotatedElement C10 = C();
        return (C10 == null || (declaredAnnotations = C10.getDeclaredAnnotations()) == null || (b10 = i.b(declaredAnnotations)) == null) ? CollectionsKt.j() : b10;
    }

    @Override // Pc.h, Zc.InterfaceC1331d
    public e p(id.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement C10 = C();
        if (C10 == null || (declaredAnnotations = C10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return i.a(declaredAnnotations, fqName);
    }
}
