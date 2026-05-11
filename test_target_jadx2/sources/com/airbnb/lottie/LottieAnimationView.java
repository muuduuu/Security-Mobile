package com.airbnb.lottie;

import O1.A;
import O1.AbstractC1031b;
import O1.AbstractC1034e;
import O1.B;
import O1.C;
import O1.C1038i;
import O1.E;
import O1.EnumC1030a;
import O1.F;
import O1.G;
import O1.H;
import O1.I;
import O1.InterfaceC1032c;
import O1.J;
import O1.s;
import O1.w;
import O1.y;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.r;
import c2.C1719b;
import c2.C1720c;
import com.airbnb.lottie.LottieAnimationView;
import h.AbstractC3220a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class LottieAnimationView extends r {

    /* renamed from: n, reason: collision with root package name */
    private static final String f19996n = "LottieAnimationView";

    /* renamed from: o, reason: collision with root package name */
    private static final y f19997o = new y() { // from class: O1.g
        @Override // O1.y
        public final void onResult(Object obj) {
            LottieAnimationView.w((Throwable) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final y f19998a;

    /* renamed from: b, reason: collision with root package name */
    private final y f19999b;

    /* renamed from: c, reason: collision with root package name */
    private y f20000c;

    /* renamed from: d, reason: collision with root package name */
    private int f20001d;

    /* renamed from: e, reason: collision with root package name */
    private final o f20002e;

    /* renamed from: f, reason: collision with root package name */
    private String f20003f;

    /* renamed from: g, reason: collision with root package name */
    private int f20004g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20005h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20006i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20007j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f20008k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f20009l;

    /* renamed from: m, reason: collision with root package name */
    private q f20010m;

    class a extends C1720c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c2.e f20011d;

        a(c2.e eVar) {
            this.f20011d = eVar;
        }

        @Override // c2.C1720c
        public Object a(C1719b c1719b) {
            return this.f20011d.a(c1719b);
        }
    }

    private static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f20013a;

        /* renamed from: b, reason: collision with root package name */
        int f20014b;

        /* renamed from: c, reason: collision with root package name */
        float f20015c;

        /* renamed from: d, reason: collision with root package name */
        boolean f20016d;

        /* renamed from: e, reason: collision with root package name */
        String f20017e;

        /* renamed from: f, reason: collision with root package name */
        int f20018f;

        /* renamed from: g, reason: collision with root package name */
        int f20019g;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f20013a);
            parcel.writeFloat(this.f20015c);
            parcel.writeInt(this.f20016d ? 1 : 0);
            parcel.writeString(this.f20017e);
            parcel.writeInt(this.f20018f);
            parcel.writeInt(this.f20019g);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f20013a = parcel.readString();
            this.f20015c = parcel.readFloat();
            this.f20016d = parcel.readInt() == 1;
            this.f20017e = parcel.readString();
            this.f20018f = parcel.readInt();
            this.f20019g = parcel.readInt();
        }
    }

    private enum c {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class d implements y {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f20020a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f20020a = new WeakReference(lottieAnimationView);
        }

        @Override // O1.y
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f20020a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f20001d != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f20001d);
            }
            (lottieAnimationView.f20000c == null ? LottieAnimationView.f19997o : lottieAnimationView.f20000c).onResult(th);
        }
    }

    private static class e implements y {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f20021a;

        public e(LottieAnimationView lottieAnimationView) {
            this.f20021a = new WeakReference(lottieAnimationView);
        }

        @Override // O1.y
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C1038i c1038i) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f20021a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c1038i);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f19998a = new e(this);
        this.f19999b = new d(this);
        this.f20001d = 0;
        this.f20002e = new o();
        this.f20005h = false;
        this.f20006i = false;
        this.f20007j = true;
        this.f20008k = new HashSet();
        this.f20009l = new HashSet();
        s(null, F.f6903a);
    }

    private void H() {
        boolean t10 = t();
        setImageDrawable(null);
        setImageDrawable(this.f20002e);
        if (t10) {
            this.f20002e.F0();
        }
    }

    private void K(float f10, boolean z10) {
        if (z10) {
            this.f20008k.add(c.SET_PROGRESS);
        }
        this.f20002e.g1(f10);
    }

    private void n() {
        q qVar = this.f20010m;
        if (qVar != null) {
            qVar.k(this.f19998a);
            this.f20010m.j(this.f19999b);
        }
    }

    private void o() {
        this.f20002e.w();
    }

    private q q(final String str) {
        return isInEditMode() ? new q(new Callable() { // from class: O1.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C u10;
                u10 = LottieAnimationView.this.u(str);
                return u10;
            }
        }, true) : this.f20007j ? s.l(getContext(), str) : s.m(getContext(), str, null);
    }

    private q r(final int i10) {
        return isInEditMode() ? new q(new Callable() { // from class: O1.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C v10;
                v10 = LottieAnimationView.this.v(i10);
                return v10;
            }
        }, true) : this.f20007j ? s.w(getContext(), i10) : s.x(getContext(), i10, null);
    }

    private void s(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, G.f6904a, i10, 0);
        this.f20007j = obtainStyledAttributes.getBoolean(G.f6907d, true);
        boolean hasValue = obtainStyledAttributes.hasValue(G.f6919p);
        boolean hasValue2 = obtainStyledAttributes.hasValue(G.f6914k);
        boolean hasValue3 = obtainStyledAttributes.hasValue(G.f6924u);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(G.f6919p, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(G.f6914k);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(G.f6924u)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(G.f6913j, 0));
        if (obtainStyledAttributes.getBoolean(G.f6906c, false)) {
            this.f20006i = true;
        }
        if (obtainStyledAttributes.getBoolean(G.f6917n, false)) {
            this.f20002e.i1(-1);
        }
        if (obtainStyledAttributes.hasValue(G.f6922s)) {
            setRepeatMode(obtainStyledAttributes.getInt(G.f6922s, 1));
        }
        if (obtainStyledAttributes.hasValue(G.f6921r)) {
            setRepeatCount(obtainStyledAttributes.getInt(G.f6921r, -1));
        }
        if (obtainStyledAttributes.hasValue(G.f6923t)) {
            setSpeed(obtainStyledAttributes.getFloat(G.f6923t, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(G.f6909f)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(G.f6909f, true));
        }
        if (obtainStyledAttributes.hasValue(G.f6908e)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(G.f6908e, false));
        }
        if (obtainStyledAttributes.hasValue(G.f6911h)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(G.f6911h));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(G.f6916m));
        K(obtainStyledAttributes.getFloat(G.f6918o, 0.0f), obtainStyledAttributes.hasValue(G.f6918o));
        p(obtainStyledAttributes.getBoolean(G.f6912i, false));
        if (obtainStyledAttributes.hasValue(G.f6910g)) {
            k(new U1.e("**"), B.f6863K, new C1720c(new I(AbstractC3220a.a(getContext(), obtainStyledAttributes.getResourceId(G.f6910g, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(G.f6920q)) {
            int i11 = G.f6920q;
            H h10 = H.AUTOMATIC;
            int i12 = obtainStyledAttributes.getInt(i11, h10.ordinal());
            if (i12 >= H.values().length) {
                i12 = h10.ordinal();
            }
            setRenderMode(H.values()[i12]);
        }
        if (obtainStyledAttributes.hasValue(G.f6905b)) {
            int i13 = G.f6905b;
            EnumC1030a enumC1030a = EnumC1030a.AUTOMATIC;
            int i14 = obtainStyledAttributes.getInt(i13, enumC1030a.ordinal());
            if (i14 >= H.values().length) {
                i14 = enumC1030a.ordinal();
            }
            setAsyncUpdates(EnumC1030a.values()[i14]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(G.f6915l, false));
        if (obtainStyledAttributes.hasValue(G.f6925v)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(G.f6925v, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setCompositionTask(q qVar) {
        C e10 = qVar.e();
        o oVar = this.f20002e;
        if (e10 != null && oVar == getDrawable() && oVar.K() == e10.b()) {
            return;
        }
        this.f20008k.add(c.SET_ANIMATION);
        o();
        n();
        this.f20010m = qVar.d(this.f19998a).c(this.f19999b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C u(String str) {
        return this.f20007j ? s.n(getContext(), str) : s.o(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C v(int i10) {
        return this.f20007j ? s.y(getContext(), i10) : s.z(getContext(), i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Throwable th) {
        if (!b2.l.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        b2.f.d("Unable to load composition.", th);
    }

    public void A(Animator.AnimatorListener animatorListener) {
        this.f20002e.C0(animatorListener);
    }

    public void B() {
        this.f20008k.add(c.PLAY_OPTION);
        this.f20002e.F0();
    }

    public void C() {
        this.f20002e.G0();
    }

    public void D(InputStream inputStream, String str) {
        setCompositionTask(s.p(inputStream, str));
    }

    public void E(ZipInputStream zipInputStream, String str) {
        setCompositionTask(s.D(zipInputStream, str));
    }

    public void F(String str, String str2) {
        D(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void G(String str, String str2) {
        setCompositionTask(s.B(getContext(), str, str2));
    }

    public void I(int i10, int i11) {
        this.f20002e.Y0(i10, i11);
    }

    public void J(float f10, float f11) {
        this.f20002e.a1(f10, f11);
    }

    public EnumC1030a getAsyncUpdates() {
        return this.f20002e.F();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f20002e.G();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f20002e.I();
    }

    public boolean getClipToCompositionBounds() {
        return this.f20002e.J();
    }

    public C1038i getComposition() {
        Drawable drawable = getDrawable();
        o oVar = this.f20002e;
        if (drawable == oVar) {
            return oVar.K();
        }
        return null;
    }

    public long getDuration() {
        C1038i composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f20002e.N();
    }

    public String getImageAssetsFolder() {
        return this.f20002e.P();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f20002e.R();
    }

    public float getMaxFrame() {
        return this.f20002e.T();
    }

    public float getMinFrame() {
        return this.f20002e.U();
    }

    public E getPerformanceTracker() {
        return this.f20002e.V();
    }

    public float getProgress() {
        return this.f20002e.W();
    }

    public H getRenderMode() {
        return this.f20002e.X();
    }

    public int getRepeatCount() {
        return this.f20002e.Y();
    }

    public int getRepeatMode() {
        return this.f20002e.Z();
    }

    public float getSpeed() {
        return this.f20002e.a0();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f20002e.r(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof o) && ((o) drawable).X() == H.SOFTWARE) {
            this.f20002e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        o oVar = this.f20002e;
        if (drawable2 == oVar) {
            super.invalidateDrawable(oVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(A a10) {
        C1038i composition = getComposition();
        if (composition != null) {
            a10.a(composition);
        }
        return this.f20009l.add(a10);
    }

    public void k(U1.e eVar, Object obj, C1720c c1720c) {
        this.f20002e.s(eVar, obj, c1720c);
    }

    public void l(U1.e eVar, Object obj, c2.e eVar2) {
        this.f20002e.s(eVar, obj, new a(eVar2));
    }

    public void m() {
        this.f20006i = false;
        this.f20008k.add(c.PLAY_OPTION);
        this.f20002e.v();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f20006i) {
            return;
        }
        this.f20002e.A0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f20003f = bVar.f20013a;
        Set set = this.f20008k;
        c cVar = c.SET_ANIMATION;
        if (!set.contains(cVar) && !TextUtils.isEmpty(this.f20003f)) {
            setAnimation(this.f20003f);
        }
        this.f20004g = bVar.f20014b;
        if (!this.f20008k.contains(cVar) && (i10 = this.f20004g) != 0) {
            setAnimation(i10);
        }
        if (!this.f20008k.contains(c.SET_PROGRESS)) {
            K(bVar.f20015c, false);
        }
        if (!this.f20008k.contains(c.PLAY_OPTION) && bVar.f20016d) {
            y();
        }
        if (!this.f20008k.contains(c.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(bVar.f20017e);
        }
        if (!this.f20008k.contains(c.SET_REPEAT_MODE)) {
            setRepeatMode(bVar.f20018f);
        }
        if (this.f20008k.contains(c.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(bVar.f20019g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f20013a = this.f20003f;
        bVar.f20014b = this.f20004g;
        bVar.f20015c = this.f20002e.W();
        bVar.f20016d = this.f20002e.f0();
        bVar.f20017e = this.f20002e.P();
        bVar.f20018f = this.f20002e.Z();
        bVar.f20019g = this.f20002e.Y();
        return bVar;
    }

    public void p(boolean z10) {
        this.f20002e.B(w.MergePathsApi19, z10);
    }

    public void setAnimation(int i10) {
        this.f20004g = i10;
        this.f20003f = null;
        setCompositionTask(r(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        F(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f20007j ? s.A(getContext(), str) : s.B(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f20002e.I0(z10);
    }

    public void setAsyncUpdates(EnumC1030a enumC1030a) {
        this.f20002e.J0(enumC1030a);
    }

    public void setCacheComposition(boolean z10) {
        this.f20007j = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f20002e.K0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f20002e.L0(z10);
    }

    public void setComposition(C1038i c1038i) {
        if (AbstractC1034e.f6932a) {
            Log.v(f19996n, "Set Composition \n" + c1038i);
        }
        this.f20002e.setCallback(this);
        this.f20005h = true;
        boolean M02 = this.f20002e.M0(c1038i);
        if (this.f20006i) {
            this.f20002e.A0();
        }
        this.f20005h = false;
        if (getDrawable() != this.f20002e || M02) {
            if (!M02) {
                H();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f20009l.iterator();
            while (it.hasNext()) {
                ((A) it.next()).a(c1038i);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f20002e.N0(str);
    }

    public void setFailureListener(y yVar) {
        this.f20000c = yVar;
    }

    public void setFallbackResource(int i10) {
        this.f20001d = i10;
    }

    public void setFontAssetDelegate(AbstractC1031b abstractC1031b) {
        this.f20002e.O0(abstractC1031b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f20002e.P0(map);
    }

    public void setFrame(int i10) {
        this.f20002e.Q0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f20002e.R0(z10);
    }

    public void setImageAssetDelegate(InterfaceC1032c interfaceC1032c) {
        this.f20002e.S0(interfaceC1032c);
    }

    public void setImageAssetsFolder(String str) {
        this.f20002e.T0(str);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f20004g = 0;
        this.f20003f = null;
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f20004g = 0;
        this.f20003f = null;
        n();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f20004g = 0;
        this.f20003f = null;
        n();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f20002e.U0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f20002e.V0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f20002e.X0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f20002e.Z0(str);
    }

    public void setMinFrame(int i10) {
        this.f20002e.b1(i10);
    }

    public void setMinProgress(float f10) {
        this.f20002e.d1(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f20002e.e1(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f20002e.f1(z10);
    }

    public void setProgress(float f10) {
        K(f10, true);
    }

    public void setRenderMode(H h10) {
        this.f20002e.h1(h10);
    }

    public void setRepeatCount(int i10) {
        this.f20008k.add(c.SET_REPEAT_COUNT);
        this.f20002e.i1(i10);
    }

    public void setRepeatMode(int i10) {
        this.f20008k.add(c.SET_REPEAT_MODE);
        this.f20002e.j1(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f20002e.k1(z10);
    }

    public void setSpeed(float f10) {
        this.f20002e.l1(f10);
    }

    public void setTextDelegate(J j10) {
        this.f20002e.m1(j10);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f20002e.n1(z10);
    }

    public boolean t() {
        return this.f20002e.e0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        o oVar;
        if (!this.f20005h && drawable == (oVar = this.f20002e) && oVar.e0()) {
            x();
        } else if (!this.f20005h && (drawable instanceof o)) {
            o oVar2 = (o) drawable;
            if (oVar2.e0()) {
                oVar2.z0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void x() {
        this.f20006i = false;
        this.f20002e.z0();
    }

    public void y() {
        this.f20008k.add(c.PLAY_OPTION);
        this.f20002e.A0();
    }

    public void z() {
        this.f20002e.B0();
    }

    public void setMaxFrame(String str) {
        this.f20002e.W0(str);
    }

    public void setMinFrame(String str) {
        this.f20002e.c1(str);
    }

    public void setAnimation(String str) {
        this.f20003f = str;
        this.f20004g = 0;
        setCompositionTask(q(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19998a = new e(this);
        this.f19999b = new d(this);
        this.f20001d = 0;
        this.f20002e = new o();
        this.f20005h = false;
        this.f20006i = false;
        this.f20007j = true;
        this.f20008k = new HashSet();
        this.f20009l = new HashSet();
        s(attributeSet, F.f6903a);
    }
}
