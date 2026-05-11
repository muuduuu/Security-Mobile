package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import g.AbstractC3178i;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f13317f;

    /* renamed from: a, reason: collision with root package name */
    private int f13318a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f13319b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f13320c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f13321d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f13322e;

    public d(Context context, int i10) {
        super(context);
        this.f13318a = i10;
    }

    private Resources b() {
        if (this.f13322e == null) {
            Configuration configuration = this.f13321d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f13322e = super.getResources();
            } else {
                this.f13322e = createConfigurationContext(this.f13321d).getResources();
            }
        }
        return this.f13322e;
    }

    private void d() {
        boolean z10 = this.f13319b == null;
        if (z10) {
            this.f13319b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13319b.setTo(theme);
            }
        }
        f(this.f13319b, this.f13318a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f13317f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f13317f = configuration2;
        }
        return configuration.equals(f13317f);
    }

    public void a(Configuration configuration) {
        if (this.f13322e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f13321d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f13321d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f13318a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13320c == null) {
            this.f13320c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f13320c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f13319b;
        if (theme != null) {
            return theme;
        }
        if (this.f13318a == 0) {
            this.f13318a = AbstractC3178i.f33239d;
        }
        d();
        return this.f13319b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f13318a != i10) {
            this.f13318a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f13319b = theme;
    }
}
