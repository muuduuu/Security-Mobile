package Gb;

import Db.AbstractC0812v;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class a extends AbstractC0812v {
    public a(boolean z10) {
        super(z10);
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(expo.modules.kotlin.jni.a.STRING);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public URI e(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        URI create = URI.create((String) value);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public URI f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        URI create = URI.create(value.asString());
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }
}
