package j4;

import android.util.SparseIntArray;

/* renamed from: j4.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3492F {

    /* renamed from: a, reason: collision with root package name */
    public final int f35789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35790b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f35791c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35792d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35793e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35795g;

    public C3492F(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C3492F(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        b3.l.i(i10 >= 0 && i11 >= i10);
        this.f35790b = i10;
        this.f35789a = i11;
        this.f35791c = sparseIntArray;
        this.f35792d = i12;
        this.f35793e = i13;
        this.f35795g = i14;
    }
}
