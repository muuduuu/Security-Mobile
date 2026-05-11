package g6;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.e;
import h6.AbstractC3284b;
import h6.C3283a;
import n6.InterfaceC3710b;
import org.aomedia.avif.android.AvifDecoder;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3194a extends com.github.penfeizhou.animation.decode.b {

    /* renamed from: w, reason: collision with root package name */
    private AvifDecoder f33560w;

    public C3194a(InterfaceC3710b interfaceC3710b, b.j jVar) {
        super(interfaceC3710b, jVar);
        this.f33560w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int B() {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected /* bridge */ /* synthetic */ e C() {
        U();
        return null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void K() {
        AvifDecoder avifDecoder = this.f33560w;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.f33560w = null;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap H10 = H(this.f33560w.getWidth(), this.f33560w.getHeight());
        AvifDecoder avifDecoder = this.f33560w;
        if (avifDecoder == null) {
            return;
        }
        int i10 = this.f23155e;
        int i11 = ((b) aVar).f33561a;
        if (i10 != i11) {
            avifDecoder.nthFrame(i11, H10);
        } else if (i10 == 0) {
            avifDecoder.nthFrame(0, H10);
        } else {
            avifDecoder.nextFrame(H10);
        }
        this.f23165o.rewind();
        try {
            H10.copyPixelsToBuffer(this.f23165o);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        J(H10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C3283a A(Reader reader) {
        return new C3283a(reader);
    }

    protected AbstractC3284b U() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect I(C3283a c3283a) {
        this.f33560w = AvifDecoder.create(c3283a.a());
        return new Rect(0, 0, this.f33560w.getWidth(), this.f33560w.getHeight());
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public com.github.penfeizhou.animation.decode.a u(int i10) {
        b bVar = new b(null);
        bVar.f33561a = i10;
        bVar.frameDuration = (int) (this.f33560w.getFrameDurations()[i10] * 1000.0d);
        return bVar;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public Bitmap v(int i10) {
        if (this.f33560w == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        this.f33560w.nthFrame(i10, createBitmap);
        return createBitmap;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int w() {
        AvifDecoder avifDecoder = this.f33560w;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        AvifDecoder avifDecoder = this.f33560w;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.f33560w.getRepetitionCount();
    }
}
