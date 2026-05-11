package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1485b;
import java.lang.reflect.Method;
import t0.InterfaceMenuItemC4603b;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuItemC3586c extends AbstractC3585b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceMenuItemC4603b f36889d;

    /* renamed from: e, reason: collision with root package name */
    private Method f36890e;

    /* renamed from: l.c$a */
    private class a extends AbstractC1485b implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private AbstractC1485b.InterfaceC0274b f36891d;

        /* renamed from: e, reason: collision with root package name */
        private final ActionProvider f36892e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f36892e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1485b
        public boolean a() {
            return this.f36892e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1485b
        public boolean b() {
            return this.f36892e.isVisible();
        }

        @Override // androidx.core.view.AbstractC1485b
        public View c(MenuItem menuItem) {
            return this.f36892e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1485b
        public boolean d() {
            return this.f36892e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1485b
        public void e(SubMenu subMenu) {
            this.f36892e.onPrepareSubMenu(MenuItemC3586c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC1485b
        public boolean f() {
            return this.f36892e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1485b
        public void i(AbstractC1485b.InterfaceC0274b interfaceC0274b) {
            this.f36891d = interfaceC0274b;
            this.f36892e.setVisibilityListener(interfaceC0274b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC1485b.InterfaceC0274b interfaceC0274b = this.f36891d;
            if (interfaceC0274b != null) {
                interfaceC0274b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* renamed from: l.c$b */
    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        final CollapsibleActionView f36894a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f36894a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f36894a;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f36894a.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void f() {
            this.f36894a.onActionViewCollapsed();
        }
    }

    /* renamed from: l.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0543c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f36895a;

        MenuItemOnActionExpandListenerC0543c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f36895a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f36895a.onMenuItemActionCollapse(MenuItemC3586c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f36895a.onMenuItemActionExpand(MenuItemC3586c.this.c(menuItem));
        }
    }

    /* renamed from: l.c$d */
    private class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f36897a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f36897a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f36897a.onMenuItemClick(MenuItemC3586c.this.c(menuItem));
        }
    }

    public MenuItemC3586c(Context context, InterfaceMenuItemC4603b interfaceMenuItemC4603b) {
        super(context);
        if (interfaceMenuItemC4603b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f36889d = interfaceMenuItemC4603b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f36889d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f36889d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1485b b10 = this.f36889d.b();
        if (b10 instanceof a) {
            return ((a) b10).f36892e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f36889d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f36889d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f36889d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f36889d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f36889d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f36889d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f36889d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f36889d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f36889d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f36889d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f36889d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f36889d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f36889d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f36889d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f36889d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f36889d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f36889d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f36889d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f36890e == null) {
                this.f36890e = this.f36889d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f36890e.invoke(this.f36889d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f36889d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f36889d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f36889d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f36889d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f36889d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f36889d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f36886a, actionProvider);
        InterfaceMenuItemC4603b interfaceMenuItemC4603b = this.f36889d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC4603b.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f36889d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f36889d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f36889d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f36889d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f36889d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f36889d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f36889d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f36889d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f36889d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f36889d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f36889d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f36889d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0543c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f36889d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f36889d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f36889d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f36889d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f36889d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f36889d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f36889d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f36889d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f36889d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f36889d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f36889d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f36889d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f36889d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f36889d.setActionView(i10);
        View actionView = this.f36889d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f36889d.setActionView(new b(actionView));
        }
        return this;
    }
}
