package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.C1422y;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class a extends C1422y {

    /* renamed from: n, reason: collision with root package name */
    private static int f29256n = 128;

    /* renamed from: b, reason: collision with root package name */
    private double f29257b;

    /* renamed from: c, reason: collision with root package name */
    private double f29258c;

    /* renamed from: d, reason: collision with root package name */
    private double f29259d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29260e;

    /* renamed from: f, reason: collision with root package name */
    private double f29261f;

    /* renamed from: g, reason: collision with root package name */
    private double f29262g;

    /* renamed from: h, reason: collision with root package name */
    private String f29263h;

    /* renamed from: i, reason: collision with root package name */
    private List f29264i;

    /* renamed from: j, reason: collision with root package name */
    private double f29265j;

    /* renamed from: k, reason: collision with root package name */
    private int f29266k;

    /* renamed from: l, reason: collision with root package name */
    private double f29267l;

    /* renamed from: m, reason: collision with root package name */
    private int f29268m;

    /* renamed from: com.reactnativecommunity.slider.a$a, reason: collision with other inner class name */
    class C0431a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f29269a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccessibilityEvent f29270b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f29271c;

        C0431a(a aVar, AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            this.f29269a = accessibilityManager;
            this.f29270b = accessibilityEvent;
            this.f29271c = aVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f29269a.sendAccessibilityEvent(this.f29270b);
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f29273b;

        b(a aVar, String str) {
            this.f29272a = str;
            this.f29273b = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitmapDrawable call() {
            Bitmap decodeStream;
            try {
                if (!this.f29272a.startsWith("http://") && !this.f29272a.startsWith("https://") && !this.f29272a.startsWith("file://") && !this.f29272a.startsWith("asset://") && !this.f29272a.startsWith("data:")) {
                    decodeStream = BitmapFactory.decodeResource(this.f29273b.getResources(), this.f29273b.getResources().getIdentifier(this.f29272a, "drawable", this.f29273b.getContext().getPackageName()));
                    return new BitmapDrawable(this.f29273b.getResources(), decodeStream);
                }
                decodeStream = BitmapFactory.decodeStream(new URL(this.f29272a).openStream());
                return new BitmapDrawable(this.f29273b.getResources(), decodeStream);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29257b = 0.0d;
        this.f29258c = 0.0d;
        this.f29259d = 0.0d;
        this.f29260e = false;
        this.f29261f = 0.0d;
        this.f29262g = 0.0d;
        this.f29265j = -9.223372036854776E18d;
        this.f29267l = 9.223372036854776E18d;
        super.setLayoutDirection(com.facebook.react.modules.i18nmanager.a.f().i(context) ? 1 : 0);
        a();
    }

    private void a() {
        if (Build.VERSION.SDK_INT < 26) {
            super.setStateListAnimator(null);
        }
    }

    private BitmapDrawable b(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new b(this, str)).get();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void g() {
        if (this.f29261f == 0.0d) {
            this.f29262g = (this.f29258c - this.f29257b) / f29256n;
        }
        setMax(getTotalSteps());
        setKeyProgressIncrement(1);
        h();
        i();
        j();
    }

    private double getStepValue() {
        double d10 = this.f29261f;
        return d10 > 0.0d ? d10 : this.f29262g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f29258c - this.f29257b) / getStepValue());
    }

    private void h() {
        double max = Math.max(this.f29265j, this.f29257b);
        double d10 = this.f29257b;
        int round = (int) Math.round(((max - d10) / (this.f29258c - d10)) * getTotalSteps());
        int i10 = this.f29268m;
        if (round > i10) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; lowerLimit not set");
        } else {
            this.f29266k = Math.min(round, i10);
        }
    }

    private void i() {
        double min = Math.min(this.f29267l, this.f29258c);
        double d10 = this.f29257b;
        int round = (int) Math.round(((min - d10) / (this.f29258c - d10)) * getTotalSteps());
        if (this.f29266k > round) {
            Log.d("Invalid configuration", "upperLimit < lowerLimit; upperLimit not set");
        } else {
            this.f29268m = round;
        }
    }

    private void j() {
        double d10 = this.f29259d;
        double d11 = this.f29257b;
        setProgress((int) Math.round(((d10 - d11) / (this.f29258c - d11)) * getTotalSteps()));
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new C0431a(this, accessibilityManager, obtain), 1000L);
        }
    }

    int c(int i10) {
        return i10 < getLowerLimit() ? getLowerLimit() : i10 > getUpperLimit() ? getUpperLimit() : i10;
    }

    void d(boolean z10) {
        this.f29260e = z10;
    }

    boolean e() {
        return this.f29260e;
    }

    public double f(int i10) {
        return i10 == getMax() ? this.f29258c : (i10 * getStepValue()) + this.f29257b;
    }

    int getLowerLimit() {
        return this.f29266k;
    }

    int getUpperLimit() {
        return this.f29268m;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.f29259d);
        }
    }

    void setAccessibilityIncrements(List<String> list) {
        this.f29264i = list;
    }

    void setAccessibilityUnits(String str) {
        this.f29263h = str;
    }

    void setLowerLimit(double d10) {
        this.f29265j = d10;
        h();
    }

    void setMaxValue(double d10) {
        this.f29258c = d10;
        g();
    }

    void setMinValue(double d10) {
        this.f29257b = d10;
        g();
    }

    void setStep(double d10) {
        this.f29261f = d10;
        g();
    }

    public void setThumbImage(String str) {
        if (str == null) {
            setThumb(getThumb());
        } else {
            setThumb(b(str));
            setSplitTrack(false);
        }
    }

    void setUpperLimit(double d10) {
        this.f29267l = d10;
        i();
    }

    void setValue(double d10) {
        this.f29259d = d10;
        j();
    }

    public void setupAccessibility(int i10) {
        List list;
        if (this.f29263h == null || (list = this.f29264i) == null || list.size() - 1 != ((int) this.f29258c)) {
            return;
        }
        String str = (String) this.f29264i.get(i10);
        int length = this.f29263h.length();
        String str2 = this.f29263h;
        if (str != null && Integer.parseInt(str) == 1) {
            str2 = str2.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, str2));
    }
}
