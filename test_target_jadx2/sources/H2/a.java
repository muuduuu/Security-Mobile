package H2;

import F2.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.canhub.cropper.CropImageView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final CropImageView f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final CropImageView f3084b;

    private a(CropImageView cropImageView, CropImageView cropImageView2) {
        this.f3083a = cropImageView;
        this.f3084b = cropImageView2;
    }

    public static a a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CropImageView cropImageView = (CropImageView) view;
        return new a(cropImageView, cropImageView);
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f2392a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CropImageView b() {
        return this.f3083a;
    }
}
