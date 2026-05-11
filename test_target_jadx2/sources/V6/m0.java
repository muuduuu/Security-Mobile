package V6;

import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f10982a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10983b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1267c f10984c;

    public m0(AbstractC1267c abstractC1267c, Object obj) {
        Objects.requireNonNull(abstractC1267c);
        this.f10984c = abstractC1267c;
        this.f10982a = obj;
        this.f10983b = false;
    }

    protected abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f10982a;
                if (this.f10983b) {
                    String obj2 = toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(obj2);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f10983b = true;
        }
        c();
    }

    public final void c() {
        d();
        AbstractC1267c abstractC1267c = this.f10984c;
        synchronized (abstractC1267c.h0()) {
            abstractC1267c.h0().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f10982a = null;
        }
    }
}
