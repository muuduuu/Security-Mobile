package Ec;

import java.lang.reflect.Method;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public abstract class J {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1952a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Class cls) {
            Intrinsics.d(cls);
            return Pc.d.b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb2.append(AbstractC3574i.S(parameterTypes, BuildConfig.FLAVOR, "(", ")", 0, null, a.f1952a, 24, null));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(Pc.d.b(returnType));
        return sb2.toString();
    }
}
