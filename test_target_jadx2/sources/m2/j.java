package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f6062a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f6063b;

    private j(TextView textView, TextView textView2) {
        this.f6062a = textView;
        this.f6063b = textView2;
    }

    public static j a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new j(textView, textView);
    }

    public static j c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5192j, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public TextView b() {
        return this.f6062a;
    }
}
