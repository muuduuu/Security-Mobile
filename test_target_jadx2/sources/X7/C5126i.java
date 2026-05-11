package x7;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p7.C3823k0;

/* renamed from: x7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5126i {

    /* renamed from: a, reason: collision with root package name */
    private final int f44852a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44853b;

    /* renamed from: c, reason: collision with root package name */
    private final List f44854c;

    /* renamed from: d, reason: collision with root package name */
    private final Location f44855d;

    private C5126i(int i10, int i11, List list, Location location) {
        this.f44852a = i10;
        this.f44853b = i11;
        this.f44854c = list;
        this.f44855d = location;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5126i a(Intent intent) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 != 1 && intExtra2 != 2) {
                if (intExtra2 == 4) {
                    intExtra2 = 4;
                }
            }
            arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList != null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    byte[] bArr = (byte[]) arrayList.get(i10);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    C3823k0 createFromParcel = C3823k0.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                    arrayList2.add(createFromParcel);
                }
            }
            Location location = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if (arrayList2 == null || intExtra != -1) {
                return new C5126i(intExtra, intExtra2, arrayList2, location);
            }
            return null;
        }
        intExtra2 = -1;
        arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList != null) {
        }
        Location location2 = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
        if (arrayList2 == null) {
        }
        return new C5126i(intExtra, intExtra2, arrayList2, location2);
    }

    public int b() {
        return this.f44853b;
    }

    public List c() {
        return this.f44854c;
    }

    public Location d() {
        return this.f44855d;
    }

    public boolean e() {
        return this.f44852a != -1;
    }
}
