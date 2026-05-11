package I7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private long f4348a;

    /* renamed from: b, reason: collision with root package name */
    private long f4349b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f4350c;

    /* renamed from: d, reason: collision with root package name */
    private int f4351d;

    /* renamed from: e, reason: collision with root package name */
    private int f4352e;

    public h(long j10, long j11) {
        this.f4350c = null;
        this.f4351d = 0;
        this.f4352e = 1;
        this.f4348a = j10;
        this.f4349b = j11;
    }

    static h b(ValueAnimator valueAnimator) {
        h hVar = new h(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        hVar.f4351d = valueAnimator.getRepeatCount();
        hVar.f4352e = valueAnimator.getRepeatMode();
        return hVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f4336b : interpolator instanceof AccelerateInterpolator ? a.f4337c : interpolator instanceof DecelerateInterpolator ? a.f4338d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f4348a;
    }

    public long d() {
        return this.f4349b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f4350c;
        return timeInterpolator != null ? timeInterpolator : a.f4336b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (c() == hVar.c() && d() == hVar.d() && g() == hVar.g() && h() == hVar.h()) {
            return e().getClass().equals(hVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f4351d;
    }

    public int h() {
        return this.f4352e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f4351d = 0;
        this.f4352e = 1;
        this.f4348a = j10;
        this.f4349b = j11;
        this.f4350c = timeInterpolator;
    }
}
