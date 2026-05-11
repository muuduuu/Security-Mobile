package tb;

import kotlin.jvm.internal.Intrinsics;
import wb.q;
import yb.C5185c;

/* renamed from: tb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4827b {

    /* renamed from: a, reason: collision with root package name */
    private final String f43360a;

    /* renamed from: b, reason: collision with root package name */
    private final q f43361b;

    /* renamed from: c, reason: collision with root package name */
    private final C5185c f43362c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43363d;

    public C4827b(String name, q constructor, C5185c objectDefinition, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(objectDefinition, "objectDefinition");
        this.f43360a = name;
        this.f43361b = constructor;
        this.f43362c = objectDefinition;
        this.f43363d = z10;
    }

    public final q a() {
        return this.f43361b;
    }

    public final String b() {
        return this.f43360a;
    }

    public final C5185c c() {
        return this.f43362c;
    }

    public final boolean d() {
        return this.f43363d;
    }
}
