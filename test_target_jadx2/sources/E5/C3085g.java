package e5;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3085g {

    /* renamed from: a, reason: collision with root package name */
    private final C3086h f32236a;

    /* renamed from: b, reason: collision with root package name */
    private final C3086h f32237b;

    /* renamed from: c, reason: collision with root package name */
    private final C3086h f32238c;

    /* renamed from: d, reason: collision with root package name */
    private final C3086h f32239d;

    public C3085g(C3086h topLeft, C3086h topRight, C3086h bottomLeft, C3086h bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.f32236a = topLeft;
        this.f32237b = topRight;
        this.f32238c = bottomLeft;
        this.f32239d = bottomRight;
    }

    public final C3086h a() {
        return this.f32238c;
    }

    public final C3086h b() {
        return this.f32239d;
    }

    public final C3086h c() {
        return this.f32236a;
    }

    public final C3086h d() {
        return this.f32237b;
    }

    public final boolean e() {
        return this.f32236a.a() > 0.0f || this.f32236a.b() > 0.0f || this.f32237b.a() > 0.0f || this.f32237b.b() > 0.0f || this.f32238c.a() > 0.0f || this.f32238c.b() > 0.0f || this.f32239d.a() > 0.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3085g)) {
            return false;
        }
        C3085g c3085g = (C3085g) obj;
        return Intrinsics.b(this.f32236a, c3085g.f32236a) && Intrinsics.b(this.f32237b, c3085g.f32237b) && Intrinsics.b(this.f32238c, c3085g.f32238c) && Intrinsics.b(this.f32239d, c3085g.f32239d);
    }

    public int hashCode() {
        return (((((this.f32236a.hashCode() * 31) + this.f32237b.hashCode()) * 31) + this.f32238c.hashCode()) * 31) + this.f32239d.hashCode();
    }

    public String toString() {
        return "ComputedBorderRadius(topLeft=" + this.f32236a + ", topRight=" + this.f32237b + ", bottomLeft=" + this.f32238c + ", bottomRight=" + this.f32239d + ")";
    }

    public C3085g() {
        this(new C3086h(0.0f, 0.0f), new C3086h(0.0f, 0.0f), new C3086h(0.0f, 0.0f), new C3086h(0.0f, 0.0f));
    }
}
