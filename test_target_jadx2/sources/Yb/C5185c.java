package yb;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pb.C3863b;

/* renamed from: yb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5185c {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f45405a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f45406b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f45407c;

    /* renamed from: d, reason: collision with root package name */
    private final vb.f f45408d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f45409e;

    public C5185c(Function0 constantsProvider, Map syncFunctions, Map asyncFunctions, vb.f fVar, Map properties) {
        Intrinsics.checkNotNullParameter(constantsProvider, "constantsProvider");
        Intrinsics.checkNotNullParameter(syncFunctions, "syncFunctions");
        Intrinsics.checkNotNullParameter(asyncFunctions, "asyncFunctions");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f45405a = constantsProvider;
        this.f45406b = syncFunctions;
        this.f45407c = asyncFunctions;
        this.f45408d = fVar;
        this.f45409e = properties;
    }

    public final Map a() {
        return this.f45407c;
    }

    public final Function0 b() {
        return this.f45405a;
    }

    public final vb.f c() {
        return this.f45408d;
    }

    public final C3863b d() {
        return new C3863b(this.f45406b.values().iterator(), this.f45407c.values().iterator());
    }

    public final Map e() {
        return this.f45409e;
    }

    public final Map f() {
        return this.f45406b;
    }
}
