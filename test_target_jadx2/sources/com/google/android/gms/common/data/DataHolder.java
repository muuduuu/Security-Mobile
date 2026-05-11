package com.google.android.gms.common.data;

import W6.c;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class DataHolder extends W6.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: k, reason: collision with root package name */
    private static final a f23487k = new com.google.android.gms.common.data.a(new String[0], null);

    /* renamed from: a, reason: collision with root package name */
    final int f23488a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f23489b;

    /* renamed from: c, reason: collision with root package name */
    Bundle f23490c;

    /* renamed from: d, reason: collision with root package name */
    private final CursorWindow[] f23491d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23492e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f23493f;

    /* renamed from: g, reason: collision with root package name */
    int[] f23494g;

    /* renamed from: h, reason: collision with root package name */
    int f23495h;

    /* renamed from: i, reason: collision with root package name */
    boolean f23496i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23497j = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f23498a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f23499b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f23500c = new HashMap();
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f23488a = i10;
        this.f23489b = strArr;
        this.f23491d = cursorWindowArr;
        this.f23492e = i11;
        this.f23493f = bundle;
    }

    public final void F() {
        this.f23490c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f23489b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f23490c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f23494g = new int[this.f23491d.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f23491d;
            if (i10 >= cursorWindowArr.length) {
                this.f23495h = i12;
                return;
            }
            this.f23494g[i10] = i12;
            i12 += this.f23491d[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f23496i) {
                    this.f23496i = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f23491d;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f23497j && this.f23491d.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f23496i;
        }
        return z10;
    }

    public Bundle j() {
        return this.f23493f;
    }

    public int u() {
        return this.f23492e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.f23489b;
        int a10 = c.a(parcel);
        c.v(parcel, 1, strArr, false);
        c.x(parcel, 2, this.f23491d, i10, false);
        c.m(parcel, 3, u());
        c.e(parcel, 4, j(), false);
        c.m(parcel, 1000, this.f23488a);
        c.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
