package z0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: z0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5230C {
    public static void a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
