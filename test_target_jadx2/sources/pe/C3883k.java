package pe;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3883k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38698a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38699b;

    /* renamed from: c, reason: collision with root package name */
    private final S f38700c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f38701d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f38702e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f38703f;

    /* renamed from: g, reason: collision with root package name */
    private final Long f38704g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f38705h;

    public C3883k(boolean z10, boolean z11, S s10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f38698a = z10;
        this.f38699b = z11;
        this.f38700c = s10;
        this.f38701d = l10;
        this.f38702e = l11;
        this.f38703f = l12;
        this.f38704g = l13;
        this.f38705h = kotlin.collections.G.t(extras);
    }

    public final C3883k a(boolean z10, boolean z11, S s10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new C3883k(z10, z11, s10, l10, l11, l12, l13, extras);
    }

    public final Long c() {
        return this.f38701d;
    }

    public final S d() {
        return this.f38700c;
    }

    public final boolean e() {
        return this.f38699b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f38698a) {
            arrayList.add("isRegularFile");
        }
        if (this.f38699b) {
            arrayList.add("isDirectory");
        }
        if (this.f38701d != null) {
            arrayList.add("byteCount=" + this.f38701d);
        }
        if (this.f38702e != null) {
            arrayList.add("createdAt=" + this.f38702e);
        }
        if (this.f38703f != null) {
            arrayList.add("lastModifiedAt=" + this.f38703f);
        }
        if (this.f38704g != null) {
            arrayList.add("lastAccessedAt=" + this.f38704g);
        }
        if (!this.f38705h.isEmpty()) {
            arrayList.add("extras=" + this.f38705h);
        }
        return CollectionsKt.l0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C3883k(boolean z10, boolean z11, S s10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? null : s10, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) == 0 ? l13 : null, (i10 & 128) != 0 ? kotlin.collections.G.h() : map);
    }
}
