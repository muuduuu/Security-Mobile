package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f6004a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f6005b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f6006c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f6007d;

    private d(FrameLayout frameLayout, RecyclerView recyclerView, TextView textView, LinearLayout linearLayout) {
        this.f6004a = frameLayout;
        this.f6005b = recyclerView;
        this.f6006c = textView;
        this.f6007d = linearLayout;
    }

    public static d a(View view) {
        int i10 = K2.d.f5174r;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i10);
        if (recyclerView != null) {
            i10 = K2.d.f5161h0;
            TextView textView = (TextView) view.findViewById(i10);
            if (textView != null) {
                i10 = K2.d.f5163i0;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i10);
                if (linearLayout != null) {
                    return new d((FrameLayout) view, recyclerView, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5186d, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public FrameLayout b() {
        return this.f6004a;
    }
}
