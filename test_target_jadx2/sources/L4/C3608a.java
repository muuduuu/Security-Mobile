package l4;

import V2.d;
import V2.i;
import android.graphics.Bitmap;
import b3.l;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import m4.AbstractC3650a;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3608a extends AbstractC3650a {

    /* renamed from: c, reason: collision with root package name */
    private final int f37083c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37084d;

    /* renamed from: e, reason: collision with root package name */
    private d f37085e;

    public C3608a(int i10, int i11) {
        l.b(Boolean.valueOf(i10 > 0));
        l.b(Boolean.valueOf(i11 > 0));
        this.f37083c = i10;
        this.f37084d = i11;
    }

    @Override // m4.AbstractC3650a, m4.d
    public d b() {
        if (this.f37085e == null) {
            this.f37085e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f37083c), Integer.valueOf(this.f37084d)));
        }
        return this.f37085e;
    }

    @Override // m4.AbstractC3650a
    public void d(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f37083c, this.f37084d);
    }
}
