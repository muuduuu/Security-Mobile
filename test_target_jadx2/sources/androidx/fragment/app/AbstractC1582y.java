package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.app.AbstractC1480b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1582y extends AbstractC1579v {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f17024a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17025b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f17026c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17027d;

    /* renamed from: e, reason: collision with root package name */
    final G f17028e;

    AbstractC1582y(AbstractActivityC1577t abstractActivityC1577t) {
        this(abstractActivityC1577t, abstractActivityC1577t, new Handler(), 0);
    }

    Activity e() {
        return this.f17024a;
    }

    Context f() {
        return this.f17025b;
    }

    public Handler g() {
        return this.f17026c;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public void k(ComponentCallbacksC1573o componentCallbacksC1573o, String[] strArr, int i10) {
    }

    public abstract boolean l(String str);

    public void m(ComponentCallbacksC1573o componentCallbacksC1573o, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.n(this.f17025b, intent, bundle);
    }

    public void n(ComponentCallbacksC1573o componentCallbacksC1573o, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        AbstractC1480b.A(this.f17024a, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public abstract void o();

    AbstractC1582y(Activity activity, Context context, Handler handler, int i10) {
        this.f17028e = new H();
        this.f17024a = activity;
        this.f17025b = (Context) y0.f.h(context, "context == null");
        this.f17026c = (Handler) y0.f.h(handler, "handler == null");
        this.f17027d = i10;
    }
}
