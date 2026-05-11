package pb;

import Db.J;
import com.facebook.react.bridge.Promise;
import expo.modules.kotlin.exception.CodedException;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import pb.m;

/* loaded from: classes2.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Promise f38558a;

    public h(Promise bridgePromise) {
        Intrinsics.checkNotNullParameter(bridgePromise, "bridgePromise");
        this.f38558a = bridgePromise;
    }

    @Override // pb.m
    public void a(String str) {
        m.a.f(this, str);
    }

    @Override // pb.m
    public void b(boolean z10) {
        m.a.h(this, z10);
    }

    @Override // pb.m
    public void c() {
        m.a.b(this);
    }

    @Override // pb.m
    public void d(Collection collection) {
        m.a.g(this, collection);
    }

    @Override // pb.m
    public void e(int i10) {
        m.a.e(this, i10);
    }

    @Override // pb.m
    public void f(double d10) {
        m.a.c(this, d10);
    }

    @Override // pb.m
    public void g(float f10) {
        m.a.d(this, f10);
    }

    @Override // pb.m
    public void h(CodedException codedException) {
        m.a.a(this, codedException);
    }

    @Override // pb.m
    public void reject(String code, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f38558a.reject(code, str, th);
    }

    @Override // pb.m
    public void resolve(Object obj) {
        this.f38558a.resolve(J.b(J.f1409a, obj, null, false, 6, null));
    }
}
