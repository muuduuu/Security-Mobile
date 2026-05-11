package Db;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* renamed from: Db.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0793b extends AbstractC0812v {

    /* renamed from: Db.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1453a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1453a = iArr;
        }
    }

    public C0793b(boolean z10) {
        super(z10);
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.ANY);
    }

    @Override // Db.AbstractC0812v
    public Object e(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    @Override // Db.AbstractC0812v
    public Object f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = a.f1453a[value.getType().ordinal()];
        if (i10 == 1) {
            return Boolean.valueOf(value.asBoolean());
        }
        if (i10 == 2) {
            return Double.valueOf(value.asDouble());
        }
        if (i10 == 3) {
            return value.asString();
        }
        if (i10 == 4) {
            return value.asMap().toHashMap();
        }
        if (i10 == 5) {
            return value.asArray().toArrayList();
        }
        throw new IllegalStateException(("Unknown dynamic type: " + value.getType()).toString());
    }
}
