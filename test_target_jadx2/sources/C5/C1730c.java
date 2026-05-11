package c5;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import e5.C3080b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5145F;

/* renamed from: c5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1730c extends LayerDrawable {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f19401a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19402b;

    /* renamed from: c, reason: collision with root package name */
    private final C1729b f19403c;

    /* renamed from: d, reason: collision with root package name */
    private final Drawable f19404d;

    /* renamed from: e, reason: collision with root package name */
    private final List f19405e;

    /* renamed from: f, reason: collision with root package name */
    private C3080b f19406f;

    public /* synthetic */ C1730c(Drawable drawable, List list, C1729b c1729b, Drawable drawable2, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : drawable, (i10 & 2) != 0 ? CollectionsKt.j() : list, (i10 & 4) != 0 ? null : c1729b, (i10 & 8) == 0 ? drawable2 : null, (i10 & 16) != 0 ? CollectionsKt.j() : list2);
    }

    public final C3080b a() {
        return this.f19406f;
    }

    public final C1729b b() {
        return this.f19403c;
    }

    public final List c() {
        return this.f19405e;
    }

    public final Drawable d() {
        return this.f19401a;
    }

    public final List e() {
        return this.f19402b;
    }

    public final void f(C3080b c3080b) {
        this.f19406f = c3080b;
    }

    public final C1730c g(C1729b c1729b) {
        return new C1730c(this.f19401a, this.f19402b, c1729b, this.f19404d, this.f19405e);
    }

    public final C1730c h(Drawable drawable) {
        return new C1730c(this.f19401a, this.f19402b, this.f19403c, drawable, this.f19405e);
    }

    public final C1730c i(List outerShadows, List innerShadows) {
        Intrinsics.checkNotNullParameter(outerShadows, "outerShadows");
        Intrinsics.checkNotNullParameter(innerShadows, "innerShadows");
        return new C1730c(this.f19401a, outerShadows, this.f19403c, this.f19404d, innerShadows);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1730c(Drawable drawable, List outerShadows, C1729b c1729b, Drawable drawable2, List innerShadows) {
        super((Drawable[]) CollectionsKt.o(r0.d(new Drawable[r0.c()])).toArray(new Drawable[0]));
        Intrinsics.checkNotNullParameter(outerShadows, "outerShadows");
        Intrinsics.checkNotNullParameter(innerShadows, "innerShadows");
        C5145F c5145f = new C5145F(5);
        c5145f.a(drawable);
        c5145f.b(CollectionsKt.M(outerShadows).toArray(new Drawable[0]));
        c5145f.a(c1729b);
        c5145f.a(drawable2);
        c5145f.b(CollectionsKt.M(innerShadows).toArray(new Drawable[0]));
        this.f19401a = drawable;
        this.f19402b = outerShadows;
        this.f19403c = c1729b;
        this.f19404d = drawable2;
        this.f19405e = innerShadows;
        setPaddingMode(1);
    }
}
