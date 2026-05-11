package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public abstract class C {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
