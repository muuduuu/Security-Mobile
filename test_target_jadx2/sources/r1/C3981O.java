package r1;

import android.view.View;
import android.view.WindowId;

/* renamed from: r1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3981O implements InterfaceC3982P {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f38983a;

    C3981O(View view) {
        this.f38983a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3981O) && ((C3981O) obj).f38983a.equals(this.f38983a);
    }

    public int hashCode() {
        return this.f38983a.hashCode();
    }
}
