package Za;

import kotlin.jvm.internal.Intrinsics;
import o2.h;
import o2.i;

/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: i, reason: collision with root package name */
    private final String f12479i;

    /* renamed from: j, reason: collision with root package name */
    private int f12480j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, i iVar, String cacheKey) {
        super(str, iVar);
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.f12479i = cacheKey;
    }

    private final String j() {
        String c10 = super.c();
        Intrinsics.checkNotNullExpressionValue(c10, "getCacheKey(...)");
        return c10;
    }

    @Override // o2.h
    public String c() {
        return this.f12479i;
    }

    @Override // o2.h, i2.f
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Intrinsics.b(j(), aVar.j()) && e().equals(aVar.e());
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.b(j(), hVar.c()) && e().equals(hVar.e());
    }

    @Override // o2.h, i2.f
    public int hashCode() {
        if (this.f12480j == 0) {
            int hashCode = j().hashCode();
            this.f12480j = hashCode;
            this.f12480j = (hashCode * 31) + e().hashCode();
        }
        return this.f12480j;
    }
}
