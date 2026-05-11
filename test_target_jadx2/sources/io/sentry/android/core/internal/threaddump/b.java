package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f34890a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34891b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final int f34892c;

    /* renamed from: d, reason: collision with root package name */
    public int f34893d;

    public b(ArrayList arrayList) {
        this.f34890a = arrayList;
        this.f34892c = arrayList.size();
    }

    public static b c(BufferedReader bufferedReader) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new b(arrayList);
            }
            i10++;
            arrayList.add(new a(i10, readLine));
        }
    }

    public boolean a() {
        return this.f34893d < this.f34892c;
    }

    public a b() {
        int i10 = this.f34893d;
        if (i10 < this.f34891b || i10 >= this.f34892c) {
            return null;
        }
        ArrayList arrayList = this.f34890a;
        this.f34893d = i10 + 1;
        return (a) arrayList.get(i10);
    }

    public void d() {
        this.f34893d--;
    }
}
