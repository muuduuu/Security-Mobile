package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f6053a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f6054b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f6055c;

    /* renamed from: d, reason: collision with root package name */
    public final Guideline f6056d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f6057e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f6058f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f6059g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f6060h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f6061i;

    private i(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Guideline guideline, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6) {
        this.f6053a = constraintLayout;
        this.f6054b = textView;
        this.f6055c = textView2;
        this.f6056d = guideline;
        this.f6057e = textView3;
        this.f6058f = textView4;
        this.f6059g = textView5;
        this.f6060h = imageView;
        this.f6061i = textView6;
    }

    public static i a(View view) {
        int i10 = K2.d.f5166k;
        TextView textView = (TextView) view.findViewById(i10);
        if (textView != null) {
            i10 = K2.d.f5169m;
            TextView textView2 = (TextView) view.findViewById(i10);
            if (textView2 != null) {
                i10 = K2.d.f5176t;
                Guideline guideline = (Guideline) view.findViewById(i10);
                if (guideline != null) {
                    i10 = K2.d.f5177u;
                    TextView textView3 = (TextView) view.findViewById(i10);
                    if (textView3 != null) {
                        i10 = K2.d.f5182z;
                        TextView textView4 = (TextView) view.findViewById(i10);
                        if (textView4 != null) {
                            i10 = K2.d.f5136Q;
                            TextView textView5 = (TextView) view.findViewById(i10);
                            if (textView5 != null) {
                                i10 = K2.d.f5137R;
                                ImageView imageView = (ImageView) view.findViewById(i10);
                                if (imageView != null) {
                                    i10 = K2.d.f5145Z;
                                    TextView textView6 = (TextView) view.findViewById(i10);
                                    if (textView6 != null) {
                                        return new i((ConstraintLayout) view, textView, textView2, guideline, textView3, textView4, textView5, imageView, textView6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5191i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f6053a;
    }
}
