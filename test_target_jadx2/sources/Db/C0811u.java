package Db;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* renamed from: Db.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0811u extends AbstractC0812v {
    public C0811u(boolean z10) {
        super(z10);
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.DOUBLE);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    public /* bridge */ /* synthetic */ Object e(Object obj, C3862a c3862a) {
        return kotlin.time.a.c(g(obj, c3862a));
    }

    @Override // Db.AbstractC0812v
    public /* bridge */ /* synthetic */ Object f(Dynamic dynamic, C3862a c3862a) {
        return kotlin.time.a.c(h(dynamic, c3862a));
    }

    public long g(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return kotlin.time.b.i(((Double) value).doubleValue(), Id.b.SECONDS);
    }

    public long h(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getType() == ReadableType.Number) {
            return kotlin.time.b.i(value.asDouble(), Id.b.SECONDS);
        }
        throw new IllegalArgumentException("Expected a number, but received " + value.getType());
    }
}
