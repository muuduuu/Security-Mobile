package pb;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.Intrinsics;
import xc.C5142C;

/* loaded from: classes2.dex */
public abstract class q {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38581a;

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
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f38581a = iArr;
        }
    }

    public static final kotlin.reflect.o a(ReadableType readableType) {
        Intrinsics.checkNotNullParameter(readableType, "<this>");
        switch (a.f38581a[readableType.ordinal()]) {
            case 1:
                return Cc.e.c(C5142C.b(Object.class), null, true, null, 5, null);
            case 2:
                return Cc.e.c(C5142C.b(Boolean.TYPE), null, false, null, 7, null);
            case 3:
                return Cc.e.c(C5142C.b(Number.class), null, false, null, 7, null);
            case 4:
                return Cc.e.c(C5142C.b(String.class), null, false, null, 7, null);
            case 5:
                return Cc.e.c(C5142C.b(ReadableMap.class), null, false, null, 7, null);
            case 6:
                return Cc.e.c(C5142C.b(ReadableArray.class), null, false, null, 7, null);
            default:
                throw new lc.m();
        }
    }
}
