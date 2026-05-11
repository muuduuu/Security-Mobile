package Db;

import com.facebook.react.bridge.Dynamic;
import pb.C3862a;

/* loaded from: classes2.dex */
public abstract class P extends W {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1420a;

    public P(boolean z10) {
        this.f1420a = z10;
    }

    @Override // Db.W
    public Object a(Object obj, C3862a c3862a) {
        if (obj != null && (!(obj instanceof Dynamic) || !((Dynamic) obj).isNull())) {
            return d(obj, c3862a);
        }
        if (this.f1420a) {
            return null;
        }
        throw new expo.modules.kotlin.exception.w();
    }

    public abstract Object d(Object obj, C3862a c3862a);
}
