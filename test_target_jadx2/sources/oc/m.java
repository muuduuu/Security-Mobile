package Oc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f7298a = new m();

    private m() {
    }

    public final String a(Constructor constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            Intrinsics.d(cls);
            sb2.append(Pc.d.b(cls));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final String b(Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return Pc.d.b(type);
    }

    public final String c(Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        for (Class<?> cls : parameterTypes) {
            Intrinsics.d(cls);
            sb2.append(Pc.d.b(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(Pc.d.b(returnType));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
