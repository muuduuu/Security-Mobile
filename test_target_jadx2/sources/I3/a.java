package I3;

import f3.AbstractC3142a;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private int f4263a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3142a f4264b;

    public a(int i10, AbstractC3142a bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f4263a = i10;
        this.f4264b = bitmap;
    }

    public final AbstractC3142a a() {
        return this.f4264b;
    }

    public final int b() {
        return this.f4263a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4264b.close();
    }
}
