package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f15913a = aVar.p(iconCompat.f15913a, 1);
        iconCompat.f15915c = aVar.j(iconCompat.f15915c, 2);
        iconCompat.f15916d = aVar.r(iconCompat.f15916d, 3);
        iconCompat.f15917e = aVar.p(iconCompat.f15917e, 4);
        iconCompat.f15918f = aVar.p(iconCompat.f15918f, 5);
        iconCompat.f15919g = (ColorStateList) aVar.r(iconCompat.f15919g, 6);
        iconCompat.f15921i = aVar.t(iconCompat.f15921i, 7);
        iconCompat.f15922j = aVar.t(iconCompat.f15922j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i10 = iconCompat.f15913a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f15915c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f15916d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f15917e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f15918f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f15919g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f15921i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f15922j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
