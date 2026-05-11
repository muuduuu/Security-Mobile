package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import l.MenuC3587d;
import l.MenuItemC3586c;
import t0.InterfaceMenuC4602a;
import t0.InterfaceMenuItemC4603b;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f13330a;

    /* renamed from: b, reason: collision with root package name */
    final b f13331b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f13332a;

        /* renamed from: b, reason: collision with root package name */
        final Context f13333b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f13334c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final j0.i f13335d = new j0.i();

        public a(Context context, ActionMode.Callback callback) {
            this.f13333b = context;
            this.f13332a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f13335d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC3587d menuC3587d = new MenuC3587d(this.f13333b, (InterfaceMenuC4602a) menu);
            this.f13335d.put(menu, menuC3587d);
            return menuC3587d;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f13332a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f13332a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f13332a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f13332a.onActionItemClicked(e(bVar), new MenuItemC3586c(this.f13333b, (InterfaceMenuItemC4603b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f13334c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f13334c.get(i10);
                if (fVar != null && fVar.f13331b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f13333b, bVar);
            this.f13334c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f13330a = context;
        this.f13331b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f13331b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f13331b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC3587d(this.f13330a, (InterfaceMenuC4602a) this.f13331b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f13331b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f13331b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f13331b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f13331b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f13331b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f13331b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f13331b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f13331b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f13331b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f13331b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f13331b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f13331b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f13331b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f13331b.q(i10);
    }
}
