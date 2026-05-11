package c2;

import O1.C1038i;
import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1718a {

    /* renamed from: a, reason: collision with root package name */
    private final C1038i f19335a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19336b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19337c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f19338d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f19339e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f19340f;

    /* renamed from: g, reason: collision with root package name */
    public final float f19341g;

    /* renamed from: h, reason: collision with root package name */
    public Float f19342h;

    /* renamed from: i, reason: collision with root package name */
    private float f19343i;

    /* renamed from: j, reason: collision with root package name */
    private float f19344j;

    /* renamed from: k, reason: collision with root package name */
    private int f19345k;

    /* renamed from: l, reason: collision with root package name */
    private int f19346l;

    /* renamed from: m, reason: collision with root package name */
    private float f19347m;

    /* renamed from: n, reason: collision with root package name */
    private float f19348n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f19349o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f19350p;

    public C1718a(C1038i c1038i, Object obj, Object obj2, Interpolator interpolator, float f10, Float f11) {
        this.f19343i = -3987645.8f;
        this.f19344j = -3987645.8f;
        this.f19345k = 784923401;
        this.f19346l = 784923401;
        this.f19347m = Float.MIN_VALUE;
        this.f19348n = Float.MIN_VALUE;
        this.f19349o = null;
        this.f19350p = null;
        this.f19335a = c1038i;
        this.f19336b = obj;
        this.f19337c = obj2;
        this.f19338d = interpolator;
        this.f19339e = null;
        this.f19340f = null;
        this.f19341g = f10;
        this.f19342h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public C1718a b(Object obj, Object obj2) {
        return new C1718a(obj, obj2);
    }

    public float c() {
        if (this.f19335a == null) {
            return 1.0f;
        }
        if (this.f19348n == Float.MIN_VALUE) {
            if (this.f19342h == null) {
                this.f19348n = 1.0f;
            } else {
                this.f19348n = f() + ((this.f19342h.floatValue() - this.f19341g) / this.f19335a.e());
            }
        }
        return this.f19348n;
    }

    public float d() {
        if (this.f19344j == -3987645.8f) {
            this.f19344j = ((Float) this.f19337c).floatValue();
        }
        return this.f19344j;
    }

    public int e() {
        if (this.f19346l == 784923401) {
            this.f19346l = ((Integer) this.f19337c).intValue();
        }
        return this.f19346l;
    }

    public float f() {
        C1038i c1038i = this.f19335a;
        if (c1038i == null) {
            return 0.0f;
        }
        if (this.f19347m == Float.MIN_VALUE) {
            this.f19347m = (this.f19341g - c1038i.p()) / this.f19335a.e();
        }
        return this.f19347m;
    }

    public float g() {
        if (this.f19343i == -3987645.8f) {
            this.f19343i = ((Float) this.f19336b).floatValue();
        }
        return this.f19343i;
    }

    public int h() {
        if (this.f19345k == 784923401) {
            this.f19345k = ((Integer) this.f19336b).intValue();
        }
        return this.f19345k;
    }

    public boolean i() {
        return this.f19338d == null && this.f19339e == null && this.f19340f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f19336b + ", endValue=" + this.f19337c + ", startFrame=" + this.f19341g + ", endFrame=" + this.f19342h + ", interpolator=" + this.f19338d + '}';
    }

    public C1718a(C1038i c1038i, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f19343i = -3987645.8f;
        this.f19344j = -3987645.8f;
        this.f19345k = 784923401;
        this.f19346l = 784923401;
        this.f19347m = Float.MIN_VALUE;
        this.f19348n = Float.MIN_VALUE;
        this.f19349o = null;
        this.f19350p = null;
        this.f19335a = c1038i;
        this.f19336b = obj;
        this.f19337c = obj2;
        this.f19338d = null;
        this.f19339e = interpolator;
        this.f19340f = interpolator2;
        this.f19341g = f10;
        this.f19342h = f11;
    }

    protected C1718a(C1038i c1038i, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f19343i = -3987645.8f;
        this.f19344j = -3987645.8f;
        this.f19345k = 784923401;
        this.f19346l = 784923401;
        this.f19347m = Float.MIN_VALUE;
        this.f19348n = Float.MIN_VALUE;
        this.f19349o = null;
        this.f19350p = null;
        this.f19335a = c1038i;
        this.f19336b = obj;
        this.f19337c = obj2;
        this.f19338d = interpolator;
        this.f19339e = interpolator2;
        this.f19340f = interpolator3;
        this.f19341g = f10;
        this.f19342h = f11;
    }

    public C1718a(Object obj) {
        this.f19343i = -3987645.8f;
        this.f19344j = -3987645.8f;
        this.f19345k = 784923401;
        this.f19346l = 784923401;
        this.f19347m = Float.MIN_VALUE;
        this.f19348n = Float.MIN_VALUE;
        this.f19349o = null;
        this.f19350p = null;
        this.f19335a = null;
        this.f19336b = obj;
        this.f19337c = obj;
        this.f19338d = null;
        this.f19339e = null;
        this.f19340f = null;
        this.f19341g = Float.MIN_VALUE;
        this.f19342h = Float.valueOf(Float.MAX_VALUE);
    }

    private C1718a(Object obj, Object obj2) {
        this.f19343i = -3987645.8f;
        this.f19344j = -3987645.8f;
        this.f19345k = 784923401;
        this.f19346l = 784923401;
        this.f19347m = Float.MIN_VALUE;
        this.f19348n = Float.MIN_VALUE;
        this.f19349o = null;
        this.f19350p = null;
        this.f19335a = null;
        this.f19336b = obj;
        this.f19337c = obj2;
        this.f19338d = null;
        this.f19339e = null;
        this.f19340f = null;
        this.f19341g = Float.MIN_VALUE;
        this.f19342h = Float.valueOf(Float.MAX_VALUE);
    }
}
