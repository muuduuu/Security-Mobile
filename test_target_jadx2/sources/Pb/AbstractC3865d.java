package pb;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3865d {

    /* renamed from: pb.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38551a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f38551a = iArr;
        }
    }

    public static final Object a(Dynamic dynamic) {
        Intrinsics.checkNotNullParameter(dynamic, "<this>");
        switch (a.f38551a[dynamic.getType().ordinal()]) {
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(dynamic.asBoolean());
            case 3:
                return Double.valueOf(dynamic.asDouble());
            case 4:
                return dynamic.asString();
            case 5:
                return dynamic.asArray();
            case 6:
                return dynamic.asMap();
            default:
                throw new lc.m();
        }
    }
}
