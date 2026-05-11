package z0;

import android.view.accessibility.AccessibilityManager;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5234c {

    /* renamed from: z0.c$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* renamed from: z0.c$b */
    private static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final a f45657a;

        b(a aVar) {
            this.f45657a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f45657a.equals(((b) obj).f45657a);
            }
            return false;
        }

        public int hashCode() {
            return this.f45657a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f45657a.onTouchExplorationStateChanged(z10);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
