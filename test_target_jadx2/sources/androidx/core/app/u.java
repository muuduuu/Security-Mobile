package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.s;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f15840a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f15841b = new Object();

    static Bundle a(s.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d10 = aVar.d();
        bundle.putInt("icon", d10 != null ? d10.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(A a10) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(A[] aArr) {
        if (aArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[aArr.length];
        for (int i10 = 0; i10 < aArr.length; i10++) {
            A a10 = aArr[i10];
            bundleArr[i10] = b(null);
        }
        return bundleArr;
    }
}
