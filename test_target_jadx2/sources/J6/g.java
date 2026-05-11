package J6;

import S6.a;
import V6.AbstractC1286q;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class g implements a.d {

    /* renamed from: d, reason: collision with root package name */
    public static final g f4801d = new g(new f());

    /* renamed from: a, reason: collision with root package name */
    private final String f4802a = null;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4803b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4804c;

    public g(f fVar) {
        this.f4803b = fVar.f4799a.booleanValue();
        this.f4804c = fVar.f4800b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f4803b);
        bundle.putString("log_session_id", this.f4804c);
        return bundle;
    }

    final /* synthetic */ boolean b() {
        return this.f4803b;
    }

    final /* synthetic */ String c() {
        return this.f4804c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f4802a;
        return AbstractC1286q.a(null, null) && this.f4803b == gVar.f4803b && AbstractC1286q.a(this.f4804c, gVar.f4804c);
    }

    public final int hashCode() {
        return AbstractC1286q.b(null, Boolean.valueOf(this.f4803b), this.f4804c);
    }
}
