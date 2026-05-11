package z0;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5233b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
