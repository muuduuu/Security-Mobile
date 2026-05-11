package d9;

import X8.C1303i;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;
import r7.C4038a8;
import r7.C4058c8;
import r7.C4096g6;
import r7.C4110i0;
import r7.C4217s8;
import r7.C4255w6;
import r7.C4257w8;
import r7.EnumC4066d6;
import r7.EnumC4076e6;
import r7.EnumC4086f6;
import r7.EnumC4196q6;
import r7.EnumC4205r6;
import r7.InterfaceC4108h8;
import r7.InterfaceC4207r8;
import r7.Z7;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray f31289a;

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray f31290b;

    /* renamed from: c, reason: collision with root package name */
    static final AtomicReference f31291c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f31292d;

    static {
        SparseArray sparseArray = new SparseArray();
        f31289a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f31290b = sparseArray2;
        f31291c = new AtomicReference();
        sparseArray.put(-1, EnumC4196q6.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC4196q6.FORMAT_CODE_128);
        sparseArray.put(2, EnumC4196q6.FORMAT_CODE_39);
        sparseArray.put(4, EnumC4196q6.FORMAT_CODE_93);
        sparseArray.put(8, EnumC4196q6.FORMAT_CODABAR);
        sparseArray.put(16, EnumC4196q6.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC4196q6.FORMAT_EAN_13);
        sparseArray.put(64, EnumC4196q6.FORMAT_EAN_8);
        sparseArray.put(128, EnumC4196q6.FORMAT_ITF);
        sparseArray.put(PSKKeyManager.MAX_KEY_LENGTH_BYTES, EnumC4196q6.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC4196q6.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC4196q6.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC4196q6.FORMAT_PDF417);
        sparseArray.put(4096, EnumC4196q6.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC4205r6.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC4205r6.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC4205r6.TYPE_EMAIL);
        sparseArray2.put(3, EnumC4205r6.TYPE_ISBN);
        sparseArray2.put(4, EnumC4205r6.TYPE_PHONE);
        sparseArray2.put(5, EnumC4205r6.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC4205r6.TYPE_SMS);
        sparseArray2.put(7, EnumC4205r6.TYPE_TEXT);
        sparseArray2.put(8, EnumC4205r6.TYPE_URL);
        sparseArray2.put(9, EnumC4205r6.TYPE_WIFI);
        sparseArray2.put(10, EnumC4205r6.TYPE_GEO);
        sparseArray2.put(11, EnumC4205r6.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC4205r6.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f31292d = hashMap;
        hashMap.put(1, Z7.CODE_128);
        hashMap.put(2, Z7.CODE_39);
        hashMap.put(4, Z7.CODE_93);
        hashMap.put(8, Z7.CODABAR);
        hashMap.put(16, Z7.DATA_MATRIX);
        hashMap.put(32, Z7.EAN_13);
        hashMap.put(64, Z7.EAN_8);
        hashMap.put(128, Z7.ITF);
        hashMap.put(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), Z7.QR_CODE);
        hashMap.put(512, Z7.UPC_A);
        hashMap.put(1024, Z7.UPC_E);
        hashMap.put(2048, Z7.PDF417);
        hashMap.put(4096, Z7.AZTEC);
    }

    public static EnumC4196q6 a(int i10) {
        EnumC4196q6 enumC4196q6 = (EnumC4196q6) f31289a.get(i10);
        return enumC4196q6 == null ? EnumC4196q6.FORMAT_UNKNOWN : enumC4196q6;
    }

    public static EnumC4205r6 b(int i10) {
        EnumC4205r6 enumC4205r6 = (EnumC4205r6) f31290b.get(i10);
        return enumC4205r6 == null ? EnumC4205r6.TYPE_UNKNOWN : enumC4205r6;
    }

    public static C4058c8 c(Z8.b bVar) {
        int a10 = bVar.a();
        C4110i0 c4110i0 = new C4110i0();
        if (a10 == 0) {
            c4110i0.f(f31292d.values());
        } else {
            for (Map.Entry entry : f31292d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & a10) != 0) {
                    c4110i0.e((Z7) entry.getValue());
                }
            }
        }
        C4038a8 c4038a8 = new C4038a8();
        c4038a8.b(c4110i0.g());
        return c4038a8.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static void e(C4217s8 c4217s8, final EnumC4076e6 enumC4076e6) {
        c4217s8.f(new InterfaceC4207r8() { // from class: d9.b
            @Override // r7.InterfaceC4207r8
            public final InterfaceC4108h8 zza() {
                EnumC4076e6 enumC4076e62 = EnumC4076e6.this;
                C4096g6 c4096g6 = new C4096g6();
                c4096g6.e(c.f() ? EnumC4066d6.TYPE_THICK : EnumC4066d6.TYPE_THIN);
                C4255w6 c4255w6 = new C4255w6();
                c4255w6.b(enumC4076e62);
                c4096g6.h(c4255w6.c());
                return C4257w8.d(c4096g6);
            }
        }, EnumC4086f6.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f31291c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean c10 = n.c(C1303i.c().b());
        atomicReference.set(Boolean.valueOf(c10));
        return c10;
    }
}
