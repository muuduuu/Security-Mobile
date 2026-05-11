package d6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import e6.C3087a;
import e6.C3088b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC3710b;

/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2994b extends com.github.penfeizhou.animation.decode.b {

    /* renamed from: A, reason: collision with root package name */
    private static final String f31237A = "b";

    /* renamed from: w, reason: collision with root package name */
    private C3088b f31238w;

    /* renamed from: x, reason: collision with root package name */
    private int f31239x;

    /* renamed from: y, reason: collision with root package name */
    private final Paint f31240y;

    /* renamed from: z, reason: collision with root package name */
    private final C0451b f31241z;

    /* renamed from: d6.b$b, reason: collision with other inner class name */
    private static class C0451b {

        /* renamed from: a, reason: collision with root package name */
        byte f31242a;

        /* renamed from: b, reason: collision with root package name */
        Rect f31243b;

        /* renamed from: c, reason: collision with root package name */
        ByteBuffer f31244c;

        private C0451b() {
            this.f31243b = new Rect();
        }
    }

    public C2994b(InterfaceC3710b interfaceC3710b, b.j jVar) {
        super(interfaceC3710b, jVar);
        Paint paint = new Paint();
        this.f31240y = paint;
        this.f31241z = new C0451b();
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void K() {
        this.f31241z.f31244c = null;
        this.f31238w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M(com.github.penfeizhou.animation.decode.a aVar) {
        if (aVar == null || this.f23166p == null) {
            return;
        }
        try {
            Bitmap H10 = H(this.f23166p.width() / this.f23161k, this.f23166p.height() / this.f23161k);
            Canvas canvas = (Canvas) this.f23164n.get(H10);
            if (canvas == null) {
                canvas = new Canvas(H10);
                this.f23164n.put(H10, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.f23165o.rewind();
                H10.copyPixelsFromBuffer(this.f23165o);
                if (this.f23155e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.f31241z.f31243b);
                    C0451b c0451b = this.f31241z;
                    byte b10 = c0451b.f31242a;
                    if (b10 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b10 == 2) {
                        c0451b.f31244c.rewind();
                        H10.copyPixelsFromBuffer(this.f31241z.f31244c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).f31249b == 2) {
                    C0451b c0451b2 = this.f31241z;
                    if (c0451b2.f31242a != 2) {
                        c0451b2.f31244c.rewind();
                        H10.copyPixelsToBuffer(this.f31241z.f31244c);
                    }
                }
                this.f31241z.f31242a = ((c) aVar).f31249b;
                canvas2.save();
                if (((c) aVar).f31248a == 0) {
                    int i10 = aVar.frameX;
                    int i11 = this.f23161k;
                    int i12 = aVar.frameY;
                    canvas2.clipRect(i10 / i11, i12 / i11, (i10 + aVar.frameWidth) / i11, (i12 + aVar.frameHeight) / i11);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.f31241z.f31243b;
                int i13 = aVar.frameX;
                int i14 = this.f23161k;
                int i15 = aVar.frameY;
                rect.set(i13 / i14, i15 / i14, (i13 + aVar.frameWidth) / i14, (i15 + aVar.frameHeight) / i14);
                canvas2.restore();
            }
            Bitmap H11 = H(aVar.frameWidth, aVar.frameHeight);
            J(aVar.draw(canvas2, this.f31240y, this.f23161k, H11, C()));
            J(H11);
            this.f23165o.rewind();
            H10.copyPixelsToBuffer(this.f23165o);
            J(H10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C3087a A(Reader reader) {
        return new C3087a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public C3088b C() {
        if (this.f31238w == null) {
            this.f31238w = new C3088b();
        }
        return this.f31238w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect I(C3087a c3087a) {
        List b10 = d.b(c3087a);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        Iterator it = b10.iterator();
        c cVar = null;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e eVar = (e) it.next();
            boolean z11 = eVar instanceof i;
            if (z11) {
                Log.e(f31237A, "chunk read reach to end");
                break;
            }
            if (eVar instanceof C2993a) {
                this.f31239x = ((C2993a) eVar).f31236f;
                z10 = true;
            } else if (eVar instanceof f) {
                cVar = new c(c3087a, (f) eVar);
                cVar.f31252e = arrayList;
                cVar.f31250c = bArr;
                this.f23154d.add(cVar);
            } else if (eVar instanceof g) {
                if (cVar != null) {
                    cVar.f31251d.add(eVar);
                }
            } else if (eVar instanceof h) {
                if (!z10) {
                    k kVar = new k(c3087a);
                    kVar.frameWidth = i10;
                    kVar.frameHeight = i11;
                    this.f23154d.add(kVar);
                    this.f31239x = 1;
                    break;
                }
                if (cVar != null) {
                    cVar.f31251d.add(eVar);
                }
            } else if (eVar instanceof j) {
                j jVar = (j) eVar;
                i10 = jVar.f31272e;
                i11 = jVar.f31273f;
                bArr = jVar.f31274g;
            } else if (!z11) {
                arrayList.add(eVar);
            }
        }
        int i12 = i10 * i11;
        int i13 = this.f23161k;
        this.f23165o = ByteBuffer.allocate(((i12 / (i13 * i13)) + 1) * 4);
        C0451b c0451b = this.f31241z;
        int i14 = this.f23161k;
        c0451b.f31244c = ByteBuffer.allocate(((i12 / (i14 * i14)) + 1) * 4);
        return new Rect(0, 0, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f31239x;
    }
}
