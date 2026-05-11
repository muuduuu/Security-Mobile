package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f5999a;

    /* renamed from: b, reason: collision with root package name */
    public final TabLayout f6000b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialToolbar f6001c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f6002d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewPager f6003e;

    private c(CoordinatorLayout coordinatorLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView, ViewPager viewPager) {
        this.f5999a = coordinatorLayout;
        this.f6000b = tabLayout;
        this.f6001c = materialToolbar;
        this.f6002d = textView;
        this.f6003e = viewPager;
    }

    public static c a(View view) {
        int i10 = K2.d.f5141V;
        TabLayout tabLayout = (TabLayout) view.findViewById(i10);
        if (tabLayout != null) {
            i10 = K2.d.f5153d0;
            MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(i10);
            if (materialToolbar != null) {
                i10 = K2.d.f5155e0;
                TextView textView = (TextView) view.findViewById(i10);
                if (textView != null) {
                    i10 = K2.d.f5167k0;
                    ViewPager viewPager = (ViewPager) view.findViewById(i10);
                    if (viewPager != null) {
                        return new c((CoordinatorLayout) view, tabLayout, materialToolbar, textView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5185c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f5999a;
    }
}
