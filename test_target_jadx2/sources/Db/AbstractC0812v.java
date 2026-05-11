package Db;

import com.facebook.react.bridge.Dynamic;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* renamed from: Db.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0812v extends P {
    public AbstractC0812v(boolean z10) {
        super(z10);
    }

    @Override // Db.P
    public Object d(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value instanceof Dynamic ? f((Dynamic) value, c3862a) : e(value, c3862a);
    }

    public abstract Object e(Object obj, C3862a c3862a);

    public abstract Object f(Dynamic dynamic, C3862a c3862a);
}
