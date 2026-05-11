package C1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: C1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748a {

    /* renamed from: a, reason: collision with root package name */
    private final String f753a;

    /* renamed from: b, reason: collision with root package name */
    private final String f754b;

    public C0748a(String workSpecId, String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f753a = workSpecId;
        this.f754b = prerequisiteId;
    }

    public final String a() {
        return this.f754b;
    }

    public final String b() {
        return this.f753a;
    }
}
