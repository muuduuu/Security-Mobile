package Pc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends t implements Zc.k {

    /* renamed from: a, reason: collision with root package name */
    private final Constructor f7765a;

    public o(Constructor member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f7765a = member;
    }

    @Override // Pc.t
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Constructor Y() {
        return this.f7765a;
    }

    @Override // Zc.k
    public List m() {
        Type[] genericParameterTypes = Y().getGenericParameterTypes();
        Intrinsics.d(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return CollectionsKt.j();
        }
        Class declaringClass = Y().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) AbstractC3574i.m(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = Y().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + Y());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            Intrinsics.d(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) AbstractC3574i.m(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        Intrinsics.d(genericParameterTypes);
        Intrinsics.d(parameterAnnotations);
        return Z(genericParameterTypes, parameterAnnotations, Y().isVarArgs());
    }

    @Override // Zc.z
    public List n() {
        TypeVariable[] typeParameters = Y().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new A(typeVariable));
        }
        return arrayList;
    }
}
