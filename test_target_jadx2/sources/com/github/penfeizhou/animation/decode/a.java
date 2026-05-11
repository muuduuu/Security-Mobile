package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.e;

/* loaded from: classes2.dex */
public abstract class a {
    public int frameDuration;
    public int frameHeight;
    public int frameWidth;
    public int frameX;
    public int frameY;
    protected final Reader reader;
    protected final Rect srcRect = new Rect();
    protected final Rect dstRect = new Rect();

    public a(Reader reader) {
        this.reader = reader;
    }

    public abstract Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, e eVar);
}
