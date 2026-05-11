package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1485b;
import t0.InterfaceMenuItemC4603b;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3584a implements InterfaceMenuItemC4603b {

    /* renamed from: a, reason: collision with root package name */
    private final int f36866a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36867b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36868c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f36869d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f36870e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f36871f;

    /* renamed from: g, reason: collision with root package name */
    private char f36872g;

    /* renamed from: i, reason: collision with root package name */
    private char f36874i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f36876k;

    /* renamed from: l, reason: collision with root package name */
    private Context f36877l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f36878m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f36879n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f36880o;

    /* renamed from: h, reason: collision with root package name */
    private int f36873h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f36875j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f36881p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f36882q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f36883r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f36884s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f36885t = 16;

    public C3584a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f36877l = context;
        this.f36866a = i11;
        this.f36867b = i10;
        this.f36868c = i13;
        this.f36869d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f36876k;
        if (drawable != null) {
            if (this.f36883r || this.f36884s) {
                Drawable l10 = androidx.core.graphics.drawable.a.l(drawable);
                this.f36876k = l10;
                Drawable mutate = l10.mutate();
                this.f36876k = mutate;
                if (this.f36883r) {
                    androidx.core.graphics.drawable.a.i(mutate, this.f36881p);
                }
                if (this.f36884s) {
                    androidx.core.graphics.drawable.a.j(this.f36876k, this.f36882q);
                }
            }
        }
    }

    @Override // t0.InterfaceMenuItemC4603b
    public InterfaceMenuItemC4603b a(AbstractC1485b abstractC1485b) {
        throw new UnsupportedOperationException();
    }

    @Override // t0.InterfaceMenuItemC4603b
    public AbstractC1485b b() {
        return null;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4603b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4603b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC4603b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f36875j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f36874i;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f36879n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f36867b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f36876k;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f36881p;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f36882q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f36871f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f36866a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f36873h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f36872g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f36868c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f36869d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f36870e;
        return charSequence != null ? charSequence : this.f36869d;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f36880o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f36885t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f36885t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f36885t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f36885t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f36874i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f36885t = (z10 ? 1 : 0) | (this.f36885t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f36885t = (z10 ? 2 : 0) | (this.f36885t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f36885t = (z10 ? 16 : 0) | (this.f36885t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f36876k = drawable;
        c();
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f36881p = colorStateList;
        this.f36883r = true;
        c();
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f36882q = mode;
        this.f36884s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f36871f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f36872g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f36878m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f36872g = c10;
        this.f36874i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f36869d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f36870e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f36885t = (this.f36885t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f36874i = Character.toLowerCase(c10);
        this.f36875j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4603b setContentDescription(CharSequence charSequence) {
        this.f36879n = charSequence;
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f36872g = c10;
        this.f36873h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f36869d = this.f36877l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC4603b setTooltipText(CharSequence charSequence) {
        this.f36880o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f36876k = androidx.core.content.a.e(this.f36877l, i10);
        c();
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f36872g = c10;
        this.f36873h = KeyEvent.normalizeMetaState(i10);
        this.f36874i = Character.toLowerCase(c11);
        this.f36875j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // t0.InterfaceMenuItemC4603b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
