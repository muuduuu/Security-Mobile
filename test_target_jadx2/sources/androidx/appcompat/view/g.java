package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.view.A;
import androidx.core.view.AbstractC1485b;
import g.AbstractC3179j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.MenuItemC3586c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t0.InterfaceMenuC4602a;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f13336e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f13337f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f13338a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f13339b;

    /* renamed from: c, reason: collision with root package name */
    Context f13340c;

    /* renamed from: d, reason: collision with root package name */
    private Object f13341d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f13342c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f13343a;

        /* renamed from: b, reason: collision with root package name */
        private Method f13344b;

        public a(Object obj, String str) {
            this.f13343a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f13344b = cls.getMethod(str, f13342c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f13344b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f13344b.invoke(this.f13343a, menuItem)).booleanValue();
                }
                this.f13344b.invoke(this.f13343a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC1485b f13345A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f13346B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f13347C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f13348D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f13349E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f13351a;

        /* renamed from: b, reason: collision with root package name */
        private int f13352b;

        /* renamed from: c, reason: collision with root package name */
        private int f13353c;

        /* renamed from: d, reason: collision with root package name */
        private int f13354d;

        /* renamed from: e, reason: collision with root package name */
        private int f13355e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f13356f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f13357g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f13358h;

        /* renamed from: i, reason: collision with root package name */
        private int f13359i;

        /* renamed from: j, reason: collision with root package name */
        private int f13360j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f13361k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f13362l;

        /* renamed from: m, reason: collision with root package name */
        private int f13363m;

        /* renamed from: n, reason: collision with root package name */
        private char f13364n;

        /* renamed from: o, reason: collision with root package name */
        private int f13365o;

        /* renamed from: p, reason: collision with root package name */
        private char f13366p;

        /* renamed from: q, reason: collision with root package name */
        private int f13367q;

        /* renamed from: r, reason: collision with root package name */
        private int f13368r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f13369s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f13370t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f13371u;

        /* renamed from: v, reason: collision with root package name */
        private int f13372v;

        /* renamed from: w, reason: collision with root package name */
        private int f13373w;

        /* renamed from: x, reason: collision with root package name */
        private String f13374x;

        /* renamed from: y, reason: collision with root package name */
        private String f13375y;

        /* renamed from: z, reason: collision with root package name */
        private String f13376z;

        public b(Menu menu) {
            this.f13351a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f13340c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f13369s).setVisible(this.f13370t).setEnabled(this.f13371u).setCheckable(this.f13368r >= 1).setTitleCondensed(this.f13362l).setIcon(this.f13363m);
            int i10 = this.f13372v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f13376z != null) {
                if (g.this.f13340c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f13376z));
            }
            if (this.f13368r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof MenuItemC3586c) {
                    ((MenuItemC3586c) menuItem).h(true);
                }
            }
            String str = this.f13374x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f13336e, g.this.f13338a));
                z10 = true;
            }
            int i11 = this.f13373w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC1485b abstractC1485b = this.f13345A;
            if (abstractC1485b != null) {
                A.a(menuItem, abstractC1485b);
            }
            A.c(menuItem, this.f13346B);
            A.g(menuItem, this.f13347C);
            A.b(menuItem, this.f13364n, this.f13365o);
            A.f(menuItem, this.f13366p, this.f13367q);
            PorterDuff.Mode mode = this.f13349E;
            if (mode != null) {
                A.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f13348D;
            if (colorStateList != null) {
                A.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f13358h = true;
            i(this.f13351a.add(this.f13352b, this.f13359i, this.f13360j, this.f13361k));
        }

        public SubMenu b() {
            this.f13358h = true;
            SubMenu addSubMenu = this.f13351a.addSubMenu(this.f13352b, this.f13359i, this.f13360j, this.f13361k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f13358h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f13340c.obtainStyledAttributes(attributeSet, AbstractC3179j.f33434o1);
            this.f13352b = obtainStyledAttributes.getResourceId(AbstractC3179j.f33444q1, 0);
            this.f13353c = obtainStyledAttributes.getInt(AbstractC3179j.f33454s1, 0);
            this.f13354d = obtainStyledAttributes.getInt(AbstractC3179j.f33459t1, 0);
            this.f13355e = obtainStyledAttributes.getInt(AbstractC3179j.f33464u1, 0);
            this.f13356f = obtainStyledAttributes.getBoolean(AbstractC3179j.f33449r1, true);
            this.f13357g = obtainStyledAttributes.getBoolean(AbstractC3179j.f33439p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            h0 u10 = h0.u(g.this.f13340c, attributeSet, AbstractC3179j.f33469v1);
            this.f13359i = u10.n(AbstractC3179j.f33484y1, 0);
            this.f13360j = (u10.k(AbstractC3179j.f33247B1, this.f13353c) & (-65536)) | (u10.k(AbstractC3179j.f33252C1, this.f13354d) & 65535);
            this.f13361k = u10.p(AbstractC3179j.f33257D1);
            this.f13362l = u10.p(AbstractC3179j.f33262E1);
            this.f13363m = u10.n(AbstractC3179j.f33474w1, 0);
            this.f13364n = c(u10.o(AbstractC3179j.f33267F1));
            this.f13365o = u10.k(AbstractC3179j.f33302M1, 4096);
            this.f13366p = c(u10.o(AbstractC3179j.f33272G1));
            this.f13367q = u10.k(AbstractC3179j.f33322Q1, 4096);
            if (u10.s(AbstractC3179j.f33277H1)) {
                this.f13368r = u10.a(AbstractC3179j.f33277H1, false) ? 1 : 0;
            } else {
                this.f13368r = this.f13355e;
            }
            this.f13369s = u10.a(AbstractC3179j.f33489z1, false);
            this.f13370t = u10.a(AbstractC3179j.f33242A1, this.f13356f);
            this.f13371u = u10.a(AbstractC3179j.f33479x1, this.f13357g);
            this.f13372v = u10.k(AbstractC3179j.f33327R1, -1);
            this.f13376z = u10.o(AbstractC3179j.f33282I1);
            this.f13373w = u10.n(AbstractC3179j.f33287J1, 0);
            this.f13374x = u10.o(AbstractC3179j.f33297L1);
            String o10 = u10.o(AbstractC3179j.f33292K1);
            this.f13375y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f13373w == 0 && this.f13374x == null) {
                this.f13345A = (AbstractC1485b) e(o10, g.f13337f, g.this.f13339b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f13345A = null;
            }
            this.f13346B = u10.p(AbstractC3179j.f33307N1);
            this.f13347C = u10.p(AbstractC3179j.f33332S1);
            if (u10.s(AbstractC3179j.f33317P1)) {
                this.f13349E = O.e(u10.k(AbstractC3179j.f33317P1, -1), this.f13349E);
            } else {
                this.f13349E = null;
            }
            if (u10.s(AbstractC3179j.f33312O1)) {
                this.f13348D = u10.c(AbstractC3179j.f33312O1);
            } else {
                this.f13348D = null;
            }
            u10.x();
            this.f13358h = false;
        }

        public void h() {
            this.f13352b = 0;
            this.f13353c = 0;
            this.f13354d = 0;
            this.f13355e = 0;
            this.f13356f = true;
            this.f13357g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f13336e = clsArr;
        f13337f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f13340c = context;
        Object[] objArr = {context};
        this.f13338a = objArr;
        this.f13339b = objArr;
    }

    private Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f13345A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    Object b() {
        if (this.f13341d == null) {
            this.f13341d = a(this.f13340c);
        }
        return this.f13341d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC4602a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            try {
                xmlResourceParser = this.f13340c.getResources().getLayout(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z10 = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
