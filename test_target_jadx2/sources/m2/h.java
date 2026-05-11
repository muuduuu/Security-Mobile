package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f6048a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f6049b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f6050c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f6051d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f6052e;

    private h(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f6048a = linearLayout;
        this.f6049b = textView;
        this.f6050c = textView2;
        this.f6051d = textView3;
        this.f6052e = textView4;
    }

    public static h a(View view) {
        int i10 = K2.d.f5162i;
        TextView textView = (TextView) view.findViewById(i10);
        if (textView != null) {
            i10 = K2.d.f5168l;
            TextView textView2 = (TextView) view.findViewById(i10);
            if (textView2 != null) {
                i10 = K2.d.f5179w;
                TextView textView3 = (TextView) view.findViewById(i10);
                if (textView3 != null) {
                    i10 = K2.d.f5142W;
                    TextView textView4 = (TextView) view.findViewById(i10);
                    if (textView4 != null) {
                        return new h((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static h c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5190h, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f6048a;
    }
}
