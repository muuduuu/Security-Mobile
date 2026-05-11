package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* renamed from: com.horcrux.svg.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2922y {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f29129a;

    /* renamed from: b, reason: collision with root package name */
    private final int[][] f29130b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f29131c;

    C2922y(Paint paint) {
        ArrayList arrayList = new ArrayList();
        this.f29129a = arrayList;
        this.f29130b = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES][];
        this.f29131c = paint;
        arrayList.add(new Path());
    }

    private int a(char c10) {
        int[] iArr = this.f29130b[c10 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c10 & 255];
    }

    Path b(char c10, String str) {
        Path path;
        int a10 = a(c10);
        if (a10 != 0) {
            path = (Path) this.f29129a.get(a10);
        } else {
            Path path2 = new Path();
            this.f29131c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f29130b;
            int i10 = c10 >> '\b';
            int[] iArr2 = iArr[i10];
            if (iArr2 == null) {
                iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                iArr[i10] = iArr2;
            }
            iArr2[c10 & 255] = this.f29129a.size();
            this.f29129a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
