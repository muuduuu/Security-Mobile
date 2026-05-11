package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f6008a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f6009b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f6010c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f6011d;

    private e(FrameLayout frameLayout, RecyclerView recyclerView, TextView textView, LinearLayout linearLayout) {
        this.f6008a = frameLayout;
        this.f6009b = recyclerView;
        this.f6010c = textView;
        this.f6011d = linearLayout;
    }

    public static e a(View view) {
        int i10 = K2.d.f5159g0;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i10);
        if (recyclerView != null) {
            i10 = K2.d.f5161h0;
            TextView textView = (TextView) view.findViewById(i10);
            if (textView != null) {
                i10 = K2.d.f5163i0;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i10);
                if (linearLayout != null) {
                    return new e((FrameLayout) view, recyclerView, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5187e, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public FrameLayout b() {
        return this.f6008a;
    }
}
