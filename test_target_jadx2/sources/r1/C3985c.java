package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1484a0;
import java.util.Map;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3985c extends AbstractC3994l {

    /* renamed from: Y, reason: collision with root package name */
    private static final String[] f38984Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: Z, reason: collision with root package name */
    private static final Property f38985Z = new b(PointF.class, "boundsOrigin");

    /* renamed from: h0, reason: collision with root package name */
    private static final Property f38986h0 = new C0601c(PointF.class, "topLeft");

    /* renamed from: i0, reason: collision with root package name */
    private static final Property f38987i0 = new d(PointF.class, "bottomRight");

    /* renamed from: j0, reason: collision with root package name */
    private static final Property f38988j0 = new e(PointF.class, "bottomRight");

    /* renamed from: k0, reason: collision with root package name */
    private static final Property f38989k0 = new f(PointF.class, "topLeft");

    /* renamed from: l0, reason: collision with root package name */
    private static final Property f38990l0 = new g(PointF.class, "position");

    /* renamed from: m0, reason: collision with root package name */
    private static C3992j f38991m0 = new C3992j();

    /* renamed from: J, reason: collision with root package name */
    private int[] f38992J = new int[2];

    /* renamed from: K, reason: collision with root package name */
    private boolean f38993K = false;

    /* renamed from: X, reason: collision with root package name */
    private boolean f38994X = false;

    /* renamed from: r1.c$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f38995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f38996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f38997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f38998d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f38995a = viewGroup;
            this.f38996b = bitmapDrawable;
            this.f38997c = view;
            this.f38998d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3967A.b(this.f38995a).b(this.f38996b);
            AbstractC3967A.g(this.f38997c, this.f38998d);
        }
    }

    /* renamed from: r1.c$b */
    static class b extends Property {

        /* renamed from: a, reason: collision with root package name */
        private Rect f39000a;

        b(Class cls, String str) {
            super(cls, str);
            this.f39000a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f39000a);
            Rect rect = this.f39000a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f39000a);
            this.f39000a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f39000a);
        }
    }

    /* renamed from: r1.c$c, reason: collision with other inner class name */
    static class C0601c extends Property {
        C0601c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: r1.c$d */
    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: r1.c$e */
    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC3967A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: r1.c$f */
    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC3967A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r1.c$g */
    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            AbstractC3967A.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: r1.c$h */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f39001a;
        private k mViewBounds;

        h(k kVar) {
            this.f39001a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: r1.c$i */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f39003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f39004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f39005c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39006d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39007e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39008f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f39009g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f39004b = view;
            this.f39005c = rect;
            this.f39006d = i10;
            this.f39007e = i11;
            this.f39008f = i12;
            this.f39009g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f39003a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f39003a) {
                return;
            }
            AbstractC1484a0.x0(this.f39004b, this.f39005c);
            AbstractC3967A.f(this.f39004b, this.f39006d, this.f39007e, this.f39008f, this.f39009g);
        }
    }

    /* renamed from: r1.c$j */
    class j extends AbstractC3995m {

        /* renamed from: a, reason: collision with root package name */
        boolean f39011a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f39012b;

        j(ViewGroup viewGroup) {
            this.f39012b = viewGroup;
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            if (!this.f39011a) {
                x.c(this.f39012b, false);
            }
            abstractC3994l.Y(this);
        }

        @Override // r1.AbstractC3995m, r1.AbstractC3994l.f
        public void c(AbstractC3994l abstractC3994l) {
            x.c(this.f39012b, true);
        }

        @Override // r1.AbstractC3995m, r1.AbstractC3994l.f
        public void d(AbstractC3994l abstractC3994l) {
            x.c(this.f39012b, false);
            this.f39011a = true;
        }

        @Override // r1.AbstractC3995m, r1.AbstractC3994l.f
        public void e(AbstractC3994l abstractC3994l) {
            x.c(this.f39012b, false);
        }
    }

    /* renamed from: r1.c$k */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private int f39014a;

        /* renamed from: b, reason: collision with root package name */
        private int f39015b;

        /* renamed from: c, reason: collision with root package name */
        private int f39016c;

        /* renamed from: d, reason: collision with root package name */
        private int f39017d;

        /* renamed from: e, reason: collision with root package name */
        private View f39018e;

        /* renamed from: f, reason: collision with root package name */
        private int f39019f;

        /* renamed from: g, reason: collision with root package name */
        private int f39020g;

        k(View view) {
            this.f39018e = view;
        }

        private void b() {
            AbstractC3967A.f(this.f39018e, this.f39014a, this.f39015b, this.f39016c, this.f39017d);
            this.f39019f = 0;
            this.f39020g = 0;
        }

        void a(PointF pointF) {
            this.f39016c = Math.round(pointF.x);
            this.f39017d = Math.round(pointF.y);
            int i10 = this.f39020g + 1;
            this.f39020g = i10;
            if (this.f39019f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f39014a = Math.round(pointF.x);
            this.f39015b = Math.round(pointF.y);
            int i10 = this.f39019f + 1;
            this.f39019f = i10;
            if (i10 == this.f39020g) {
                b();
            }
        }
    }

    private void l0(s sVar) {
        View view = sVar.f39104b;
        if (!AbstractC1484a0.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f39103a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f39103a.put("android:changeBounds:parent", sVar.f39104b.getParent());
        if (this.f38994X) {
            sVar.f39104b.getLocationInWindow(this.f38992J);
            sVar.f39103a.put("android:changeBounds:windowX", Integer.valueOf(this.f38992J[0]));
            sVar.f39103a.put("android:changeBounds:windowY", Integer.valueOf(this.f38992J[1]));
        }
        if (this.f38993K) {
            sVar.f39103a.put("android:changeBounds:clip", AbstractC1484a0.t(view));
        }
    }

    private boolean m0(View view, View view2) {
        if (!this.f38994X) {
            return true;
        }
        s A10 = A(view, true);
        if (A10 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == A10.f39104b) {
            return true;
        }
        return false;
    }

    @Override // r1.AbstractC3994l
    public String[] M() {
        return f38984Y;
    }

    @Override // r1.AbstractC3994l
    public void k(s sVar) {
        l0(sVar);
    }

    @Override // r1.AbstractC3994l
    public void n(s sVar) {
        l0(sVar);
    }

    @Override // r1.AbstractC3994l
    public Animator s(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        int i11;
        ObjectAnimator objectAnimator;
        Animator c10;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map map = sVar.f39103a;
        Map map2 = sVar2.f39103a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f39104b;
        if (!m0(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) sVar.f39103a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) sVar.f39103a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) sVar2.f39103a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) sVar2.f39103a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f38992J);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float c11 = AbstractC3967A.c(view2);
            AbstractC3967A.g(view2, 0.0f);
            AbstractC3967A.b(viewGroup).a(bitmapDrawable);
            AbstractC3989g C10 = C();
            int[] iArr = this.f38992J;
            int i12 = iArr[0];
            int i13 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC3990h.a(f38985Z, C10.a(intValue - i12, intValue2 - i13, intValue3 - i12, intValue4 - i13)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c11));
            return ofPropertyValuesHolder;
        }
        Rect rect = (Rect) sVar.f39103a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) sVar2.f39103a.get("android:changeBounds:bounds");
        int i14 = rect.left;
        int i15 = rect2.left;
        int i16 = rect.top;
        int i17 = rect2.top;
        int i18 = rect.right;
        int i19 = rect2.right;
        int i20 = rect.bottom;
        int i21 = rect2.bottom;
        int i22 = i18 - i14;
        int i23 = i20 - i16;
        int i24 = i19 - i15;
        int i25 = i21 - i17;
        Rect rect3 = (Rect) sVar.f39103a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) sVar2.f39103a.get("android:changeBounds:clip");
        if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
            i10 = 0;
        } else {
            i10 = (i14 == i15 && i16 == i17) ? 0 : 1;
            if (i18 != i19 || i20 != i21) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.f38993K) {
            view = view2;
            AbstractC3967A.f(view, i14, i16, Math.max(i22, i24) + i14, Math.max(i23, i25) + i16);
            ObjectAnimator a10 = (i14 == i15 && i16 == i17) ? null : AbstractC3988f.a(view, f38990l0, C().a(i14, i16, i15, i17));
            if (rect3 == null) {
                i11 = 0;
                rect3 = new Rect(0, 0, i22, i23);
            } else {
                i11 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i11, i11, i24, i25) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                AbstractC1484a0.x0(view, rect3);
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", f38991m0, rect3, rect5);
                ofObject.addListener(new i(view, rect4, i15, i17, i19, i21));
                objectAnimator = ofObject;
            }
            c10 = r.c(a10, objectAnimator);
        } else {
            view = view2;
            AbstractC3967A.f(view, i14, i16, i18, i20);
            if (i10 != 2) {
                c10 = (i14 == i15 && i16 == i17) ? AbstractC3988f.a(view, f38988j0, C().a(i18, i20, i19, i21)) : AbstractC3988f.a(view, f38989k0, C().a(i14, i16, i15, i17));
            } else if (i22 == i24 && i23 == i25) {
                c10 = AbstractC3988f.a(view, f38990l0, C().a(i14, i16, i15, i17));
            } else {
                k kVar = new k(view);
                ObjectAnimator a11 = AbstractC3988f.a(kVar, f38986h0, C().a(i14, i16, i15, i17));
                ObjectAnimator a12 = AbstractC3988f.a(kVar, f38987i0, C().a(i18, i20, i19, i21));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a11, a12);
                animatorSet.addListener(new h(kVar));
                c10 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return c10;
    }
}
