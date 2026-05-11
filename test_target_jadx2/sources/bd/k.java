package bd;

import id.C3367b;
import kotlin.jvm.internal.Intrinsics;
import ud.C4889g;

/* loaded from: classes3.dex */
public final class k implements ud.h {

    /* renamed from: a, reason: collision with root package name */
    private final r f19017a;

    /* renamed from: b, reason: collision with root package name */
    private final j f19018b;

    public k(r kotlinClassFinder, j deserializedDescriptorResolver) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f19017a = kotlinClassFinder;
        this.f19018b = deserializedDescriptorResolver;
    }

    @Override // ud.h
    public C4889g a(C3367b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        t b10 = s.b(this.f19017a, classId, Gd.c.a(this.f19018b.d().g()));
        if (b10 == null) {
            return null;
        }
        Intrinsics.b(b10.l(), classId);
        return this.f19018b.j(b10);
    }
}
