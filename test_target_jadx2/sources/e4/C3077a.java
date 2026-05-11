package e4;

import g4.i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3077a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final i f32196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3077a(String str, i encodedImage) {
        super(str);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.f32196a = encodedImage;
    }

    public final i a() {
        return this.f32196a;
    }
}
