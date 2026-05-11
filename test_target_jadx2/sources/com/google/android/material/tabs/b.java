package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
class b extends c {
    b() {
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        if (f10 >= 0.5f) {
            view = view2;
        }
        RectF a10 = c.a(tabLayout, view);
        float b10 = f10 < 0.5f ? I7.a.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : I7.a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
        drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b10 * 255.0f));
    }
}
