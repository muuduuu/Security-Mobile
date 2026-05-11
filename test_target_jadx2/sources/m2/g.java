package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f6042a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f6043b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f6044c;

    /* renamed from: d, reason: collision with root package name */
    public final Group f6045d;

    /* renamed from: e, reason: collision with root package name */
    public final CircularProgressIndicator f6046e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f6047f;

    private g(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Group group, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView) {
        this.f6042a = constraintLayout;
        this.f6043b = imageView;
        this.f6044c = textView;
        this.f6045d = group;
        this.f6046e = circularProgressIndicator;
        this.f6047f = recyclerView;
    }

    public static g a(View view) {
        int i10 = K2.d.f5170n;
        ImageView imageView = (ImageView) view.findViewById(i10);
        if (imageView != null) {
            i10 = K2.d.f5171o;
            TextView textView = (TextView) view.findViewById(i10);
            if (textView != null) {
                i10 = K2.d.f5172p;
                Group group = (Group) view.findViewById(i10);
                if (group != null) {
                    i10 = K2.d.f5178v;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view.findViewById(i10);
                    if (circularProgressIndicator != null) {
                        i10 = K2.d.f5120A;
                        RecyclerView recyclerView = (RecyclerView) view.findViewById(i10);
                        if (recyclerView != null) {
                            return new g((ConstraintLayout) view, imageView, textView, group, circularProgressIndicator, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5189g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f6042a;
    }
}
