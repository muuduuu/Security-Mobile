package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import j0.i;
import t0.InterfaceMenuItemC4603b;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3585b {

    /* renamed from: a, reason: collision with root package name */
    final Context f36886a;

    /* renamed from: b, reason: collision with root package name */
    private i f36887b;

    /* renamed from: c, reason: collision with root package name */
    private i f36888c;

    AbstractC3585b(Context context) {
        this.f36886a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC4603b)) {
            return menuItem;
        }
        InterfaceMenuItemC4603b interfaceMenuItemC4603b = (InterfaceMenuItemC4603b) menuItem;
        if (this.f36887b == null) {
            this.f36887b = new i();
        }
        MenuItem menuItem2 = (MenuItem) this.f36887b.get(interfaceMenuItemC4603b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC3586c menuItemC3586c = new MenuItemC3586c(this.f36886a, interfaceMenuItemC4603b);
        this.f36887b.put(interfaceMenuItemC4603b, menuItemC3586c);
        return menuItemC3586c;
    }

    final void e() {
        i iVar = this.f36887b;
        if (iVar != null) {
            iVar.clear();
        }
        i iVar2 = this.f36888c;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    final void f(int i10) {
        if (this.f36887b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f36887b.size()) {
            if (((InterfaceMenuItemC4603b) this.f36887b.f(i11)).getGroupId() == i10) {
                this.f36887b.h(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f36887b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f36887b.size(); i11++) {
            if (((InterfaceMenuItemC4603b) this.f36887b.f(i11)).getItemId() == i10) {
                this.f36887b.h(i11);
                return;
            }
        }
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
