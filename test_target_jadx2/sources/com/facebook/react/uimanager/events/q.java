package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f22410a = new SparseIntArray();

    public void a(long j10) {
        this.f22410a.put((int) j10, 0);
    }

    public short b(long j10) {
        int i10 = this.f22410a.get((int) j10, -1);
        if (i10 != -1) {
            return (short) (i10 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean c(long j10) {
        return this.f22410a.get((int) j10, -1) != -1;
    }

    public void d(long j10) {
        int i10 = (int) j10;
        int i11 = this.f22410a.get(i10, -1);
        if (i11 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.f22410a.put(i10, i11 + 1);
    }

    public void e(long j10) {
        this.f22410a.delete((int) j10);
    }
}
