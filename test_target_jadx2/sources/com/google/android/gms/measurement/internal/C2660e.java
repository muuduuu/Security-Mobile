package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2261i3;
import com.google.android.gms.internal.measurement.C2270j3;
import com.google.android.gms.internal.measurement.C2288l3;
import com.google.android.gms.internal.measurement.C2377v3;
import j0.C3476a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2660e extends M6 {

    /* renamed from: d, reason: collision with root package name */
    private String f25897d;

    /* renamed from: e, reason: collision with root package name */
    private Set f25898e;

    /* renamed from: f, reason: collision with root package name */
    private Map f25899f;

    /* renamed from: g, reason: collision with root package name */
    private Long f25900g;

    /* renamed from: h, reason: collision with root package name */
    private Long f25901h;

    C2660e(b7 b7Var) {
        super(b7Var);
    }

    private final u7 n(Integer num) {
        if (this.f25899f.containsKey(num)) {
            return (u7) this.f25899f.get(num);
        }
        u7 u7Var = new u7(this, this.f25897d, null);
        this.f25899f.put(num, u7Var);
        return u7Var;
    }

    private final boolean o(int i10, int i11) {
        u7 u7Var = (u7) this.f25899f.get(Integer.valueOf(i10));
        if (u7Var == null) {
            return false;
        }
        return u7Var.c().get(i11);
    }

    @Override // com.google.android.gms.measurement.internal.M6
    protected final boolean l() {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|(2:4|(2:6|7)(1:524))(2:525|526))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(14:(7:25|26|27|28|(1:30)(3:499|(1:501)(1:503)|502)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:458|(6:459|460|461|462|463|(1:466)(1:465))|467)|44|(1:46)(6:287|(11:289|290|291|292|293|(1:(4:295|(1:297)|298|299))(1:442)|302|303|(3:398|(6:401|(2:437|438)(2:405|(8:411|412|(4:415|(2:417|418)(1:420)|419|413)|421|422|(4:425|(3:427|428|429)(1:431)|430|423)|432|433)(4:407|408|409|410))|434|435|410|399)|440)|305|306)(1:457)|307|(10:310|(3:314|(4:317|(5:319|320|(1:322)(1:326)|323|324)(1:327)|325|315)|328)|329|(3:333|(4:336|(3:341|342|343)|344|334)|347)|348|(3:350|(6:353|(2:355|(3:357|358|359))(1:362)|360|361|359|351)|363)|364|(3:373|(8:376|(1:378)|379|(1:381)|382|(3:384|385|386)(1:388)|387|374)|389)|390|308)|396|397)|47|(3:181|(6:184|(2:186|(9:192|193|(12:195|196|197|198|199|200|201|202|203|204|(2:(9:206|207|208|209|210|(3:212|213|214)(1:262)|215|216|(1:219)(1:218))|220)(3:266|267|268)|221)(1:284)|222|(4:225|(3:243|244|245)(6:227|228|(2:229|(2:231|(1:233)(2:234|235))(2:241|242))|(1:237)|238|239)|240|223)|246|247|248|191)(1:188))(1:285)|189|190|191|182)|286)|49|(6:51|(3:53|(6:56|(8:58|59|60|61|62|63|64|(3:(9:66|67|68|69|70|(1:72)(1:129)|73|74|(1:77)(1:76))|78|79)(4:136|137|128|79))(1:154)|80|(2:81|(2:83|(3:119|120|121)(8:85|(2:86|(4:88|(3:90|(1:92)(1:115)|93)(1:116)|94|(1:1)(2:98|(1:100)(2:101|102)))(2:117|118))|109|(1:111)(1:113)|112|104|105|106))(0))|122|54)|155)|156|(9:159|160|161|162|163|164|(2:166|167)(1:169)|168|157)|177|178)(2:179|180))(2:507|508))|523|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|(0)(0)|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x09b4, code lost:
    
        if (r13 != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0896, code lost:
    
        if (r13 == null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x02ee, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x01bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x01bc, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0229, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x022a, code lost:
    
        r18 = "audience_id";
        r19 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0232, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0227, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x022f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0170, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_LEAVE, TryCatch #19 {all -> 0x01b8, blocks: (B:40:0x01a4, B:42:0x01aa, B:458:0x01c2, B:459:0x01c7, B:461:0x01d1, B:462:0x01e1, B:463:0x020d, B:476:0x01f0, B:479:0x0200, B:482:0x0206, B:470:0x0233), top: B:39:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01c2 A[Catch: all -> 0x01b8, SQLiteException -> 0x01bb, TRY_ENTER, TryCatch #19 {all -> 0x01b8, blocks: (B:40:0x01a4, B:42:0x01aa, B:458:0x01c2, B:459:0x01c7, B:461:0x01d1, B:462:0x01e1, B:463:0x020d, B:476:0x01f0, B:479:0x0200, B:482:0x0206, B:470:0x0233), top: B:39:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x079f  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List m(String str, List list, List list2, Long l10, Long l11, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        Cursor cursor;
        Map map;
        String str2;
        String str3;
        Cursor cursor2;
        ?? r13;
        String str4;
        C3476a c3476a;
        String str5;
        String str6;
        String str7;
        String str8;
        List<com.google.android.gms.internal.measurement.D1> list3;
        String str9;
        ?? r52;
        Cursor cursor3;
        Map map2;
        Iterator it;
        String str10;
        v7 v7Var;
        Iterator it2;
        String str11;
        long j10;
        String str12;
        Iterator it3;
        Map map3;
        Iterator it4;
        Cursor cursor4;
        List list4;
        Iterator it5;
        String str13;
        Map map4;
        String str14;
        com.google.android.gms.internal.measurement.L1 l12;
        C2760q3 c2760q3;
        Integer num;
        Cursor cursor5;
        Cursor cursor6;
        List list5;
        C3476a c3476a2;
        Cursor cursor7;
        Cursor cursor8;
        List list6;
        String str15 = "current_results";
        AbstractC1287s.g(str);
        AbstractC1287s.m(list);
        AbstractC1287s.m(list2);
        this.f25897d = str;
        this.f25898e = new HashSet();
        this.f25899f = new C3476a();
        this.f25900g = l10;
        this.f25901h = l11;
        Iterator it6 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it6.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.S2) it6.next()).F())) {
                z11 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.Q6.a();
        C2760q3 c2760q32 = this.f25694a;
        boolean H10 = c2760q32.w().H(this.f25897d, AbstractC2671f2.f25948G0);
        com.google.android.gms.internal.measurement.Q6.a();
        boolean H11 = c2760q32.w().H(this.f25897d, AbstractC2671f2.f25946F0);
        if (z11) {
            C2803w F02 = this.f25405b.F0();
            String str16 = this.f25897d;
            F02.j();
            F02.h();
            AbstractC1287s.g(str16);
            ContentValues contentValues = new ContentValues();
            ?? r53 = "current_session_count";
            contentValues.put("current_session_count", (Integer) 0);
            try {
                r53 = "events";
                F02.u0().update("events", contentValues, "app_id = ?", new String[]{str16});
                cursor = "events";
            } catch (SQLiteException e10) {
                F02.f25694a.a().o().c("Error resetting session-scoped event counts. appId", C2.x(str16), e10);
                cursor = r53;
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str17 = "Failed to merge filter. appId";
        String str18 = "Database error querying filters. appId";
        String str19 = "data";
        String str20 = "audience_id";
        try {
            if (H11 && H10) {
                C2803w F03 = this.f25405b.F0();
                String str21 = this.f25897d;
                AbstractC1287s.g(str21);
                C3476a c3476a3 = new C3476a();
                try {
                    try {
                        cursor8 = F03.u0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str21}, null, null, null);
                        try {
                        } catch (SQLiteException e11) {
                            e = e11;
                            F03.f25694a.a().o().c("Database error querying filters. appId", C2.x(str21), e);
                            emptyMap = Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor7 = cursor;
                        if (cursor7 != null) {
                            cursor7.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor8 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor7 = null;
                    if (cursor7 != null) {
                    }
                    throw th;
                }
                if (cursor8.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.D1 d12 = (com.google.android.gms.internal.measurement.D1) ((com.google.android.gms.internal.measurement.C1) g7.W(com.google.android.gms.internal.measurement.D1.O(), cursor8.getBlob(i11))).v();
                            if (d12.I()) {
                                Integer valueOf = Integer.valueOf(cursor8.getInt(i10));
                                List list7 = (List) c3476a3.get(valueOf);
                                if (list7 == null) {
                                    list6 = new ArrayList();
                                    c3476a3.put(valueOf, list6);
                                } else {
                                    list6 = list7;
                                }
                                list6.add(d12);
                            }
                        } catch (IOException e13) {
                            F03.f25694a.a().o().c("Failed to merge filter. appId", C2.x(str21), e13);
                        }
                        if (!cursor8.moveToNext()) {
                            break;
                        }
                        i10 = 0;
                        i11 = 1;
                    }
                    cursor8.close();
                    map = c3476a3;
                    C2803w F04 = this.f25405b.F0();
                    String str22 = this.f25897d;
                    F04.j();
                    F04.h();
                    AbstractC1287s.g(str22);
                    cursor2 = F04.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str22}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        cursor2.close();
                        r13 = emptyMap2;
                        str2 = "audience_id";
                        str3 = "data";
                    } else {
                        C3476a c3476a4 = new C3476a();
                        while (true) {
                            int i12 = cursor2.getInt(0);
                            try {
                                c3476a4.put(Integer.valueOf(i12), (C2270j3) ((C2261i3) g7.W(C2270j3.K(), cursor2.getBlob(1))).v());
                                c3476a2 = c3476a4;
                                str2 = str20;
                                str3 = str19;
                            } catch (IOException e14) {
                                c3476a2 = c3476a4;
                                str2 = str20;
                                try {
                                    str3 = str19;
                                    try {
                                        F04.f25694a.a().o().d("Failed to merge filter results. appId, audienceId, error", C2.x(str22), Integer.valueOf(i12), e14);
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        F04.f25694a.a().o().c("Database error querying filter results. appId", C2.x(str22), e);
                                        Map emptyMap3 = Collections.emptyMap();
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        r13 = emptyMap3;
                                        if (r13.isEmpty()) {
                                        }
                                        String str23 = "Skipping failed audience ID";
                                        if (!list.isEmpty()) {
                                        }
                                        String str24 = str15;
                                        String str25 = str6;
                                        if (!z10) {
                                        }
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    str3 = str19;
                                    F04.f25694a.a().o().c("Database error querying filter results. appId", C2.x(str22), e);
                                    Map emptyMap32 = Collections.emptyMap();
                                    if (cursor2 != null) {
                                    }
                                    r13 = emptyMap32;
                                    if (r13.isEmpty()) {
                                    }
                                    String str232 = "Skipping failed audience ID";
                                    if (!list.isEmpty()) {
                                    }
                                    String str242 = str15;
                                    String str252 = str6;
                                    if (!z10) {
                                    }
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            c3476a4 = c3476a2;
                            str20 = str2;
                            str19 = str3;
                        }
                        cursor2.close();
                        r13 = c3476a2;
                    }
                    if (r13.isEmpty()) {
                        HashSet<Integer> hashSet = new HashSet(r13.keySet());
                        if (z11) {
                            String str26 = this.f25897d;
                            C2803w F05 = this.f25405b.F0();
                            String str27 = this.f25897d;
                            F05.j();
                            F05.h();
                            AbstractC1287s.g(str27);
                            Map c3476a5 = new C3476a();
                            SQLiteDatabase u02 = F05.u0();
                            try {
                                try {
                                    cursor3 = u02.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str27, str27});
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor3.getInt(0));
                                                List list8 = (List) c3476a5.get(valueOf2);
                                                if (list8 == null) {
                                                    list8 = new ArrayList();
                                                    c3476a5.put(valueOf2, list8);
                                                }
                                                list8.add(Integer.valueOf(cursor3.getInt(1)));
                                            } while (cursor3.moveToNext());
                                        } else {
                                            c3476a5 = Collections.emptyMap();
                                        }
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        F05.f25694a.a().o().c("Database error querying scoped filters. appId", C2.x(str27), e);
                                        c3476a5 = Collections.emptyMap();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r52 = u02;
                                    if (r52 != 0) {
                                        r52.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e18) {
                                e = e18;
                                cursor3 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r52 = 0;
                                if (r52 != 0) {
                                }
                                throw th;
                            }
                            cursor3.close();
                            AbstractC1287s.g(str26);
                            AbstractC1287s.m(r13);
                            C3476a c3476a6 = new C3476a();
                            if (!r13.isEmpty()) {
                                Iterator it7 = r13.keySet().iterator();
                                while (it7.hasNext()) {
                                    Integer num2 = (Integer) it7.next();
                                    num2.intValue();
                                    C2270j3 c2270j3 = (C2270j3) r13.get(num2);
                                    List list9 = (List) c3476a5.get(num2);
                                    if (list9 == null || list9.isEmpty()) {
                                        map2 = c3476a5;
                                        it = it7;
                                        str10 = str18;
                                        c3476a6.put(num2, c2270j3);
                                    } else {
                                        b7 b7Var = this.f25405b;
                                        map2 = c3476a5;
                                        it = it7;
                                        List R10 = b7Var.K0().R(c2270j3.E(), list9);
                                        if (R10.isEmpty()) {
                                            c3476a5 = map2;
                                            it7 = it;
                                        } else {
                                            C2261i3 c2261i3 = (C2261i3) c2270j3.p();
                                            c2261i3.B();
                                            c2261i3.A(R10);
                                            List R11 = b7Var.K0().R(c2270j3.C(), list9);
                                            c2261i3.z();
                                            c2261i3.y(R11);
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it8 = c2270j3.G().iterator();
                                            while (it8.hasNext()) {
                                                Iterator it9 = it8;
                                                com.google.android.gms.internal.measurement.Q2 q22 = (com.google.android.gms.internal.measurement.Q2) it8.next();
                                                String str28 = str18;
                                                if (!list9.contains(Integer.valueOf(q22.D()))) {
                                                    arrayList.add(q22);
                                                }
                                                it8 = it9;
                                                str18 = str28;
                                            }
                                            str10 = str18;
                                            c2261i3.D();
                                            c2261i3.C(arrayList);
                                            ArrayList arrayList2 = new ArrayList();
                                            for (C2288l3 c2288l3 : c2270j3.I()) {
                                                if (!list9.contains(Integer.valueOf(c2288l3.D()))) {
                                                    arrayList2.add(c2288l3);
                                                }
                                            }
                                            c2261i3.G();
                                            c2261i3.E(arrayList2);
                                            c3476a6.put(num2, (C2270j3) c2261i3.v());
                                        }
                                    }
                                    c3476a5 = map2;
                                    it7 = it;
                                    str18 = str10;
                                }
                            }
                            str4 = str18;
                            c3476a = c3476a6;
                        } else {
                            str4 = "Database error querying filters. appId";
                            c3476a = r13;
                        }
                        Map map5 = r13;
                        for (Integer num3 : hashSet) {
                            num3.intValue();
                            C2270j3 c2270j32 = (C2270j3) c3476a.get(num3);
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            C3476a c3476a7 = new C3476a();
                            if (c2270j32 != null && c2270j32.H() != 0) {
                                for (com.google.android.gms.internal.measurement.Q2 q23 : c2270j32.G()) {
                                    if (q23.C()) {
                                        c3476a7.put(Integer.valueOf(q23.D()), q23.E() ? Long.valueOf(q23.F()) : null);
                                    }
                                }
                            }
                            C3476a c3476a8 = new C3476a();
                            if (c2270j32 != null && c2270j32.J() != 0) {
                                Iterator it10 = c2270j32.I().iterator();
                                while (it10.hasNext()) {
                                    C2288l3 c2288l32 = (C2288l3) it10.next();
                                    if (c2288l32.C() && c2288l32.F() > 0) {
                                        c3476a8.put(Integer.valueOf(c2288l32.D()), Long.valueOf(c2288l32.G(c2288l32.F() - 1)));
                                        c3476a = c3476a;
                                        it10 = it10;
                                    }
                                }
                            }
                            C3476a c3476a9 = c3476a;
                            if (c2270j32 != null) {
                                int i13 = 0;
                                while (i13 < c2270j32.D() * 64) {
                                    if (g7.P(c2270j32.C(), i13)) {
                                        str9 = str17;
                                        this.f25694a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i13));
                                        bitSet2.set(i13);
                                        if (g7.P(c2270j32.E(), i13)) {
                                            bitSet.set(i13);
                                            i13++;
                                            str17 = str9;
                                        }
                                    } else {
                                        str9 = str17;
                                    }
                                    c3476a7.remove(Integer.valueOf(i13));
                                    i13++;
                                    str17 = str9;
                                }
                            }
                            String str29 = str17;
                            C2270j3 c2270j33 = (C2270j3) map5.get(num3);
                            if (H11 && H10 && (list3 = (List) map.get(num3)) != null && this.f25901h != null && this.f25900g != null) {
                                for (com.google.android.gms.internal.measurement.D1 d13 : list3) {
                                    int D10 = d13.D();
                                    long longValue = this.f25901h.longValue() / 1000;
                                    if (d13.L()) {
                                        longValue = this.f25900g.longValue() / 1000;
                                    }
                                    Integer valueOf3 = Integer.valueOf(D10);
                                    if (c3476a7.containsKey(valueOf3)) {
                                        c3476a7.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    if (c3476a8.containsKey(valueOf3)) {
                                        c3476a8.put(valueOf3, Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.f25899f.put(num3, new u7(this, this.f25897d, c2270j33, bitSet, bitSet2, c3476a7, c3476a8, null));
                            str17 = str29;
                            H10 = H10;
                            map = map;
                            c3476a = c3476a9;
                            str2 = str2;
                            map5 = map5;
                        }
                        str5 = str17;
                        str6 = str2;
                        str7 = str3;
                        str8 = str4;
                    } else {
                        str8 = "Database error querying filters. appId";
                        str5 = "Failed to merge filter. appId";
                        str6 = str2;
                        str7 = str3;
                    }
                    String str2322 = "Skipping failed audience ID";
                    if (!list.isEmpty()) {
                        v7 v7Var2 = new v7(this, null);
                        C3476a c3476a10 = new C3476a();
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            com.google.android.gms.internal.measurement.S2 s22 = (com.google.android.gms.internal.measurement.S2) it11.next();
                            com.google.android.gms.internal.measurement.S2 a10 = v7Var2.a(this.f25897d, s22);
                            if (a10 != null) {
                                b7 b7Var2 = this.f25405b;
                                E Z10 = b7Var2.F0().Z(this.f25897d, s22, a10.F());
                                b7Var2.F0().w0(Z10);
                                if (!z10) {
                                    long j11 = Z10.f25367c;
                                    String F10 = a10.F();
                                    Map map6 = (Map) c3476a10.get(F10);
                                    if (map6 == null) {
                                        C2803w F06 = b7Var2.F0();
                                        String str30 = this.f25897d;
                                        F06.j();
                                        F06.h();
                                        AbstractC1287s.g(str30);
                                        AbstractC1287s.g(F10);
                                        v7Var = v7Var2;
                                        C3476a c3476a11 = new C3476a();
                                        it2 = it11;
                                        str11 = str15;
                                        str12 = str6;
                                        String str31 = str7;
                                        try {
                                            try {
                                                j10 = j11;
                                                try {
                                                    Cursor query = F06.u0().query("event_filters", new String[]{str12, str31}, "app_id=? AND event_name=?", new String[]{str30, F10}, null, null, null);
                                                    try {
                                                        try {
                                                            if (query.moveToFirst()) {
                                                                while (true) {
                                                                    try {
                                                                        com.google.android.gms.internal.measurement.D1 d14 = (com.google.android.gms.internal.measurement.D1) ((com.google.android.gms.internal.measurement.C1) g7.W(com.google.android.gms.internal.measurement.D1.O(), query.getBlob(1))).v();
                                                                        Integer valueOf4 = Integer.valueOf(query.getInt(0));
                                                                        List list10 = (List) c3476a11.get(valueOf4);
                                                                        if (list10 == null) {
                                                                            str7 = str31;
                                                                            try {
                                                                                list4 = new ArrayList();
                                                                                c3476a11.put(valueOf4, list4);
                                                                            } catch (SQLiteException e19) {
                                                                                e = e19;
                                                                                cursor4 = query;
                                                                                try {
                                                                                    F06.f25694a.a().o().c(str8, C2.x(str30), e);
                                                                                    map6 = Collections.emptyMap();
                                                                                    if (cursor4 != null) {
                                                                                        cursor4.close();
                                                                                    }
                                                                                    c3476a10.put(F10, map6);
                                                                                    it3 = map6.keySet().iterator();
                                                                                    while (it3.hasNext()) {
                                                                                    }
                                                                                    v7Var2 = v7Var;
                                                                                    it11 = it2;
                                                                                    str6 = str12;
                                                                                    str15 = str11;
                                                                                } catch (Throwable th5) {
                                                                                    th = th5;
                                                                                    if (cursor4 != null) {
                                                                                        cursor4.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str7 = str31;
                                                                            list4 = list10;
                                                                        }
                                                                        list4.add(d14);
                                                                    } catch (IOException e20) {
                                                                        str7 = str31;
                                                                        F06.f25694a.a().o().c(str5, C2.x(str30), e20);
                                                                    }
                                                                    if (!query.moveToNext()) {
                                                                        break;
                                                                    }
                                                                    str31 = str7;
                                                                }
                                                                query.close();
                                                                map6 = c3476a11;
                                                            } else {
                                                                str7 = str31;
                                                                map6 = Collections.emptyMap();
                                                                query.close();
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            cursor4 = query;
                                                            if (cursor4 != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (SQLiteException e21) {
                                                        e = e21;
                                                        str7 = str31;
                                                    }
                                                } catch (SQLiteException e22) {
                                                    e = e22;
                                                    str7 = str31;
                                                    cursor4 = null;
                                                    F06.f25694a.a().o().c(str8, C2.x(str30), e);
                                                    map6 = Collections.emptyMap();
                                                    if (cursor4 != null) {
                                                    }
                                                    c3476a10.put(F10, map6);
                                                    it3 = map6.keySet().iterator();
                                                    while (it3.hasNext()) {
                                                    }
                                                    v7Var2 = v7Var;
                                                    it11 = it2;
                                                    str6 = str12;
                                                    str15 = str11;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cursor4 = null;
                                            }
                                        } catch (SQLiteException e23) {
                                            e = e23;
                                            str7 = str31;
                                            j10 = j11;
                                        }
                                        c3476a10.put(F10, map6);
                                    } else {
                                        v7Var = v7Var2;
                                        it2 = it11;
                                        str11 = str15;
                                        j10 = j11;
                                        str12 = str6;
                                    }
                                    it3 = map6.keySet().iterator();
                                    while (it3.hasNext()) {
                                        Integer num4 = (Integer) it3.next();
                                        int intValue = num4.intValue();
                                        if (this.f25898e.contains(num4)) {
                                            this.f25694a.a().w().b("Skipping failed audience ID", num4);
                                        } else {
                                            Iterator it12 = ((List) map6.get(num4)).iterator();
                                            boolean z12 = true;
                                            while (true) {
                                                if (!it12.hasNext()) {
                                                    map3 = map6;
                                                    it4 = it3;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.D1 d15 = (com.google.android.gms.internal.measurement.D1) it12.next();
                                                C2636b c2636b = new C2636b(this, this.f25897d, intValue, d15);
                                                map3 = map6;
                                                it4 = it3;
                                                z12 = c2636b.k(this.f25900g, this.f25901h, a10, j10, Z10, o(intValue, d15.D()));
                                                if (!z12) {
                                                    this.f25898e.add(num4);
                                                    break;
                                                }
                                                n(num4).a(c2636b);
                                                map6 = map3;
                                                it3 = it4;
                                            }
                                            if (!z12) {
                                                this.f25898e.add(num4);
                                            }
                                            map6 = map3;
                                            it3 = it4;
                                        }
                                    }
                                    v7Var2 = v7Var;
                                    it11 = it2;
                                    str6 = str12;
                                    str15 = str11;
                                }
                            }
                        }
                    }
                    String str2422 = str15;
                    String str2522 = str6;
                    if (!z10) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        C3476a c3476a12 = new C3476a();
                        Iterator it13 = list2.iterator();
                        while (it13.hasNext()) {
                            C2377v3 c2377v3 = (C2377v3) it13.next();
                            String E10 = c2377v3.E();
                            Map map7 = (Map) c3476a12.get(E10);
                            if (map7 == null) {
                                C2803w F07 = this.f25405b.F0();
                                String str32 = this.f25897d;
                                F07.j();
                                F07.h();
                                AbstractC1287s.g(str32);
                                AbstractC1287s.g(E10);
                                C3476a c3476a13 = new C3476a();
                                str13 = str7;
                                try {
                                    cursor6 = F07.u0().query("property_filters", new String[]{str2522, str13}, "app_id=? AND property_name=?", new String[]{str32, E10}, null, null, null);
                                    try {
                                        try {
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor5 = cursor6;
                                            if (cursor5 != null) {
                                                cursor5.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e24) {
                                        e = e24;
                                        it5 = it13;
                                    }
                                } catch (SQLiteException e25) {
                                    e = e25;
                                    it5 = it13;
                                    cursor6 = null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor5 = null;
                                }
                                if (cursor6.moveToFirst()) {
                                    while (true) {
                                        try {
                                            com.google.android.gms.internal.measurement.L1 l13 = (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.K1) g7.W(com.google.android.gms.internal.measurement.L1.K(), cursor6.getBlob(1))).v();
                                            Integer valueOf5 = Integer.valueOf(cursor6.getInt(0));
                                            List list11 = (List) c3476a13.get(valueOf5);
                                            if (list11 == null) {
                                                list5 = new ArrayList();
                                                c3476a13.put(valueOf5, list5);
                                            } else {
                                                list5 = list11;
                                            }
                                            list5.add(l13);
                                            it5 = it13;
                                        } catch (IOException e26) {
                                            it5 = it13;
                                            try {
                                                F07.f25694a.a().o().c("Failed to merge filter", C2.x(str32), e26);
                                            } catch (SQLiteException e27) {
                                                e = e27;
                                                F07.f25694a.a().o().c(str8, C2.x(str32), e);
                                                map7 = Collections.emptyMap();
                                            }
                                        }
                                        if (!cursor6.moveToNext()) {
                                            break;
                                        }
                                        it13 = it5;
                                    }
                                    cursor6.close();
                                    map7 = c3476a13;
                                    c3476a12.put(E10, map7);
                                } else {
                                    it5 = it13;
                                    map7 = Collections.emptyMap();
                                    cursor6.close();
                                    c3476a12.put(E10, map7);
                                }
                            } else {
                                it5 = it13;
                                str13 = str7;
                            }
                            Iterator it14 = map7.keySet().iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    Integer num5 = (Integer) it14.next();
                                    int intValue2 = num5.intValue();
                                    if (this.f25898e.contains(num5)) {
                                        this.f25694a.a().w().b(str2322, num5);
                                        break;
                                    }
                                    Iterator it15 = ((List) map7.get(num5)).iterator();
                                    boolean z13 = true;
                                    while (true) {
                                        if (!it15.hasNext()) {
                                            map4 = map7;
                                            str14 = str2322;
                                            break;
                                        }
                                        l12 = (com.google.android.gms.internal.measurement.L1) it15.next();
                                        c2760q3 = this.f25694a;
                                        if (Log.isLoggable(c2760q3.a().z(), 2)) {
                                            A2 w10 = c2760q3.a().w();
                                            if (l12.C()) {
                                                num = Integer.valueOf(l12.D());
                                                map4 = map7;
                                            } else {
                                                map4 = map7;
                                                num = null;
                                            }
                                            str14 = str2322;
                                            w10.d("Evaluating filter. audience, filter, property", num5, num, c2760q3.D().c(l12.E()));
                                            c2760q3.a().w().b("Filter definition", this.f25405b.K0().M(l12));
                                        } else {
                                            map4 = map7;
                                            str14 = str2322;
                                        }
                                        if (!l12.C() || l12.D() > 256) {
                                            break;
                                        }
                                        C2652d c2652d = new C2652d(this, this.f25897d, intValue2, l12);
                                        z13 = c2652d.k(this.f25900g, this.f25901h, c2377v3, o(intValue2, l12.D()));
                                        if (!z13) {
                                            this.f25898e.add(num5);
                                            break;
                                        }
                                        n(num5).a(c2652d);
                                        map7 = map4;
                                        str2322 = str14;
                                    }
                                    c2760q3.a().r().c("Invalid property filter ID. appId, id", C2.x(this.f25897d), String.valueOf(l12.C() ? Integer.valueOf(l12.D()) : null));
                                    this.f25898e.add(num5);
                                    map7 = map4;
                                    str2322 = str14;
                                }
                            }
                            it13 = it5;
                            str7 = str13;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Set<Integer> keySet = this.f25899f.keySet();
                    keySet.removeAll(this.f25898e);
                    for (Integer num6 : keySet) {
                        int intValue3 = num6.intValue();
                        u7 u7Var = (u7) this.f25899f.get(num6);
                        AbstractC1287s.m(u7Var);
                        com.google.android.gms.internal.measurement.G2 b10 = u7Var.b(intValue3);
                        arrayList3.add(b10);
                        C2803w F08 = this.f25405b.F0();
                        String str33 = this.f25897d;
                        C2270j3 E11 = b10.E();
                        F08.j();
                        F08.h();
                        AbstractC1287s.g(str33);
                        AbstractC1287s.m(E11);
                        byte[] c10 = E11.c();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str33);
                        contentValues2.put(str2522, num6);
                        String str34 = str2422;
                        contentValues2.put(str34, c10);
                        try {
                        } catch (SQLiteException e28) {
                            e = e28;
                        }
                        try {
                            if (F08.u0().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                F08.f25694a.a().o().b("Failed to insert filter results (got -1). appId", C2.x(str33));
                            }
                        } catch (SQLiteException e29) {
                            e = e29;
                            F08.f25694a.a().o().c("Error storing filter results. appId", C2.x(str33), e);
                            str2422 = str34;
                        }
                        str2422 = str34;
                    }
                    return arrayList3;
                }
                emptyMap = Collections.emptyMap();
                cursor8.close();
            }
            if (cursor2.moveToFirst()) {
            }
            if (r13.isEmpty()) {
            }
            String str23222 = "Skipping failed audience ID";
            if (!list.isEmpty()) {
            }
            String str24222 = str15;
            String str25222 = str6;
            if (!z10) {
            }
        } catch (Throwable th10) {
            th = th10;
            Cursor cursor9 = cursor2;
            if (cursor9 != null) {
                cursor9.close();
            }
            throw th;
        }
        map = emptyMap;
        C2803w F042 = this.f25405b.F0();
        String str222 = this.f25897d;
        F042.j();
        F042.h();
        AbstractC1287s.g(str222);
        cursor2 = F042.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str222}, null, null, null);
    }
}
