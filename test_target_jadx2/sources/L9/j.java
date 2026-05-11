package L9;

import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public abstract class j {
    public static final void a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.removeView(viewGroup);
    }
}
