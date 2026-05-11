package e5;

import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3084f {

    /* renamed from: g, reason: collision with root package name */
    public static final a f32229g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f32230a;

    /* renamed from: b, reason: collision with root package name */
    private final float f32231b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f32232c;

    /* renamed from: d, reason: collision with root package name */
    private final Float f32233d;

    /* renamed from: e, reason: collision with root package name */
    private final Float f32234e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f32235f;

    /* renamed from: e5.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3084f a(ReadableMap boxShadow) {
            Intrinsics.checkNotNullParameter(boxShadow, "boxShadow");
            if (boxShadow.hasKey("offsetX") && boxShadow.hasKey("offsetY")) {
                return new C3084f((float) boxShadow.getDouble("offsetX"), (float) boxShadow.getDouble("offsetY"), boxShadow.hasKey("color") ? Integer.valueOf(boxShadow.getInt("color")) : null, boxShadow.hasKey("blurRadius") ? Float.valueOf((float) boxShadow.getDouble("blurRadius")) : null, boxShadow.hasKey("spreadDistance") ? Float.valueOf((float) boxShadow.getDouble("spreadDistance")) : null, boxShadow.hasKey("inset") ? Boolean.valueOf(boxShadow.getBoolean("inset")) : null);
            }
            return null;
        }

        private a() {
        }
    }

    public C3084f(float f10, float f11, Integer num, Float f12, Float f13, Boolean bool) {
        this.f32230a = f10;
        this.f32231b = f11;
        this.f32232c = num;
        this.f32233d = f12;
        this.f32234e = f13;
        this.f32235f = bool;
    }

    public final Float a() {
        return this.f32233d;
    }

    public final Integer b() {
        return this.f32232c;
    }

    public final Boolean c() {
        return this.f32235f;
    }

    public final float d() {
        return this.f32230a;
    }

    public final float e() {
        return this.f32231b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3084f)) {
            return false;
        }
        C3084f c3084f = (C3084f) obj;
        return Float.compare(this.f32230a, c3084f.f32230a) == 0 && Float.compare(this.f32231b, c3084f.f32231b) == 0 && Intrinsics.b(this.f32232c, c3084f.f32232c) && Intrinsics.b(this.f32233d, c3084f.f32233d) && Intrinsics.b(this.f32234e, c3084f.f32234e) && Intrinsics.b(this.f32235f, c3084f.f32235f);
    }

    public final Float f() {
        return this.f32234e;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.f32230a) * 31) + Float.hashCode(this.f32231b)) * 31;
        Integer num = this.f32232c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f10 = this.f32233d;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f32234e;
        int hashCode4 = (hashCode3 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Boolean bool = this.f32235f;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BoxShadow(offsetX=" + this.f32230a + ", offsetY=" + this.f32231b + ", color=" + this.f32232c + ", blurRadius=" + this.f32233d + ", spreadDistance=" + this.f32234e + ", inset=" + this.f32235f + ")";
    }
}
