package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class u implements WildcardType, Type {

    /* renamed from: c, reason: collision with root package name */
    public static final a f36740c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final u f36741d = new u(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Type f36742a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f36743b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f36741d;
        }

        private a() {
        }
    }

    public u(Type type, Type type2) {
        this.f36742a = type;
        this.f36743b = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f36743b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h10;
        String h11;
        if (this.f36743b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? super ");
            h11 = t.h(this.f36743b);
            sb2.append(h11);
            return sb2.toString();
        }
        Type type = this.f36742a;
        if (type == null || Intrinsics.b(type, Object.class)) {
            return "?";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("? extends ");
        h10 = t.h(this.f36742a);
        sb3.append(h10);
        return sb3.toString();
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.f36742a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
