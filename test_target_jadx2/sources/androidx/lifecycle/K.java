package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import k1.d;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K implements d.c {

    /* renamed from: a, reason: collision with root package name */
    private final k1.d f17053a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17054b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f17055c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f17056d;

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X f17057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X x10) {
            super(0);
            this.f17057a = x10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L invoke() {
            return J.e(this.f17057a);
        }
    }

    public K(k1.d savedStateRegistry, X viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f17053a = savedStateRegistry;
        this.f17056d = lc.i.a(new a(viewModelStoreOwner));
    }

    private final L c() {
        return (L) this.f17056d.getValue();
    }

    @Override // k1.d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17055c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((G) entry.getValue()).c().a();
            if (!Intrinsics.b(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f17054b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        d();
        Bundle bundle = this.f17055c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f17055c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f17055c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f17055c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f17054b) {
            return;
        }
        Bundle b10 = this.f17053a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f17055c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b10 != null) {
            bundle.putAll(b10);
        }
        this.f17055c = bundle;
        this.f17054b = true;
        c();
    }
}
