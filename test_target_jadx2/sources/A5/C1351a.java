package a5;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1351a f12609a = new C1351a();

    private C1351a() {
    }

    public static final int a(int i10) {
        return i10 % 2 == 0 ? 2 : 1;
    }

    public static final int b(int i10, int i11) {
        int i12 = i11 == -1 ? 1 : 2;
        if (i12 == 1 && !d(i10) && i10 % 2 == 0) {
            return 2;
        }
        return i12;
    }

    public static final int c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return a(view.getId());
    }

    public static final boolean d(int i10) {
        return i10 % 10 == 1;
    }
}
