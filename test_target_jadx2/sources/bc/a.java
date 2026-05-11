package Bc;

import java.util.NoSuchElementException;
import kotlin.collections.D;

/* loaded from: classes3.dex */
public final class a extends D {

    /* renamed from: a, reason: collision with root package name */
    private final int f568a;

    /* renamed from: b, reason: collision with root package name */
    private final int f569b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f570c;

    /* renamed from: d, reason: collision with root package name */
    private int f571d;

    public a(int i10, int i11, int i12) {
        this.f568a = i12;
        this.f569b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f570c = z10;
        this.f571d = z10 ? i10 : i11;
    }

    @Override // kotlin.collections.D
    public int a() {
        int i10 = this.f571d;
        if (i10 != this.f569b) {
            this.f571d = this.f568a + i10;
        } else {
            if (!this.f570c) {
                throw new NoSuchElementException();
            }
            this.f570c = false;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f570c;
    }
}
