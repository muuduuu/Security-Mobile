package Q2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125d extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8085b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f8086a;

    /* renamed from: Q2.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1125d a(Context context, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C1125d(androidx.core.content.a.c(context, i10), androidx.core.content.a.c(context, i11), context.getResources().getDimensionPixelSize(i12));
        }

        private a() {
        }
    }

    public C1125d(int i10, int i11, int i12) {
        Paint paint = new Paint();
        int i13 = i12 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i10);
        paint.setColor(i11);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(i12, 0, i13, i12);
        canvas.drawRect(rect, paint);
        rect.offsetTo(0, i12);
        canvas.drawRect(rect, paint);
        paint.reset();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        Unit unit = Unit.f36324a;
        this.f8086a = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPaint(this.f8086a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f8086a.getColorFilter() == null ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f8086a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8086a.setColorFilter(colorFilter);
    }
}
