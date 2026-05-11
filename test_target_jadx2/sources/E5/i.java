package e5;

import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import qc.AbstractC3958a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f32242a;

    /* renamed from: b, reason: collision with root package name */
    private float f32243b;

    /* renamed from: c, reason: collision with root package name */
    private float f32244c;

    /* renamed from: d, reason: collision with root package name */
    private float f32245d;

    /* renamed from: e, reason: collision with root package name */
    private float f32246e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f32247f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f32248g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a LINEAR_GRADIENT = new a("LINEAR_GRADIENT", 0);

        private static final /* synthetic */ a[] $values() {
            return new a[]{LINEAR_GRADIENT};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private a(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32249a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LINEAR_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f32249a = iArr;
        }
    }

    public i(ReadableMap readableMap) {
        if (readableMap == null) {
            throw new IllegalArgumentException("Gradient cannot be null");
        }
        String string = readableMap.getString("type");
        if (!Intrinsics.b(string, "linearGradient")) {
            throw new IllegalArgumentException("Unsupported gradient type: " + string);
        }
        this.f32242a = a.LINEAR_GRADIENT;
        ReadableMap map = readableMap.getMap("start");
        if (map != null) {
            this.f32243b = (float) map.getDouble("x");
            this.f32244c = (float) map.getDouble("y");
        }
        ReadableMap map2 = readableMap.getMap("end");
        if (map2 != null) {
            this.f32245d = (float) map2.getDouble("x");
            this.f32246e = (float) map2.getDouble("y");
        }
        ReadableArray array = readableMap.getArray("colorStops");
        if (array == null) {
            throw new IllegalArgumentException("Invalid colorStops array");
        }
        int size = array.size();
        this.f32247f = new int[size];
        this.f32248g = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map3 = array.getMap(i10);
            this.f32247f[i10] = map3.getInt("color");
            this.f32248g[i10] = (float) map3.getDouble("position");
        }
    }

    public final Shader a(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (b.f32249a[this.f32242a.ordinal()] == 1) {
            return new LinearGradient(this.f32243b * bounds.width(), this.f32244c * bounds.height(), this.f32245d * bounds.width(), this.f32246e * bounds.height(), this.f32247f, this.f32248g, Shader.TileMode.CLAMP);
        }
        throw new m();
    }
}
