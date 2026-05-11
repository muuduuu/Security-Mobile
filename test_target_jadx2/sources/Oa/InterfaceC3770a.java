package oa;

import android.app.Activity;

/* renamed from: oa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3770a {

    /* renamed from: oa.a$a, reason: collision with other inner class name */
    public static final class C0581a {
        public static /* synthetic */ void a(InterfaceC3770a interfaceC3770a, Activity activity, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMenu");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            interfaceC3770a.a(activity, str);
        }
    }

    void a(Activity activity, String str);
}
