package k6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.gif.decode.GifFrame;
import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;
import l6.C3610a;
import n6.InterfaceC3710b;

/* loaded from: classes2.dex */
public class g extends com.github.penfeizhou.animation.decode.b {

    /* renamed from: A, reason: collision with root package name */
    private int f36236A;

    /* renamed from: w, reason: collision with root package name */
    private C3610a f36237w;

    /* renamed from: x, reason: collision with root package name */
    private final Paint f36238x;

    /* renamed from: y, reason: collision with root package name */
    private int f36239y;

    /* renamed from: z, reason: collision with root package name */
    private final b f36240z;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        ByteBuffer f36241a;

        private b() {
        }
    }

    public g(InterfaceC3710b interfaceC3710b, b.j jVar) {
        super(interfaceC3710b, jVar);
        this.f36237w = new C3610a();
        Paint paint = new Paint();
        this.f36238x = paint;
        this.f36239y = 0;
        this.f36240z = new b();
        this.f36236A = 1;
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void K() {
        this.f36240z.f36241a = null;
        this.f36237w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M(com.github.penfeizhou.animation.decode.a aVar) {
        GifFrame gifFrame = (GifFrame) aVar;
        Bitmap H10 = H(this.f23166p.width() / this.f23161k, this.f23166p.height() / this.f23161k);
        Canvas canvas = (Canvas) this.f23164n.get(H10);
        if (canvas == null) {
            canvas = new Canvas(H10);
            this.f23164n.put(H10, canvas);
        }
        Canvas canvas2 = canvas;
        this.f23165o.rewind();
        H10.copyPixelsFromBuffer(this.f23165o);
        int i10 = !gifFrame.transparencyFlag() ? this.f36239y : 0;
        int i11 = this.f23155e;
        if (i11 == 0) {
            H10.eraseColor(i10);
        } else {
            GifFrame gifFrame2 = (GifFrame) this.f23154d.get(i11 - 1);
            canvas2.save();
            int i12 = gifFrame2.frameX;
            int i13 = this.f23161k;
            int i14 = gifFrame2.frameY;
            canvas2.clipRect(i12 / i13, i14 / i13, (i12 + gifFrame2.frameWidth) / i13, (i14 + gifFrame2.frameHeight) / i13);
            int i15 = gifFrame2.disposalMethod;
            if (i15 == 2) {
                canvas2.drawColor(this.f36239y, PorterDuff.Mode.CLEAR);
            } else if (i15 == 3) {
                this.f36240z.f36241a.rewind();
                canvas2.drawColor(this.f36239y, PorterDuff.Mode.CLEAR);
                Bitmap H11 = H(this.f23166p.width() / this.f23161k, this.f23166p.height() / this.f23161k);
                H11.copyPixelsFromBuffer(this.f36240z.f36241a);
                canvas2.drawBitmap(H11, 0.0f, 0.0f, this.f36238x);
                J(H11);
            }
            canvas2.restore();
            if (gifFrame.disposalMethod == 3 && gifFrame2.disposalMethod != 3) {
                this.f23165o.rewind();
                this.f36240z.f36241a.rewind();
                this.f36240z.f36241a.put(this.f23165o);
            }
        }
        int i16 = aVar.frameWidth;
        int i17 = this.f23161k;
        Bitmap H12 = H(i16 / i17, aVar.frameHeight / i17);
        gifFrame.draw(canvas2, this.f36238x, this.f23161k, H12, C());
        canvas2.drawColor(i10, PorterDuff.Mode.DST_OVER);
        J(H12);
        this.f23165o.rewind();
        H10.copyPixelsToBuffer(this.f23165o);
        J(H10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public GifReader A(Reader reader) {
        return new GifReader(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public C3610a C() {
        if (this.f36237w == null) {
            this.f36237w = new C3610a();
        }
        return this.f36237w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect I(GifReader gifReader) {
        C3548c c3548c = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        i iVar = null;
        for (InterfaceC3547b interfaceC3547b : h.c(gifReader)) {
            if (interfaceC3547b instanceof k) {
                k kVar = (k) interfaceC3547b;
                i10 = kVar.f36254a;
                i11 = kVar.f36255b;
                if (kVar.b()) {
                    i12 = kVar.f36257d & 255;
                }
            } else if (interfaceC3547b instanceof C3548c) {
                c3548c = (C3548c) interfaceC3547b;
            } else if (interfaceC3547b instanceof i) {
                iVar = (i) interfaceC3547b;
            } else if (interfaceC3547b instanceof j) {
                this.f23154d.add(new GifFrame(gifReader, c3548c, iVar, (j) interfaceC3547b));
            } else if (interfaceC3547b instanceof C3546a) {
                C3546a c3546a = (C3546a) interfaceC3547b;
                if ("NETSCAPE2.0".equals(c3546a.f36230b)) {
                    int i13 = c3546a.f36229a;
                    if (i13 == 0) {
                        this.f36236A = 0;
                    } else if (i13 > 0) {
                        this.f36236A = i13 + 1;
                    }
                }
            }
        }
        int i14 = i10 * i11;
        int i15 = this.f23161k;
        this.f23165o = ByteBuffer.allocate(((i14 / (i15 * i15)) + 1) * 4);
        b bVar = this.f36240z;
        int i16 = this.f23161k;
        bVar.f36241a = ByteBuffer.allocate(((i14 / (i16 * i16)) + 1) * 4);
        if (c3548c != null && i12 >= 0 && i12 < c3548c.b().length) {
            int i17 = c3548c.b()[i12];
            this.f36239y = Color.rgb(i17 & 255, (i17 >> 8) & 255, (i17 >> 16) & 255);
        }
        return new Rect(0, 0, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int t(int i10, int i11) {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f36236A;
    }
}
