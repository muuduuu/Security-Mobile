package Db;

import android.graphics.Color;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import xc.C5142C;

/* renamed from: Db.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0801j extends AbstractC0812v {

    /* renamed from: Db.j$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1463a;

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
            try {
                iArr[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1463a = iArr;
        }
    }

    public C0801j(boolean z10) {
        super(z10);
    }

    private final Color g(double[] dArr) {
        Color valueOf;
        Double E10 = AbstractC3574i.E(dArr, 3);
        valueOf = Color.valueOf((float) dArr[0], (float) dArr[1], (float) dArr[2], (float) (E10 != null ? E10.doubleValue() : 1.0d));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    private final Color h(int i10) {
        Color valueOf;
        valueOf = Color.valueOf(i10);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    private final Color i(String str) {
        Map map;
        Color valueOf;
        Color valueOf2;
        map = AbstractC0802k.f1464a;
        List list = (List) map.get(str);
        if (list != null) {
            valueOf2 = Color.valueOf(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue());
            Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(...)");
            return valueOf2;
        }
        valueOf = Color.valueOf(Color.parseColor(str));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf;
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(new SingleType(expo.modules.kotlin.jni.a.INT, null, 2, null), new SingleType(expo.modules.kotlin.jni.a.STRING, null, 2, null), new SingleType(expo.modules.kotlin.jni.a.PRIMITIVE_ARRAY, new ExpectedType[]{new ExpectedType(expo.modules.kotlin.jni.a.DOUBLE)}));
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Color e(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Integer) {
            return h(((Number) value).intValue());
        }
        if (value instanceof String) {
            return i((String) value);
        }
        if (value instanceof double[]) {
            return g((double[]) value);
        }
        throw new UnexpectedException("Unknown argument type: " + C5142C.b(value.getClass()));
    }

    @Override // Db.AbstractC0812v
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Color f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = a.f1463a[value.getType().ordinal()];
        if (i10 == 1) {
            return h((int) value.asDouble());
        }
        if (i10 == 2) {
            return i(value.asString());
        }
        if (i10 != 3) {
            throw new UnexpectedException("Unknown argument type: " + value.getType());
        }
        ArrayList<Object> arrayList = value.asArray().toArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
        for (Object obj : arrayList) {
            Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.Double");
            Double d10 = (Double) obj;
            d10.doubleValue();
            arrayList2.add(d10);
        }
        return g(CollectionsKt.K0(arrayList2));
    }
}
