package Gb;

import Db.AbstractC0812v;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class c extends AbstractC0812v {
    public c(boolean z10) {
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
    public Uri e(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uri parse = Uri.parse((String) value);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return parse;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Uri f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        Uri parse = Uri.parse(value.asString());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return parse;
    }
}
