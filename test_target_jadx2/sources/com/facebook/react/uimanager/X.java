package com.facebook.react.uimanager;

import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import e5.C3086h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: c, reason: collision with root package name */
    public static final a f22304c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f22305a;

    /* renamed from: b, reason: collision with root package name */
    private final Y f22306b;

    public static final class a {

        /* renamed from: com.facebook.react.uimanager.X$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0382a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22307a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f22307a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final X a(Dynamic dynamic) {
            Intrinsics.checkNotNullParameter(dynamic, "dynamic");
            int i10 = C0382a.f22307a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                double asDouble = dynamic.asDouble();
                if (asDouble >= 0.0d) {
                    return new X((float) asDouble, Y.POINT);
                }
                return null;
            }
            if (i10 != 2) {
                AbstractC1721a.J("ReactNative", "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String asString = dynamic.asString();
            if (!StringsKt.q(asString, "%", false, 2, null)) {
                AbstractC1721a.J("ReactNative", "Invalid string value: " + asString);
                return null;
            }
            try {
                String substring = asString.substring(0, asString.length() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                float parseFloat = Float.parseFloat(substring);
                if (parseFloat >= 0.0f) {
                    return new X(parseFloat, Y.PERCENT);
                }
                return null;
            } catch (NumberFormatException unused) {
                AbstractC1721a.J("ReactNative", "Invalid percentage format: " + asString);
                return null;
            }
        }

        private a() {
        }
    }

    public X(float f10, Y type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f22305a = f10;
        this.f22306b = type;
    }

    public static final X c(Dynamic dynamic) {
        return f22304c.a(dynamic);
    }

    public final Y a() {
        return this.f22306b;
    }

    public final C3086h b(float f10, float f11) {
        if (this.f22306b != Y.PERCENT) {
            float f12 = this.f22305a;
            return new C3086h(f12, f12);
        }
        float f13 = this.f22305a;
        float f14 = 100;
        return new C3086h((f13 / f14) * f10, (f13 / f14) * f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return Float.compare(this.f22305a, x10.f22305a) == 0 && this.f22306b == x10.f22306b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f22305a) * 31) + this.f22306b.hashCode();
    }

    public String toString() {
        return "LengthPercentage(value=" + this.f22305a + ", type=" + this.f22306b + ")";
    }
}
