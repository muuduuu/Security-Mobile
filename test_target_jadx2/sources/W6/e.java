package W6;

import V6.AbstractC1287s;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class e {
    public static d a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC1287s.m(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        d dVar = (d) creator.createFromParcel(obtain);
        obtain.recycle();
        return dVar;
    }

    public static d b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    public static ArrayList c(Intent intent, String str, Parcelable.Creator creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(a((byte[]) arrayList.get(i10), creator));
        }
        return arrayList2;
    }
}
