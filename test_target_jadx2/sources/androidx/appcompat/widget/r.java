package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class r extends ImageView {
    private final C1403e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C1415q mImageHelper;

    public r(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1403e c1403e = this.mBackgroundTintHelper;
        if (c1403e != null) {
            c1403e.b();
        }
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            c1415q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1403e c1403e = this.mBackgroundTintHelper;
        if (c1403e != null) {
            return c1403e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1403e c1403e = this.mBackgroundTintHelper;
        if (c1403e != null) {
            return c1403e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            return c1415q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            return c1415q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1403e c1403e = this.mBackgroundTintHelper;
        if (c1403e != null) {
            c1403e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1403e c1403e = this.mBackgroundTintHelper;
        if (c1403e != null) {
            c1403e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            c1415q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null && drawable != null && !this.mHasLevel) {
            c1415q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1415q c1415q2 = this.mImageHelper;
        if (c1415q2 != null) {
            c1415q2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            c1415q.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            c1415q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1403e c1403e = this.mBackgroundTintHelper;
        if (c1403e != null) {
            c1403e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1403e c1403e = this.mBackgroundTintHelper;
        if (c1403e != null) {
            c1403e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            c1415q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1415q c1415q = this.mImageHelper;
        if (c1415q != null) {
            c1415q.k(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        this.mHasLevel = false;
        d0.a(this, getContext());
        C1403e c1403e = new C1403e(this);
        this.mBackgroundTintHelper = c1403e;
        c1403e.e(attributeSet, i10);
        C1415q c1415q = new C1415q(this);
        this.mImageHelper = c1415q;
        c1415q.g(attributeSet, i10);
    }
}
