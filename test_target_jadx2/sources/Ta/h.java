package Ta;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ViewParent;
import android.widget.ImageView;
import expo.modules.image.enums.ContentFit;
import expo.modules.image.records.ContentPosition;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends androidx.appcompat.widget.r {

    /* renamed from: a, reason: collision with root package name */
    private t f9584a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9585b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9586c;

    /* renamed from: d, reason: collision with root package name */
    private ContentFit f9587d;

    /* renamed from: e, reason: collision with root package name */
    private ContentFit f9588e;

    /* renamed from: f, reason: collision with root package name */
    private ContentPosition f9589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipToOutline(true);
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f9587d = ContentFit.Cover;
        this.f9588e = ContentFit.ScaleDown;
        this.f9589f = ContentPosition.INSTANCE.a();
    }

    private final void d(Drawable drawable, ContentFit contentFit, ContentPosition contentPosition, Integer num, Integer num2) {
        RectF rectF = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Matrix matrix$expo_image_release = contentFit.toMatrix$expo_image_release(rectF, rectF2, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        matrix$expo_image_release.mapRect(rectF);
        contentPosition.apply$expo_image_release(matrix$expo_image_release, rectF, rectF2);
        setImageMatrix(matrix$expo_image_release);
    }

    static /* synthetic */ void e(h hVar, Drawable drawable, ContentFit contentFit, ContentPosition contentPosition, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            contentPosition = ContentPosition.INSTANCE.a();
        }
        ContentPosition contentPosition2 = contentPosition;
        if ((i10 & 8) != 0) {
            t tVar = hVar.f9584a;
            num = tVar != null ? Integer.valueOf(tVar.s()) : null;
        }
        Integer num3 = num;
        if ((i10 & 16) != 0) {
            t tVar2 = hVar.f9584a;
            num2 = tVar2 != null ? Integer.valueOf(tVar2.r()) : null;
        }
        hVar.d(drawable, contentFit, contentPosition2, num3, num2);
    }

    public final void c() {
        if (getDrawable() == null) {
            return;
        }
        if (!this.f9585b) {
            Drawable drawable = getDrawable();
            Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
            e(this, drawable, this.f9587d, this.f9589f, null, null, 24, null);
            return;
        }
        Drawable drawable2 = getDrawable();
        ContentFit contentFit = this.f9588e;
        t tVar = this.f9584a;
        Integer valueOf = tVar != null ? Integer.valueOf(tVar.p()) : null;
        t tVar2 = this.f9584a;
        Integer valueOf2 = tVar2 != null ? Integer.valueOf(tVar2.q()) : null;
        Intrinsics.d(drawable2);
        e(this, drawable2, contentFit, null, valueOf2, valueOf, 4, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        com.bumptech.glide.l requestManager$expo_image_release;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null && bitmap.isRecycled()) {
            Log.e("ExpoImage", "Trying to use a recycled bitmap");
            t g10 = g();
            if (g10 != null) {
                ViewParent parent = getParent();
                k kVar = parent instanceof k ? (k) parent : null;
                if (kVar != null && (requestManager$expo_image_release = kVar.getRequestManager$expo_image_release()) != null) {
                    g10.e(requestManager$expo_image_release);
                }
            }
        }
        super.draw(canvas);
    }

    public final boolean f() {
        return this.f9585b;
    }

    public final t g() {
        setImageDrawable(null);
        t tVar = this.f9584a;
        if (tVar != null) {
            tVar.A(false);
        } else {
            tVar = null;
        }
        this.f9584a = null;
        setVisibility(8);
        this.f9585b = false;
        return tVar;
    }

    public final ContentFit getContentFit$expo_image_release() {
        return this.f9587d;
    }

    public final ContentPosition getContentPosition$expo_image_release() {
        return this.f9589f;
    }

    public final t getCurrentTarget() {
        return this.f9584a;
    }

    public final ContentFit getPlaceholderContentFit$expo_image_release() {
        return this.f9588e;
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c();
    }

    public final void setContentFit$expo_image_release(ContentFit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9587d = value;
        this.f9586c = true;
    }

    public final void setContentPosition$expo_image_release(ContentPosition value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9589f = value;
        this.f9586c = true;
    }

    public final void setCurrentTarget(t tVar) {
        this.f9584a = tVar;
    }

    public final void setPlaceholder(boolean z10) {
        this.f9585b = z10;
    }

    public final void setPlaceholderContentFit$expo_image_release(ContentFit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f9588e = value;
        this.f9586c = true;
    }

    public final void setTintColor$expo_image_release(Integer num) {
        Unit unit;
        if (num != null) {
            setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            unit = Unit.f36324a;
        } else {
            unit = null;
        }
        if (unit == null) {
            clearColorFilter();
        }
    }
}
