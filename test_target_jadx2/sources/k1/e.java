package k1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1592i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f35976d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f35977a;

    /* renamed from: b, reason: collision with root package name */
    private final d f35978b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35979c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new e(owner, null);
        }

        private a() {
        }
    }

    public /* synthetic */ e(f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f35976d.a(fVar);
    }

    public final d b() {
        return this.f35978b;
    }

    public final void c() {
        AbstractC1592i lifecycle = this.f35977a.getLifecycle();
        if (lifecycle.b() != AbstractC1592i.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C3530b(this.f35977a));
        this.f35978b.e(lifecycle);
        this.f35979c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f35979c) {
            c();
        }
        AbstractC1592i lifecycle = this.f35977a.getLifecycle();
        if (!lifecycle.b().isAtLeast(AbstractC1592i.b.STARTED)) {
            this.f35978b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f35978b.g(outBundle);
    }

    private e(f fVar) {
        this.f35977a = fVar;
        this.f35978b = new d();
    }
}
