package d5;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.Q;
import java.util.Map;
import v4.AbstractC4929e;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2979a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f31204e = AbstractC4929e.g(EnumC2982d.LINEAR, new LinearInterpolator(), EnumC2982d.EASE_IN, new AccelerateInterpolator(), EnumC2982d.EASE_OUT, new DecelerateInterpolator(), EnumC2982d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: a, reason: collision with root package name */
    private Interpolator f31205a;

    /* renamed from: b, reason: collision with root package name */
    private int f31206b;

    /* renamed from: c, reason: collision with root package name */
    protected EnumC2980b f31207c;

    /* renamed from: d, reason: collision with root package name */
    protected int f31208d;

    AbstractC2979a() {
    }

    private static Interpolator c(EnumC2982d enumC2982d, ReadableMap readableMap) {
        Interpolator interpolatorC2992n = enumC2982d.equals(EnumC2982d.SPRING) ? new InterpolatorC2992n(InterpolatorC2992n.a(readableMap)) : (Interpolator) f31204e.get(enumC2982d);
        if (interpolatorC2992n != null) {
            return interpolatorC2992n;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + enumC2982d);
    }

    public final Animation a(View view, int i10, int i11, int i12, int i13) {
        if (!e()) {
            return null;
        }
        Animation b10 = b(view, i10, i11, i12, i13);
        if (b10 != null) {
            b10.setDuration(this.f31208d);
            b10.setStartOffset(this.f31206b);
            b10.setInterpolator(this.f31205a);
        }
        return b10;
    }

    abstract Animation b(View view, int i10, int i11, int i12, int i13);

    public void d(ReadableMap readableMap, int i10) {
        this.f31207c = readableMap.hasKey("property") ? EnumC2980b.fromString(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i10 = readableMap.getInt("duration");
        }
        this.f31208d = i10;
        this.f31206b = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (!readableMap.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        this.f31205a = c(EnumC2982d.fromString(readableMap.getString("type")), readableMap);
        if (e()) {
            return;
        }
        throw new Q("Invalid layout animation : " + readableMap);
    }

    abstract boolean e();

    public void f() {
        this.f31207c = null;
        this.f31208d = 0;
        this.f31206b = 0;
        this.f31205a = null;
    }
}
