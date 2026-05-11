package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f5990a;

    /* renamed from: b, reason: collision with root package name */
    public final TabLayout f5991b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialToolbar f5992c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewPager f5993d;

    private a(LinearLayout linearLayout, TabLayout tabLayout, MaterialToolbar materialToolbar, ViewPager viewPager) {
        this.f5990a = linearLayout;
        this.f5991b = tabLayout;
        this.f5992c = materialToolbar;
        this.f5993d = viewPager;
    }

    public static a a(View view) {
        int i10 = K2.d.f5141V;
        TabLayout tabLayout = (TabLayout) view.findViewById(i10);
        if (tabLayout != null) {
            i10 = K2.d.f5153d0;
            MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(i10);
            if (materialToolbar != null) {
                i10 = K2.d.f5167k0;
                ViewPager viewPager = (ViewPager) view.findViewById(i10);
                if (viewPager != null) {
                    return new a((LinearLayout) view, tabLayout, materialToolbar, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5183a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f5990a;
    }
}
