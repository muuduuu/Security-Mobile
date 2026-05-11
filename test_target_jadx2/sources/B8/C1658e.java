package b8;

import android.graphics.Rect;
import android.media.Image;

/* renamed from: b8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1658e {

    /* renamed from: a, reason: collision with root package name */
    private final Image f18864a;

    /* renamed from: b, reason: collision with root package name */
    private int f18865b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Rect f18866c;

    public C1658e(Image image) {
        this.f18864a = image;
        this.f18866c = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    public C1659f a() {
        return new C1659f(new l(this.f18864a), this.f18865b, this.f18866c, 0L, this.f18864a.getWidth(), this.f18864a.getHeight());
    }

    public C1658e b(int i10) {
        C1659f.f(i10);
        this.f18865b = i10;
        return this;
    }
}
