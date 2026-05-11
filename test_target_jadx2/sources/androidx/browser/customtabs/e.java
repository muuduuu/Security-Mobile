package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.b;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private Context f14302a;

    class a extends c {
        a(b.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    void b(Context context) {
        this.f14302a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f14302a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(b.a.p(iBinder), componentName, this.f14302a));
    }
}
