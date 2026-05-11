package b6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.github.penfeizhou.animation.decode.b;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import s1.AbstractC4306a;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1651a extends Drawable implements Animatable, b.j {

    /* renamed from: l, reason: collision with root package name */
    private static final String f18847l = "a";

    /* renamed from: a, reason: collision with root package name */
    private final Paint f18848a;

    /* renamed from: b, reason: collision with root package name */
    private final com.github.penfeizhou.animation.decode.b f18849b;

    /* renamed from: c, reason: collision with root package name */
    private final DrawFilter f18850c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f18851d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f18852e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f18853f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f18854g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f18855h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18856i;

    /* renamed from: j, reason: collision with root package name */
    private final Set f18857j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18858k;

    /* renamed from: b6.a$a, reason: collision with other inner class name */
    class HandlerC0325a extends Handler {
        HandlerC0325a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Iterator it = new ArrayList(AbstractC1651a.this.f18852e).iterator();
                while (it.hasNext()) {
                    ((AbstractC4306a) it.next()).b(AbstractC1651a.this);
                }
            } else {
                if (i10 != 2) {
                    return;
                }
                Iterator it2 = new ArrayList(AbstractC1651a.this.f18852e).iterator();
                while (it2.hasNext()) {
                    ((AbstractC4306a) it2.next()).a(AbstractC1651a.this);
                }
            }
        }
    }

    /* renamed from: b6.a$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1651a.this.invalidateSelf();
        }
    }

    public AbstractC1651a(com.github.penfeizhou.animation.decode.b bVar) {
        Paint paint = new Paint();
        this.f18848a = paint;
        this.f18850c = new PaintFlagsDrawFilter(0, 3);
        this.f18851d = new Matrix();
        this.f18852e = new HashSet();
        this.f18854g = new HandlerC0325a(Looper.getMainLooper());
        this.f18855h = new b();
        this.f18856i = true;
        this.f18857j = new HashSet();
        this.f18858k = false;
        paint.setAntiAlias(true);
        this.f18849b = bVar;
    }

    private void e() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        boolean z10 = false;
        for (WeakReference weakReference : new HashSet(this.f18857j)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z10 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f18857j.remove((WeakReference) it.next());
        }
        if (z10) {
            return;
        }
        this.f18857j.add(new WeakReference(callback));
    }

    private void f() {
        this.f18849b.p(this);
        if (this.f18856i) {
            this.f18849b.P();
        } else {
            if (this.f18849b.G()) {
                return;
            }
            this.f18849b.P();
        }
    }

    private void g() {
        this.f18849b.L(this);
        if (this.f18856i) {
            this.f18849b.R();
        } else {
            this.f18849b.S();
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void a(ByteBuffer byteBuffer) {
        if (isRunning()) {
            Bitmap bitmap = this.f18853f;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f18853f = Bitmap.createBitmap(this.f18849b.s().width() / this.f18849b.B(), this.f18849b.s().height() / this.f18849b.B(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f18853f.getByteCount()) {
                Log.e(f18847l, "onRender:Buffer not large enough for pixels");
            } else {
                this.f18853f.copyPixelsFromBuffer(byteBuffer);
                this.f18854g.post(this.f18855h);
            }
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void b() {
        Message.obtain(this.f18854g, 1).sendToTarget();
    }

    public int d() {
        int y10 = this.f18849b.y();
        Bitmap bitmap = this.f18853f;
        if (bitmap != null && !bitmap.isRecycled()) {
            y10 += this.f18853f.getAllocationByteCount();
        }
        return Math.max(1, y10);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f18853f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f18850c);
        canvas.drawBitmap(this.f18853f, this.f18851d, this.f18848a);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f18858k) {
            return -1;
        }
        try {
            return this.f18849b.s().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f18858k) {
            return -1;
        }
        try {
            return this.f18849b.s().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(boolean z10) {
        this.f18856i = z10;
    }

    public void i(boolean z10) {
        this.f18858k = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.f18857j).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f18849b.G();
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void onEnd() {
        Message.obtain(this.f18854g, 2).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18848a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int B10 = this.f18849b.B();
        int O10 = this.f18849b.O(getBounds().width(), getBounds().height());
        float f10 = O10;
        this.f18851d.setScale(((getBounds().width() * 1.0f) * f10) / this.f18849b.s().width(), ((getBounds().height() * 1.0f) * f10) / this.f18849b.s().height());
        if (O10 != B10) {
            this.f18853f = Bitmap.createBitmap(this.f18849b.s().width() / O10, this.f18849b.s().height() / O10, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18848a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        e();
        if (this.f18856i) {
            if (z10) {
                if (!isRunning()) {
                    f();
                }
            } else if (isRunning()) {
                g();
            }
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f18849b.G()) {
            this.f18849b.R();
        }
        this.f18849b.N();
        f();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        g();
    }
}
