package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14141c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f14142d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f14143a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f14144b;

    private e0(Context context) {
        super(context);
        if (!r0.c()) {
            this.f14143a = new g0(this, context.getResources());
            this.f14144b = null;
            return;
        }
        r0 r0Var = new r0(this, context.getResources());
        this.f14143a = r0Var;
        Resources.Theme newTheme = r0Var.newTheme();
        this.f14144b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof e0) || (context.getResources() instanceof g0) || (context.getResources() instanceof r0)) {
            return false;
        }
        return r0.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f14141c) {
            try {
                ArrayList arrayList = f14142d;
                if (arrayList == null) {
                    f14142d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f14142d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f14142d.remove(size);
                        }
                    }
                    for (int size2 = f14142d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f14142d.get(size2);
                        e0 e0Var = weakReference2 != null ? (e0) weakReference2.get() : null;
                        if (e0Var != null && e0Var.getBaseContext() == context) {
                            return e0Var;
                        }
                    }
                }
                e0 e0Var2 = new e0(context);
                f14142d.add(new WeakReference(e0Var2));
                return e0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f14143a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f14143a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f14144b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f14144b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
