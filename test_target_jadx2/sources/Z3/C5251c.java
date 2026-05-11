package z3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import y3.g;
import y3.s;
import y3.t;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5251c extends g implements s {

    /* renamed from: e, reason: collision with root package name */
    Drawable f45722e;

    /* renamed from: f, reason: collision with root package name */
    private t f45723f;

    public C5251c(Drawable drawable) {
        super(drawable);
        this.f45722e = null;
    }

    @Override // y3.s
    public void d(t tVar) {
        this.f45723f = tVar;
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            t tVar = this.f45723f;
            if (tVar != null) {
                tVar.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f45722e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f45722e.draw(canvas);
            }
        }
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // y3.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        t tVar = this.f45723f;
        if (tVar != null) {
            tVar.b(z10);
        }
        return super.setVisible(z10, z11);
    }

    public void x(Drawable drawable) {
        this.f45722e = drawable;
        invalidateSelf();
    }
}
