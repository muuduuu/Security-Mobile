package j5;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3502c {

    /* renamed from: a, reason: collision with root package name */
    private final int f35847a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f35848b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35849c;

    public C3502c(int i10, RectF rectangle, int i11) {
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        this.f35847a = i10;
        this.f35848b = rectangle;
        this.f35849c = i11;
    }

    public final int a() {
        return this.f35849c;
    }

    public final int b() {
        return this.f35847a;
    }

    public final RectF c() {
        return this.f35848b;
    }
}
