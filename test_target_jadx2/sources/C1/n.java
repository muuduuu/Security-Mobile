package C1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f775a;

    /* renamed from: b, reason: collision with root package name */
    private final String f776b;

    public n(String name, String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f775a = name;
        this.f776b = workSpecId;
    }

    public final String a() {
        return this.f775a;
    }

    public final String b() {
        return this.f776b;
    }
}
