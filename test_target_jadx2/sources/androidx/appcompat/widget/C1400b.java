package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1400b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f14025a;

    /* renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C1400b(ActionBarContainer actionBarContainer) {
        this.f14025a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f14025a;
        if (actionBarContainer.f13621h) {
            Drawable drawable = actionBarContainer.f13620g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f13618e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f14025a;
        Drawable drawable3 = actionBarContainer2.f13619f;
        if (drawable3 == null || !actionBarContainer2.f13622i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f14025a;
        if (actionBarContainer.f13621h) {
            if (actionBarContainer.f13620g != null) {
                a.a(actionBarContainer.f13618e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f13618e;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
