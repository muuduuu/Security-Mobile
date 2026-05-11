package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f5994a;

    /* renamed from: b, reason: collision with root package name */
    public final h f5995b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f5996c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialToolbar f5997d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f5998e;

    private b(CoordinatorLayout coordinatorLayout, h hVar, TextView textView, MaterialToolbar materialToolbar, TextView textView2) {
        this.f5994a = coordinatorLayout;
        this.f5995b = hVar;
        this.f5996c = textView;
        this.f5997d = materialToolbar;
        this.f5998e = textView2;
    }

    public static b a(View view) {
        int i10 = K2.d.f5143X;
        View findViewById = view.findViewById(i10);
        if (findViewById != null) {
            h a10 = h.a(findViewById);
            i10 = K2.d.f5144Y;
            TextView textView = (TextView) view.findViewById(i10);
            if (textView != null) {
                i10 = K2.d.f5153d0;
                MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(i10);
                if (materialToolbar != null) {
                    i10 = K2.d.f5155e0;
                    TextView textView2 = (TextView) view.findViewById(i10);
                    if (textView2 != null) {
                        return new b((CoordinatorLayout) view, a10, textView, materialToolbar, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5184b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f5994a;
    }
}
