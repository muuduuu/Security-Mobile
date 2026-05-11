package w2;

import android.graphics.Bitmap;
import i2.h;
import java.io.ByteArrayOutputStream;
import k2.v;
import s2.C4310b;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5028a implements InterfaceC5032e {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f44280a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44281b;

    public C5028a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // w2.InterfaceC5032e
    public v a(v vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f44280a, this.f44281b, byteArrayOutputStream);
        vVar.recycle();
        return new C4310b(byteArrayOutputStream.toByteArray());
    }

    public C5028a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f44280a = compressFormat;
        this.f44281b = i10;
    }
}
