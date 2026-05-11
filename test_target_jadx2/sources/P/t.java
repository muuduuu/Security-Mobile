package p;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m;
import androidx.lifecycle.InterfaceC1608z;
import g.AbstractC3170a;

/* loaded from: classes.dex */
public class t extends DialogInterfaceOnCancelListenerC1571m {

    /* renamed from: s, reason: collision with root package name */
    final Handler f38184s = new Handler(Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    final Runnable f38185t = new a();

    /* renamed from: u, reason: collision with root package name */
    o f38186u;

    /* renamed from: v, reason: collision with root package name */
    private int f38187v;

    /* renamed from: w, reason: collision with root package name */
    private int f38188w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f38189x;

    /* renamed from: y, reason: collision with root package name */
    TextView f38190y;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.Z();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            t.this.f38186u.a0(true);
        }
    }

    class c implements InterfaceC1608z {
        c() {
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Integer num) {
            t tVar = t.this;
            tVar.f38184s.removeCallbacks(tVar.f38185t);
            t.this.b0(num.intValue());
            t.this.c0(num.intValue());
            t tVar2 = t.this;
            tVar2.f38184s.postDelayed(tVar2.f38185t, 2000L);
        }
    }

    class d implements InterfaceC1608z {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC1608z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(CharSequence charSequence) {
            t tVar = t.this;
            tVar.f38184s.removeCallbacks(tVar.f38185t);
            t.this.d0(charSequence);
            t tVar2 = t.this;
            tVar2.f38184s.postDelayed(tVar2.f38185t, 2000L);
        }
    }

    private static class e {
        static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    private static class f {
        static int a() {
            return AbstractC3170a.f33087v;
        }
    }

    private t() {
    }

    private void V() {
        Context g10 = n.g(this);
        if (g10 == null) {
            return;
        }
        o h10 = n.h(g10);
        this.f38186u = h10;
        h10.r().i(this, new c());
        this.f38186u.p().i(this, new d());
    }

    private Drawable W(int i10, int i11) {
        int i12;
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i10 == 0 && i11 == 1) {
            i12 = y.f38203b;
        } else if (i10 == 1 && i11 == 2) {
            i12 = y.f38202a;
        } else if (i10 == 2 && i11 == 1) {
            i12 = y.f38203b;
        } else {
            if (i10 != 1 || i11 != 3) {
                return null;
            }
            i12 = y.f38203b;
        }
        return androidx.core.content.a.e(context, i12);
    }

    private int X(int i10) {
        Context context = getContext();
        Context g10 = n.g(this);
        if (context == null || g10 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray obtainStyledAttributes = g10.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    static t Y() {
        return new t();
    }

    private boolean a0(int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            return false;
        }
        if (i10 == 1 && i11 == 2) {
            return true;
        }
        return i10 == 2 && i11 == 1;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m
    public Dialog M(Bundle bundle) {
        c.a aVar = new c.a(requireContext());
        aVar.o(this.f38186u.w());
        View inflate = LayoutInflater.from(aVar.b()).inflate(AbstractC3779A.f38073a, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(z.f38207d);
        if (textView != null) {
            CharSequence v10 = this.f38186u.v();
            if (TextUtils.isEmpty(v10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(v10);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(z.f38204a);
        if (textView2 != null) {
            CharSequence o10 = this.f38186u.o();
            if (TextUtils.isEmpty(o10)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(o10);
            }
        }
        this.f38189x = (ImageView) inflate.findViewById(z.f38206c);
        this.f38190y = (TextView) inflate.findViewById(z.f38205b);
        aVar.i(AbstractC3782b.d(this.f38186u.e()) ? getString(AbstractC3780B.f38074a) : this.f38186u.u(), new b());
        aVar.p(inflate);
        androidx.appcompat.app.c a10 = aVar.a();
        a10.setCanceledOnTouchOutside(false);
        return a10;
    }

    void Z() {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.f38186u.Y(1);
            this.f38186u.W(context.getString(AbstractC3780B.f38076c));
        }
    }

    void b0(int i10) {
        int q10;
        Drawable W10;
        if (this.f38189x == null || (W10 = W((q10 = this.f38186u.q()), i10)) == null) {
            return;
        }
        this.f38189x.setImageDrawable(W10);
        if (a0(q10, i10)) {
            e.a(W10);
        }
        this.f38186u.X(i10);
    }

    void c0(int i10) {
        TextView textView = this.f38190y;
        if (textView != null) {
            textView.setTextColor(i10 == 2 ? this.f38187v : this.f38188w);
        }
    }

    void d0(CharSequence charSequence) {
        TextView textView = this.f38190y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f38186u.U(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1571m, androidx.fragment.app.ComponentCallbacksC1573o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        V();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f38187v = X(f.a());
        } else {
            Context context = getContext();
            this.f38187v = context != null ? androidx.core.content.a.c(context, x.f38201a) : 0;
        }
        this.f38188w = X(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onPause() {
        super.onPause();
        this.f38184s.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1573o
    public void onResume() {
        super.onResume();
        this.f38186u.X(0);
        this.f38186u.Y(1);
        this.f38186u.W(getString(AbstractC3780B.f38076c));
    }
}
