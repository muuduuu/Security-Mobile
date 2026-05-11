package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1579v {
    public ComponentCallbacksC1573o b(Context context, String str, Bundle bundle) {
        return ComponentCallbacksC1573o.instantiate(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
