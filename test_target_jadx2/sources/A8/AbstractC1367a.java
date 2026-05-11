package a8;

import H7.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1367a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12645a = {R.attr.theme, b.f3126R};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f12646b = {b.f3111C};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12645a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12646b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i10, int i11) {
        int b10 = b(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof d) && ((d) context).c() == b10;
        if (b10 == 0 || z10) {
            return context;
        }
        d dVar = new d(context, b10);
        int a10 = a(context, attributeSet);
        if (a10 != 0) {
            dVar.getTheme().applyStyle(a10, true);
        }
        return dVar;
    }
}
