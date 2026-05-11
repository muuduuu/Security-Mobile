package C1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f867a;

    /* renamed from: b, reason: collision with root package name */
    private final String f868b;

    public y(String tag, String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f867a = tag;
        this.f868b = workSpecId;
    }

    public final String a() {
        return this.f867a;
    }

    public final String b() {
        return this.f868b;
    }
}
