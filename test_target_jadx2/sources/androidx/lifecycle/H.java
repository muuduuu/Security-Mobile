package androidx.lifecycle;

import androidx.lifecycle.AbstractC1592i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class H implements InterfaceC1596m {

    /* renamed from: a, reason: collision with root package name */
    private final K f17046a;

    public H(K provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f17046a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1596m
    public void d(InterfaceC1599p source, AbstractC1592i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1592i.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.f17046a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
