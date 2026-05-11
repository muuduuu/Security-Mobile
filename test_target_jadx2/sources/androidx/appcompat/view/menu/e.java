package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1485b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import t0.InterfaceMenuC4602a;

/* loaded from: classes.dex */
public class e implements InterfaceMenuC4602a {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f13483A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f13484a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f13485b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13486c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13487d;

    /* renamed from: e, reason: collision with root package name */
    private a f13488e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f13496m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f13497n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f13498o;

    /* renamed from: p, reason: collision with root package name */
    View f13499p;

    /* renamed from: x, reason: collision with root package name */
    private g f13507x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13509z;

    /* renamed from: l, reason: collision with root package name */
    private int f13495l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13500q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13501r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13502s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13503t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13504u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f13505v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f13506w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f13508y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f13489f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f13490g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f13491h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f13492i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f13493j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f13494k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f13484a = context;
        this.f13485b = context.getResources();
        c0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f13483A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f13489f.size()) {
            return;
        }
        this.f13489f.remove(i10);
        if (z10) {
            L(true);
        }
    }

    private void X(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C10 = C();
        if (view != null) {
            this.f13499p = view;
            this.f13497n = null;
            this.f13498o = null;
        } else {
            if (i10 > 0) {
                this.f13497n = C10.getText(i10);
            } else if (charSequence != null) {
                this.f13497n = charSequence;
            }
            if (i11 > 0) {
                this.f13498o = androidx.core.content.a.e(u(), i11);
            } else if (drawable != null) {
                this.f13498o = drawable;
            }
            this.f13499p = null;
        }
        L(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.AbstractC1492e0.l(android.view.ViewConfiguration.get(r2.f13484a), r2.f13484a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c0(boolean z10) {
        boolean z11;
        if (z10) {
            z11 = true;
            if (this.f13485b.getConfiguration().keyboard != 1) {
            }
        }
        z11 = false;
        this.f13487d = z11;
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f13506w.isEmpty()) {
            return;
        }
        e0();
        Iterator it = this.f13506w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f13506w.remove(weakReference);
            } else {
                jVar.d(z10);
            }
        }
        d0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f13506w.isEmpty()) {
            return false;
        }
        boolean k10 = jVar != null ? jVar.k(mVar) : false;
        Iterator it = this.f13506w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f13506w.remove(weakReference);
            } else if (!k10) {
                k10 = jVar2.k(mVar);
            }
        }
        return k10;
    }

    private static int n(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f13503t;
    }

    Resources C() {
        return this.f13485b;
    }

    public e D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f13491h) {
            return this.f13490g;
        }
        this.f13490g.clear();
        int size = this.f13489f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f13489f.get(i10);
            if (gVar.isVisible()) {
                this.f13490g.add(gVar);
            }
        }
        this.f13491h = false;
        this.f13494k = true;
        return this.f13490g;
    }

    public boolean F() {
        return !this.f13500q;
    }

    public boolean G() {
        return this.f13508y;
    }

    boolean H() {
        return this.f13486c;
    }

    public boolean I() {
        return this.f13487d;
    }

    void J(g gVar) {
        this.f13494k = true;
        L(true);
    }

    void K(g gVar) {
        this.f13491h = true;
        L(true);
    }

    public void L(boolean z10) {
        if (this.f13500q) {
            this.f13501r = true;
            if (z10) {
                this.f13502s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f13491h = true;
            this.f13494k = true;
        }
        i(z10);
    }

    public boolean M(MenuItem menuItem, int i10) {
        return N(menuItem, null, i10);
    }

    public boolean N(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k10 = gVar.k();
        AbstractC1485b b10 = gVar.b();
        boolean z10 = b10 != null && b10.a();
        if (gVar.j()) {
            k10 |= gVar.expandActionView();
            if (k10) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z10) {
                b10.e(mVar);
            }
            k10 |= j(mVar, jVar);
            if (!k10) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return k10;
    }

    public void P(j jVar) {
        Iterator it = this.f13506w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f13506w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f13488e = aVar;
    }

    public e T(int i10) {
        this.f13495l = i10;
        return this;
    }

    void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f13489f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f13489f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    protected e V(int i10) {
        X(0, null, i10, null, null);
        return this;
    }

    protected e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    protected e Y(int i10) {
        X(i10, null, 0, null, null);
        return this;
    }

    protected e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B10 = B(i12);
        g g10 = g(i10, i11, i12, B10, charSequence, this.f13495l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f13496m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f13489f;
        arrayList.add(n(arrayList, B10), g10);
        L(true);
        return g10;
    }

    protected e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f13484a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f13484a);
    }

    public void b0(boolean z10) {
        this.f13509z = z10;
    }

    public void c(j jVar, Context context) {
        this.f13506w.add(new WeakReference(jVar));
        jVar.i(context, this);
        this.f13494k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f13507x;
        if (gVar != null) {
            f(gVar);
        }
        this.f13489f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f13498o = null;
        this.f13497n = null;
        this.f13499p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f13488e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f13500q = false;
        if (this.f13501r) {
            this.f13501r = false;
            L(this.f13502s);
        }
    }

    public final void e(boolean z10) {
        if (this.f13504u) {
            return;
        }
        this.f13504u = true;
        Iterator it = this.f13506w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f13506w.remove(weakReference);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f13504u = false;
    }

    public void e0() {
        if (this.f13500q) {
            return;
        }
        this.f13500q = true;
        this.f13501r = false;
        this.f13502s = false;
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f13506w.isEmpty() && this.f13507x == gVar) {
            e0();
            Iterator it = this.f13506w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f13506w.remove(weakReference);
                } else {
                    z10 = jVar.f(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            d0();
            if (z10) {
                this.f13507x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f13489f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f13489f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f13488e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f13509z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f13489f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z10 = false;
        if (this.f13506w.isEmpty()) {
            return false;
        }
        e0();
        Iterator it = this.f13506w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f13506w.remove(weakReference);
            } else {
                z10 = jVar.g(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        d0();
        if (z10) {
            this.f13507x = gVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f13489f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f13489f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g p(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13505v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean H10 = H();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            char alphabeticShortcut = H10 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (H10 && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return M(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g p10 = p(i10, keyEvent);
        boolean M10 = p10 != null ? M(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return M10;
    }

    void q(List list, int i10, KeyEvent keyEvent) {
        boolean H10 = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f13489f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) this.f13489f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = H10 ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((H10 ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (H10 && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E10 = E();
        if (this.f13494k) {
            Iterator it = this.f13506w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f13506w.remove(weakReference);
                } else {
                    z10 |= jVar.e();
                }
            }
            if (z10) {
                this.f13492i.clear();
                this.f13493j.clear();
                int size = E10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) E10.get(i10);
                    if (gVar.l()) {
                        this.f13492i.add(gVar);
                    } else {
                        this.f13493j.add(gVar);
                    }
                }
            } else {
                this.f13492i.clear();
                this.f13493j.clear();
                this.f13493j.addAll(E());
            }
            this.f13494k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f13489f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f13489f.get(l10)).getGroupId() != i10) {
                    break;
                }
                O(l10, false);
                i11 = i12;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        O(o(i10), true);
    }

    public ArrayList s() {
        r();
        return this.f13492i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f13489f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f13489f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f13508y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f13489f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f13489f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f13489f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f13489f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f13486c = z10;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f13489f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f13484a;
    }

    public g v() {
        return this.f13507x;
    }

    public Drawable w() {
        return this.f13498o;
    }

    public CharSequence x() {
        return this.f13497n;
    }

    public View y() {
        return this.f13499p;
    }

    public ArrayList z() {
        r();
        return this.f13493j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f13485b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f13485b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f13484a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f13485b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f13485b.getString(i13));
    }
}
