package M2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f6066a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f6067b;

    private l(FrameLayout frameLayout, ImageView imageView) {
        this.f6066a = frameLayout;
        this.f6067b = imageView;
    }

    public static l a(View view) {
        int i10 = K2.d.f5154e;
        ImageView imageView = (ImageView) view.findViewById(i10);
        if (imageView != null) {
            return new l((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static l c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(K2.e.f5194l, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public FrameLayout b() {
        return this.f6066a;
    }
}
