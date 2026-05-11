package Pc;

import Zc.InterfaceC1328a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A extends p implements h, Zc.y {

    /* renamed from: a, reason: collision with root package name */
    private final TypeVariable f7716a;

    public A(TypeVariable typeVariable) {
        Intrinsics.checkNotNullParameter(typeVariable, "typeVariable");
        this.f7716a = typeVariable;
    }

    @Override // Pc.h
    public AnnotatedElement C() {
        TypeVariable typeVariable = this.f7716a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // Zc.y
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f7716a.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new n(type));
        }
        n nVar = (n) CollectionsKt.C0(arrayList);
        return Intrinsics.b(nVar != null ? nVar.X() : null, Object.class) ? CollectionsKt.j() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && Intrinsics.b(this.f7716a, ((A) obj).f7716a);
    }

    @Override // Zc.t
    public id.f getName() {
        id.f o10 = id.f.o(this.f7716a.getName());
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        return o10;
    }

    public int hashCode() {
        return this.f7716a.hashCode();
    }

    @Override // Zc.InterfaceC1331d
    public /* bridge */ /* synthetic */ Collection i() {
        return i();
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
        return A.class.getName() + ": " + this.f7716a;
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
