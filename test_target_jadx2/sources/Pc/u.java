package Pc;

import Pc.z;
import Zc.InterfaceC1329b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u extends t implements Zc.r {

    /* renamed from: a, reason: collision with root package name */
    private final Method f7769a;

    public u(Method member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f7769a = member;
    }

    @Override // Zc.r
    public boolean S() {
        return y() != null;
    }

    @Override // Pc.t
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Method Y() {
        return this.f7769a;
    }

    @Override // Zc.r
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public z g() {
        z.a aVar = z.f7775a;
        Type genericReturnType = Y().getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // Zc.r
    public List m() {
        Type[] genericParameterTypes = Y().getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = Y().getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
        return Z(genericParameterTypes, parameterAnnotations, Y().isVarArgs());
    }

    @Override // Zc.z
    public List n() {
        TypeVariable<Method>[] typeParameters = Y().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new A(typeVariable));
        }
        return arrayList;
    }

    @Override // Zc.r
    public InterfaceC1329b y() {
        Object defaultValue = Y().getDefaultValue();
        if (defaultValue != null) {
            return f.f7745b.a(defaultValue, null);
        }
        return null;
    }
}
