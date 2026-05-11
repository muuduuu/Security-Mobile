package p6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import n6.InterfaceC3710b;
import q6.C3923a;
import q6.C3924b;

/* loaded from: classes2.dex */
public class l extends com.github.penfeizhou.animation.decode.b {

    /* renamed from: A, reason: collision with root package name */
    private int f38358A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f38359B;

    /* renamed from: C, reason: collision with root package name */
    private int f38360C;

    /* renamed from: D, reason: collision with root package name */
    private C3924b f38361D;

    /* renamed from: w, reason: collision with root package name */
    private final Paint f38362w;

    /* renamed from: x, reason: collision with root package name */
    private Paint f38363x;

    /* renamed from: y, reason: collision with root package name */
    private int f38364y;

    /* renamed from: z, reason: collision with root package name */
    private int f38365z;

    public l(InterfaceC3710b interfaceC3710b, b.j jVar) {
        super(interfaceC3710b, jVar);
        Paint paint = new Paint();
        this.f38362w = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M(com.github.penfeizhou.animation.decode.a aVar) {
        Bitmap H10;
        Bitmap bitmap;
        int i10;
        if (aVar == null || this.f23166p == null || this.f23166p.width() <= 0 || this.f23166p.height() <= 0 || (H10 = H(this.f23166p.width() / this.f23161k, this.f23166p.height() / this.f23161k)) == null) {
            return;
        }
        Canvas canvas = (Canvas) this.f23164n.get(H10);
        if (canvas == null) {
            canvas = new Canvas(H10);
            this.f23164n.put(H10, canvas);
        }
        this.f23165o.rewind();
        H10.copyPixelsFromBuffer(this.f23165o);
        int i11 = this.f23155e;
        if (i11 != 0) {
            com.github.penfeizhou.animation.decode.a aVar2 = (com.github.penfeizhou.animation.decode.a) this.f23154d.get(i11 - 1);
            if ((aVar2 instanceof C3800d) && ((C3800d) aVar2).f38345d) {
                int i12 = aVar2.frameX;
                int i13 = this.f23161k;
                canvas.drawRect((i12 * 2.0f) / i13, (aVar2.frameY * 2.0f) / i13, ((i12 * 2) + aVar2.frameWidth) / i13, ((r7 * 2) + aVar2.frameHeight) / i13, this.f38362w);
            }
        } else if (this.f38359B) {
            canvas.drawColor(0, PorterDuff.Mode.SRC);
        } else {
            canvas.drawColor(this.f38360C, PorterDuff.Mode.SRC);
        }
        int i14 = aVar.frameWidth;
        if (i14 <= 0 || (i10 = aVar.frameHeight) <= 0) {
            bitmap = null;
        } else {
            int i15 = this.f23161k;
            bitmap = H(i14 / i15, i10 / i15);
        }
        J(aVar.draw(canvas, this.f38363x, this.f23161k, bitmap, C()));
        J(bitmap);
        this.f23165o.rewind();
        H10.copyPixelsToBuffer(this.f23165o);
        J(H10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C3923a A(Reader reader) {
        return new C3923a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public C3924b C() {
        if (this.f38361D == null) {
            this.f38361D = new C3924b();
        }
        return this.f38361D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect I(C3923a c3923a) {
        boolean z10 = false;
        boolean z11 = false;
        for (e eVar : m.b(c3923a)) {
            if (eVar instanceof k) {
                k kVar = (k) eVar;
                this.f38365z = kVar.f38356e;
                this.f38358A = kVar.f38357f;
                this.f38359B = kVar.d();
                z11 = true;
            } else if (eVar instanceof C3798b) {
                C3798b c3798b = (C3798b) eVar;
                this.f38360C = c3798b.f38328d;
                this.f38364y = c3798b.f38329e;
                z10 = true;
            } else if (eVar instanceof C3799c) {
                this.f23154d.add(new C3800d(c3923a, (C3799c) eVar));
            }
        }
        if (!z10) {
            if (!z11) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(c3923a.toInputStream(), null, options);
                this.f38365z = options.outWidth;
                this.f38358A = options.outHeight;
            }
            this.f23154d.add(new h(c3923a, this.f38365z, this.f38358A));
            this.f38364y = 1;
        }
        Paint paint = new Paint();
        this.f38363x = paint;
        paint.setAntiAlias(true);
        if (!this.f38359B) {
            this.f38362w.setColor(this.f38360C);
        }
        return new Rect(0, 0, this.f38365z, this.f38358A);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f38364y;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void K() {
    }
}
