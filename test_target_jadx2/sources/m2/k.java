package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f6064a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f6065b;

    private k(TextView textView, TextView textView2) {
        this.f6064a = textView;
        this.f6065b = textView2;
    }

    public static k a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new k(textView, textView);
    }

    public static k c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5193k, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public TextView b() {
        return this.f6064a;
    }
}
