package V3;

import T3.b;
import T3.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final T3.a f10812a;

    /* renamed from: b, reason: collision with root package name */
    private final b f10813b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f10814c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10815d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10816a;

        static {
            int[] iArr = new int[c.values().length];
            f10816a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10816a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10816a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10816a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void a(int i10, Bitmap bitmap);

        AbstractC3142a b(int i10);
    }

    private enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(T3.a aVar, boolean z10, b bVar) {
        this.f10812a = aVar;
        this.f10813b = bVar;
        this.f10815d = z10;
        Paint paint = new Paint();
        this.f10814c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, T3.b bVar) {
        canvas.drawRect(bVar.f9243b, bVar.f9244c, r0 + bVar.f9245d, r1 + bVar.f9246e, this.f10814c);
    }

    private c b(int i10) {
        T3.b c10 = this.f10812a.c(i10);
        b.EnumC0181b enumC0181b = c10.f9248g;
        return enumC0181b == b.EnumC0181b.DISPOSE_DO_NOT ? c.REQUIRED : enumC0181b == b.EnumC0181b.DISPOSE_TO_BACKGROUND ? c(c10) ? c.NOT_REQUIRED : c.REQUIRED : enumC0181b == b.EnumC0181b.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT;
    }

    private boolean c(T3.b bVar) {
        return bVar.f9243b == 0 && bVar.f9244c == 0 && bVar.f9245d == this.f10812a.j() && bVar.f9246e == this.f10812a.h();
    }

    private boolean d(int i10) {
        if (i10 == 0) {
            return true;
        }
        T3.b c10 = this.f10812a.c(i10);
        T3.b c11 = this.f10812a.c(i10 - 1);
        if (c10.f9247f == b.a.NO_BLEND && c(c10)) {
            return true;
        }
        return c11.f9248g == b.EnumC0181b.DISPOSE_TO_BACKGROUND && c(c11);
    }

    private void e(Bitmap bitmap) {
        e k10 = this.f10812a.k();
        if (k10 == null) {
            return;
        }
        k10.c();
    }

    private int f(int i10, Canvas canvas) {
        while (i10 >= 0) {
            int i11 = a.f10816a[b(i10).ordinal()];
            if (i11 == 1) {
                T3.b c10 = this.f10812a.c(i10);
                AbstractC3142a b10 = this.f10813b.b(i10);
                if (b10 != null) {
                    try {
                        canvas.drawBitmap((Bitmap) b10.p(), 0.0f, 0.0f, (Paint) null);
                        if (c10.f9248g == b.EnumC0181b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, c10);
                        }
                        return i10 + 1;
                    } finally {
                        if (!this.f10815d) {
                            b10.close();
                        }
                    }
                }
                if (d(i10)) {
                    return i10;
                }
            } else {
                if (i11 == 2) {
                    return i10 + 1;
                }
                if (i11 == 3) {
                    return i10;
                }
            }
            i10--;
        }
        return 0;
    }

    public void g(int i10, Bitmap bitmap) {
        this.f10812a.i(i10, new Canvas(bitmap));
    }

    public void h(int i10, Bitmap bitmap) {
        if (this.f10815d) {
            g(i10, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int f10 = !d(i10) ? f(i10 - 1, canvas) : i10; f10 < i10; f10++) {
            T3.b c10 = this.f10812a.c(f10);
            b.EnumC0181b enumC0181b = c10.f9248g;
            if (enumC0181b != b.EnumC0181b.DISPOSE_TO_PREVIOUS) {
                if (c10.f9247f == b.a.NO_BLEND) {
                    a(canvas, c10);
                }
                this.f10812a.e(f10, canvas);
                this.f10813b.a(f10, bitmap);
                if (enumC0181b == b.EnumC0181b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, c10);
                }
            }
        }
        T3.b c11 = this.f10812a.c(i10);
        if (c11.f9247f == b.a.NO_BLEND) {
            a(canvas, c11);
        }
        this.f10812a.e(i10, canvas);
        e(bitmap);
    }
}
