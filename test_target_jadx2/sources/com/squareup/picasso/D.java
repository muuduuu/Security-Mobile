package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.u;

/* loaded from: classes2.dex */
public interface D {
    void onBitmapFailed(Exception exc, Drawable drawable);

    void onBitmapLoaded(Bitmap bitmap, u.e eVar);

    void onPrepareLoad(Drawable drawable);
}
