package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15847a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f15848b;

    public z(boolean z10) {
        this.f15847a = z10;
    }

    public final boolean a() {
        return this.f15847a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(boolean z10, Configuration newConfig) {
        this(z10);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.f15848b = newConfig;
    }
}
