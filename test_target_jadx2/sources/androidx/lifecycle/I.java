package androidx.lifecycle;

import androidx.lifecycle.AbstractC1592i;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I implements InterfaceC1596m, Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final String f17047a;

    /* renamed from: b, reason: collision with root package name */
    private final G f17048b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17049c;

    public I(String key, G handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f17047a = key;
        this.f17048b = handle;
    }

    public final void a(k1.d registry, AbstractC1592i lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f17049c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f17049c = true;
        lifecycle.a(this);
        registry.h(this.f17047a, this.f17048b.c());
    }

    public final G b() {
        return this.f17048b;
    }

    public final boolean c() {
        return this.f17049c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.InterfaceC1596m
    public void d(InterfaceC1599p source, AbstractC1592i.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1592i.a.ON_DESTROY) {
            this.f17049c = false;
            source.getLifecycle().d(this);
        }
    }
}
