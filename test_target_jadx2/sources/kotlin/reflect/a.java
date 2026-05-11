package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class a implements GenericArrayType, Type {

    /* renamed from: a, reason: collision with root package name */
    private final Type f36434a;

    public a(Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f36434a = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && Intrinsics.b(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f36434a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h10;
        StringBuilder sb2 = new StringBuilder();
        h10 = t.h(this.f36434a);
        sb2.append(h10);
        sb2.append("[]");
        return sb2.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
