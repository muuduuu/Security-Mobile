package Xc;

import Kc.f0;
import java.util.Set;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5220w;
import yd.M;
import yd.p0;

/* loaded from: classes3.dex */
public final class a extends AbstractC5220w {

    /* renamed from: d, reason: collision with root package name */
    private final p0 f11852d;

    /* renamed from: e, reason: collision with root package name */
    private final c f11853e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11854f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f11855g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f11856h;

    /* renamed from: i, reason: collision with root package name */
    private final M f11857i;

    public /* synthetic */ a(p0 p0Var, c cVar, boolean z10, boolean z11, Set set, M m10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(p0Var, (i10 & 2) != 0 ? c.INFLEXIBLE : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : m10);
    }

    public static /* synthetic */ a f(a aVar, p0 p0Var, c cVar, boolean z10, boolean z11, Set set, M m10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            p0Var = aVar.f11852d;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f11853e;
        }
        c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f11854f;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f11855g;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            set = aVar.f11856h;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            m10 = aVar.f11857i;
        }
        return aVar.e(p0Var, cVar2, z12, z13, set2, m10);
    }

    @Override // yd.AbstractC5220w
    public M a() {
        return this.f11857i;
    }

    @Override // yd.AbstractC5220w
    public p0 b() {
        return this.f11852d;
    }

    @Override // yd.AbstractC5220w
    public Set c() {
        return this.f11856h;
    }

    public final a e(p0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, M m10) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z10, z11, set, m10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(aVar.a(), a()) && aVar.b() == b() && aVar.f11853e == this.f11853e && aVar.f11854f == this.f11854f && aVar.f11855g == this.f11855g;
    }

    public final c g() {
        return this.f11853e;
    }

    public final boolean h() {
        return this.f11855g;
    }

    @Override // yd.AbstractC5220w
    public int hashCode() {
        M a10 = a();
        int hashCode = a10 != null ? a10.hashCode() : 0;
        int hashCode2 = hashCode + (hashCode * 31) + b().hashCode();
        int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f11853e.hashCode();
        int i10 = hashCode3 + (hashCode3 * 31) + (this.f11854f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f11855g ? 1 : 0);
    }

    public final boolean i() {
        return this.f11854f;
    }

    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public a k(M m10) {
        return f(this, null, null, false, false, null, m10, 31, null);
    }

    public final a l(c flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // yd.AbstractC5220w
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(f0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? O.l(c(), typeParameter) : O.c(typeParameter), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f11852d + ", flexibility=" + this.f11853e + ", isRaw=" + this.f11854f + ", isForAnnotationParameter=" + this.f11855g + ", visitedTypeParameters=" + this.f11856h + ", defaultType=" + this.f11857i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, M m10) {
        super(howThisTypeIsUsed, set, m10);
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        this.f11852d = howThisTypeIsUsed;
        this.f11853e = flexibility;
        this.f11854f = z10;
        this.f11855g = z11;
        this.f11856h = set;
        this.f11857i = m10;
    }
}
