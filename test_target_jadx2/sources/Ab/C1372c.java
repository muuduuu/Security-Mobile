package ab;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ab.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1372c extends PictureDrawable {

    /* renamed from: a, reason: collision with root package name */
    private final int f12649a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12650b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372c(Picture picture, int i10, int i11) {
        super(picture);
        Intrinsics.checkNotNullParameter(picture, "picture");
        this.f12649a = i10;
        this.f12650b = i11;
    }

    public final int a() {
        return this.f12650b;
    }

    public final int b() {
        return this.f12649a;
    }
}
