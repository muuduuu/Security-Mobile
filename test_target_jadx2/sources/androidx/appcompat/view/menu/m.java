package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public class m extends e implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    private e f13583B;

    /* renamed from: C, reason: collision with root package name */
    private g f13584C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f13583B = eVar;
        this.f13584C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e D() {
        return this.f13583B.D();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean G() {
        return this.f13583B.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.f13583B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f13583B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public void S(e.a aVar) {
        this.f13583B.S(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f13583B.f(gVar);
    }

    public Menu f0() {
        return this.f13583B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f13584C;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f13583B.h(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean k(g gVar) {
        return this.f13583B.k(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f13583B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.W(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Z(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f13584C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f13583B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.e
    public String t() {
        g gVar = this.f13584C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.V(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.Y(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f13584C.setIcon(i10);
        return this;
    }
}
