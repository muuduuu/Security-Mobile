package q4;

import android.graphics.ColorSpace;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ColorSpace f38755a;

    /* renamed from: b, reason: collision with root package name */
    private final Pair f38756b;

    public d(int i10, int i11, ColorSpace colorSpace) {
        this.f38755a = colorSpace;
        this.f38756b = (i10 == -1 || i11 == -1) ? null : new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public final ColorSpace a() {
        return this.f38755a;
    }

    public final Pair b() {
        return this.f38756b;
    }
}
