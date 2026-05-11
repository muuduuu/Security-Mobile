package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.AbstractC1485b;
import g.AbstractC3177h;
import h.AbstractC3220a;
import org.conscrypt.BuildConfig;
import t0.InterfaceMenuItemC4603b;

/* loaded from: classes.dex */
public final class g implements InterfaceMenuItemC4603b {

    /* renamed from: A, reason: collision with root package name */
    private View f13514A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC1485b f13515B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f13516C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f13518E;

    /* renamed from: a, reason: collision with root package name */
    private final int f13519a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13520b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13521c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13522d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f13523e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f13524f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f13525g;

    /* renamed from: h, reason: collision with root package name */
    private char f13526h;

    /* renamed from: j, reason: collision with root package name */
    private char f13528j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f13530l;

    /* renamed from: n, reason: collision with root package name */
    e f13532n;

    /* renamed from: o, reason: collision with root package name */
    private m f13533o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f13534p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f13535q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f13536r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f13537s;

    /* renamed from: z, reason: collision with root package name */
    private int f13544z;

    /* renamed from: i, reason: collision with root package name */
    private int f13527i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f13529k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f13531m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f13538t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f13539u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13540v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13541w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13542x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f13543y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f13517D = false;

    class a implements AbstractC1485b.InterfaceC0274b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1485b.InterfaceC0274b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f13532n.K(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f13532n = eVar;
        this.f13519a = i11;
        this.f13520b = i10;
        this.f13521c = i12;
        this.f13522d = i13;
        this.f13523e = charSequence;
        this.f13544z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f13542x && (this.f13540v || this.f13541w)) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            if (this.f13540v) {
                androidx.core.graphics.drawable.a.i(drawable, this.f13538t);
            }
            if (this.f13541w) {
                androidx.core.graphics.drawable.a.j(drawable, this.f13539u);
            }
            this.f13542x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f13532n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f13544z & 4) == 4;
    }

    @Override // t0.InterfaceMenuItemC4603b
    public InterfaceMenuItemC4603b a(AbstractC1485b abstractC1485b) {
        AbstractC1485b abstractC1485b2 = this.f13515B;
        if (abstractC1485b2 != null) {
            abstractC1485b2.g();
        }
        this.f13514A = null;
        this.f13515B = abstractC1485b;
        this.f13532n.L(true);
        AbstractC1485b abstractC1485b3 = this.f13515B;
        if (abstractC1485b3 != null) {
            abstractC1485b3.i(new a());
        }
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b
    public AbstractC1485b b() {
        return this.f13515B;
    }

    public void c() {
        this.f13532n.J(this);
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f13544z & 8) == 0) {
            return false;
        }
        if (this.f13514A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13516C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f13532n.f(this);
        }
        return false;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13516C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f13532n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f13522d;
    }

    char g() {
        return this.f13532n.H() ? this.f13528j : this.f13526h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public View getActionView() {
        View view = this.f13514A;
        if (view != null) {
            return view;
        }
        AbstractC1485b abstractC1485b = this.f13515B;
        if (abstractC1485b == null) {
            return null;
        }
        View c10 = abstractC1485b.c(this);
        this.f13514A = c10;
        return c10;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f13529k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f13528j;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f13536r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f13520b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f13530l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f13531m == 0) {
            return null;
        }
        Drawable b10 = AbstractC3220a.b(this.f13532n.u(), this.f13531m);
        this.f13531m = 0;
        this.f13530l = b10;
        return e(b10);
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f13538t;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f13539u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f13525g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f13519a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f13518E;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f13527i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f13526h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f13521c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f13533o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f13523e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13524f;
        return charSequence != null ? charSequence : this.f13523e;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f13537s;
    }

    String h() {
        char g10 = g();
        if (g10 == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f13532n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f13532n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(AbstractC3177h.f33234m));
        }
        int i10 = this.f13532n.H() ? this.f13529k : this.f13527i;
        d(sb2, i10, 65536, resources.getString(AbstractC3177h.f33230i));
        d(sb2, i10, 4096, resources.getString(AbstractC3177h.f33226e));
        d(sb2, i10, 2, resources.getString(AbstractC3177h.f33225d));
        d(sb2, i10, 1, resources.getString(AbstractC3177h.f33231j));
        d(sb2, i10, 4, resources.getString(AbstractC3177h.f33233l));
        d(sb2, i10, 8, resources.getString(AbstractC3177h.f33229h));
        if (g10 == '\b') {
            sb2.append(resources.getString(AbstractC3177h.f33227f));
        } else if (g10 == '\n') {
            sb2.append(resources.getString(AbstractC3177h.f33228g));
        } else if (g10 != ' ') {
            sb2.append(g10);
        } else {
            sb2.append(resources.getString(AbstractC3177h.f33232k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f13533o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f13517D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f13543y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f13543y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f13543y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1485b abstractC1485b = this.f13515B;
        return (abstractC1485b == null || !abstractC1485b.f()) ? (this.f13543y & 8) == 0 : (this.f13543y & 8) == 0 && this.f13515B.b();
    }

    public boolean j() {
        AbstractC1485b abstractC1485b;
        if ((this.f13544z & 8) == 0) {
            return false;
        }
        if (this.f13514A == null && (abstractC1485b = this.f13515B) != null) {
            this.f13514A = abstractC1485b.c(this);
        }
        return this.f13514A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f13535q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f13532n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f13534p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f13525g != null) {
            try {
                this.f13532n.u().startActivity(this.f13525g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC1485b abstractC1485b = this.f13515B;
        return abstractC1485b != null && abstractC1485b.d();
    }

    public boolean l() {
        return (this.f13543y & 32) == 32;
    }

    public boolean m() {
        return (this.f13543y & 4) != 0;
    }

    public boolean n() {
        return (this.f13544z & 1) == 1;
    }

    public boolean o() {
        return (this.f13544z & 2) == 2;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4603b setActionView(int i10) {
        Context u10 = this.f13532n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4603b setActionView(View view) {
        int i10;
        this.f13514A = view;
        this.f13515B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f13519a) > 0) {
            view.setId(i10);
        }
        this.f13532n.J(this);
        return this;
    }

    public void r(boolean z10) {
        this.f13517D = z10;
        this.f13532n.L(false);
    }

    void s(boolean z10) {
        int i10 = this.f13543y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f13543y = i11;
        if (i10 != i11) {
            this.f13532n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f13528j == c10) {
            return this;
        }
        this.f13528j = Character.toLowerCase(c10);
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f13543y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f13543y = i11;
        if (i10 != i11) {
            this.f13532n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f13543y & 4) != 0) {
            this.f13532n.U(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f13543y |= 16;
        } else {
            this.f13543y &= -17;
        }
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f13531m = 0;
        this.f13530l = drawable;
        this.f13542x = true;
        this.f13532n.L(false);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13538t = colorStateList;
        this.f13540v = true;
        this.f13542x = true;
        this.f13532n.L(false);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13539u = mode;
        this.f13541w = true;
        this.f13542x = true;
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f13525g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f13526h == c10) {
            return this;
        }
        this.f13526h = c10;
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13516C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13535q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f13526h = c10;
        this.f13528j = Character.toLowerCase(c11);
        this.f13532n.L(false);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13544z = i10;
        this.f13532n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f13523e = charSequence;
        this.f13532n.L(false);
        m mVar = this.f13533o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13524f = charSequence;
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f13532n.K(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f13543y = (z10 ? 4 : 0) | (this.f13543y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f13523e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f13543y |= 32;
        } else {
            this.f13543y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f13518E = contextMenuInfo;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4603b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f13533o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f13543y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f13543y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f13532n.A();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4603b setContentDescription(CharSequence charSequence) {
        this.f13536r = charSequence;
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4603b setTooltipText(CharSequence charSequence) {
        this.f13537s = charSequence;
        this.f13532n.L(false);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f13528j == c10 && this.f13529k == i10) {
            return this;
        }
        this.f13528j = Character.toLowerCase(c10);
        this.f13529k = KeyEvent.normalizeMetaState(i10);
        this.f13532n.L(false);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f13526h == c10 && this.f13527i == i10) {
            return this;
        }
        this.f13526h = c10;
        this.f13527i = KeyEvent.normalizeMetaState(i10);
        this.f13532n.L(false);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f13526h = c10;
        this.f13527i = KeyEvent.normalizeMetaState(i10);
        this.f13528j = Character.toLowerCase(c11);
        this.f13529k = KeyEvent.normalizeMetaState(i11);
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f13530l = null;
        this.f13531m = i10;
        this.f13542x = true;
        this.f13532n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f13532n.u().getString(i10));
    }
}
