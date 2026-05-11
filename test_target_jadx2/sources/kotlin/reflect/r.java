package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class r implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name */
    private final Class f36733a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f36734b;

    /* renamed from: c, reason: collision with root package name */
    private final Type[] f36735c;

    /* synthetic */ class a extends xc.j implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f36736j = new a();

        a() {
            super(1, t.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p02) {
            String h10;
            Intrinsics.checkNotNullParameter(p02, "p0");
            h10 = t.h(p02);
            return h10;
        }
    }

    public r(Class rawType, Type type, List typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f36733a = rawType;
        this.f36734b = type;
        this.f36735c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.b(this.f36733a, parameterizedType.getRawType()) && Intrinsics.b(this.f36734b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f36735c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f36734b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f36733a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h10;
        String h11;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f36734b;
        if (type != null) {
            h11 = t.h(type);
            sb2.append(h11);
            sb2.append("$");
            sb2.append(this.f36733a.getSimpleName());
        } else {
            h10 = t.h(this.f36733a);
            sb2.append(h10);
        }
        Type[] typeArr = this.f36735c;
        if (!(typeArr.length == 0)) {
            AbstractC3574i.M(typeArr, sb2, null, "<", ">", 0, null, a.f36736j, 50, null);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public int hashCode() {
        int hashCode = this.f36733a.hashCode();
        Type type = this.f36734b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
