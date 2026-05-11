package Fb;

import Db.AbstractC0812v;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class b extends AbstractC0812v {
    public b(boolean z10) {
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
    public Path e(Object value, C3862a c3862a) {
        Path path;
        Intrinsics.checkNotNullParameter(value, "value");
        path = Paths.get((String) value, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Path f(Dynamic value, C3862a c3862a) {
        Path path;
        Intrinsics.checkNotNullParameter(value, "value");
        path = Paths.get(value.asString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }
}
