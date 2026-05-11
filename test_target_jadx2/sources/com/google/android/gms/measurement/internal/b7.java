package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import b7.C1653b;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.google.android.gms.internal.measurement.AbstractC2217d4;
import com.google.android.gms.internal.measurement.AbstractC2231f0;
import com.google.android.gms.internal.measurement.C2207c3;
import com.google.android.gms.internal.measurement.C2216d3;
import com.google.android.gms.internal.measurement.C2224e2;
import com.google.android.gms.internal.measurement.C2225e3;
import com.google.android.gms.internal.measurement.C2278k2;
import com.google.android.gms.internal.measurement.C2301m7;
import com.google.android.gms.internal.measurement.C2326p5;
import com.google.android.gms.internal.measurement.C2359t3;
import com.google.android.gms.internal.measurement.C2368u3;
import com.google.android.gms.internal.measurement.C2377v3;
import com.google.android.gms.internal.measurement.C2385w2;
import com.google.android.gms.internal.measurement.EnumC2315o3;
import com.google.android.gms.internal.measurement.z7;
import d7.C2998d;
import h1.C3226d;
import j0.C3476a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class b7 implements V3 {

    /* renamed from: K, reason: collision with root package name */
    private static volatile b7 f25812K;

    /* renamed from: A, reason: collision with root package name */
    private long f25813A;

    /* renamed from: B, reason: collision with root package name */
    private final Map f25814B;

    /* renamed from: C, reason: collision with root package name */
    private final Map f25815C;

    /* renamed from: D, reason: collision with root package name */
    private final Map f25816D;

    /* renamed from: F, reason: collision with root package name */
    private C2730m5 f25818F;

    /* renamed from: G, reason: collision with root package name */
    private String f25819G;

    /* renamed from: H, reason: collision with root package name */
    private AbstractC2827z f25820H;

    /* renamed from: I, reason: collision with root package name */
    private long f25821I;

    /* renamed from: a, reason: collision with root package name */
    private final C2656d3 f25823a;

    /* renamed from: b, reason: collision with root package name */
    private final H2 f25824b;

    /* renamed from: c, reason: collision with root package name */
    private C2803w f25825c;

    /* renamed from: d, reason: collision with root package name */
    private K2 f25826d;

    /* renamed from: e, reason: collision with root package name */
    private E6 f25827e;

    /* renamed from: f, reason: collision with root package name */
    private C2660e f25828f;

    /* renamed from: g, reason: collision with root package name */
    private final g7 f25829g;

    /* renamed from: h, reason: collision with root package name */
    private C2690h5 f25830h;

    /* renamed from: i, reason: collision with root package name */
    private C2683g6 f25831i;

    /* renamed from: j, reason: collision with root package name */
    private final O6 f25832j;

    /* renamed from: k, reason: collision with root package name */
    private T2 f25833k;

    /* renamed from: l, reason: collision with root package name */
    private final C2760q3 f25834l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25836n;

    /* renamed from: o, reason: collision with root package name */
    long f25837o;

    /* renamed from: p, reason: collision with root package name */
    private List f25838p;

    /* renamed from: r, reason: collision with root package name */
    private int f25840r;

    /* renamed from: s, reason: collision with root package name */
    private int f25841s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f25842t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f25843u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f25844v;

    /* renamed from: w, reason: collision with root package name */
    private FileLock f25845w;

    /* renamed from: x, reason: collision with root package name */
    private FileChannel f25846x;

    /* renamed from: y, reason: collision with root package name */
    private List f25847y;

    /* renamed from: z, reason: collision with root package name */
    private List f25848z;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f25835m = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    private final Deque f25839q = new LinkedList();

    /* renamed from: E, reason: collision with root package name */
    private final Map f25817E = new HashMap();

    /* renamed from: J, reason: collision with root package name */
    private final k7 f25822J = new W6(this);

    b7(c7 c7Var, C2760q3 c2760q3) {
        AbstractC1287s.m(c7Var);
        this.f25834l = C2760q3.O(c7Var.f25867a, null, null);
        this.f25813A = -1L;
        this.f25832j = new O6(this);
        g7 g7Var = new g7(this);
        g7Var.k();
        this.f25829g = g7Var;
        H2 h22 = new H2(this);
        h22.k();
        this.f25824b = h22;
        C2656d3 c2656d3 = new C2656d3(this);
        c2656d3.k();
        this.f25823a = c2656d3;
        this.f25814B = new HashMap();
        this.f25815C = new HashMap();
        this.f25816D = new HashMap();
        b().t(new P6(this, c7Var));
    }

    public static b7 F(Context context) {
        AbstractC1287s.m(context);
        AbstractC1287s.m(context.getApplicationContext());
        if (f25812K == null) {
            synchronized (b7.class) {
                try {
                    if (f25812K == null) {
                        f25812K = new b7((c7) AbstractC1287s.m(new c7(context)), null);
                    }
                } finally {
                }
            }
        }
        return f25812K;
    }

    static final void G(com.google.android.gms.internal.measurement.R2 r22, int i10, String str) {
        List y10 = r22.y();
        for (int i11 = 0; i11 < y10.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.W2) y10.get(i11)).D())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
        O10.z("_err");
        O10.D(i10);
        com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) O10.v();
        com.google.android.gms.internal.measurement.V2 O11 = com.google.android.gms.internal.measurement.W2.O();
        O11.z("_ev");
        O11.B(str);
        com.google.android.gms.internal.measurement.W2 w23 = (com.google.android.gms.internal.measurement.W2) O11.v();
        r22.D(w22);
        r22.D(w23);
    }

    static final void H(com.google.android.gms.internal.measurement.R2 r22, String str) {
        List y10 = r22.y();
        for (int i10 = 0; i10 < y10.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.W2) y10.get(i10)).D())) {
                r22.J(i10);
                return;
            }
        }
    }

    private final int I(String str, C2740o c2740o) {
        Z3 z32;
        X3 m10;
        C2656d3 c2656d3 = this.f25823a;
        if (c2656d3.R(str) == null) {
            c2740o.c(Z3.AD_PERSONALIZATION, EnumC2732n.FAILSAFE);
            return 1;
        }
        I2 J02 = F0().J0(str);
        if (J02 != null && C2670f1.c(J02.I()).a() == X3.POLICY && (m10 = c2656d3.m(str, (z32 = Z3.AD_PERSONALIZATION))) != X3.UNINITIALIZED) {
            c2740o.c(z32, EnumC2732n.REMOTE_ENFORCED_DEFAULT);
            return m10 == X3.GRANTED ? 0 : 1;
        }
        Z3 z33 = Z3.AD_PERSONALIZATION;
        c2740o.c(z33, EnumC2732n.REMOTE_DEFAULT);
        return c2656d3.P(str, z33) ? 0 : 1;
    }

    private final Map J(com.google.android.gms.internal.measurement.S2 s22) {
        HashMap hashMap = new HashMap();
        K0();
        for (Map.Entry entry : g7.t(s22, "gad_").entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    private final AbstractC2827z K() {
        if (this.f25820H == null) {
            this.f25820H = new S6(this, this.f25834l);
        }
        return this.f25820H;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void v0() {
        b().h();
        if (this.f25839q.isEmpty() || K().c()) {
            return;
        }
        long max = Math.max(0L, ((Integer) AbstractC2671f2.f25940C0.b(null)).intValue() - (f().c() - this.f25821I));
        a().w().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        K().b(max);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(3:9|10|(4:12|13|(4:15|(1:22)|23|24)(24:26|27|(4:245|(2:247|(2:253|254))|255|254)|33|(2:35|(3:37|(4:40|(2:46|47)|48|38)|52))|53|54|(3:56|57|(8:243|(5:113|(6:117|(1:119)(2:122|(1:124))|120|121|115|114)|125|126|(2:129|(3:134|(1:136)(2:138|(3:140|(3:143|(1:145)(1:146)|141)|147)(0))|137)(1:133))(1:128))(0)|148|(2:150|(2:(2:155|(2:157|158))|204)(4:205|206|207|208))(4:209|(3:211|(2:(2:216|(2:218|158))|219)|206)(2:220|(5:222|(3:224|(1:226)|208)(1:240)|227|(2:231|(2:232|(2:234|(2:237|238)(1:236))(1:239)))(0)|208))|207|208)|159|(9:161|(5:164|(2:181|(1:183))(4:168|(5:171|(2:174|172)|175|176|169)|177|178)|179|180|162)|184|185|(4:188|(3:190|191|192)(1:194)|193|186)|195|196|(2:199|197)|200)(1:203)|201|202))(1:244)|61|(3:62|63|(3:65|(2:67|68)(2:70|(2:72|73)(2:74|75))|69)(1:76))|77|(1:242)(1:80)|(1:82)|83|(1:85)(1:241)|86|(5:91|(4:94|(2:96|97)(4:99|(1:101)|102|103)|98|92)|104|(1:(1:107)(1:108))|(1:110)(1:111))|(0)(0)|148|(0)(0)|159|(0)(0)|201|202)|25)(1:256))|257|(6:259|(2:261|(3:263|264|265))|266|(3:268|(1:270)(1:275)|(1:274))|264|265)|276|277|(2:278|(2:280|(2:282|283)(1:521))(2:522|523))|284|(1:286)(2:518|(1:520))|287|(1:289)(1:517)|290|(1:292)(1:516)|293|(6:296|(1:298)|299|(2:301|302)(1:304)|303|294)|305|306|(2:511|(1:515))(1:310)|311|(1:313)|314|(1:316)|317|(1:325)|326|(10:396|397|(6:400|401|(6:403|(1:407)|(1:428)(5:411|(1:415)|416|(1:427)(1:420)|421)|422|423|424)(10:430|431|(8:495|496|434|(2:436|(2:437|(2:439|(3:442|443|(1:445)(1:446))(1:441))(1:493)))(0)|494|(1:448)(6:450|(2:452|(1:454))(1:492)|455|(1:457)(1:491)|458|(3:460|(1:468)|469)(3:470|(3:472|(1:474)|475)(5:477|(1:479)(1:490)|480|(3:482|(1:484)|485)(2:487|(1:489))|486)|476))|449|424)|433|434|(0)(0)|494|(0)(0)|449|424)|425|426|398)|501|502|(1:504)|505|(2:508|506)|509|510)(1:328)|329|(1:331)(2:377|(20:379|(1:381)(1:395)|382|(1:384)(1:394)|385|(1:387)(1:393)|388|(1:390)(1:392)|391|333|(6:335|336|(2:341|342)|366|(1:368)(1:369)|342)(1:370)|343|(3:(2:347|348)(1:350)|349|344)|351|352|(1:354)|355|356|357|358))|332|333|(0)(0)|343|(1:344)|351|352|(0)|355|356|357|358) */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0e21, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0e23, code lost:
    
        r1.f25694a.a().o().c("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.C2.x(r3), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f2 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0017, B:6:0x0035, B:8:0x003f, B:9:0x0056, B:12:0x006e, B:15:0x0094, B:17:0x00c9, B:20:0x00da, B:22:0x00e4, B:25:0x0705, B:26:0x0119, B:29:0x012b, B:31:0x0131, B:33:0x016c, B:35:0x017a, B:38:0x019a, B:40:0x01a0, B:42:0x01b0, B:44:0x01be, B:46:0x01ce, B:48:0x01db, B:53:0x01de, B:56:0x01f4, B:62:0x0225, B:65:0x022f, B:67:0x023d, B:69:0x0288, B:70:0x025a, B:72:0x0268, B:80:0x0294, B:82:0x02c5, B:83:0x02ef, B:85:0x0326, B:86:0x032c, B:89:0x0338, B:91:0x036f, B:92:0x038a, B:94:0x0390, B:96:0x039e, B:98:0x03b4, B:99:0x03a8, B:107:0x03ba, B:110:0x03c1, B:111:0x03d9, B:113:0x03f2, B:114:0x03fe, B:117:0x0408, B:121:0x042d, B:122:0x041b, B:129:0x0434, B:131:0x0440, B:133:0x044c, B:137:0x0491, B:138:0x0469, B:141:0x047b, B:143:0x0481, B:145:0x048b, B:148:0x04a9, B:150:0x04b5, B:153:0x04c6, B:155:0x04d7, B:157:0x04e3, B:159:0x05b7, B:161:0x05bd, B:162:0x05c9, B:164:0x05cf, B:166:0x05df, B:168:0x05e9, B:169:0x05fe, B:171:0x0604, B:172:0x061f, B:174:0x0625, B:176:0x0643, B:178:0x064e, B:180:0x067d, B:181:0x0657, B:183:0x0669, B:185:0x068a, B:186:0x06a8, B:188:0x06ae, B:191:0x06c1, B:196:0x06ce, B:197:0x06d2, B:199:0x06d8, B:201:0x06ec, B:209:0x0503, B:211:0x0511, B:214:0x0524, B:216:0x0535, B:218:0x0541, B:220:0x0554, B:222:0x0563, B:224:0x056f, B:227:0x057e, B:229:0x0588, B:232:0x0593, B:234:0x0599, B:238:0x05a9, B:236:0x05b4, B:245:0x0137, B:247:0x0142, B:249:0x014e, B:251:0x0154, B:254:0x015f, B:259:0x0722, B:261:0x0730, B:263:0x0739, B:265:0x076b, B:266:0x0741, B:268:0x074b, B:270:0x0751, B:272:0x075d, B:274:0x0765, B:277:0x076d, B:278:0x0779, B:280:0x077f, B:283:0x0791, B:284:0x07a1, B:286:0x07a9, B:287:0x07ce, B:289:0x07e8, B:290:0x07fd, B:292:0x0817, B:293:0x082c, B:294:0x083a, B:296:0x0840, B:298:0x0850, B:299:0x0857, B:301:0x0863, B:303:0x086a, B:306:0x086d, B:308:0x08af, B:310:0x08b5, B:311:0x08dc, B:313:0x08e4, B:314:0x08ed, B:316:0x08f3, B:317:0x08f9, B:319:0x090e, B:321:0x091e, B:323:0x092e, B:325:0x0936, B:326:0x0939, B:403:0x09ab, B:405:0x09c4, B:407:0x09da, B:409:0x09df, B:411:0x09e3, B:413:0x09e7, B:415:0x09f1, B:416:0x09f7, B:418:0x09fb, B:420:0x0a01, B:421:0x0a12, B:422:0x0a1e, B:496:0x0a45, B:500:0x0a4c, B:511:0x08c3, B:513:0x08c9, B:515:0x08cf, B:516:0x0829, B:517:0x07fa, B:518:0x07ae, B:520:0x07b4), top: B:2:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b5 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0017, B:6:0x0035, B:8:0x003f, B:9:0x0056, B:12:0x006e, B:15:0x0094, B:17:0x00c9, B:20:0x00da, B:22:0x00e4, B:25:0x0705, B:26:0x0119, B:29:0x012b, B:31:0x0131, B:33:0x016c, B:35:0x017a, B:38:0x019a, B:40:0x01a0, B:42:0x01b0, B:44:0x01be, B:46:0x01ce, B:48:0x01db, B:53:0x01de, B:56:0x01f4, B:62:0x0225, B:65:0x022f, B:67:0x023d, B:69:0x0288, B:70:0x025a, B:72:0x0268, B:80:0x0294, B:82:0x02c5, B:83:0x02ef, B:85:0x0326, B:86:0x032c, B:89:0x0338, B:91:0x036f, B:92:0x038a, B:94:0x0390, B:96:0x039e, B:98:0x03b4, B:99:0x03a8, B:107:0x03ba, B:110:0x03c1, B:111:0x03d9, B:113:0x03f2, B:114:0x03fe, B:117:0x0408, B:121:0x042d, B:122:0x041b, B:129:0x0434, B:131:0x0440, B:133:0x044c, B:137:0x0491, B:138:0x0469, B:141:0x047b, B:143:0x0481, B:145:0x048b, B:148:0x04a9, B:150:0x04b5, B:153:0x04c6, B:155:0x04d7, B:157:0x04e3, B:159:0x05b7, B:161:0x05bd, B:162:0x05c9, B:164:0x05cf, B:166:0x05df, B:168:0x05e9, B:169:0x05fe, B:171:0x0604, B:172:0x061f, B:174:0x0625, B:176:0x0643, B:178:0x064e, B:180:0x067d, B:181:0x0657, B:183:0x0669, B:185:0x068a, B:186:0x06a8, B:188:0x06ae, B:191:0x06c1, B:196:0x06ce, B:197:0x06d2, B:199:0x06d8, B:201:0x06ec, B:209:0x0503, B:211:0x0511, B:214:0x0524, B:216:0x0535, B:218:0x0541, B:220:0x0554, B:222:0x0563, B:224:0x056f, B:227:0x057e, B:229:0x0588, B:232:0x0593, B:234:0x0599, B:238:0x05a9, B:236:0x05b4, B:245:0x0137, B:247:0x0142, B:249:0x014e, B:251:0x0154, B:254:0x015f, B:259:0x0722, B:261:0x0730, B:263:0x0739, B:265:0x076b, B:266:0x0741, B:268:0x074b, B:270:0x0751, B:272:0x075d, B:274:0x0765, B:277:0x076d, B:278:0x0779, B:280:0x077f, B:283:0x0791, B:284:0x07a1, B:286:0x07a9, B:287:0x07ce, B:289:0x07e8, B:290:0x07fd, B:292:0x0817, B:293:0x082c, B:294:0x083a, B:296:0x0840, B:298:0x0850, B:299:0x0857, B:301:0x0863, B:303:0x086a, B:306:0x086d, B:308:0x08af, B:310:0x08b5, B:311:0x08dc, B:313:0x08e4, B:314:0x08ed, B:316:0x08f3, B:317:0x08f9, B:319:0x090e, B:321:0x091e, B:323:0x092e, B:325:0x0936, B:326:0x0939, B:403:0x09ab, B:405:0x09c4, B:407:0x09da, B:409:0x09df, B:411:0x09e3, B:413:0x09e7, B:415:0x09f1, B:416:0x09f7, B:418:0x09fb, B:420:0x0a01, B:421:0x0a12, B:422:0x0a1e, B:496:0x0a45, B:500:0x0a4c, B:511:0x08c3, B:513:0x08c9, B:515:0x08cf, B:516:0x0829, B:517:0x07fa, B:518:0x07ae, B:520:0x07b4), top: B:2:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05bd A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0017, B:6:0x0035, B:8:0x003f, B:9:0x0056, B:12:0x006e, B:15:0x0094, B:17:0x00c9, B:20:0x00da, B:22:0x00e4, B:25:0x0705, B:26:0x0119, B:29:0x012b, B:31:0x0131, B:33:0x016c, B:35:0x017a, B:38:0x019a, B:40:0x01a0, B:42:0x01b0, B:44:0x01be, B:46:0x01ce, B:48:0x01db, B:53:0x01de, B:56:0x01f4, B:62:0x0225, B:65:0x022f, B:67:0x023d, B:69:0x0288, B:70:0x025a, B:72:0x0268, B:80:0x0294, B:82:0x02c5, B:83:0x02ef, B:85:0x0326, B:86:0x032c, B:89:0x0338, B:91:0x036f, B:92:0x038a, B:94:0x0390, B:96:0x039e, B:98:0x03b4, B:99:0x03a8, B:107:0x03ba, B:110:0x03c1, B:111:0x03d9, B:113:0x03f2, B:114:0x03fe, B:117:0x0408, B:121:0x042d, B:122:0x041b, B:129:0x0434, B:131:0x0440, B:133:0x044c, B:137:0x0491, B:138:0x0469, B:141:0x047b, B:143:0x0481, B:145:0x048b, B:148:0x04a9, B:150:0x04b5, B:153:0x04c6, B:155:0x04d7, B:157:0x04e3, B:159:0x05b7, B:161:0x05bd, B:162:0x05c9, B:164:0x05cf, B:166:0x05df, B:168:0x05e9, B:169:0x05fe, B:171:0x0604, B:172:0x061f, B:174:0x0625, B:176:0x0643, B:178:0x064e, B:180:0x067d, B:181:0x0657, B:183:0x0669, B:185:0x068a, B:186:0x06a8, B:188:0x06ae, B:191:0x06c1, B:196:0x06ce, B:197:0x06d2, B:199:0x06d8, B:201:0x06ec, B:209:0x0503, B:211:0x0511, B:214:0x0524, B:216:0x0535, B:218:0x0541, B:220:0x0554, B:222:0x0563, B:224:0x056f, B:227:0x057e, B:229:0x0588, B:232:0x0593, B:234:0x0599, B:238:0x05a9, B:236:0x05b4, B:245:0x0137, B:247:0x0142, B:249:0x014e, B:251:0x0154, B:254:0x015f, B:259:0x0722, B:261:0x0730, B:263:0x0739, B:265:0x076b, B:266:0x0741, B:268:0x074b, B:270:0x0751, B:272:0x075d, B:274:0x0765, B:277:0x076d, B:278:0x0779, B:280:0x077f, B:283:0x0791, B:284:0x07a1, B:286:0x07a9, B:287:0x07ce, B:289:0x07e8, B:290:0x07fd, B:292:0x0817, B:293:0x082c, B:294:0x083a, B:296:0x0840, B:298:0x0850, B:299:0x0857, B:301:0x0863, B:303:0x086a, B:306:0x086d, B:308:0x08af, B:310:0x08b5, B:311:0x08dc, B:313:0x08e4, B:314:0x08ed, B:316:0x08f3, B:317:0x08f9, B:319:0x090e, B:321:0x091e, B:323:0x092e, B:325:0x0936, B:326:0x0939, B:403:0x09ab, B:405:0x09c4, B:407:0x09da, B:409:0x09df, B:411:0x09e3, B:413:0x09e7, B:415:0x09f1, B:416:0x09f7, B:418:0x09fb, B:420:0x0a01, B:421:0x0a12, B:422:0x0a1e, B:496:0x0a45, B:500:0x0a4c, B:511:0x08c3, B:513:0x08c9, B:515:0x08cf, B:516:0x0829, B:517:0x07fa, B:518:0x07ae, B:520:0x07b4), top: B:2:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0503 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:3:0x0017, B:6:0x0035, B:8:0x003f, B:9:0x0056, B:12:0x006e, B:15:0x0094, B:17:0x00c9, B:20:0x00da, B:22:0x00e4, B:25:0x0705, B:26:0x0119, B:29:0x012b, B:31:0x0131, B:33:0x016c, B:35:0x017a, B:38:0x019a, B:40:0x01a0, B:42:0x01b0, B:44:0x01be, B:46:0x01ce, B:48:0x01db, B:53:0x01de, B:56:0x01f4, B:62:0x0225, B:65:0x022f, B:67:0x023d, B:69:0x0288, B:70:0x025a, B:72:0x0268, B:80:0x0294, B:82:0x02c5, B:83:0x02ef, B:85:0x0326, B:86:0x032c, B:89:0x0338, B:91:0x036f, B:92:0x038a, B:94:0x0390, B:96:0x039e, B:98:0x03b4, B:99:0x03a8, B:107:0x03ba, B:110:0x03c1, B:111:0x03d9, B:113:0x03f2, B:114:0x03fe, B:117:0x0408, B:121:0x042d, B:122:0x041b, B:129:0x0434, B:131:0x0440, B:133:0x044c, B:137:0x0491, B:138:0x0469, B:141:0x047b, B:143:0x0481, B:145:0x048b, B:148:0x04a9, B:150:0x04b5, B:153:0x04c6, B:155:0x04d7, B:157:0x04e3, B:159:0x05b7, B:161:0x05bd, B:162:0x05c9, B:164:0x05cf, B:166:0x05df, B:168:0x05e9, B:169:0x05fe, B:171:0x0604, B:172:0x061f, B:174:0x0625, B:176:0x0643, B:178:0x064e, B:180:0x067d, B:181:0x0657, B:183:0x0669, B:185:0x068a, B:186:0x06a8, B:188:0x06ae, B:191:0x06c1, B:196:0x06ce, B:197:0x06d2, B:199:0x06d8, B:201:0x06ec, B:209:0x0503, B:211:0x0511, B:214:0x0524, B:216:0x0535, B:218:0x0541, B:220:0x0554, B:222:0x0563, B:224:0x056f, B:227:0x057e, B:229:0x0588, B:232:0x0593, B:234:0x0599, B:238:0x05a9, B:236:0x05b4, B:245:0x0137, B:247:0x0142, B:249:0x014e, B:251:0x0154, B:254:0x015f, B:259:0x0722, B:261:0x0730, B:263:0x0739, B:265:0x076b, B:266:0x0741, B:268:0x074b, B:270:0x0751, B:272:0x075d, B:274:0x0765, B:277:0x076d, B:278:0x0779, B:280:0x077f, B:283:0x0791, B:284:0x07a1, B:286:0x07a9, B:287:0x07ce, B:289:0x07e8, B:290:0x07fd, B:292:0x0817, B:293:0x082c, B:294:0x083a, B:296:0x0840, B:298:0x0850, B:299:0x0857, B:301:0x0863, B:303:0x086a, B:306:0x086d, B:308:0x08af, B:310:0x08b5, B:311:0x08dc, B:313:0x08e4, B:314:0x08ed, B:316:0x08f3, B:317:0x08f9, B:319:0x090e, B:321:0x091e, B:323:0x092e, B:325:0x0936, B:326:0x0939, B:403:0x09ab, B:405:0x09c4, B:407:0x09da, B:409:0x09df, B:411:0x09e3, B:413:0x09e7, B:415:0x09f1, B:416:0x09f7, B:418:0x09fb, B:420:0x0a01, B:421:0x0a12, B:422:0x0a1e, B:496:0x0a45, B:500:0x0a4c, B:511:0x08c3, B:513:0x08c9, B:515:0x08cf, B:516:0x0829, B:517:0x07fa, B:518:0x07ae, B:520:0x07b4), top: B:2:0x0017, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0df4 A[Catch: all -> 0x0d68, TryCatch #2 {all -> 0x0d68, blocks: (B:336:0x0d44, B:338:0x0d59, B:341:0x0d60, B:342:0x0d94, B:343:0x0da6, B:344:0x0dbc, B:347:0x0dc4, B:349:0x0dc9, B:352:0x0dd9, B:354:0x0df4, B:355:0x0e0f, B:357:0x0e17, B:358:0x0e36, B:365:0x0e23, B:366:0x0d6b, B:368:0x0d77, B:369:0x0d7d, B:525:0x0e3f), top: B:4:0x0033, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a84 A[Catch: all -> 0x0ab5, TryCatch #1 {all -> 0x0ab5, blocks: (B:397:0x097a, B:398:0x098d, B:400:0x0993, B:426:0x0c62, B:431:0x0a2f, B:434:0x0a61, B:436:0x0a84, B:437:0x0a8c, B:439:0x0a92, B:443:0x0aa4, B:448:0x0ad1, B:450:0x0afc, B:452:0x0b08, B:454:0x0b1e, B:455:0x0b5d, B:460:0x0b77, B:462:0x0b82, B:464:0x0b86, B:466:0x0b8a, B:468:0x0b8e, B:469:0x0b9a, B:470:0x0b9f, B:472:0x0ba5, B:474:0x0bbc, B:475:0x0bc1, B:476:0x0c5d, B:477:0x0bdb, B:479:0x0be0, B:482:0x0c07, B:484:0x0c2b, B:485:0x0c32, B:489:0x0c50, B:490:0x0bed, B:494:0x0abd, B:502:0x0c71, B:504:0x0c7e, B:505:0x0c84, B:506:0x0c8c, B:508:0x0c92, B:329:0x0caa, B:331:0x0cba, B:333:0x0d3c, B:377:0x0cd3, B:379:0x0cd9, B:381:0x0ce3, B:382:0x0cea, B:387:0x0cfa, B:388:0x0d01, B:390:0x0d2d, B:391:0x0d34, B:392:0x0d31, B:393:0x0cfe, B:395:0x0ce7), top: B:396:0x097a }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0ad1 A[Catch: all -> 0x0ab5, TryCatch #1 {all -> 0x0ab5, blocks: (B:397:0x097a, B:398:0x098d, B:400:0x0993, B:426:0x0c62, B:431:0x0a2f, B:434:0x0a61, B:436:0x0a84, B:437:0x0a8c, B:439:0x0a92, B:443:0x0aa4, B:448:0x0ad1, B:450:0x0afc, B:452:0x0b08, B:454:0x0b1e, B:455:0x0b5d, B:460:0x0b77, B:462:0x0b82, B:464:0x0b86, B:466:0x0b8a, B:468:0x0b8e, B:469:0x0b9a, B:470:0x0b9f, B:472:0x0ba5, B:474:0x0bbc, B:475:0x0bc1, B:476:0x0c5d, B:477:0x0bdb, B:479:0x0be0, B:482:0x0c07, B:484:0x0c2b, B:485:0x0c32, B:489:0x0c50, B:490:0x0bed, B:494:0x0abd, B:502:0x0c71, B:504:0x0c7e, B:505:0x0c84, B:506:0x0c8c, B:508:0x0c92, B:329:0x0caa, B:331:0x0cba, B:333:0x0d3c, B:377:0x0cd3, B:379:0x0cd9, B:381:0x0ce3, B:382:0x0cea, B:387:0x0cfa, B:388:0x0d01, B:390:0x0d2d, B:391:0x0d34, B:392:0x0d31, B:393:0x0cfe, B:395:0x0ce7), top: B:396:0x097a }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0afc A[Catch: all -> 0x0ab5, TryCatch #1 {all -> 0x0ab5, blocks: (B:397:0x097a, B:398:0x098d, B:400:0x0993, B:426:0x0c62, B:431:0x0a2f, B:434:0x0a61, B:436:0x0a84, B:437:0x0a8c, B:439:0x0a92, B:443:0x0aa4, B:448:0x0ad1, B:450:0x0afc, B:452:0x0b08, B:454:0x0b1e, B:455:0x0b5d, B:460:0x0b77, B:462:0x0b82, B:464:0x0b86, B:466:0x0b8a, B:468:0x0b8e, B:469:0x0b9a, B:470:0x0b9f, B:472:0x0ba5, B:474:0x0bbc, B:475:0x0bc1, B:476:0x0c5d, B:477:0x0bdb, B:479:0x0be0, B:482:0x0c07, B:484:0x0c2b, B:485:0x0c32, B:489:0x0c50, B:490:0x0bed, B:494:0x0abd, B:502:0x0c71, B:504:0x0c7e, B:505:0x0c84, B:506:0x0c8c, B:508:0x0c92, B:329:0x0caa, B:331:0x0cba, B:333:0x0d3c, B:377:0x0cd3, B:379:0x0cd9, B:381:0x0ce3, B:382:0x0cea, B:387:0x0cfa, B:388:0x0d01, B:390:0x0d2d, B:391:0x0d34, B:392:0x0d31, B:393:0x0cfe, B:395:0x0ce7), top: B:396:0x097a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean M(String str, long j10) {
        boolean z10;
        C2216d3 c2216d3;
        String str2;
        C2216d3 c2216d32;
        X6 x62;
        long parseLong;
        int G10;
        long j11;
        X6 x63;
        SecureRandom secureRandom;
        int i10;
        HashMap hashMap;
        C2216d3 c2216d33;
        long Y10;
        String str3;
        HashMap hashMap2;
        int i11;
        C2216d3 c2216d34;
        String str4;
        int i12;
        List list;
        int delete;
        String str5;
        String str6;
        com.google.android.gms.internal.measurement.R2 r22;
        boolean z11;
        String str7;
        String str8;
        int i13;
        String str9;
        String str10;
        int i14;
        int i15;
        String str11;
        String str12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str13;
        String str14;
        String str15;
        int i21;
        com.google.android.gms.internal.measurement.R2 r23;
        int i22;
        b7 b7Var = this;
        String str16 = "_v";
        String str17 = "_f";
        String str18 = "_ai";
        String str19 = "purchase";
        String str20 = "items";
        F0().r0();
        try {
            X6 x64 = new X6(b7Var, null);
            String str21 = "_efs";
            F0().n0(str, j10, b7Var.f25813A, x64);
            List list2 = x64.f25736c;
            try {
                if (list2 == null || list2.isEmpty()) {
                    z10 = false;
                    F0().s0();
                } else {
                    C2216d3 c2216d35 = (C2216d3) x64.f25734a.p();
                    c2216d35.c1();
                    com.google.android.gms.internal.measurement.R2 r24 = null;
                    com.google.android.gms.internal.measurement.R2 r25 = null;
                    int i23 = -1;
                    int i24 = -1;
                    boolean z12 = false;
                    int i25 = 0;
                    int i26 = 0;
                    boolean z13 = false;
                    while (true) {
                        String str22 = str20;
                        String str23 = str16;
                        String str24 = str17;
                        c2216d3 = c2216d35;
                        int i27 = i24;
                        if (i25 >= x64.f25736c.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.R2 r26 = (com.google.android.gms.internal.measurement.R2) ((com.google.android.gms.internal.measurement.S2) x64.f25736c.get(i25)).p();
                        int i28 = i25;
                        if (D0().D(x64.f25734a.C(), r26.K())) {
                            a().r().c("Dropping blocked raw event. appId", C2.x(x64.f25734a.C()), b7Var.f25834l.D().a(r26.K()));
                            if (!D0().H(x64.f25734a.C()) && !D0().I(x64.f25734a.C()) && !"_err".equals(r26.K())) {
                                N0().B(b7Var.f25822J, x64.f25734a.C(), 11, "_ev", r26.K(), 0);
                            }
                            c2216d35 = c2216d3;
                            i18 = i27;
                            i17 = i23;
                            str6 = str18;
                            str7 = str19;
                            z11 = z12;
                            str12 = str22;
                            str11 = str23;
                            i16 = i28;
                        } else {
                            String K10 = r26.K();
                            com.google.android.gms.internal.measurement.R2 r27 = r25;
                            if (K10.equals(str19) || K10.equals("_iap") || K10.equals("ecommerce_purchase")) {
                                com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
                                O10.z("_ct");
                                if (!z12) {
                                    String C10 = x64.f25734a.C();
                                    if (b7Var.V(C10, str19) && b7Var.V(C10, "_iap") && b7Var.V(C10, "ecommerce_purchase")) {
                                        str5 = "new";
                                        O10.B(str5);
                                        r26.D((com.google.android.gms.internal.measurement.W2) O10.v());
                                        z12 = true;
                                    }
                                }
                                str5 = "returning";
                                O10.B(str5);
                                r26.D((com.google.android.gms.internal.measurement.W2) O10.v());
                                z12 = true;
                            }
                            if (r26.K().equals(AbstractC2641b4.a(str18))) {
                                r26.L(str18);
                                a().w().a("Renaming ad_impression to _ai");
                                if (Log.isLoggable(a().z(), 5)) {
                                    for (int i29 = 0; i29 < r26.z(); i29++) {
                                        if ("ad_platform".equals(r26.A(i29).D()) && !r26.A(i29).F().isEmpty() && "admob".equalsIgnoreCase(r26.A(i29).F())) {
                                            a().t().a("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            boolean E10 = D0().E(x64.f25734a.C(), r26.K());
                            if (E10) {
                                str6 = str18;
                            } else {
                                K0();
                                String K11 = r26.K();
                                AbstractC1287s.g(K11);
                                str6 = str18;
                                if (K11.hashCode() != 95027 || !K11.equals("_ui")) {
                                    str7 = str19;
                                    r22 = r24;
                                    z11 = z12;
                                    E10 = false;
                                    str8 = "_e";
                                    if (E10) {
                                        ArrayList arrayList = new ArrayList(r26.y());
                                        int i30 = -1;
                                        int i31 = -1;
                                        for (int i32 = 0; i32 < arrayList.size(); i32++) {
                                            if ("value".equals(((com.google.android.gms.internal.measurement.W2) arrayList.get(i32)).D())) {
                                                i30 = i32;
                                            } else if ("currency".equals(((com.google.android.gms.internal.measurement.W2) arrayList.get(i32)).D())) {
                                                i31 = i32;
                                            }
                                        }
                                        if (i30 != -1) {
                                            if (((com.google.android.gms.internal.measurement.W2) arrayList.get(i30)).G() || ((com.google.android.gms.internal.measurement.W2) arrayList.get(i30)).K()) {
                                                if (i31 != -1) {
                                                    String F10 = ((com.google.android.gms.internal.measurement.W2) arrayList.get(i31)).F();
                                                    if (F10.length() == 3) {
                                                        int i33 = 0;
                                                        while (i33 < F10.length()) {
                                                            int codePointAt = F10.codePointAt(i33);
                                                            if (Character.isLetter(codePointAt)) {
                                                                i33 += Character.charCount(codePointAt);
                                                            }
                                                        }
                                                    }
                                                }
                                                a().t().a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                r26.J(i30);
                                                H(r26, "_c");
                                                G(r26, 19, "currency");
                                                break;
                                            }
                                            a().t().a("Value must be specified with a numeric type.");
                                            r26.J(i30);
                                            H(r26, "_c");
                                            G(r26, 18, "value");
                                        }
                                    }
                                    if (str8.equals(r26.K())) {
                                        c2216d35 = c2216d3;
                                        if ("_vs".equals(r26.K())) {
                                            K0();
                                            if (g7.r((com.google.android.gms.internal.measurement.S2) r26.v(), "_et") == null) {
                                                if (r27 != null && Math.abs(r27.N() - r26.N()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.R2 r28 = (com.google.android.gms.internal.measurement.R2) r27.clone();
                                                    if (b7Var.O(r28, r26)) {
                                                        i13 = i27;
                                                        c2216d35.X0(i13, r28);
                                                        str10 = str23;
                                                        str9 = str24;
                                                        r25 = null;
                                                        r22 = null;
                                                    }
                                                }
                                                i13 = i27;
                                                r22 = r26;
                                                i23 = i26;
                                            }
                                            i13 = i27;
                                        } else {
                                            i13 = i27;
                                            if (B0().H(null, AbstractC2671f2.f26019k1)) {
                                                str9 = str24;
                                                if (str9.equals(r26.K())) {
                                                    str10 = str23;
                                                } else {
                                                    str10 = str23;
                                                    if (str10.equals(r26.K())) {
                                                    }
                                                    r25 = r27;
                                                }
                                                if (str9.equals(r26.K()) || str10.equals(r26.K())) {
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 >= r26.z()) {
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.W2 A10 = r26.A(i34);
                                                        if ("_elt".equals(A10.D())) {
                                                            r26.R(A10.H());
                                                            r26.J(i34);
                                                            break;
                                                        }
                                                        i34++;
                                                    }
                                                }
                                                r25 = r27;
                                            }
                                        }
                                        str10 = str23;
                                        str9 = str24;
                                        r25 = r27;
                                    } else {
                                        K0();
                                        if (g7.r((com.google.android.gms.internal.measurement.S2) r26.v(), "_fr") == null) {
                                            if (r22 != null && Math.abs(r22.N() - r26.N()) <= 1000) {
                                                com.google.android.gms.internal.measurement.R2 r29 = (com.google.android.gms.internal.measurement.R2) r22.clone();
                                                if (b7Var.O(r26, r29)) {
                                                    c2216d35 = c2216d3;
                                                    c2216d35.X0(i23, r29);
                                                    i13 = i27;
                                                    str10 = str23;
                                                    str9 = str24;
                                                    r25 = null;
                                                    r22 = null;
                                                }
                                            }
                                            c2216d35 = c2216d3;
                                            r25 = r26;
                                            i13 = i26;
                                            str10 = str23;
                                            str9 = str24;
                                        } else {
                                            c2216d35 = c2216d3;
                                            i13 = i27;
                                            str10 = str23;
                                            str9 = str24;
                                            r25 = r27;
                                        }
                                    }
                                    if (r26.z() == 0) {
                                        K0();
                                        Bundle q10 = g7.q(r26.y());
                                        int i35 = 0;
                                        while (i35 < r26.z()) {
                                            com.google.android.gms.internal.measurement.W2 A11 = r26.A(i35);
                                            String str25 = str22;
                                            if (!A11.D().equals(str25) || A11.M().isEmpty()) {
                                                i19 = i23;
                                                i20 = i13;
                                                str13 = str9;
                                                str14 = str10;
                                                if (!A11.D().equals(str25)) {
                                                    b7Var.z(r26.K(), (com.google.android.gms.internal.measurement.V2) A11.p(), q10, x64.f25734a.C());
                                                }
                                            } else {
                                                String C11 = x64.f25734a.C();
                                                List M10 = A11.M();
                                                Bundle[] bundleArr = new Bundle[M10.size()];
                                                i19 = i23;
                                                i20 = i13;
                                                int i36 = 0;
                                                while (i36 < M10.size()) {
                                                    com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) M10.get(i36);
                                                    K0();
                                                    String str26 = str9;
                                                    Bundle q11 = g7.q(w22.M());
                                                    Iterator it = w22.M().iterator();
                                                    while (it.hasNext()) {
                                                        b7Var.z(r26.K(), (com.google.android.gms.internal.measurement.V2) ((com.google.android.gms.internal.measurement.W2) it.next()).p(), q11, C11);
                                                        it = it;
                                                        str10 = str10;
                                                    }
                                                    bundleArr[i36] = q11;
                                                    i36++;
                                                    str9 = str26;
                                                    str10 = str10;
                                                }
                                                str13 = str9;
                                                str14 = str10;
                                                q10.putParcelableArray(str25, bundleArr);
                                            }
                                            i35++;
                                            i23 = i19;
                                            i13 = i20;
                                            str22 = str25;
                                            str9 = str13;
                                            str10 = str14;
                                        }
                                        i14 = i23;
                                        i15 = i13;
                                        str24 = str9;
                                        str11 = str10;
                                        str12 = str22;
                                        r26.H();
                                        g7 K02 = K0();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (String str27 : q10.keySet()) {
                                            com.google.android.gms.internal.measurement.V2 O11 = com.google.android.gms.internal.measurement.W2.O();
                                            O11.z(str27);
                                            Object obj = q10.get(str27);
                                            if (obj != null) {
                                                K02.H(O11, obj);
                                                arrayList2.add((com.google.android.gms.internal.measurement.W2) O11.v());
                                            }
                                        }
                                        Iterator it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            r26.D((com.google.android.gms.internal.measurement.W2) it2.next());
                                        }
                                    } else {
                                        i14 = i23;
                                        i15 = i13;
                                        str24 = str9;
                                        str11 = str10;
                                        str12 = str22;
                                    }
                                    i16 = i28;
                                    x64.f25736c.set(i16, (com.google.android.gms.internal.measurement.S2) r26.v());
                                    c2216d35.Y0(r26);
                                    i26++;
                                    i17 = i14;
                                    i18 = i15;
                                    r24 = r22;
                                }
                            }
                            str7 = str19;
                            int i37 = 0;
                            boolean z14 = false;
                            boolean z15 = false;
                            while (true) {
                                z11 = z12;
                                if (i37 >= r26.z()) {
                                    break;
                                }
                                if ("_c".equals(r26.A(i37).D())) {
                                    com.google.android.gms.internal.measurement.V2 v22 = (com.google.android.gms.internal.measurement.V2) r26.A(i37).p();
                                    v22.D(1L);
                                    r26.B(i37, (com.google.android.gms.internal.measurement.W2) v22.v());
                                    r23 = r24;
                                    i22 = 1;
                                    z14 = true;
                                } else if ("_r".equals(r26.A(i37).D())) {
                                    com.google.android.gms.internal.measurement.V2 v23 = (com.google.android.gms.internal.measurement.V2) r26.A(i37).p();
                                    r23 = r24;
                                    v23.D(1L);
                                    r26.B(i37, (com.google.android.gms.internal.measurement.W2) v23.v());
                                    i22 = 1;
                                    z15 = true;
                                } else {
                                    r23 = r24;
                                    i22 = 1;
                                }
                                i37 += i22;
                                z12 = z11;
                                r24 = r23;
                            }
                            r22 = r24;
                            if (z14 || !E10) {
                                str15 = "_err";
                                str8 = "_e";
                            } else {
                                a().w().b("Marking event as conversion", b7Var.f25834l.D().a(r26.K()));
                                com.google.android.gms.internal.measurement.V2 O12 = com.google.android.gms.internal.measurement.W2.O();
                                O12.z("_c");
                                str15 = "_err";
                                str8 = "_e";
                                O12.D(1L);
                                r26.E(O12);
                            }
                            if (!z15) {
                                a().w().b("Marking event as real-time", b7Var.f25834l.D().a(r26.K()));
                                com.google.android.gms.internal.measurement.V2 O13 = com.google.android.gms.internal.measurement.W2.O();
                                O13.z("_r");
                                O13.D(1L);
                                r26.E(O13);
                            }
                            if (F0().L0(h(), x64.f25734a.C(), false, false, false, false, true, false, false).f26320e > B0().E(x64.f25734a.C(), AbstractC2671f2.f26029p)) {
                                H(r26, "_r");
                            } else {
                                z13 = true;
                            }
                            if (l7.r0(r26.K()) && E10 && F0().L0(h(), x64.f25734a.C(), false, false, true, false, false, false, false).f26318c > B0().E(x64.f25734a.C(), AbstractC2671f2.f26027o)) {
                                a().r().b("Too many conversions. Not logging as conversion. appId", C2.x(x64.f25734a.C()));
                                int i38 = 0;
                                int i39 = -1;
                                boolean z16 = false;
                                com.google.android.gms.internal.measurement.V2 v24 = null;
                                while (i38 < r26.z()) {
                                    com.google.android.gms.internal.measurement.W2 A12 = r26.A(i38);
                                    if ("_c".equals(A12.D())) {
                                        v24 = (com.google.android.gms.internal.measurement.V2) A12.p();
                                        i21 = 1;
                                        i39 = i38;
                                    } else {
                                        if (str15.equals(A12.D())) {
                                            z16 = true;
                                        }
                                        i21 = 1;
                                    }
                                    i38 += i21;
                                }
                                if (z16) {
                                    if (v24 != null) {
                                        r26.J(i39);
                                    } else {
                                        v24 = null;
                                    }
                                }
                                if (v24 != null) {
                                    com.google.android.gms.internal.measurement.V2 v25 = (com.google.android.gms.internal.measurement.V2) v24.clone();
                                    v25.z(str15);
                                    v25.D(10L);
                                    r26.B(i39, (com.google.android.gms.internal.measurement.W2) v25.v());
                                } else {
                                    a().o().b("Did not find conversion parameter. appId", C2.x(x64.f25734a.C()));
                                }
                            }
                            if (E10) {
                            }
                            if (str8.equals(r26.K())) {
                            }
                            if (r26.z() == 0) {
                            }
                            i16 = i28;
                            x64.f25736c.set(i16, (com.google.android.gms.internal.measurement.S2) r26.v());
                            c2216d35.Y0(r26);
                            i26++;
                            i17 = i14;
                            i18 = i15;
                            r24 = r22;
                        }
                        i25 = i16 + 1;
                        i23 = i17;
                        i24 = i18;
                        str20 = str12;
                        str17 = str24;
                        str16 = str11;
                        str18 = str6;
                        str19 = str7;
                        z12 = z11;
                    }
                    C2216d3 c2216d36 = c2216d3;
                    long j12 = 0;
                    int i40 = i26;
                    int i41 = 0;
                    while (i41 < i40) {
                        com.google.android.gms.internal.measurement.S2 V02 = c2216d36.V0(i41);
                        if ("_e".equals(V02.F())) {
                            K0();
                            if (g7.r(V02, "_fr") != null) {
                                c2216d36.d1(i41);
                                i40--;
                                i41--;
                                i41++;
                            }
                        }
                        K0();
                        com.google.android.gms.internal.measurement.W2 r10 = g7.r(V02, "_et");
                        if (r10 != null) {
                            Long valueOf = r10.G() ? Long.valueOf(r10.H()) : null;
                            if (valueOf != null && valueOf.longValue() > 0) {
                                j12 += valueOf.longValue();
                            }
                        }
                        i41++;
                    }
                    b7Var.N(c2216d36, j12, false);
                    Iterator it3 = c2216d36.T0().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            str2 = "_se";
                            break;
                        }
                        if ("_s".equals(((com.google.android.gms.internal.measurement.S2) it3.next()).F())) {
                            str2 = "_se";
                            F0().z0(c2216d36.K(), str2);
                            break;
                        }
                    }
                    if (g7.X(c2216d36, "_sid") >= 0) {
                        b7Var.N(c2216d36, j12, true);
                    } else {
                        int X10 = g7.X(c2216d36, str2);
                        if (X10 >= 0) {
                            c2216d36.p1(X10);
                            a().o().b("Session engagement user property is in the bundle without session ID. appId", C2.x(x64.f25734a.C()));
                        }
                    }
                    String C12 = x64.f25734a.C();
                    b().h();
                    O0();
                    I2 J02 = F0().J0(C12);
                    if (J02 == null) {
                        a().o().b("Cannot fix consent fields without appInfo. appId", C2.x(C12));
                    } else {
                        b7Var.n(J02, c2216d36);
                    }
                    String C13 = x64.f25734a.C();
                    b().h();
                    O0();
                    I2 J03 = F0().J0(C13);
                    if (J03 == null) {
                        a().r().b("Cannot populate ad_campaign_info without appInfo. appId", C2.x(C13));
                    } else {
                        b7Var.o(J03, c2216d36);
                    }
                    c2216d36.u1(Long.MAX_VALUE);
                    c2216d36.x1(Long.MIN_VALUE);
                    for (int i42 = 0; i42 < c2216d36.U0(); i42++) {
                        com.google.android.gms.internal.measurement.S2 V03 = c2216d36.V0(i42);
                        if (V03.H() < c2216d36.s1()) {
                            c2216d36.u1(V03.H());
                        }
                        if (V03.H() > c2216d36.w1()) {
                            c2216d36.x1(V03.H());
                        }
                    }
                    c2216d36.D0();
                    C2633a4 c2633a4 = C2633a4.f25768c;
                    C2633a4 s10 = b7Var.g(x64.f25734a.C()).s(C2633a4.f(x64.f25734a.I0(), 100));
                    C2633a4 X11 = F0().X(x64.f25734a.C());
                    F0().W(x64.f25734a.C(), s10);
                    Z3 z32 = Z3.ANALYTICS_STORAGE;
                    if (!s10.o(z32) && X11.o(z32)) {
                        F0().x0(x64.f25734a.C());
                    } else if (s10.o(z32) && !X11.o(z32)) {
                        F0().y0(x64.f25734a.C());
                    }
                    Z3 z33 = Z3.AD_STORAGE;
                    if (!s10.o(z33)) {
                        c2216d36.R();
                        c2216d36.U();
                        c2216d36.G0();
                    }
                    if (!s10.o(z32)) {
                        c2216d36.X();
                        c2216d36.O0();
                    }
                    C2301m7.a();
                    if (B0().H(x64.f25734a.C(), AbstractC2671f2.f25968Q0) && N0().L(x64.f25734a.C()) && b7Var.g(x64.f25734a.C()).o(z33) && x64.f25734a.N0()) {
                        b7Var.y(c2216d36, x64);
                    }
                    c2216d36.z0();
                    c2216d36.x0(I0().m(c2216d36.K(), c2216d36.T0(), c2216d36.e1(), Long.valueOf(c2216d36.s1()), Long.valueOf(c2216d36.w1()), !s10.o(z32)));
                    if (B0().l(x64.f25734a.C())) {
                        try {
                            HashMap hashMap3 = new HashMap();
                            ArrayList arrayList3 = new ArrayList();
                            SecureRandom q02 = N0().q0();
                            for (int i43 = 0; i43 < c2216d36.U0(); i43 = i11 + 1) {
                                com.google.android.gms.internal.measurement.R2 r210 = (com.google.android.gms.internal.measurement.R2) c2216d36.V0(i43).p();
                                if (r210.K().equals("_ep")) {
                                    K0();
                                    String str28 = (String) g7.u((com.google.android.gms.internal.measurement.S2) r210.v(), "_en");
                                    E e10 = (E) hashMap3.get(str28);
                                    if (e10 == null && (e10 = F0().v0(x64.f25734a.C(), (String) AbstractC1287s.m(str28))) != null) {
                                        hashMap3.put(str28, e10);
                                    }
                                    if (e10 == null || e10.f25373i != null) {
                                        str4 = str21;
                                    } else {
                                        Long l10 = e10.f25374j;
                                        if (l10 != null && l10.longValue() > 1) {
                                            K0();
                                            g7.o(r210, "_sr", l10);
                                        }
                                        Boolean bool = e10.f25375k;
                                        if (bool == null || !bool.booleanValue()) {
                                            str4 = str21;
                                        } else {
                                            K0();
                                            str4 = str21;
                                            g7.o(r210, str4, 1L);
                                        }
                                        arrayList3.add((com.google.android.gms.internal.measurement.S2) r210.v());
                                    }
                                    c2216d36.X0(i43, r210);
                                    hashMap2 = hashMap3;
                                    c2216d34 = c2216d36;
                                    secureRandom = q02;
                                    i11 = i43;
                                    x63 = x64;
                                    str3 = str4;
                                } else {
                                    String str29 = str21;
                                    C2656d3 D02 = D0();
                                    String C14 = x64.f25734a.C();
                                    String d10 = D02.d(C14, "measurement.account.time_zone_offset_minutes");
                                    if (!TextUtils.isEmpty(d10)) {
                                        try {
                                            parseLong = Long.parseLong(d10);
                                        } catch (NumberFormatException e11) {
                                            D02.f25694a.a().r().c("Unable to parse timezone offset. appId", C2.x(C14), e11);
                                        }
                                        long Y11 = N0().Y(r210.N(), parseLong);
                                        com.google.android.gms.internal.measurement.S2 s22 = (com.google.android.gms.internal.measurement.S2) r210.v();
                                        Long l11 = 1L;
                                        if (!TextUtils.isEmpty("_dbg")) {
                                            Iterator it4 = s22.C().iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.W2 w23 = (com.google.android.gms.internal.measurement.W2) it4.next();
                                                Iterator it5 = it4;
                                                if (!"_dbg".equals(w23.D())) {
                                                    it4 = it5;
                                                } else if (l11.equals(Long.valueOf(w23.H()))) {
                                                    G10 = 1;
                                                }
                                            }
                                        }
                                        G10 = D0().G(x64.f25734a.C(), r210.K());
                                        if (G10 > 0) {
                                            a().r().c("Sample rate must be positive. event, rate", r210.K(), Integer.valueOf(G10));
                                            arrayList3.add((com.google.android.gms.internal.measurement.S2) r210.v());
                                            c2216d36.X0(i43, r210);
                                        } else {
                                            E e12 = (E) hashMap3.get(r210.K());
                                            if (e12 == null) {
                                                j11 = parseLong;
                                                e12 = F0().v0(x64.f25734a.C(), r210.K());
                                                if (e12 == null) {
                                                    a().r().c("Event being bundled has no eventAggregate. appId, eventName", x64.f25734a.C(), r210.K());
                                                    e12 = new E(x64.f25734a.C(), r210.K(), 1L, 1L, 1L, r210.N(), 0L, null, null, null, null);
                                                }
                                            } else {
                                                j11 = parseLong;
                                            }
                                            K0();
                                            Long l12 = (Long) g7.u((com.google.android.gms.internal.measurement.S2) r210.v(), "_eid");
                                            boolean z17 = l12 != null;
                                            if (G10 == 1) {
                                                arrayList3.add((com.google.android.gms.internal.measurement.S2) r210.v());
                                                if (z17 && (e12.f25373i != null || e12.f25374j != null || e12.f25375k != null)) {
                                                    hashMap3.put(r210.K(), e12.c(null, null, null));
                                                }
                                                c2216d36.X0(i43, r210);
                                            } else {
                                                if (q02.nextInt(G10) == 0) {
                                                    K0();
                                                    x63 = x64;
                                                    Long valueOf2 = Long.valueOf(G10);
                                                    g7.o(r210, "_sr", valueOf2);
                                                    arrayList3.add((com.google.android.gms.internal.measurement.S2) r210.v());
                                                    if (z17) {
                                                        e12 = e12.c(null, valueOf2, null);
                                                    }
                                                    hashMap3.put(r210.K(), e12.b(r210.N(), Y11));
                                                    hashMap2 = hashMap3;
                                                    c2216d34 = c2216d36;
                                                    secureRandom = q02;
                                                    i11 = i43;
                                                    str3 = str29;
                                                } else {
                                                    x63 = x64;
                                                    Long l13 = e12.f25372h;
                                                    if (l13 != null) {
                                                        Y10 = l13.longValue();
                                                        hashMap = hashMap3;
                                                        c2216d33 = c2216d36;
                                                        secureRandom = q02;
                                                        i10 = i43;
                                                    } else {
                                                        secureRandom = q02;
                                                        i10 = i43;
                                                        hashMap = hashMap3;
                                                        c2216d33 = c2216d36;
                                                        Y10 = N0().Y(r210.P(), j11);
                                                    }
                                                    if (Y10 != Y11) {
                                                        K0();
                                                        str3 = str29;
                                                        g7.o(r210, str3, 1L);
                                                        K0();
                                                        Long valueOf3 = Long.valueOf(G10);
                                                        g7.o(r210, "_sr", valueOf3);
                                                        arrayList3.add((com.google.android.gms.internal.measurement.S2) r210.v());
                                                        if (z17) {
                                                            e12 = e12.c(null, valueOf3, Boolean.TRUE);
                                                        }
                                                        hashMap2 = hashMap;
                                                        hashMap2.put(r210.K(), e12.b(r210.N(), Y11));
                                                    } else {
                                                        str3 = str29;
                                                        hashMap2 = hashMap;
                                                        if (z17) {
                                                            hashMap2.put(r210.K(), e12.c(l12, null, null));
                                                        }
                                                    }
                                                    i11 = i10;
                                                    c2216d34 = c2216d33;
                                                }
                                                c2216d34.X0(i11, r210);
                                            }
                                        }
                                        hashMap2 = hashMap3;
                                        c2216d34 = c2216d36;
                                        secureRandom = q02;
                                        i11 = i43;
                                        x63 = x64;
                                        str3 = str29;
                                    }
                                    parseLong = 0;
                                    long Y112 = N0().Y(r210.N(), parseLong);
                                    com.google.android.gms.internal.measurement.S2 s222 = (com.google.android.gms.internal.measurement.S2) r210.v();
                                    Long l112 = 1L;
                                    if (!TextUtils.isEmpty("_dbg")) {
                                    }
                                    G10 = D0().G(x64.f25734a.C(), r210.K());
                                    if (G10 > 0) {
                                    }
                                    hashMap2 = hashMap3;
                                    c2216d34 = c2216d36;
                                    secureRandom = q02;
                                    i11 = i43;
                                    x63 = x64;
                                    str3 = str29;
                                }
                                c2216d36 = c2216d34;
                                hashMap3 = hashMap2;
                                str21 = str3;
                                x64 = x63;
                                q02 = secureRandom;
                                b7Var = this;
                            }
                            HashMap hashMap4 = hashMap3;
                            c2216d32 = c2216d36;
                            X6 x65 = x64;
                            if (arrayList3.size() < c2216d32.U0()) {
                                c2216d32.c1();
                                c2216d32.b1(arrayList3);
                            }
                            Iterator it6 = hashMap4.entrySet().iterator();
                            while (it6.hasNext()) {
                                F0().w0((E) ((Map.Entry) it6.next()).getValue());
                            }
                            x62 = x65;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            F0().t0();
                            throw th2;
                        }
                    } else {
                        c2216d32 = c2216d36;
                        x62 = x64;
                    }
                    String C15 = x62.f25734a.C();
                    I2 J04 = F0().J0(C15);
                    if (J04 == null) {
                        a().o().b("Bundling raw events w/o app info. appId", C2.x(x62.f25734a.C()));
                    } else if (c2216d32.U0() > 0) {
                        long B02 = J04.B0();
                        if (B02 != 0) {
                            c2216d32.y(B02);
                        } else {
                            c2216d32.z();
                        }
                        long z02 = J04.z0();
                        if (z02 != 0) {
                            B02 = z02;
                        }
                        if (B02 != 0) {
                            c2216d32.y1(B02);
                        } else {
                            c2216d32.z1();
                        }
                        J04.m(c2216d32.U0());
                        c2216d32.k0((int) J04.G());
                        c2216d32.Z((int) J04.g());
                        J04.A0(c2216d32.s1());
                        J04.C0(c2216d32.w1());
                        String N10 = J04.N();
                        if (N10 != null) {
                            c2216d32.s0(N10);
                        } else {
                            c2216d32.t0();
                        }
                        i12 = 0;
                        F0().K0(J04, false, false);
                        if (c2216d32.U0() <= 0) {
                            this.f25834l.c();
                            C2278k2 w10 = D0().w(x62.f25734a.C());
                            if (w10 != null && w10.C()) {
                                c2216d32.E0(w10.D());
                                F0().O0((C2225e3) c2216d32.v(), z13);
                            }
                            if (x62.f25734a.R().isEmpty()) {
                                c2216d32.E0(-1L);
                            } else {
                                a().r().b("Did not find measurement config or missing version info. appId", C2.x(x62.f25734a.C()));
                            }
                            F0().O0((C2225e3) c2216d32.v(), z13);
                        }
                        C2803w F02 = F0();
                        list = x62.f25735b;
                        AbstractC1287s.m(list);
                        F02.h();
                        F02.j();
                        StringBuilder sb2 = new StringBuilder("rowid in (");
                        while (i12 < list.size()) {
                            if (i12 != 0) {
                                sb2.append(",");
                            }
                            sb2.append(((Long) list.get(i12)).longValue());
                            i12++;
                        }
                        sb2.append(")");
                        delete = F02.u0().delete("raw_events", sb2.toString(), null);
                        if (delete != list.size()) {
                            F02.f25694a.a().o().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
                        }
                        C2803w F03 = F0();
                        F03.u0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{C15, C15});
                        F0().s0();
                        z10 = true;
                    }
                    i12 = 0;
                    if (c2216d32.U0() <= 0) {
                    }
                    C2803w F022 = F0();
                    list = x62.f25735b;
                    AbstractC1287s.m(list);
                    F022.h();
                    F022.j();
                    StringBuilder sb22 = new StringBuilder("rowid in (");
                    while (i12 < list.size()) {
                    }
                    sb22.append(")");
                    delete = F022.u0().delete("raw_events", sb22.toString(), null);
                    if (delete != list.size()) {
                    }
                    C2803w F032 = F0();
                    F032.u0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{C15, C15});
                    F0().s0();
                    z10 = true;
                }
                F0().t0();
                return z10;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final void N(C2216d3 c2216d3, long j10, boolean z10) {
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        j7 B02 = F0().B0(c2216d3.K(), str);
        j7 j7Var = (B02 == null || (obj = B02.f26138e) == null) ? new j7(c2216d3.K(), "auto", str, f().a(), Long.valueOf(j10)) : new j7(c2216d3.K(), "auto", str, f().a(), Long.valueOf(((Long) obj).longValue() + j10));
        C2368u3 N10 = C2377v3.N();
        N10.z(str);
        N10.y(f().a());
        Object obj2 = j7Var.f26138e;
        N10.C(((Long) obj2).longValue());
        C2377v3 c2377v3 = (C2377v3) N10.v();
        int X10 = g7.X(c2216d3, str);
        if (X10 >= 0) {
            c2216d3.j1(X10, c2377v3);
        } else {
            c2216d3.k1(c2377v3);
        }
        if (j10 > 0) {
            F0().A0(j7Var);
            a().w().c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean O(com.google.android.gms.internal.measurement.R2 r22, com.google.android.gms.internal.measurement.R2 r23) {
        AbstractC1287s.a("_e".equals(r22.K()));
        K0();
        com.google.android.gms.internal.measurement.W2 r10 = g7.r((com.google.android.gms.internal.measurement.S2) r22.v(), "_sc");
        String F10 = r10 == null ? null : r10.F();
        K0();
        com.google.android.gms.internal.measurement.W2 r11 = g7.r((com.google.android.gms.internal.measurement.S2) r23.v(), "_pc");
        String F11 = r11 != null ? r11.F() : null;
        if (F11 == null || !F11.equals(F10)) {
            return false;
        }
        AbstractC1287s.a("_e".equals(r22.K()));
        K0();
        com.google.android.gms.internal.measurement.W2 r12 = g7.r((com.google.android.gms.internal.measurement.S2) r22.v(), "_et");
        if (r12 == null || !r12.G() || r12.H() <= 0) {
            return true;
        }
        long H10 = r12.H();
        K0();
        com.google.android.gms.internal.measurement.W2 r13 = g7.r((com.google.android.gms.internal.measurement.S2) r23.v(), "_et");
        if (r13 != null && r13.H() > 0) {
            H10 += r13.H();
        }
        K0();
        g7.o(r23, "_et", Long.valueOf(H10));
        K0();
        g7.o(r22, "_fr", 1L);
        return true;
    }

    private final boolean P() {
        b().h();
        O0();
        return F0().B() || !TextUtils.isEmpty(F0().r());
    }

    private static String Q(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void R() {
        long max;
        long j10;
        b().h();
        O0();
        if (this.f25837o > 0) {
            long abs = 3600000 - Math.abs(f().c() - this.f25837o);
            if (abs > 0) {
                a().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                G0().b();
                H0().n();
                return;
            }
            this.f25837o = 0L;
        }
        if (!this.f25834l.m() || !P()) {
            a().w().a("Nothing to upload or uploading impossible");
            G0().b();
            H0().n();
            return;
        }
        long a10 = f().a();
        B0();
        long max2 = Math.max(0L, ((Long) AbstractC2671f2.f25965P.b(null)).longValue());
        boolean z10 = true;
        if (!F0().D() && !F0().s()) {
            z10 = false;
        }
        if (z10) {
            String i10 = B0().i();
            if (TextUtils.isEmpty(i10) || ".none.".equals(i10)) {
                B0();
                max = Math.max(0L, ((Long) AbstractC2671f2.f25953J.b(null)).longValue());
            } else {
                B0();
                max = Math.max(0L, ((Long) AbstractC2671f2.f25955K.b(null)).longValue());
            }
        } else {
            B0();
            max = Math.max(0L, ((Long) AbstractC2671f2.f25951I.b(null)).longValue());
        }
        long a11 = this.f25831i.f26076h.a();
        long a12 = this.f25831i.f26077i.a();
        boolean z11 = z10;
        long max3 = Math.max(F0().y(), F0().A());
        if (max3 != 0) {
            long abs2 = a10 - Math.abs(max3 - a10);
            long abs3 = a10 - Math.abs(a11 - a10);
            long abs4 = a10 - Math.abs(a12 - a10);
            j10 = abs2 + max2;
            long max4 = Math.max(abs3, abs4);
            if (z11 && max4 > 0) {
                j10 = Math.min(abs2, max4) + max;
            }
            if (!K0().S(max4, max)) {
                j10 = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i11 = 0;
                while (true) {
                    B0();
                    if (i11 >= Math.min(20, Math.max(0, ((Integer) AbstractC2671f2.f25969R.b(null)).intValue()))) {
                        break;
                    }
                    B0();
                    j10 += Math.max(0L, ((Long) AbstractC2671f2.f25967Q.b(null)).longValue()) * (1 << i11);
                    if (j10 > abs4) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            if (j10 != 0) {
                a().w().a("Next upload time is 0");
                G0().b();
                H0().n();
                return;
            }
            if (!E0().m()) {
                a().w().a("No network");
                G0().a();
                H0().n();
                return;
            }
            long a13 = this.f25831i.f26075g.a();
            B0();
            long max5 = Math.max(0L, ((Long) AbstractC2671f2.f25947G.b(null)).longValue());
            if (!K0().S(a13, max5)) {
                j10 = Math.max(j10, a13 + max5);
            }
            G0().b();
            long a14 = j10 - f().a();
            if (a14 <= 0) {
                B0();
                a14 = Math.max(0L, ((Long) AbstractC2671f2.f25957L.b(null)).longValue());
                this.f25831i.f26076h.b(f().a());
            }
            a().w().b("Upload scheduled in approximately ms", Long.valueOf(a14));
            H0().m(a14);
            return;
        }
        j10 = 0;
        if (j10 != 0) {
        }
    }

    private final void S() {
        b().h();
        if (this.f25842t || this.f25843u || this.f25844v) {
            a().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f25842t), Boolean.valueOf(this.f25843u), Boolean.valueOf(this.f25844v));
            return;
        }
        a().w().a("Stopping uploading service(s)");
        List list = this.f25838p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) AbstractC1287s.m(this.f25838p)).clear();
    }

    private final Boolean T(I2 i22) {
        try {
            if (i22.F0() != -2147483648L) {
                if (i22.F0() == C2998d.a(this.f25834l.e()).e(i22.o0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C2998d.a(this.f25834l.e()).e(i22.o0(), 0).versionName;
                String D02 = i22.D0();
                if (D02 != null && D02.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final n7 U(String str) {
        I2 J02 = F0().J0(str);
        if (J02 == null || TextUtils.isEmpty(J02.D0())) {
            a().v().b("No app data available; dropping", str);
            return null;
        }
        Boolean T10 = T(J02);
        if (T10 == null || T10.booleanValue()) {
            return new n7(str, J02.r0(), J02.D0(), J02.F0(), J02.H0(), J02.J0(), J02.L0(), (String) null, J02.d(), false, J02.x0(), 0L, 0, J02.P(), false, J02.R(), J02.b(), J02.T(), g(str).l(), BuildConfig.FLAVOR, (String) null, J02.V(), J02.X(), g(str).b(), R0(str).e(), J02.b0(), J02.j0(), J02.l0(), J02.I(), 0L, J02.M());
        }
        a().o().b("App version does not match; dropping. appId", C2.x(str));
        return null;
    }

    private final boolean V(String str, String str2) {
        E v02 = F0().v0(str, str2);
        return v02 == null || v02.f25367c < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(Context context, Intent intent) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
            return;
        }
        makeBasic = BroadcastOptions.makeBasic();
        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
        bundle = shareIdentityEnabled.toBundle();
        context.sendBroadcast(intent, null, bundle);
    }

    private static final boolean X(n7 n7Var) {
        return !TextUtils.isEmpty(n7Var.f26198b);
    }

    private static final M6 Y(M6 m62) {
        if (m62 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (m62.i()) {
            return m62;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(m62.getClass())));
    }

    private static final Boolean Z(n7 n7Var) {
        Boolean bool = n7Var.f26212p;
        String str = n7Var.f26194C;
        if (!TextUtils.isEmpty(str)) {
            X3 a10 = C2670f1.c(str).a();
            X3 x32 = X3.UNINITIALIZED;
            int ordinal = a10.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r23 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void A(boolean z10, int i10, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        int i11 = i10;
        b().h();
        O0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.f25843u = false;
                S();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) AbstractC1287s.m(this.f25847y);
        this.f25847y = null;
        try {
            if (z10) {
                if (i11 != 200) {
                    if (i11 == 204) {
                        i11 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    a().t().d("Network upload failed. Will retry later. code, error", Integer.valueOf(i11), th, str2.substring(0, Math.min(32, str2.length())));
                    this.f25831i.f26077i.b(f().a());
                    if (i11 == 503 || i11 == 429) {
                        this.f25831i.f26075g.b(f().a());
                    }
                    F0().v(list2);
                    R();
                    this.f25843u = false;
                    S();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C2207c3 c2207c3 = (C2207c3) pair.first;
                N6 n62 = (N6) pair.second;
                if (n62.c() != EnumC2714k5.SGTM_CLIENT) {
                    long m10 = F0().m(str, c2207c3, n62.a(), n62.b(), n62.c(), null);
                    if (n62.c() == EnumC2714k5.GOOGLE_SIGNAL_PENDING && m10 != -1 && !c2207c3.G().isEmpty()) {
                        hashMap.put(c2207c3.G(), Long.valueOf(m10));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                C2207c3 c2207c32 = (C2207c3) pair2.first;
                N6 n63 = (N6) pair2.second;
                if (n63.c() == EnumC2714k5.SGTM_CLIENT) {
                    F0().m(str, c2207c32, n63.a(), n63.b(), n63.c(), (Long) hashMap.get(c2207c32.G()));
                }
            }
            List o10 = F0().o(str, I6.j(EnumC2714k5.SGTM_CLIENT), 1);
            if (!o10.isEmpty()) {
                long g10 = ((e7) o10.get(0)).g();
                if (f().a() > ((Long) AbstractC2671f2.f25945F.b(null)).longValue() + g10) {
                    a().r().c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(g10));
                }
            }
            for (Long l10 : list2) {
                try {
                    F0().t(l10.longValue());
                } catch (SQLiteException e10) {
                    List list3 = this.f25848z;
                    if (list3 == null || !list3.contains(l10)) {
                        throw e10;
                    }
                }
            }
            F0().s0();
            F0().t0();
            this.f25848z = null;
            if (E0().m() && F0().p(str)) {
                u(str);
            } else if (E0().m() && P()) {
                r();
            } else {
                this.f25813A = -1L;
                R();
            }
            this.f25837o = 0L;
            this.f25843u = false;
            S();
            return;
        } catch (Throwable th3) {
            F0().t0();
            throw th3;
        }
        A2 w10 = a().w();
        Integer valueOf = Integer.valueOf(i11);
        w10.c("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z10));
        if (z10) {
            try {
                this.f25831i.f26076h.b(f().a());
            } catch (SQLiteException e11) {
                a().o().b("Database error while trying to delete uploaded bundles", e11);
                this.f25837o = f().c();
                a().w().b("Disable upload, time", Long.valueOf(this.f25837o));
            }
        }
        this.f25831i.f26077i.b(0L);
        R();
        if (z10) {
            a().w().c("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            a().w().a("Purged empty bundles");
        }
        F0().r0();
    }

    protected final void A0() {
        b().h();
        F0().u();
        C2803w F02 = F0();
        F02.h();
        F02.j();
        if (F02.a0()) {
            C2663e2 c2663e2 = AbstractC2671f2.f26044w0;
            if (((Long) c2663e2.b(null)).longValue() != 0) {
                SQLiteDatabase u02 = F02.u0();
                C2760q3 c2760q3 = F02.f25694a;
                int delete = u02.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(c2760q3.f().a()), String.valueOf(c2663e2.b(null))});
                if (delete > 0) {
                    c2760q3.a().w().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        if (this.f25831i.f26076h.a() == 0) {
            this.f25831i.f26076h.b(f().a());
        }
        R();
    }

    final void B(I2 i22) {
        b().h();
        if (TextUtils.isEmpty(i22.r0())) {
            C((String) AbstractC1287s.m(i22.o0()), 204, null, null, null);
            return;
        }
        String str = (String) AbstractC1287s.m(i22.o0());
        a().w().b("Fetching remote configuration", str);
        C2278k2 w10 = D0().w(str);
        String y10 = D0().y(str);
        C3476a c3476a = null;
        if (w10 != null) {
            if (!TextUtils.isEmpty(y10)) {
                c3476a = new C3476a();
                c3476a.put("If-Modified-Since", y10);
            }
            String z10 = D0().z(str);
            if (!TextUtils.isEmpty(z10)) {
                if (c3476a == null) {
                    c3476a = new C3476a();
                }
                c3476a.put("If-None-Match", z10);
            }
        }
        this.f25842t = true;
        E0().o(i22, c3476a, new E2() { // from class: com.google.android.gms.measurement.internal.a7
            @Override // com.google.android.gms.measurement.internal.E2
            public final /* synthetic */ void a(String str2, int i10, Throwable th, byte[] bArr, Map map) {
                b7.this.C(str2, i10, th, bArr, map);
            }
        });
    }

    public final C2724m B0() {
        return ((C2760q3) AbstractC1287s.m(this.f25834l)).w();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void C(String str, int i10, Throwable th, byte[] bArr, Map map) {
        boolean z10;
        b().h();
        O0();
        AbstractC1287s.g(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f25842t = false;
                S();
                throw th2;
            }
        }
        A2 w10 = a().w();
        Integer valueOf = Integer.valueOf(bArr.length);
        w10.b("onConfigFetched. Response size", valueOf);
        F0().r0();
        try {
            I2 J02 = F0().J0(str);
            if (i10 != 200 && i10 != 204) {
                if (i10 == 304) {
                    i10 = 304;
                }
                z10 = false;
                if (J02 == null) {
                    a().r().b("App does not exist in onConfigFetched. appId", C2.x(str));
                } else {
                    if (!z10 && i10 != 404) {
                        J02.k(f().a());
                        F0().K0(J02, false, false);
                        a().w().c("Fetching config failed. code, error", Integer.valueOf(i10), th);
                        D0().A(str);
                        this.f25831i.f26077i.b(f().a());
                        if (i10 == 503 || i10 == 429) {
                            this.f25831i.f26075g.b(f().a());
                        }
                        R();
                    }
                    String Q10 = Q(map, "Last-Modified");
                    String Q11 = Q(map, "ETag");
                    if (i10 != 404 && i10 != 304) {
                        D0().C(str, bArr, Q10, Q11);
                        J02.i(f().a());
                        F0().K0(J02, false, false);
                        if (i10 != 404) {
                            a().t().b("Config not found. Using empty config. appId", str);
                        } else {
                            a().w().c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i10), valueOf);
                        }
                        if (!E0().m() && P()) {
                            r();
                        } else if (E0().m() || !F0().p(J02.o0())) {
                            R();
                        } else {
                            u(J02.o0());
                        }
                    }
                    if (D0().w(str) == null) {
                        D0().C(str, null, null, null);
                    }
                    J02.i(f().a());
                    F0().K0(J02, false, false);
                    if (i10 != 404) {
                    }
                    if (!E0().m()) {
                    }
                    if (E0().m()) {
                    }
                    R();
                }
                F0().s0();
                F0().t0();
                this.f25842t = false;
                S();
            }
            if (th == null) {
                z10 = true;
                if (J02 == null) {
                }
                F0().s0();
                F0().t0();
                this.f25842t = false;
                S();
            }
            z10 = false;
            if (J02 == null) {
            }
            F0().s0();
            F0().t0();
            this.f25842t = false;
            S();
        } catch (Throwable th3) {
            F0().t0();
            throw th3;
        }
    }

    public final O6 C0() {
        return this.f25832j;
    }

    final void D(Runnable runnable) {
        b().h();
        if (this.f25838p == null) {
            this.f25838p = new ArrayList();
        }
        this.f25838p.add(runnable);
    }

    public final C2656d3 D0() {
        C2656d3 c2656d3 = this.f25823a;
        Y(c2656d3);
        return c2656d3;
    }

    final void E() {
        b().h();
        O0();
        if (this.f25836n) {
            return;
        }
        this.f25836n = true;
        if (a0()) {
            FileChannel fileChannel = this.f25846x;
            b().h();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                a().o().a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i10 = allocate.getInt();
                    } else if (read != -1) {
                        a().r().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e10) {
                    a().o().b("Failed to read from channel", e10);
                }
            }
            int t10 = this.f25834l.L().t();
            b().h();
            if (i10 > t10) {
                a().o().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t10));
                return;
            }
            if (i10 < t10) {
                FileChannel fileChannel2 = this.f25846x;
                b().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    a().o().a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(t10);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            a().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        a().w().c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t10));
                        return;
                    } catch (IOException e11) {
                        a().o().b("Failed to write to channel", e11);
                    }
                }
                a().o().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(t10));
            }
        }
    }

    public final H2 E0() {
        H2 h22 = this.f25824b;
        Y(h22);
        return h22;
    }

    public final C2803w F0() {
        C2803w c2803w = this.f25825c;
        Y(c2803w);
        return c2803w;
    }

    public final K2 G0() {
        K2 k22 = this.f25826d;
        if (k22 != null) {
            return k22;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final E6 H0() {
        E6 e62 = this.f25827e;
        Y(e62);
        return e62;
    }

    public final C2660e I0() {
        C2660e c2660e = this.f25828f;
        Y(c2660e);
        return c2660e;
    }

    public final C2690h5 J0() {
        C2690h5 c2690h5 = this.f25830h;
        Y(c2690h5);
        return c2690h5;
    }

    public final g7 K0() {
        g7 g7Var = this.f25829g;
        Y(g7Var);
        return g7Var;
    }

    public final C2683g6 L0() {
        return this.f25831i;
    }

    public final C2798v2 M0() {
        return this.f25834l.D();
    }

    public final l7 N0() {
        return ((C2760q3) AbstractC1287s.m(this.f25834l)).C();
    }

    final void O0() {
        if (!this.f25835m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void P0(n7 n7Var) {
        b().h();
        O0();
        String str = n7Var.f26197a;
        AbstractC1287s.g(str);
        C2633a4 f10 = C2633a4.f(n7Var.f26215s, n7Var.f26220x);
        g(str);
        a().w().c("Setting storage consent for package", str, f10);
        d(str, f10);
    }

    final void Q0(n7 n7Var) {
        b().h();
        O0();
        String str = n7Var.f26197a;
        AbstractC1287s.g(str);
        A g10 = A.g(n7Var.f26221y);
        a().w().c("Setting DMA consent for package", str, g10);
        b().h();
        O0();
        X3 c10 = A.h(S0(str), 100).c();
        this.f25815C.put(str, g10);
        F0().V(str, g10);
        X3 c11 = A.h(S0(str), 100).c();
        b().h();
        O0();
        X3 x32 = X3.DENIED;
        boolean z10 = c10 == x32 && c11 == X3.GRANTED;
        boolean z11 = c10 == X3.GRANTED && c11 == x32;
        if (z10 || z11) {
            a().w().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (F0().L0(h(), str, false, false, false, false, false, false, false).f26321f < B0().E(str, AbstractC2671f2.f26026n0)) {
                bundle.putLong("_r", 1L);
                a().w().c("_dcu realtime event count", str, Long.valueOf(F0().L0(h(), str, false, false, false, false, false, true, false).f26321f));
            }
            this.f25822J.a(str, "_dcu", bundle);
        }
    }

    final A R0(String str) {
        b().h();
        O0();
        Map map = this.f25815C;
        A a10 = (A) map.get(str);
        if (a10 != null) {
            return a10;
        }
        A U10 = F0().U(str);
        map.put(str, U10);
        return U10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Bundle S0(String str) {
        b().h();
        O0();
        if (D0().R(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C2633a4 g10 = g(str);
        bundle.putAll(g10.n());
        bundle.putAll(T0(str, R0(str), g10, new C2740o()).f());
        j7 B02 = F0().B0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (B02 != null ? B02.f26138e.equals(1L) : I(str, new C2740o())) ? "granted" : "denied");
        return bundle;
    }

    final A T0(String str, A a10, C2633a4 c2633a4, C2740o c2740o) {
        X3 x32;
        int i10 = 90;
        if (D0().R(str) == null) {
            if (a10.c() == X3.DENIED) {
                i10 = a10.b();
                c2740o.b(Z3.AD_USER_DATA, i10);
            } else {
                c2740o.c(Z3.AD_USER_DATA, EnumC2732n.FAILSAFE);
            }
            return new A(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        X3 c10 = a10.c();
        X3 x33 = X3.GRANTED;
        if (c10 == x33 || c10 == (x32 = X3.DENIED)) {
            i10 = a10.b();
            c2740o.b(Z3.AD_USER_DATA, i10);
        } else {
            if (c10 == X3.POLICY) {
                C2656d3 c2656d3 = this.f25823a;
                Z3 z32 = Z3.AD_USER_DATA;
                X3 m10 = c2656d3.m(str, z32);
                if (m10 != X3.UNINITIALIZED) {
                    c2740o.c(z32, EnumC2732n.REMOTE_ENFORCED_DEFAULT);
                    c10 = m10;
                }
            }
            C2656d3 c2656d32 = this.f25823a;
            Z3 z33 = Z3.AD_USER_DATA;
            Z3 Q10 = c2656d32.Q(str, z33);
            X3 p10 = c2633a4.p();
            boolean z10 = p10 == x33 || p10 == x32;
            if (Q10 == Z3.AD_STORAGE && z10) {
                c2740o.c(z33, EnumC2732n.REMOTE_DELEGATION);
                c10 = p10;
            } else {
                c2740o.c(z33, EnumC2732n.REMOTE_DEFAULT);
                c10 = true != c2656d32.P(str, z33) ? x32 : x33;
            }
        }
        boolean S10 = this.f25823a.S(str);
        SortedSet T10 = D0().T(str);
        if (c10 == X3.DENIED || T10.isEmpty()) {
            return new A(Boolean.FALSE, i10, Boolean.valueOf(S10), "-");
        }
        Boolean bool = Boolean.TRUE;
        Boolean valueOf = Boolean.valueOf(S10);
        String str2 = BuildConfig.FLAVOR;
        if (S10) {
            str2 = TextUtils.join(BuildConfig.FLAVOR, T10);
        }
        return new A(bool, i10, valueOf, str2);
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final C2 a() {
        return ((C2760q3) AbstractC1287s.m(this.f25834l)).a();
    }

    final boolean a0() {
        b().h();
        FileLock fileLock = this.f25845w;
        if (fileLock != null && fileLock.isValid()) {
            a().w().a("Storage concurrent access okay");
            return true;
        }
        this.f25825c.f25694a.w();
        File filesDir = this.f25834l.e().getFilesDir();
        com.google.android.gms.internal.measurement.Z.a();
        int i10 = AbstractC2231f0.f24500b;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f25846x = channel;
            FileLock tryLock = channel.tryLock();
            this.f25845w = tryLock;
            if (tryLock != null) {
                a().w().a("Storage concurrent access okay");
                return true;
            }
            a().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            a().o().b("Failed to acquire storage lock", e10);
            return false;
        } catch (IOException e11) {
            a().o().b("Failed to access storage lock file", e11);
            return false;
        } catch (OverlappingFileLockException e12) {
            a().r().b("Storage lock already acquired", e12);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final C2696i3 b() {
        return ((C2760q3) AbstractC1287s.m(this.f25834l)).b();
    }

    final void b0(n7 n7Var) {
        if (this.f25847y != null) {
            ArrayList arrayList = new ArrayList();
            this.f25848z = arrayList;
            arrayList.addAll(this.f25847y);
        }
        C2803w F02 = F0();
        String str = (String) AbstractC1287s.m(n7Var.f26197a);
        AbstractC1287s.g(str);
        F02.h();
        F02.j();
        try {
            SQLiteDatabase u02 = F02.u0();
            String[] strArr = {str};
            int delete = u02.delete("apps", "app_id=?", strArr) + u02.delete("events", "app_id=?", strArr) + u02.delete("events_snapshot", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("queue", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("main_event_params", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr) + u02.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.K6.a();
            C2760q3 c2760q3 = F02.f25694a;
            if (c2760q3.w().H(null, AbstractC2671f2.f26013i1)) {
                delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (delete > 0) {
                c2760q3.a().w().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            F02.f25694a.a().o().c("Error resetting analytics data. appId, error", C2.x(str), e10);
        }
        if (n7Var.f26204h) {
            h0(n7Var);
        }
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final C2668f c() {
        return this.f25834l.c();
    }

    final void c0(h7 h7Var, n7 n7Var) {
        String str;
        j7 B02;
        long j10;
        b().h();
        O0();
        if (X(n7Var)) {
            if (!n7Var.f26204h) {
                o0(n7Var);
                return;
            }
            l7 N02 = N0();
            String str2 = h7Var.f26096b;
            int y02 = N02.y0(str2);
            if (y02 != 0) {
                l7 N03 = N0();
                B0();
                N0().B(this.f25822J, n7Var.f26197a, y02, "_ev", N03.q(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            int y10 = N0().y(str2, h7Var.j());
            if (y10 != 0) {
                l7 N04 = N0();
                B0();
                String q10 = N04.q(str2, 24, true);
                Object j11 = h7Var.j();
                N0().B(this.f25822J, n7Var.f26197a, y10, "_ev", q10, (j11 == null || !((j11 instanceof String) || (j11 instanceof CharSequence))) ? 0 : j11.toString().length());
                return;
            }
            Object z10 = N0().z(str2, h7Var.j());
            if (z10 != null) {
                if ("_sid".equals(str2)) {
                    long j12 = h7Var.f26097c;
                    String str3 = h7Var.f26100f;
                    String str4 = (String) AbstractC1287s.m(n7Var.f26197a);
                    j7 B03 = F0().B0(str4, "_sno");
                    if (B03 != null) {
                        Object obj = B03.f26138e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            str = "_sid";
                            c0(new h7("_sno", j12, Long.valueOf(j10 + 1), str3), n7Var);
                        }
                    }
                    if (B03 != null) {
                        a().r().b("Retrieved last session number from database does not contain a valid (long) value", B03.f26138e);
                    }
                    E v02 = F0().v0(str4, "_s");
                    if (v02 != null) {
                        A2 w10 = a().w();
                        str = "_sid";
                        long j13 = v02.f25367c;
                        w10.b("Backfill the session number. Last used session number", Long.valueOf(j13));
                        j10 = j13;
                    } else {
                        str = "_sid";
                        j10 = 0;
                    }
                    c0(new h7("_sno", j12, Long.valueOf(j10 + 1), str3), n7Var);
                } else {
                    str = "_sid";
                }
                String str5 = n7Var.f26197a;
                j7 j7Var = new j7((String) AbstractC1287s.m(str5), (String) AbstractC1287s.m(h7Var.f26100f), str2, h7Var.f26097c, z10);
                A2 w11 = a().w();
                C2760q3 c2760q3 = this.f25834l;
                String str6 = j7Var.f26136c;
                w11.c("Setting user property", c2760q3.D().c(str6), z10);
                F0().r0();
                try {
                    if ("_id".equals(str6) && (B02 = F0().B0(str5, "_id")) != null && !j7Var.f26138e.equals(B02.f26138e)) {
                        F0().z0(str5, "_lair");
                    }
                    o0(n7Var);
                    boolean A02 = F0().A0(j7Var);
                    if (str.equals(str2)) {
                        long U10 = K0().U(n7Var.f26217u);
                        I2 J02 = F0().J0(str5);
                        if (J02 != null) {
                            J02.a0(U10);
                            if (J02.A()) {
                                F0().K0(J02, false, false);
                            }
                        }
                    }
                    F0().s0();
                    if (!A02) {
                        a().o().c("Too many unique user properties are set. Ignoring user property", c2760q3.D().c(str6), j7Var.f26138e);
                        N0().B(this.f25822J, str5, 9, null, null, 0);
                    }
                    F0().t0();
                } catch (Throwable th) {
                    F0().t0();
                    throw th;
                }
            }
        }
    }

    final void d(String str, C2633a4 c2633a4) {
        b().h();
        O0();
        this.f25814B.put(str, c2633a4);
        F0().L(str, c2633a4);
    }

    final void d0(String str, n7 n7Var) {
        b().h();
        O0();
        if (X(n7Var)) {
            if (!n7Var.f26204h) {
                o0(n7Var);
                return;
            }
            Boolean Z10 = Z(n7Var);
            if ("_npa".equals(str) && Z10 != null) {
                a().v().a("Falling back to manifest metadata value for ad personalization");
                c0(new h7("_npa", f().a(), Long.valueOf(true != Z10.booleanValue() ? 0L : 1L), "auto"), n7Var);
                return;
            }
            A2 v10 = a().v();
            C2760q3 c2760q3 = this.f25834l;
            v10.b("Removing user property", c2760q3.D().c(str));
            F0().r0();
            try {
                o0(n7Var);
                if ("_id".equals(str)) {
                    F0().z0((String) AbstractC1287s.m(n7Var.f26197a), "_lair");
                }
                F0().z0((String) AbstractC1287s.m(n7Var.f26197a), str);
                F0().s0();
                a().v().b("User property removed", c2760q3.D().c(str));
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final Context e() {
        return this.f25834l.e();
    }

    final void e0() {
        this.f25840r++;
    }

    @Override // com.google.android.gms.measurement.internal.V3
    public final com.google.android.gms.common.util.f f() {
        return ((C2760q3) AbstractC1287s.m(this.f25834l)).f();
    }

    final void f0() {
        this.f25841s++;
    }

    final C2633a4 g(String str) {
        C2633a4 c2633a4 = C2633a4.f25768c;
        b().h();
        O0();
        C2633a4 c2633a42 = (C2633a4) this.f25814B.get(str);
        if (c2633a42 == null) {
            c2633a42 = F0().J(str);
            if (c2633a42 == null) {
                c2633a42 = C2633a4.f25768c;
            }
            d(str, c2633a42);
        }
        return c2633a42;
    }

    final C2760q3 g0() {
        return this.f25834l;
    }

    final long h() {
        long a10 = f().a();
        C2683g6 c2683g6 = this.f25831i;
        c2683g6.j();
        c2683g6.h();
        N2 n22 = c2683g6.f26078j;
        long a11 = n22.a();
        if (a11 == 0) {
            a11 = c2683g6.f25694a.C().q0().nextInt(86400000) + 1;
            n22.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:66|67|68)|(2:70|(8:72|(3:74|(2:76|(1:78))(1:98)|79)(1:99)|80|(1:82)(1:97)|83|84|85|(4:87|(1:89)(1:93)|90|(1:92))))|100|84|85|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00be, code lost:
    
        if (true == r11.booleanValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c0, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00c5, code lost:
    
        r4 = true;
        r3 = new com.google.android.gms.measurement.internal.h7("_npa", r13, java.lang.Long.valueOf(r17), "auto");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00d2, code lost:
    
        if (r10 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00dc, code lost:
    
        if (r10.f26138e.equals(r3.f26098d) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00de, code lost:
    
        c0(r3, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00c3, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x034a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x034b, code lost:
    
        a().o().c("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.C2.x(r8), r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x041b A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e8, B:33:0x00f5, B:34:0x00fe, B:36:0x0103, B:38:0x011c, B:41:0x0133, B:43:0x015c, B:45:0x0168, B:47:0x0177, B:48:0x0255, B:50:0x0285, B:51:0x0288, B:53:0x02b0, B:57:0x037e, B:58:0x0381, B:60:0x038e, B:61:0x039b, B:62:0x043c, B:67:0x02c5, B:70:0x02e9, B:72:0x02f1, B:74:0x02f9, B:78:0x030c, B:80:0x031c, B:83:0x0328, B:85:0x033a, B:87:0x035f, B:89:0x0365, B:90:0x036d, B:92:0x0373, B:96:0x034b, B:98:0x0315, B:103:0x02d5, B:104:0x018a, B:106:0x01b5, B:107:0x01c4, B:109:0x01cb, B:111:0x01d1, B:113:0x01db, B:115:0x01e1, B:117:0x01e7, B:119:0x01ed, B:121:0x01f2, B:124:0x0212, B:129:0x0216, B:130:0x022a, B:131:0x0238, B:133:0x0246, B:134:0x03b3, B:136:0x03e9, B:137:0x03ec, B:139:0x03f9, B:140:0x0404, B:141:0x041b, B:143:0x0421, B:144:0x010f, B:145:0x00fb, B:147:0x00b6, B:150:0x00c5, B:152:0x00d4, B:154:0x00de, B:158:0x00e5), top: B:24:0x0093, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x010f A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e8, B:33:0x00f5, B:34:0x00fe, B:36:0x0103, B:38:0x011c, B:41:0x0133, B:43:0x015c, B:45:0x0168, B:47:0x0177, B:48:0x0255, B:50:0x0285, B:51:0x0288, B:53:0x02b0, B:57:0x037e, B:58:0x0381, B:60:0x038e, B:61:0x039b, B:62:0x043c, B:67:0x02c5, B:70:0x02e9, B:72:0x02f1, B:74:0x02f9, B:78:0x030c, B:80:0x031c, B:83:0x0328, B:85:0x033a, B:87:0x035f, B:89:0x0365, B:90:0x036d, B:92:0x0373, B:96:0x034b, B:98:0x0315, B:103:0x02d5, B:104:0x018a, B:106:0x01b5, B:107:0x01c4, B:109:0x01cb, B:111:0x01d1, B:113:0x01db, B:115:0x01e1, B:117:0x01e7, B:119:0x01ed, B:121:0x01f2, B:124:0x0212, B:129:0x0216, B:130:0x022a, B:131:0x0238, B:133:0x0246, B:134:0x03b3, B:136:0x03e9, B:137:0x03ec, B:139:0x03f9, B:140:0x0404, B:141:0x041b, B:143:0x0421, B:144:0x010f, B:145:0x00fb, B:147:0x00b6, B:150:0x00c5, B:152:0x00d4, B:154:0x00de, B:158:0x00e5), top: B:24:0x0093, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00fb A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e8, B:33:0x00f5, B:34:0x00fe, B:36:0x0103, B:38:0x011c, B:41:0x0133, B:43:0x015c, B:45:0x0168, B:47:0x0177, B:48:0x0255, B:50:0x0285, B:51:0x0288, B:53:0x02b0, B:57:0x037e, B:58:0x0381, B:60:0x038e, B:61:0x039b, B:62:0x043c, B:67:0x02c5, B:70:0x02e9, B:72:0x02f1, B:74:0x02f9, B:78:0x030c, B:80:0x031c, B:83:0x0328, B:85:0x033a, B:87:0x035f, B:89:0x0365, B:90:0x036d, B:92:0x0373, B:96:0x034b, B:98:0x0315, B:103:0x02d5, B:104:0x018a, B:106:0x01b5, B:107:0x01c4, B:109:0x01cb, B:111:0x01d1, B:113:0x01db, B:115:0x01e1, B:117:0x01e7, B:119:0x01ed, B:121:0x01f2, B:124:0x0212, B:129:0x0216, B:130:0x022a, B:131:0x0238, B:133:0x0246, B:134:0x03b3, B:136:0x03e9, B:137:0x03ec, B:139:0x03f9, B:140:0x0404, B:141:0x041b, B:143:0x0421, B:144:0x010f, B:145:0x00fb, B:147:0x00b6, B:150:0x00c5, B:152:0x00d4, B:154:0x00de, B:158:0x00e5), top: B:24:0x0093, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e8, B:33:0x00f5, B:34:0x00fe, B:36:0x0103, B:38:0x011c, B:41:0x0133, B:43:0x015c, B:45:0x0168, B:47:0x0177, B:48:0x0255, B:50:0x0285, B:51:0x0288, B:53:0x02b0, B:57:0x037e, B:58:0x0381, B:60:0x038e, B:61:0x039b, B:62:0x043c, B:67:0x02c5, B:70:0x02e9, B:72:0x02f1, B:74:0x02f9, B:78:0x030c, B:80:0x031c, B:83:0x0328, B:85:0x033a, B:87:0x035f, B:89:0x0365, B:90:0x036d, B:92:0x0373, B:96:0x034b, B:98:0x0315, B:103:0x02d5, B:104:0x018a, B:106:0x01b5, B:107:0x01c4, B:109:0x01cb, B:111:0x01d1, B:113:0x01db, B:115:0x01e1, B:117:0x01e7, B:119:0x01ed, B:121:0x01f2, B:124:0x0212, B:129:0x0216, B:130:0x022a, B:131:0x0238, B:133:0x0246, B:134:0x03b3, B:136:0x03e9, B:137:0x03ec, B:139:0x03f9, B:140:0x0404, B:141:0x041b, B:143:0x0421, B:144:0x010f, B:145:0x00fb, B:147:0x00b6, B:150:0x00c5, B:152:0x00d4, B:154:0x00de, B:158:0x00e5), top: B:24:0x0093, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103 A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e8, B:33:0x00f5, B:34:0x00fe, B:36:0x0103, B:38:0x011c, B:41:0x0133, B:43:0x015c, B:45:0x0168, B:47:0x0177, B:48:0x0255, B:50:0x0285, B:51:0x0288, B:53:0x02b0, B:57:0x037e, B:58:0x0381, B:60:0x038e, B:61:0x039b, B:62:0x043c, B:67:0x02c5, B:70:0x02e9, B:72:0x02f1, B:74:0x02f9, B:78:0x030c, B:80:0x031c, B:83:0x0328, B:85:0x033a, B:87:0x035f, B:89:0x0365, B:90:0x036d, B:92:0x0373, B:96:0x034b, B:98:0x0315, B:103:0x02d5, B:104:0x018a, B:106:0x01b5, B:107:0x01c4, B:109:0x01cb, B:111:0x01d1, B:113:0x01db, B:115:0x01e1, B:117:0x01e7, B:119:0x01ed, B:121:0x01f2, B:124:0x0212, B:129:0x0216, B:130:0x022a, B:131:0x0238, B:133:0x0246, B:134:0x03b3, B:136:0x03e9, B:137:0x03ec, B:139:0x03f9, B:140:0x0404, B:141:0x041b, B:143:0x0421, B:144:0x010f, B:145:0x00fb, B:147:0x00b6, B:150:0x00c5, B:152:0x00d4, B:154:0x00de, B:158:0x00e5), top: B:24:0x0093, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #1 {all -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e8, B:33:0x00f5, B:34:0x00fe, B:36:0x0103, B:38:0x011c, B:41:0x0133, B:43:0x015c, B:45:0x0168, B:47:0x0177, B:48:0x0255, B:50:0x0285, B:51:0x0288, B:53:0x02b0, B:57:0x037e, B:58:0x0381, B:60:0x038e, B:61:0x039b, B:62:0x043c, B:67:0x02c5, B:70:0x02e9, B:72:0x02f1, B:74:0x02f9, B:78:0x030c, B:80:0x031c, B:83:0x0328, B:85:0x033a, B:87:0x035f, B:89:0x0365, B:90:0x036d, B:92:0x0373, B:96:0x034b, B:98:0x0315, B:103:0x02d5, B:104:0x018a, B:106:0x01b5, B:107:0x01c4, B:109:0x01cb, B:111:0x01d1, B:113:0x01db, B:115:0x01e1, B:117:0x01e7, B:119:0x01ed, B:121:0x01f2, B:124:0x0212, B:129:0x0216, B:130:0x022a, B:131:0x0238, B:133:0x0246, B:134:0x03b3, B:136:0x03e9, B:137:0x03ec, B:139:0x03f9, B:140:0x0404, B:141:0x041b, B:143:0x0421, B:144:0x010f, B:145:0x00fb, B:147:0x00b6, B:150:0x00c5, B:152:0x00d4, B:154:0x00de, B:158:0x00e5), top: B:24:0x0093, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035f A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e8, B:33:0x00f5, B:34:0x00fe, B:36:0x0103, B:38:0x011c, B:41:0x0133, B:43:0x015c, B:45:0x0168, B:47:0x0177, B:48:0x0255, B:50:0x0285, B:51:0x0288, B:53:0x02b0, B:57:0x037e, B:58:0x0381, B:60:0x038e, B:61:0x039b, B:62:0x043c, B:67:0x02c5, B:70:0x02e9, B:72:0x02f1, B:74:0x02f9, B:78:0x030c, B:80:0x031c, B:83:0x0328, B:85:0x033a, B:87:0x035f, B:89:0x0365, B:90:0x036d, B:92:0x0373, B:96:0x034b, B:98:0x0315, B:103:0x02d5, B:104:0x018a, B:106:0x01b5, B:107:0x01c4, B:109:0x01cb, B:111:0x01d1, B:113:0x01db, B:115:0x01e1, B:117:0x01e7, B:119:0x01ed, B:121:0x01f2, B:124:0x0212, B:129:0x0216, B:130:0x022a, B:131:0x0238, B:133:0x0246, B:134:0x03b3, B:136:0x03e9, B:137:0x03ec, B:139:0x03f9, B:140:0x0404, B:141:0x041b, B:143:0x0421, B:144:0x010f, B:145:0x00fb, B:147:0x00b6, B:150:0x00c5, B:152:0x00d4, B:154:0x00de, B:158:0x00e5), top: B:24:0x0093, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void h0(n7 n7Var) {
        boolean z10;
        E v02;
        boolean z11;
        String str;
        long j10;
        PackageInfo packageInfo;
        String str2;
        ApplicationInfo applicationInfo;
        long j11;
        boolean z12;
        b().h();
        O0();
        AbstractC1287s.m(n7Var);
        String str3 = n7Var.f26197a;
        AbstractC1287s.g(str3);
        if (X(n7Var)) {
            I2 J02 = F0().J0(str3);
            if (J02 != null && TextUtils.isEmpty(J02.r0()) && !TextUtils.isEmpty(n7Var.f26198b)) {
                J02.i(0L);
                F0().K0(J02, false, false);
                D0().B(str3);
            }
            if (!n7Var.f26204h) {
                o0(n7Var);
                return;
            }
            long j12 = n7Var.f26208l;
            if (j12 == 0) {
                j12 = f().a();
            }
            int i10 = n7Var.f26209m;
            if (i10 != 0 && i10 != 1) {
                a().r().c("Incorrect app type, assuming installed app. appId, appType", C2.x(str3), Integer.valueOf(i10));
                i10 = 0;
            }
            F0().r0();
            try {
                j7 B02 = F0().B0(str3, "_npa");
                Boolean Z10 = Z(n7Var);
                if (B02 != null && !"auto".equals(B02.f26135b)) {
                    z10 = true;
                    if (B0().H(null, AbstractC2671f2.f25995c1)) {
                        n0(n7Var, j12);
                    } else {
                        n0(n7Var, n7Var.f26195D);
                    }
                    o0(n7Var);
                    if (i10 != 0) {
                        v02 = F0().v0(str3, "_f");
                        z11 = false;
                    } else {
                        v02 = F0().v0(str3, "_v");
                        z11 = z10;
                    }
                    if (v02 != null) {
                        long j13 = ((j12 / 3600000) + 1) * 3600000;
                        if (z11) {
                            long j14 = j12;
                            c0(new h7("_fvt", j14, Long.valueOf(j13), "auto"), n7Var);
                            b().h();
                            O0();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (n7Var.f26211o) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (B0().H(null, AbstractC2671f2.f26019k1)) {
                                bundle.putLong("_elt", f().a());
                            }
                            j(new I("_v", new G(bundle), "auto", j14), n7Var);
                        } else {
                            c0(new h7("_fot", j12, Long.valueOf(j13), "auto"), n7Var);
                            b().h();
                            T2 t22 = (T2) AbstractC1287s.m(this.f25833k);
                            if (str3 == null || str3.isEmpty()) {
                                str = "_elt";
                                j10 = j12;
                                t22.f25693a.a().s().a("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                C2760q3 c2760q3 = t22.f25693a;
                                c2760q3.b().h();
                                if (t22.a()) {
                                    str = "_elt";
                                    S2 s22 = new S2(t22, str3);
                                    c2760q3.b().h();
                                    j10 = j12;
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = c2760q3.e().getPackageManager();
                                    if (packageManager == null) {
                                        c2760q3.a().s().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            c2760q3.a().u().a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str4 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str4) && t22.a()) {
                                                    try {
                                                        c2760q3.a().w().b("Install Referrer Service is", C1653b.b().a(c2760q3.e(), new Intent(intent), s22, 1) ? "available" : "not available");
                                                    } catch (RuntimeException e10) {
                                                        t22.f25693a.a().o().b("Exception occurred while binding to Install Referrer Service", e10.getMessage());
                                                    }
                                                } else {
                                                    c2760q3.a().r().a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c2760q3.a().u().a("Install Referrer Reporter is not available");
                                    str = "_elt";
                                    j10 = j12;
                                }
                            }
                            b().h();
                            O0();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", 1L);
                            if (n7Var.f26211o) {
                                bundle2.putLong("_dac", 1L);
                            }
                            String str5 = (String) AbstractC1287s.m(n7Var.f26197a);
                            C2803w F02 = F0();
                            AbstractC1287s.g(str5);
                            F02.h();
                            F02.j();
                            long z13 = F02.z(str5, "first_open_count");
                            C2760q3 c2760q32 = this.f25834l;
                            if (c2760q32.e().getPackageManager() == null) {
                                a().o().b("PackageManager is null, first open report might be inaccurate. appId", C2.x(str5));
                            } else {
                                try {
                                    packageInfo = C2998d.a(c2760q32.e()).e(str5, 0);
                                } catch (PackageManager.NameNotFoundException e11) {
                                    a().o().c("Package info is null, first open report might be inaccurate. appId", C2.x(str5), e11);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    long j15 = packageInfo.firstInstallTime;
                                    if (j15 != 0) {
                                        str2 = "_sysu";
                                        if (j15 != packageInfo.lastUpdateTime) {
                                            if (!B0().H(null, AbstractC2671f2.f25954J0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (z13 == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z13 = 0;
                                            }
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                        c0(new h7("_fi", j10, Long.valueOf(true != z12 ? 0L : 1L), "auto"), n7Var);
                                        applicationInfo = C2998d.a(this.f25834l.e()).c(str5, 0);
                                        if (applicationInfo != null) {
                                            if ((applicationInfo.flags & 1) != 0) {
                                                j11 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j11 = 1;
                                            }
                                            if ((applicationInfo.flags & 128) != 0) {
                                                bundle2.putLong(str2, j11);
                                            }
                                        }
                                    }
                                }
                                str2 = "_sysu";
                                applicationInfo = C2998d.a(this.f25834l.e()).c(str5, 0);
                                if (applicationInfo != null) {
                                }
                            }
                            if (z13 >= 0) {
                                bundle2.putLong("_pfo", z13);
                            }
                            if (B0().H(null, AbstractC2671f2.f26019k1)) {
                                bundle2.putLong(str, f().a());
                            }
                            j(new I("_f", new G(bundle2), "auto", j10), n7Var);
                        }
                    } else {
                        long j16 = j12;
                        if (n7Var.f26205i) {
                            j(new I("_cd", new G(new Bundle()), "auto", j16), n7Var);
                        }
                    }
                    F0().s0();
                    F0().t0();
                }
                z10 = true;
                if (B02 != null) {
                    d0("_npa", n7Var);
                }
                if (B0().H(null, AbstractC2671f2.f25995c1)) {
                }
                o0(n7Var);
                if (i10 != 0) {
                }
                if (v02 != null) {
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final void i(I i10, String str) {
        I2 J02 = F0().J0(str);
        if (J02 == null || TextUtils.isEmpty(J02.D0())) {
            a().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean T10 = T(J02);
        if (T10 == null) {
            if (!"_ui".equals(i10.f25442a)) {
                a().r().b("Could not find package. appId", C2.x(str));
            }
        } else if (!T10.booleanValue()) {
            a().o().b("App version does not match; dropping event. appId", C2.x(str));
            return;
        }
        j(i10, new n7(str, J02.r0(), J02.D0(), J02.F0(), J02.H0(), J02.J0(), J02.L0(), (String) null, J02.d(), false, J02.x0(), 0L, 0, J02.P(), false, J02.R(), J02.b(), J02.T(), g(str).l(), BuildConfig.FLAVOR, (String) null, J02.V(), J02.X(), g(str).b(), R0(str).e(), J02.b0(), J02.j0(), J02.l0(), J02.I(), 0L, J02.M()));
    }

    final void i0(n7 n7Var) {
        b().h();
        O0();
        AbstractC1287s.m(n7Var);
        String str = n7Var.f26197a;
        AbstractC1287s.g(str);
        int i10 = 0;
        if (B0().H(null, AbstractC2671f2.f25936A0)) {
            long a10 = f().a();
            int E10 = B0().E(null, AbstractC2671f2.f26015j0);
            B0();
            long n10 = a10 - C2724m.n();
            while (i10 < E10 && M(null, n10)) {
                i10++;
            }
        } else {
            B0();
            long p10 = C2724m.p();
            while (i10 < p10 && M(str, 0L)) {
                i10++;
            }
        }
        if (B0().H(null, AbstractC2671f2.f25938B0)) {
            b().h();
            v0();
        }
        if (this.f25832j.j(str, EnumC2315o3.zzb(n7Var.f26196E))) {
            a().w().b("[sgtm] Going background, trigger client side upload. appId", str);
            s(str, f().a());
        }
    }

    final void j(I i10, n7 n7Var) {
        String str = n7Var.f26197a;
        AbstractC1287s.g(str);
        D2 a10 = D2.a(i10);
        N0().w(a10.f25357d, F0().G(str));
        N0().u(a10, B0().w(str));
        I b10 = a10.b();
        if (!B0().H(null, AbstractC2671f2.f26007g1) && "_cmp".equals(b10.f25442a)) {
            G g10 = b10.f25443b;
            if ("referrer API v2".equals(g10.I("_cis"))) {
                String I10 = g10.I("gclid");
                if (!TextUtils.isEmpty(I10)) {
                    c0(new h7("_lgclid", b10.f25445d, I10, "auto"), n7Var);
                }
            }
        }
        k(b10, n7Var);
    }

    final void j0(C2692i c2692i) {
        n7 U10 = U((String) AbstractC1287s.m(c2692i.f26102a));
        if (U10 != null) {
            k0(c2692i, U10);
        }
    }

    final void k(I i10, n7 n7Var) {
        I i11;
        List<C2692i> I02;
        List<C2692i> I03;
        List<C2692i> I04;
        String str;
        AbstractC1287s.m(n7Var);
        String str2 = n7Var.f26197a;
        AbstractC1287s.g(str2);
        b().h();
        O0();
        long j10 = i10.f25445d;
        D2 a10 = D2.a(i10);
        b().h();
        l7.k0((this.f25818F == null || (str = this.f25819G) == null || !str.equals(str2)) ? null : this.f25818F, a10.f25357d, false);
        I b10 = a10.b();
        K0();
        if (g7.p(b10, n7Var)) {
            if (!n7Var.f26204h) {
                o0(n7Var);
                return;
            }
            List list = n7Var.f26214r;
            if (list != null) {
                String str3 = b10.f25442a;
                if (!list.contains(str3)) {
                    a().v().d("Dropping non-safelisted event. appId, event name, origin", str2, b10.f25442a, b10.f25444c);
                    return;
                } else {
                    Bundle Z02 = b10.f25443b.Z0();
                    Z02.putLong("ga_safelisted", 1L);
                    i11 = new I(str3, new G(Z02), b10.f25444c, b10.f25445d);
                }
            } else {
                i11 = b10;
            }
            F0().r0();
            try {
                String str4 = i11.f25442a;
                if ("_s".equals(str4) && !F0().C(str2, "_s") && i11.f25443b.u("_sid").longValue() != 0) {
                    if (!F0().C(str2, "_f") && !F0().C(str2, "_v")) {
                        F0().I(str2, Long.valueOf(f().a() - 15000), "_sid", l(str2, i11));
                    }
                    F0().I(str2, null, "_sid", l(str2, i11));
                }
                C2803w F02 = F0();
                AbstractC1287s.g(str2);
                F02.h();
                F02.j();
                if (j10 < 0) {
                    F02.f25694a.a().r().c("Invalid time querying timed out conditional properties", C2.x(str2), Long.valueOf(j10));
                    I02 = Collections.emptyList();
                } else {
                    I02 = F02.I0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (C2692i c2692i : I02) {
                    if (c2692i != null) {
                        a().w().d("User property timed out", c2692i.f26102a, this.f25834l.D().c(c2692i.f26104c.f26096b), c2692i.f26104c.j());
                        I i12 = c2692i.f26108g;
                        if (i12 != null) {
                            m(new I(i12, j10), n7Var);
                        }
                        F0().G0(str2, c2692i.f26104c.f26096b);
                    }
                }
                C2803w F03 = F0();
                AbstractC1287s.g(str2);
                F03.h();
                F03.j();
                if (j10 < 0) {
                    F03.f25694a.a().r().c("Invalid time querying expired conditional properties", C2.x(str2), Long.valueOf(j10));
                    I03 = Collections.emptyList();
                } else {
                    I03 = F03.I0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(I03.size());
                for (C2692i c2692i2 : I03) {
                    if (c2692i2 != null) {
                        a().w().d("User property expired", c2692i2.f26102a, this.f25834l.D().c(c2692i2.f26104c.f26096b), c2692i2.f26104c.j());
                        F0().z0(str2, c2692i2.f26104c.f26096b);
                        I i13 = c2692i2.f26112k;
                        if (i13 != null) {
                            arrayList.add(i13);
                        }
                        F0().G0(str2, c2692i2.f26104c.f26096b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m(new I((I) it.next(), j10), n7Var);
                }
                C2803w F04 = F0();
                AbstractC1287s.g(str2);
                AbstractC1287s.g(str4);
                F04.h();
                F04.j();
                if (j10 < 0) {
                    C2760q3 c2760q3 = F04.f25694a;
                    c2760q3.a().r().d("Invalid time querying triggered conditional properties", C2.x(str2), c2760q3.D().a(str4), Long.valueOf(j10));
                    I04 = Collections.emptyList();
                } else {
                    I04 = F04.I0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(I04.size());
                for (C2692i c2692i3 : I04) {
                    if (c2692i3 != null) {
                        h7 h7Var = c2692i3.f26104c;
                        j7 j7Var = new j7((String) AbstractC1287s.m(c2692i3.f26102a), c2692i3.f26103b, h7Var.f26096b, j10, AbstractC1287s.m(h7Var.j()));
                        if (F0().A0(j7Var)) {
                            a().w().d("User property triggered", c2692i3.f26102a, this.f25834l.D().c(j7Var.f26136c), j7Var.f26138e);
                        } else {
                            a().o().d("Too many active user properties, ignoring", C2.x(c2692i3.f26102a), this.f25834l.D().c(j7Var.f26136c), j7Var.f26138e);
                        }
                        I i14 = c2692i3.f26110i;
                        if (i14 != null) {
                            arrayList2.add(i14);
                        }
                        c2692i3.f26104c = new h7(j7Var);
                        c2692i3.f26106e = true;
                        F0().E0(c2692i3);
                    }
                }
                m(i11, n7Var);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    m(new I((I) it2.next(), j10), n7Var);
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final void k0(C2692i c2692i, n7 n7Var) {
        AbstractC1287s.m(c2692i);
        AbstractC1287s.g(c2692i.f26102a);
        AbstractC1287s.m(c2692i.f26103b);
        AbstractC1287s.m(c2692i.f26104c);
        AbstractC1287s.g(c2692i.f26104c.f26096b);
        b().h();
        O0();
        if (X(n7Var)) {
            if (!n7Var.f26204h) {
                o0(n7Var);
                return;
            }
            C2692i c2692i2 = new C2692i(c2692i);
            boolean z10 = false;
            c2692i2.f26106e = false;
            F0().r0();
            try {
                C2692i F02 = F0().F0((String) AbstractC1287s.m(c2692i2.f26102a), c2692i2.f26104c.f26096b);
                if (F02 != null && !F02.f26103b.equals(c2692i2.f26103b)) {
                    a().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f25834l.D().c(c2692i2.f26104c.f26096b), c2692i2.f26103b, F02.f26103b);
                }
                if (F02 != null && F02.f26106e) {
                    c2692i2.f26103b = F02.f26103b;
                    c2692i2.f26105d = F02.f26105d;
                    c2692i2.f26109h = F02.f26109h;
                    c2692i2.f26107f = F02.f26107f;
                    c2692i2.f26110i = F02.f26110i;
                    c2692i2.f26106e = true;
                    h7 h7Var = c2692i2.f26104c;
                    c2692i2.f26104c = new h7(h7Var.f26096b, F02.f26104c.f26097c, h7Var.j(), F02.f26104c.f26100f);
                } else if (TextUtils.isEmpty(c2692i2.f26107f)) {
                    h7 h7Var2 = c2692i2.f26104c;
                    c2692i2.f26104c = new h7(h7Var2.f26096b, c2692i2.f26105d, h7Var2.j(), c2692i2.f26104c.f26100f);
                    c2692i2.f26106e = true;
                    z10 = true;
                }
                if (c2692i2.f26106e) {
                    h7 h7Var3 = c2692i2.f26104c;
                    j7 j7Var = new j7((String) AbstractC1287s.m(c2692i2.f26102a), c2692i2.f26103b, h7Var3.f26096b, h7Var3.f26097c, AbstractC1287s.m(h7Var3.j()));
                    if (F0().A0(j7Var)) {
                        a().v().d("User property updated immediately", c2692i2.f26102a, this.f25834l.D().c(j7Var.f26136c), j7Var.f26138e);
                    } else {
                        a().o().d("(2)Too many active user properties, ignoring", C2.x(c2692i2.f26102a), this.f25834l.D().c(j7Var.f26136c), j7Var.f26138e);
                    }
                    if (z10 && c2692i2.f26110i != null) {
                        m(new I(c2692i2.f26110i, c2692i2.f26105d), n7Var);
                    }
                }
                if (F0().E0(c2692i2)) {
                    a().v().d("Conditional property added", c2692i2.f26102a, this.f25834l.D().c(c2692i2.f26104c.f26096b), c2692i2.f26104c.j());
                } else {
                    a().o().d("Too many conditional properties, ignoring", C2.x(c2692i2.f26102a), this.f25834l.D().c(c2692i2.f26104c.f26096b), c2692i2.f26104c.j());
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final Bundle l(String str, I i10) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", i10.f25443b.u("_sid").longValue());
        j7 B02 = F0().B0(str, "_sno");
        if (B02 != null) {
            Object obj = B02.f26138e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    final void l0(C2692i c2692i) {
        n7 U10 = U((String) AbstractC1287s.m(c2692i.f26102a));
        if (U10 != null) {
            m0(c2692i, U10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:370|(2:372|(10:374|375|376|(1:378)|57|(0)(0)|60|(0)(0)|66|67))|379|380|381|382|383|375|376|(0)|57|(0)(0)|60|(0)(0)|66|67) */
    /* JADX WARN: Can't wrap try/catch for region: R(57:336|337|338|114|(0)|117|(0)(0)|124|(0)|127|(0)|130|(0)|133|(0)|136|(0)|139|(0)|142|(1:144)|333|157|(0)|160|(0)(0)|(35:164|166|(1:167)|300|181|(0)|(0)|186|(0)|189|(0)|291|213|(0)|218|(0)(0)|224|(0)|229|(0)|232|(1:233)|247|248|249|250|251|(3:252|(0)(0)|272)|258|259|260|(0)(0)|263|264|265)|301|(0)|186|(0)|189|(0)|291|213|(0)|218|(0)(0)|224|(0)|229|(0)|232|(1:233)|247|248|249|250|251|(3:252|(0)(0)|272)|258|259|260|(0)(0)|263|264|265) */
    /* JADX WARN: Can't wrap try/catch for region: R(66:68|(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))|84|85|(1:87)(1:342)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|(6:108|109|110|111|112|113)|114|(1:116)|117|(2:119|(1:123)(1:122))(1:334)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|(1:333)(6:146|(1:150)|151|(1:153)(1:332)|154|(1:156)(15:303|(1:305)(1:331)|306|(1:308)(1:330)|309|(1:311)(1:329)|312|(1:314)(1:328)|315|(1:317)(1:327)|318|(1:320)(1:326)|321|(1:323)(1:325)|324))|157|(1:159)|160|(1:162)(1:302)|(34:166|(4:169|(3:171|172|(3:174|175|(3:177|178|180)(1:292))(1:294))(1:299)|293|167)|300|181|(1:183)|(1:185)|186|(1:188)|189|(2:193|(4:195|(1:197)|198|(28:206|(1:208)(1:290)|209|(1:211)|212|213|(2:215|(1:217))|218|(3:220|(1:222)|223)(1:289)|224|(1:228)|229|(1:231)|232|(4:235|(2:241|242)|243|233)|247|248|249|250|251|(2:252|(2:254|(1:256)(1:272))(3:273|274|(1:279)(1:278)))|258|259|260|(1:262)(2:267|268)|263|264|265)))|291|213|(0)|218|(0)(0)|224|(2:226|228)|229|(0)|232|(1:233)|247|248|249|250|251|(3:252|(0)(0)|272)|258|259|260|(0)(0)|263|264|265)|301|(0)|186|(0)|189|(3:191|193|(0))|291|213|(0)|218|(0)(0)|224|(0)|229|(0)|232|(1:233)|247|248|249|250|251|(3:252|(0)(0)|272)|258|259|260|(0)(0)|263|264|265) */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0a77, code lost:
    
        r31 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0b28, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b30, code lost:
    
        r2.f25694a.a().o().c("Error storing raw event. appId", com.google.android.gms.measurement.internal.C2.x(r4.f25346a), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0b46, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0b63, code lost:
    
        a().o().c("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.C2.x(r3.K()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0298, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x029a, code lost:
    
        r8.f25694a.a().o().c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.C2.x(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0529 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x056a A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x061d A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0628 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0633 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x063e A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x064a A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x065b A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0737 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x075d A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0791 A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x07f2 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0802 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0825 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0839 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08f3 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x090a A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0972 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0993 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x09af A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a6d A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0b14 A[Catch: all -> 0x0178, SQLiteException -> 0x0b28, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x0b28, blocks: (B:260:0x0b03, B:262:0x0b14), top: B:259:0x0b03, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0a7a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0762 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05d9 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x031c A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x02d0 A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x037e A[Catch: all -> 0x0178, TryCatch #7 {all -> 0x0178, blocks: (B:42:0x0157, B:45:0x0166, B:47:0x016e, B:50:0x017c, B:57:0x0308, B:60:0x033b, B:62:0x037e, B:64:0x0385, B:65:0x039c, B:70:0x03a9, B:72:0x03c1, B:74:0x03c8, B:75:0x03df, B:78:0x0403, B:82:0x0426, B:83:0x043d, B:84:0x0446, B:87:0x0465, B:88:0x047e, B:90:0x0486, B:92:0x0492, B:94:0x0498, B:95:0x049f, B:97:0x04ac, B:99:0x04b4, B:101:0x04bc, B:104:0x04c6, B:107:0x04d2, B:109:0x04df, B:112:0x0504, B:116:0x0529, B:117:0x053e, B:119:0x056a, B:122:0x0581, B:123:0x05bd, B:124:0x05e5, B:126:0x061d, B:127:0x0620, B:129:0x0628, B:130:0x062b, B:132:0x0633, B:133:0x0636, B:135:0x063e, B:136:0x0641, B:138:0x064a, B:139:0x064e, B:141:0x065b, B:142:0x065e, B:144:0x068a, B:146:0x0694, B:150:0x06ab, B:154:0x06b8, B:157:0x072f, B:159:0x0737, B:160:0x073a, B:162:0x075d, B:164:0x0768, B:166:0x0771, B:167:0x078b, B:169:0x0791, B:172:0x07a5, B:175:0x07b1, B:178:0x07be, B:297:0x07d8, B:181:0x07e8, B:185:0x07f2, B:186:0x07f5, B:188:0x0802, B:189:0x0807, B:191:0x0825, B:193:0x0829, B:195:0x0839, B:197:0x0844, B:198:0x084d, B:200:0x0857, B:202:0x0863, B:204:0x086d, B:206:0x0873, B:208:0x0883, B:209:0x0897, B:211:0x089d, B:212:0x08a6, B:213:0x08b7, B:215:0x08f3, B:217:0x08fd, B:218:0x0900, B:220:0x090a, B:222:0x0927, B:223:0x0932, B:224:0x096a, B:226:0x0972, B:228:0x097c, B:229:0x0989, B:231:0x0993, B:232:0x09a0, B:233:0x09a9, B:235:0x09af, B:237:0x09eb, B:239:0x09f5, B:241:0x0a07, B:248:0x0a0d, B:250:0x0a51, B:251:0x0a5c, B:252:0x0a67, B:254:0x0a6d, B:258:0x0ab8, B:260:0x0b03, B:262:0x0b14, B:263:0x0b78, B:268:0x0b2d, B:271:0x0b30, B:274:0x0a7a, B:276:0x0aa4, B:283:0x0b4b, B:284:0x0b62, B:288:0x0b63, B:302:0x0762, B:303:0x06c3, B:306:0x06cf, B:309:0x06dd, B:312:0x06eb, B:315:0x06f9, B:318:0x0707, B:321:0x0713, B:324:0x0720, B:334:0x05d9, B:338:0x0511, B:343:0x031c, B:344:0x0323, B:346:0x0329, B:349:0x0335, B:354:0x0199, B:356:0x01a7, B:358:0x01bc, B:363:0x01dc, B:366:0x0212, B:368:0x0218, B:370:0x0226, B:372:0x0234, B:374:0x0243, B:376:0x02c6, B:378:0x02d0, B:380:0x026d, B:382:0x0286, B:383:0x02ad, B:387:0x029a, B:389:0x01e8, B:391:0x0206), top: B:41:0x0157, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void m(I i10, n7 n7Var) {
        String str;
        String str2;
        long longValue;
        String str3;
        String str4;
        I i11;
        String str5;
        j7 j7Var;
        j7 j7Var2;
        G g10;
        long j10;
        long p10;
        String str6;
        long j11;
        D d10;
        String str7;
        E v02;
        E a10;
        String str8;
        String str9;
        String str10;
        String str11;
        long j12;
        String str12;
        long j13;
        Map emptyMap;
        ArrayList arrayList;
        String str13;
        C2633a4 s10;
        Z3 z32;
        C2633a4 c2633a4;
        Z3 z33;
        String str14;
        C2760q3 c2760q3;
        I2 J02;
        int i12;
        List C02;
        int i13;
        C2803w F02;
        C2225e3 c2225e3;
        C2803w F03;
        F f10;
        int i14;
        ContentValues contentValues;
        Pair m10;
        I2 J03;
        j7 B02;
        AbstractC1287s.m(n7Var);
        String str15 = n7Var.f26197a;
        AbstractC1287s.g(str15);
        long nanoTime = System.nanoTime();
        b().h();
        O0();
        K0();
        if (g7.p(i10, n7Var)) {
            if (!n7Var.f26204h) {
                o0(n7Var);
                return;
            }
            C2656d3 D02 = D0();
            String str16 = i10.f25442a;
            if (D02.D(str15, str16)) {
                a().r().c("Dropping blocked event. appId", C2.x(str15), this.f25834l.D().a(str16));
                if (!D0().H(str15) && !D0().I(str15)) {
                    if ("_err".equals(str16)) {
                        return;
                    }
                    N0().B(this.f25822J, str15, 11, "_ev", str16, 0);
                    return;
                }
                I2 J04 = F0().J0(str15);
                if (J04 != null) {
                    long abs = Math.abs(f().a() - Math.max(J04.j(), J04.h()));
                    B0();
                    if (abs > ((Long) AbstractC2671f2.f25963O.b(null)).longValue()) {
                        a().v().a("Fetching config for blocked app");
                        B(J04);
                        return;
                    }
                    return;
                }
                return;
            }
            D2 a11 = D2.a(i10);
            N0().u(a11, B0().w(str15));
            int F10 = B0().F(str15, AbstractC2671f2.f26009h0, 10, 35);
            Bundle bundle = a11.f25357d;
            for (String str17 : new TreeSet(bundle.keySet())) {
                if ("items".equals(str17)) {
                    N0().v(bundle.getParcelableArray(str17), F10);
                }
            }
            I b10 = a11.b();
            if (Log.isLoggable(a().z(), 2)) {
                a().w().b("Logging event", this.f25834l.D().d(b10));
            }
            F0().r0();
            try {
                o0(n7Var);
                String str18 = b10.f25442a;
                boolean z10 = "ecommerce_purchase".equals(str18) || "purchase".equals(str18) || "refund".equals(str18);
                if (!"_iap".equals(str18)) {
                    if (!z10) {
                        str3 = "value";
                        str = "app_id";
                        str2 = "_fx";
                        str4 = "raw_events";
                        i11 = b10;
                        str5 = "_err";
                        String str19 = i11.f25442a;
                        boolean r02 = l7.r0(str19);
                        boolean equals = str5.equals(str19);
                        N0();
                        g10 = i11.f25443b;
                        if (g10 != null) {
                            j10 = 0;
                        } else {
                            F f11 = new F(g10);
                            j10 = 0;
                            while (f11.hasNext()) {
                                if (g10.j(f11.next()) instanceof Parcelable[]) {
                                    j10 += ((Parcelable[]) r11).length;
                                }
                            }
                        }
                        I i15 = i11;
                        C2771s M02 = F0().M0(h(), str15, j10 + 1, true, r02, false, equals, false, false, false);
                        long j14 = M02.f26317b;
                        B0();
                        p10 = j14 - C2724m.p();
                        if (p10 <= 0) {
                            if (p10 % 1000 == 1) {
                                a().o().c("Data loss. Too many events logged. appId, count", C2.x(str15), Long.valueOf(M02.f26317b));
                            }
                            F0().s0();
                        } else {
                            if (r02) {
                                long j15 = M02.f26316a;
                                B0();
                                long intValue = j15 - ((Integer) AbstractC2671f2.f26025n.b(null)).intValue();
                                if (intValue > 0) {
                                    if (intValue % 1000 == 1) {
                                        a().o().c("Data loss. Too many public events logged. appId, count", C2.x(str15), Long.valueOf(M02.f26316a));
                                    }
                                    N0().B(this.f25822J, str15, 16, "_ev", i15.f25442a, 0);
                                    F0().s0();
                                }
                            }
                            if (equals) {
                                long max = M02.f26319d - Math.max(0, Math.min(HVFrameRecorder.BITRATE, B0().E(n7Var.f26197a, AbstractC2671f2.f26023m)));
                                if (max > 0) {
                                    if (max == 1) {
                                        a().o().c("Too many error events logged. appId, count", C2.x(str15), Long.valueOf(M02.f26319d));
                                    }
                                    F0().s0();
                                }
                            }
                            Bundle Z02 = g10.Z0();
                            l7 N02 = N0();
                            String str20 = i15.f25444c;
                            N02.A(Z02, "_o", str20);
                            if (N0().P(str15, n7Var.f26193B)) {
                                N0().A(Z02, "_dbg", 1L);
                                N0().A(Z02, "_r", 1L);
                            }
                            if ("_s".equals(str19) && (B02 = F0().B0(n7Var.f26197a, "_sno")) != null) {
                                Object obj = B02.f26138e;
                                if (obj instanceof Long) {
                                    N0().A(Z02, "_sno", obj);
                                }
                            }
                            if (B0().H(null, AbstractC2671f2.f25984Y0) && Objects.equals(str20, "am") && Objects.equals(str19, "_ai")) {
                                String str21 = str3;
                                Object obj2 = Z02.get(str21);
                                if (obj2 instanceof String) {
                                    try {
                                        double parseDouble = Double.parseDouble((String) obj2);
                                        Z02.remove(str21);
                                        Z02.putDouble(str21, parseDouble);
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            C2803w F04 = F0();
                            AbstractC1287s.g(str15);
                            F04.h();
                            F04.j();
                            try {
                                str6 = str4;
                                try {
                                    j11 = F04.u0().delete(str6, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str15, String.valueOf(Math.max(0, Math.min(HVFrameRecorder.BITRATE, F04.f25694a.w().E(str15, AbstractC2671f2.f26031q))))});
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    F04.f25694a.a().o().c("Error deleting over the limit events. appId", C2.x(str15), e);
                                    j11 = 0;
                                    if (j11 > 0) {
                                    }
                                    C2760q3 c2760q32 = this.f25834l;
                                    str7 = str6;
                                    d10 = new D(c2760q32, i15.f25444c, str15, i15.f25442a, i15.f25445d, 0L, Z02);
                                    C2803w F05 = F0();
                                    String str22 = d10.f25347b;
                                    v02 = F05.v0(str15, str22);
                                    if (v02 == null) {
                                    }
                                    F0().w0(a10);
                                    b().h();
                                    O0();
                                    AbstractC1287s.m(d10);
                                    AbstractC1287s.m(n7Var);
                                    String str23 = d10.f25346a;
                                    AbstractC1287s.g(str23);
                                    str8 = n7Var.f26197a;
                                    AbstractC1287s.a(str23.equals(str8));
                                    C2216d3 h02 = C2225e3.h0();
                                    boolean z11 = true;
                                    h02.a0(1);
                                    h02.A("android");
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    str9 = n7Var.f26200d;
                                    if (!TextUtils.isEmpty(str9)) {
                                    }
                                    str10 = n7Var.f26199c;
                                    if (!TextUtils.isEmpty(str10)) {
                                    }
                                    str11 = n7Var.f26217u;
                                    if (!TextUtils.isEmpty(str11)) {
                                    }
                                    j12 = n7Var.f26206j;
                                    if (j12 != -2147483648L) {
                                    }
                                    h02.N(n7Var.f26201e);
                                    str12 = n7Var.f26198b;
                                    if (!TextUtils.isEmpty(str12)) {
                                    }
                                    C2633a4 s11 = g((String) AbstractC1287s.m(str8)).s(C2633a4.f(n7Var.f26215s, 100));
                                    h02.M0(s11.k());
                                    C2301m7.a();
                                    if (!B0().H(str8, AbstractC2671f2.f25968Q0)) {
                                    }
                                    j13 = n7Var.f26202f;
                                    if (j13 != 0) {
                                    }
                                    h02.K0(n7Var.f26213q);
                                    g7 K02 = K0();
                                    com.google.android.gms.internal.measurement.T3 c10 = com.google.android.gms.internal.measurement.T3.c(K02.f25405b.f25834l.e().getContentResolver(), AbstractC2217d4.a("com.google.android.gms.measurement"), RunnableC2639b2.f25780a);
                                    if (c10 != null) {
                                    }
                                    if (emptyMap != null) {
                                        arrayList = new ArrayList();
                                        int intValue2 = ((Integer) AbstractC2671f2.f26006g0.b(null)).intValue();
                                        while (r6.hasNext()) {
                                        }
                                        if (arrayList.isEmpty()) {
                                        }
                                        if (arrayList != null) {
                                        }
                                        if (B0().H(null, AbstractC2671f2.f25992b1)) {
                                        }
                                        str13 = n7Var.f26197a;
                                        s10 = g((String) AbstractC1287s.m(str13)).s(C2633a4.f(n7Var.f26215s, 100));
                                        z32 = Z3.AD_STORAGE;
                                        if (s10.o(z32)) {
                                        }
                                        c2633a4 = s10;
                                        z33 = z32;
                                        str14 = "_r";
                                        c2760q3 = this.f25834l;
                                        c2760q3.K().l();
                                        h02.D(Build.MODEL);
                                        c2760q3.K().l();
                                        h02.C(Build.VERSION.RELEASE);
                                        h02.H((int) c2760q3.K().o());
                                        h02.G(c2760q3.K().p());
                                        h02.R0(n7Var.f26219w);
                                        if (c2760q3.g()) {
                                        }
                                        J02 = F0().J0(str13);
                                        if (J02 == null) {
                                        }
                                        if (c2633a4.o(Z3.ANALYTICS_STORAGE)) {
                                        }
                                        if (!TextUtils.isEmpty(J02.x0())) {
                                        }
                                        C02 = F0().C0(str13);
                                        while (i13 < C02.size()) {
                                        }
                                        F02 = F0();
                                        c2225e3 = (C2225e3) h02.v();
                                        F02.h();
                                        F02.j();
                                        AbstractC1287s.m(c2225e3);
                                        AbstractC1287s.g(c2225e3.C());
                                        byte[] c11 = c2225e3.c();
                                        long T10 = F02.f25405b.K0().T(c11);
                                        ContentValues contentValues2 = new ContentValues();
                                        String str24 = str;
                                        contentValues2.put(str24, c2225e3.C());
                                        contentValues2.put("metadata_fingerprint", Long.valueOf(T10));
                                        contentValues2.put("metadata", c11);
                                        F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                        F03 = F0();
                                        f10 = new F(d10.f25351f);
                                        while (true) {
                                            if (f10.hasNext()) {
                                            }
                                        }
                                        F03.h();
                                        F03.j();
                                        AbstractC1287s.m(d10);
                                        String str25 = d10.f25346a;
                                        AbstractC1287s.g(str25);
                                        byte[] c12 = F03.f25405b.K0().J(d10).c();
                                        contentValues = new ContentValues();
                                        contentValues.put(str24, str25);
                                        contentValues.put("name", d10.f25347b);
                                        contentValues.put("timestamp", Long.valueOf(d10.f25349d));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(T10));
                                        contentValues.put("data", c12);
                                        contentValues.put("realtime", Integer.valueOf(i14));
                                        if (F03.u0().insert(str7, null, contentValues) == -1) {
                                        }
                                        F0().s0();
                                        F0().t0();
                                        R();
                                        a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + HVFrameRecorder.TIMEOUT_USEC) / 1000000));
                                        return;
                                    }
                                    arrayList = null;
                                    if (arrayList != null) {
                                    }
                                    if (B0().H(null, AbstractC2671f2.f25992b1)) {
                                    }
                                    str13 = n7Var.f26197a;
                                    s10 = g((String) AbstractC1287s.m(str13)).s(C2633a4.f(n7Var.f26215s, 100));
                                    z32 = Z3.AD_STORAGE;
                                    if (s10.o(z32)) {
                                    }
                                    c2633a4 = s10;
                                    z33 = z32;
                                    str14 = "_r";
                                    c2760q3 = this.f25834l;
                                    c2760q3.K().l();
                                    h02.D(Build.MODEL);
                                    c2760q3.K().l();
                                    h02.C(Build.VERSION.RELEASE);
                                    h02.H((int) c2760q3.K().o());
                                    h02.G(c2760q3.K().p());
                                    h02.R0(n7Var.f26219w);
                                    if (c2760q3.g()) {
                                    }
                                    J02 = F0().J0(str13);
                                    if (J02 == null) {
                                    }
                                    if (c2633a4.o(Z3.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(J02.x0())) {
                                    }
                                    C02 = F0().C0(str13);
                                    while (i13 < C02.size()) {
                                    }
                                    F02 = F0();
                                    c2225e3 = (C2225e3) h02.v();
                                    F02.h();
                                    F02.j();
                                    AbstractC1287s.m(c2225e3);
                                    AbstractC1287s.g(c2225e3.C());
                                    byte[] c112 = c2225e3.c();
                                    long T102 = F02.f25405b.K0().T(c112);
                                    ContentValues contentValues22 = new ContentValues();
                                    String str242 = str;
                                    contentValues22.put(str242, c2225e3.C());
                                    contentValues22.put("metadata_fingerprint", Long.valueOf(T102));
                                    contentValues22.put("metadata", c112);
                                    F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    F03 = F0();
                                    f10 = new F(d10.f25351f);
                                    while (true) {
                                        if (f10.hasNext()) {
                                        }
                                    }
                                    F03.h();
                                    F03.j();
                                    AbstractC1287s.m(d10);
                                    String str252 = d10.f25346a;
                                    AbstractC1287s.g(str252);
                                    byte[] c122 = F03.f25405b.K0().J(d10).c();
                                    contentValues = new ContentValues();
                                    contentValues.put(str242, str252);
                                    contentValues.put("name", d10.f25347b);
                                    contentValues.put("timestamp", Long.valueOf(d10.f25349d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(T102));
                                    contentValues.put("data", c122);
                                    contentValues.put("realtime", Integer.valueOf(i14));
                                    if (F03.u0().insert(str7, null, contentValues) == -1) {
                                    }
                                    F0().s0();
                                    F0().t0();
                                    R();
                                    a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + HVFrameRecorder.TIMEOUT_USEC) / 1000000));
                                    return;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                str6 = str4;
                            }
                            if (j11 > 0) {
                                a().r().c("Data lost. Too many events stored on disk, deleted. appId", C2.x(str15), Long.valueOf(j11));
                            }
                            C2760q3 c2760q322 = this.f25834l;
                            str7 = str6;
                            d10 = new D(c2760q322, i15.f25444c, str15, i15.f25442a, i15.f25445d, 0L, Z02);
                            C2803w F052 = F0();
                            String str222 = d10.f25347b;
                            v02 = F052.v0(str15, str222);
                            if (v02 == null) {
                                d10 = d10.a(c2760q322, v02.f25370f);
                                a10 = v02.a(d10.f25349d);
                            } else if (F0().E(str15) < B0().z(str15) || !r02) {
                                a10 = new E(str15, str222, 0L, 0L, 0L, d10.f25349d, 0L, null, null, null, null);
                            } else {
                                a().o().d("Too many event names used, ignoring event. appId, name, supported count", C2.x(str15), c2760q322.D().a(str222), Integer.valueOf(B0().z(str15)));
                                N0().B(this.f25822J, str15, 8, null, null, 0);
                            }
                            F0().w0(a10);
                            b().h();
                            O0();
                            AbstractC1287s.m(d10);
                            AbstractC1287s.m(n7Var);
                            String str232 = d10.f25346a;
                            AbstractC1287s.g(str232);
                            str8 = n7Var.f26197a;
                            AbstractC1287s.a(str232.equals(str8));
                            C2216d3 h022 = C2225e3.h0();
                            boolean z112 = true;
                            h022.a0(1);
                            h022.A("android");
                            if (!TextUtils.isEmpty(str8)) {
                                h022.L(str8);
                            }
                            str9 = n7Var.f26200d;
                            if (!TextUtils.isEmpty(str9)) {
                                h022.J(str9);
                            }
                            str10 = n7Var.f26199c;
                            if (!TextUtils.isEmpty(str10)) {
                                h022.M(str10);
                            }
                            str11 = n7Var.f26217u;
                            if (!TextUtils.isEmpty(str11)) {
                                h022.N0(str11);
                            }
                            j12 = n7Var.f26206j;
                            if (j12 != -2147483648L) {
                                h022.C0((int) j12);
                            }
                            h022.N(n7Var.f26201e);
                            str12 = n7Var.f26198b;
                            if (!TextUtils.isEmpty(str12)) {
                                h022.v0(str12);
                            }
                            C2633a4 s112 = g((String) AbstractC1287s.m(str8)).s(C2633a4.f(n7Var.f26215s, 100));
                            h022.M0(s112.k());
                            C2301m7.a();
                            if (!B0().H(str8, AbstractC2671f2.f25968Q0) && N0().L(str8)) {
                                h022.i0(n7Var.f26222z);
                                long j16 = n7Var.f26192A;
                                if (!s112.o(Z3.AD_STORAGE) && j16 != 0) {
                                    j16 = (j16 & (-2)) | 32;
                                }
                                h022.S0(j16 == 1);
                                if (j16 != 0) {
                                    com.google.android.gms.internal.measurement.D2 J10 = com.google.android.gms.internal.measurement.E2.J();
                                    if ((j16 & 1) == 0) {
                                        z112 = false;
                                    }
                                    J10.y(z112);
                                    J10.z((j16 & 2) != 0);
                                    J10.A((j16 & 4) != 0);
                                    J10.B((j16 & 8) != 0);
                                    J10.C((j16 & 16) != 0);
                                    J10.D((j16 & 32) != 0);
                                    J10.E((64 & j16) != 0);
                                    h022.j0((com.google.android.gms.internal.measurement.E2) J10.v());
                                }
                            }
                            j13 = n7Var.f26202f;
                            if (j13 != 0) {
                                h022.Y(j13);
                            }
                            h022.K0(n7Var.f26213q);
                            g7 K022 = K0();
                            com.google.android.gms.internal.measurement.T3 c102 = com.google.android.gms.internal.measurement.T3.c(K022.f25405b.f25834l.e().getContentResolver(), AbstractC2217d4.a("com.google.android.gms.measurement"), RunnableC2639b2.f25780a);
                            emptyMap = c102 != null ? Collections.emptyMap() : c102.d();
                            try {
                                if (emptyMap != null && !emptyMap.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int intValue22 = ((Integer) AbstractC2671f2.f26006g0.b(null)).intValue();
                                    for (Map.Entry entry : emptyMap.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue22) {
                                                        K022.f25694a.a().r().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e12) {
                                                K022.f25694a.a().r().b("Experiment ID NumberFormatException", e12);
                                            }
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                    if (arrayList != null) {
                                        h022.J0(arrayList);
                                    }
                                    if (B0().H(null, AbstractC2671f2.f25992b1)) {
                                        h022.q0(BuildConfig.FLAVOR);
                                    }
                                    str13 = n7Var.f26197a;
                                    s10 = g((String) AbstractC1287s.m(str13)).s(C2633a4.f(n7Var.f26215s, 100));
                                    z32 = Z3.AD_STORAGE;
                                    if (s10.o(z32) && n7Var.f26210n) {
                                        m10 = this.f25831i.m(str13, s10);
                                        if (!TextUtils.isEmpty((CharSequence) m10.first)) {
                                            h022.Q((String) m10.first);
                                            Object obj3 = m10.second;
                                            if (obj3 != null) {
                                                h022.T(((Boolean) obj3).booleanValue());
                                            }
                                            String str26 = str2;
                                            if (!d10.f25347b.equals(str26) && !((String) m10.first).equals("00000000-0000-0000-0000-000000000000") && (J03 = F0().J0(str13)) != null && J03.d0()) {
                                                w(str13, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                Long f02 = J03.f0();
                                                if (f02 != null) {
                                                    long longValue2 = f02.longValue();
                                                    c2633a4 = s10;
                                                    z33 = z32;
                                                    bundle2.putLong("_pfo", Math.max(0L, longValue2));
                                                } else {
                                                    c2633a4 = s10;
                                                    z33 = z32;
                                                }
                                                Long h03 = J03.h0();
                                                if (h03 != null) {
                                                    bundle2.putLong("_uwa", h03.longValue());
                                                }
                                                str14 = "_r";
                                                bundle2.putLong(str14, 1L);
                                                this.f25822J.a(str13, str26, bundle2);
                                                c2760q3 = this.f25834l;
                                                c2760q3.K().l();
                                                h022.D(Build.MODEL);
                                                c2760q3.K().l();
                                                h022.C(Build.VERSION.RELEASE);
                                                h022.H((int) c2760q3.K().o());
                                                h022.G(c2760q3.K().p());
                                                h022.R0(n7Var.f26219w);
                                                if (c2760q3.g()) {
                                                    h022.K();
                                                    if (!TextUtils.isEmpty(null)) {
                                                        h022.F0(null);
                                                    }
                                                }
                                                J02 = F0().J0(str13);
                                                if (J02 == null) {
                                                    J02 = new I2(c2760q3, str13);
                                                    J02.q0(p(c2633a4));
                                                    J02.y0(n7Var.f26207k);
                                                    J02.s0(n7Var.f26198b);
                                                    if (c2633a4.o(z33)) {
                                                        J02.w0(this.f25831i.o(str13, n7Var.f26210n));
                                                    }
                                                    J02.f(0L);
                                                    J02.A0(0L);
                                                    J02.C0(0L);
                                                    J02.E0(n7Var.f26199c);
                                                    J02.G0(n7Var.f26206j);
                                                    J02.I0(n7Var.f26200d);
                                                    J02.K0(n7Var.f26201e);
                                                    J02.a(n7Var.f26202f);
                                                    J02.e(n7Var.f26204h);
                                                    J02.c(n7Var.f26213q);
                                                    i12 = 0;
                                                    F0().K0(J02, false, false);
                                                } else {
                                                    i12 = 0;
                                                }
                                                if (c2633a4.o(Z3.ANALYTICS_STORAGE) && !TextUtils.isEmpty(J02.p0())) {
                                                    h022.W((String) AbstractC1287s.m(J02.p0()));
                                                }
                                                if (!TextUtils.isEmpty(J02.x0())) {
                                                    h022.A0((String) AbstractC1287s.m(J02.x0()));
                                                }
                                                C02 = F0().C0(str13);
                                                for (i13 = i12; i13 < C02.size(); i13++) {
                                                    C2368u3 N10 = C2377v3.N();
                                                    N10.z(((j7) C02.get(i13)).f26136c);
                                                    N10.y(((j7) C02.get(i13)).f26137d);
                                                    K0().G(N10, ((j7) C02.get(i13)).f26138e);
                                                    h022.l1(N10);
                                                    if ("_sid".equals(((j7) C02.get(i13)).f26136c) && J02.Z() != 0 && K0().U(n7Var.f26217u) != J02.Z()) {
                                                        h022.O0();
                                                    }
                                                }
                                                F02 = F0();
                                                c2225e3 = (C2225e3) h022.v();
                                                F02.h();
                                                F02.j();
                                                AbstractC1287s.m(c2225e3);
                                                AbstractC1287s.g(c2225e3.C());
                                                byte[] c1122 = c2225e3.c();
                                                long T1022 = F02.f25405b.K0().T(c1122);
                                                ContentValues contentValues222 = new ContentValues();
                                                String str2422 = str;
                                                contentValues222.put(str2422, c2225e3.C());
                                                contentValues222.put("metadata_fingerprint", Long.valueOf(T1022));
                                                contentValues222.put("metadata", c1122);
                                                F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                                F03 = F0();
                                                f10 = new F(d10.f25351f);
                                                while (true) {
                                                    if (f10.hasNext()) {
                                                        if (str14.equals(f10.next())) {
                                                            break;
                                                        }
                                                    } else {
                                                        C2656d3 D03 = D0();
                                                        String str27 = d10.f25346a;
                                                        boolean E10 = D03.E(str27, d10.f25347b);
                                                        C2771s L02 = F0().L0(h(), str27, false, false, false, false, false, false, false);
                                                        if (!E10 || L02.f26320e >= B0().E(str27, AbstractC2671f2.f26029p)) {
                                                            i14 = 0;
                                                        }
                                                    }
                                                }
                                                F03.h();
                                                F03.j();
                                                AbstractC1287s.m(d10);
                                                String str2522 = d10.f25346a;
                                                AbstractC1287s.g(str2522);
                                                byte[] c1222 = F03.f25405b.K0().J(d10).c();
                                                contentValues = new ContentValues();
                                                contentValues.put(str2422, str2522);
                                                contentValues.put("name", d10.f25347b);
                                                contentValues.put("timestamp", Long.valueOf(d10.f25349d));
                                                contentValues.put("metadata_fingerprint", Long.valueOf(T1022));
                                                contentValues.put("data", c1222);
                                                contentValues.put("realtime", Integer.valueOf(i14));
                                                if (F03.u0().insert(str7, null, contentValues) == -1) {
                                                    F03.f25694a.a().o().b("Failed to insert raw event (got -1). appId", C2.x(str2522));
                                                } else {
                                                    this.f25837o = 0L;
                                                }
                                                F0().s0();
                                                F0().t0();
                                                R();
                                                a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + HVFrameRecorder.TIMEOUT_USEC) / 1000000));
                                                return;
                                            }
                                        }
                                    }
                                    c2633a4 = s10;
                                    z33 = z32;
                                    str14 = "_r";
                                    c2760q3 = this.f25834l;
                                    c2760q3.K().l();
                                    h022.D(Build.MODEL);
                                    c2760q3.K().l();
                                    h022.C(Build.VERSION.RELEASE);
                                    h022.H((int) c2760q3.K().o());
                                    h022.G(c2760q3.K().p());
                                    h022.R0(n7Var.f26219w);
                                    if (c2760q3.g()) {
                                    }
                                    J02 = F0().J0(str13);
                                    if (J02 == null) {
                                    }
                                    if (c2633a4.o(Z3.ANALYTICS_STORAGE)) {
                                        h022.W((String) AbstractC1287s.m(J02.p0()));
                                    }
                                    if (!TextUtils.isEmpty(J02.x0())) {
                                    }
                                    C02 = F0().C0(str13);
                                    while (i13 < C02.size()) {
                                    }
                                    F02 = F0();
                                    c2225e3 = (C2225e3) h022.v();
                                    F02.h();
                                    F02.j();
                                    AbstractC1287s.m(c2225e3);
                                    AbstractC1287s.g(c2225e3.C());
                                    byte[] c11222 = c2225e3.c();
                                    long T10222 = F02.f25405b.K0().T(c11222);
                                    ContentValues contentValues2222 = new ContentValues();
                                    String str24222 = str;
                                    contentValues2222.put(str24222, c2225e3.C());
                                    contentValues2222.put("metadata_fingerprint", Long.valueOf(T10222));
                                    contentValues2222.put("metadata", c11222);
                                    F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues2222, 4);
                                    F03 = F0();
                                    f10 = new F(d10.f25351f);
                                    while (true) {
                                        if (f10.hasNext()) {
                                        }
                                    }
                                    F03.h();
                                    F03.j();
                                    AbstractC1287s.m(d10);
                                    String str25222 = d10.f25346a;
                                    AbstractC1287s.g(str25222);
                                    byte[] c12222 = F03.f25405b.K0().J(d10).c();
                                    contentValues = new ContentValues();
                                    contentValues.put(str24222, str25222);
                                    contentValues.put("name", d10.f25347b);
                                    contentValues.put("timestamp", Long.valueOf(d10.f25349d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(T10222));
                                    contentValues.put("data", c12222);
                                    contentValues.put("realtime", Integer.valueOf(i14));
                                    if (F03.u0().insert(str7, null, contentValues) == -1) {
                                    }
                                    F0().s0();
                                    F0().t0();
                                    R();
                                    a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + HVFrameRecorder.TIMEOUT_USEC) / 1000000));
                                    return;
                                }
                                F02.u0().insertWithOnConflict("raw_events_metadata", null, contentValues2222, 4);
                                F03 = F0();
                                f10 = new F(d10.f25351f);
                                while (true) {
                                    if (f10.hasNext()) {
                                    }
                                }
                                F03.h();
                                F03.j();
                                AbstractC1287s.m(d10);
                                String str252222 = d10.f25346a;
                                AbstractC1287s.g(str252222);
                                byte[] c122222 = F03.f25405b.K0().J(d10).c();
                                contentValues = new ContentValues();
                                contentValues.put(str24222, str252222);
                                contentValues.put("name", d10.f25347b);
                                contentValues.put("timestamp", Long.valueOf(d10.f25349d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(T10222));
                                contentValues.put("data", c122222);
                                contentValues.put("realtime", Integer.valueOf(i14));
                                if (F03.u0().insert(str7, null, contentValues) == -1) {
                                }
                                F0().s0();
                                F0().t0();
                                R();
                                a().w().b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + HVFrameRecorder.TIMEOUT_USEC) / 1000000));
                                return;
                            } catch (SQLiteException e13) {
                                F02.f25694a.a().o().c("Error storing raw event metadata. appId", C2.x(c2225e3.C()), e13);
                                throw e13;
                            }
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            if (B0().H(null, AbstractC2671f2.f25992b1)) {
                            }
                            str13 = n7Var.f26197a;
                            s10 = g((String) AbstractC1287s.m(str13)).s(C2633a4.f(n7Var.f26215s, 100));
                            z32 = Z3.AD_STORAGE;
                            if (s10.o(z32)) {
                                m10 = this.f25831i.m(str13, s10);
                                if (!TextUtils.isEmpty((CharSequence) m10.first)) {
                                }
                            }
                            c2633a4 = s10;
                            z33 = z32;
                            str14 = "_r";
                            c2760q3 = this.f25834l;
                            c2760q3.K().l();
                            h022.D(Build.MODEL);
                            c2760q3.K().l();
                            h022.C(Build.VERSION.RELEASE);
                            h022.H((int) c2760q3.K().o());
                            h022.G(c2760q3.K().p());
                            h022.R0(n7Var.f26219w);
                            if (c2760q3.g()) {
                            }
                            J02 = F0().J0(str13);
                            if (J02 == null) {
                            }
                            if (c2633a4.o(Z3.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(J02.x0())) {
                            }
                            C02 = F0().C0(str13);
                            while (i13 < C02.size()) {
                            }
                            F02 = F0();
                            c2225e3 = (C2225e3) h022.v();
                            F02.h();
                            F02.j();
                            AbstractC1287s.m(c2225e3);
                            AbstractC1287s.g(c2225e3.C());
                            byte[] c112222 = c2225e3.c();
                            long T102222 = F02.f25405b.K0().T(c112222);
                            ContentValues contentValues22222 = new ContentValues();
                            String str242222 = str;
                            contentValues22222.put(str242222, c2225e3.C());
                            contentValues22222.put("metadata_fingerprint", Long.valueOf(T102222));
                            contentValues22222.put("metadata", c112222);
                        }
                        F0().t0();
                    }
                    z10 = true;
                }
                G g11 = b10.f25443b;
                String I10 = g11.I("currency");
                if (z10) {
                    double doubleValue = g11.F("value").doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        str = "app_id";
                        str2 = "_fx";
                        doubleValue = g11.u("value").longValue() * 1000000.0d;
                    } else {
                        str = "app_id";
                        str2 = "_fx";
                    }
                    if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                        a().r().c("Data lost. Currency value is too big. appId", C2.x(str15), Double.valueOf(doubleValue));
                        F0().s0();
                        F0().t0();
                    } else {
                        longValue = Math.round(doubleValue);
                        if ("refund".equals(str18)) {
                            longValue = -longValue;
                        }
                    }
                } else {
                    str = "app_id";
                    str2 = "_fx";
                    longValue = g11.u("value").longValue();
                }
                if (!TextUtils.isEmpty(I10)) {
                    String upperCase = I10.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(upperCase);
                        j7 B03 = F0().B0(str15, concat);
                        if (B03 != null) {
                            Object obj4 = B03.f26138e;
                            if (obj4 instanceof Long) {
                                str4 = "raw_events";
                                i11 = b10;
                                str3 = "value";
                                str5 = "_err";
                                j7Var = new j7(str15, b10.f25444c, concat, f().a(), Long.valueOf(((Long) obj4).longValue() + longValue));
                                j7Var2 = j7Var;
                                if (!F0().A0(j7Var2)) {
                                    a().o().d("Too many unique user properties are set. Ignoring user property. appId", C2.x(str15), this.f25834l.D().c(j7Var2.f26136c), j7Var2.f26138e);
                                    N0().B(this.f25822J, str15, 9, null, null, 0);
                                }
                                String str192 = i11.f25442a;
                                boolean r022 = l7.r0(str192);
                                boolean equals2 = str5.equals(str192);
                                N0();
                                g10 = i11.f25443b;
                                if (g10 != null) {
                                }
                                I i152 = i11;
                                C2771s M022 = F0().M0(h(), str15, j10 + 1, true, r022, false, equals2, false, false, false);
                                long j142 = M022.f26317b;
                                B0();
                                p10 = j142 - C2724m.p();
                                if (p10 <= 0) {
                                }
                                F0().t0();
                            }
                        }
                        str3 = "value";
                        str4 = "raw_events";
                        i11 = b10;
                        str5 = "_err";
                        C2803w F06 = F0();
                        int E11 = B0().E(str15, AbstractC2671f2.f25975U) - 1;
                        AbstractC1287s.g(str15);
                        F06.h();
                        F06.j();
                        F06.u0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str15, str15, String.valueOf(E11)});
                        j7Var = new j7(str15, i11.f25444c, concat, f().a(), Long.valueOf(longValue));
                        j7Var2 = j7Var;
                        if (!F0().A0(j7Var2)) {
                        }
                        String str1922 = i11.f25442a;
                        boolean r0222 = l7.r0(str1922);
                        boolean equals22 = str5.equals(str1922);
                        N0();
                        g10 = i11.f25443b;
                        if (g10 != null) {
                        }
                        I i1522 = i11;
                        C2771s M0222 = F0().M0(h(), str15, j10 + 1, true, r0222, false, equals22, false, false, false);
                        long j1422 = M0222.f26317b;
                        B0();
                        p10 = j1422 - C2724m.p();
                        if (p10 <= 0) {
                        }
                        F0().t0();
                    }
                }
                str3 = "value";
                str4 = "raw_events";
                i11 = b10;
                str5 = "_err";
                String str19222 = i11.f25442a;
                boolean r02222 = l7.r0(str19222);
                boolean equals222 = str5.equals(str19222);
                N0();
                g10 = i11.f25443b;
                if (g10 != null) {
                }
                I i15222 = i11;
                C2771s M02222 = F0().M0(h(), str15, j10 + 1, true, r02222, false, equals222, false, false, false);
                long j14222 = M02222.f26317b;
                B0();
                p10 = j14222 - C2724m.p();
                if (p10 <= 0) {
                }
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final void m0(C2692i c2692i, n7 n7Var) {
        AbstractC1287s.m(c2692i);
        AbstractC1287s.g(c2692i.f26102a);
        AbstractC1287s.m(c2692i.f26104c);
        AbstractC1287s.g(c2692i.f26104c.f26096b);
        b().h();
        O0();
        if (X(n7Var)) {
            if (!n7Var.f26204h) {
                o0(n7Var);
                return;
            }
            F0().r0();
            try {
                o0(n7Var);
                String str = (String) AbstractC1287s.m(c2692i.f26102a);
                C2692i F02 = F0().F0(str, c2692i.f26104c.f26096b);
                if (F02 != null) {
                    a().v().c("Removing conditional user property", c2692i.f26102a, this.f25834l.D().c(c2692i.f26104c.f26096b));
                    F0().G0(str, c2692i.f26104c.f26096b);
                    if (F02.f26106e) {
                        F0().z0(str, c2692i.f26104c.f26096b);
                    }
                    I i10 = c2692i.f26112k;
                    if (i10 != null) {
                        G g10 = i10.f25443b;
                        m((I) AbstractC1287s.m(N0().R(str, ((I) AbstractC1287s.m(i10)).f25442a, g10 != null ? g10.Z0() : null, F02.f26103b, i10.f25445d, true, true)), n7Var);
                    }
                } else {
                    a().r().c("Conditional user property doesn't exist", C2.x(c2692i.f26102a), this.f25834l.D().c(c2692i.f26104c.f26096b));
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th) {
                F0().t0();
                throw th;
            }
        }
    }

    final void n(I2 i22, C2216d3 c2216d3) {
        C2377v3 c2377v3;
        b().h();
        O0();
        C2740o d10 = C2740o.d(c2216d3.b0());
        String o02 = i22.o0();
        b().h();
        O0();
        C2633a4 g10 = g(o02);
        X3 x32 = X3.UNINITIALIZED;
        int ordinal = g10.p().ordinal();
        if (ordinal == 1) {
            d10.c(Z3.AD_STORAGE, EnumC2732n.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            d10.b(Z3.AD_STORAGE, g10.b());
        } else {
            d10.c(Z3.AD_STORAGE, EnumC2732n.FAILSAFE);
        }
        int ordinal2 = g10.q().ordinal();
        if (ordinal2 == 1) {
            d10.c(Z3.ANALYTICS_STORAGE, EnumC2732n.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            d10.b(Z3.ANALYTICS_STORAGE, g10.b());
        } else {
            d10.c(Z3.ANALYTICS_STORAGE, EnumC2732n.FAILSAFE);
        }
        String o03 = i22.o0();
        b().h();
        O0();
        A T02 = T0(o03, R0(o03), g(o03), d10);
        c2216d3.e0(((Boolean) AbstractC1287s.m(T02.j())).booleanValue());
        if (!TextUtils.isEmpty(T02.k())) {
            c2216d3.g0(T02.k());
        }
        b().h();
        O0();
        Iterator it = c2216d3.e1().iterator();
        while (true) {
            if (it.hasNext()) {
                c2377v3 = (C2377v3) it.next();
                if ("_npa".equals(c2377v3.E())) {
                    break;
                }
            } else {
                c2377v3 = null;
                break;
            }
        }
        if (c2377v3 != null) {
            Z3 z32 = Z3.AD_PERSONALIZATION;
            if (d10.a(z32) == EnumC2732n.UNSET) {
                j7 B02 = F0().B0(i22.o0(), "_npa");
                if (B02 != null) {
                    String str = B02.f26135b;
                    if ("tcf".equals(str)) {
                        d10.c(z32, EnumC2732n.TCF);
                    } else if ("app".equals(str)) {
                        d10.c(z32, EnumC2732n.API);
                    } else {
                        d10.c(z32, EnumC2732n.MANIFEST);
                    }
                } else {
                    Boolean R10 = i22.R();
                    if (R10 == null || ((R10.booleanValue() && c2377v3.I() != 1) || !(R10.booleanValue() || c2377v3.I() == 0))) {
                        d10.c(z32, EnumC2732n.API);
                    } else {
                        d10.c(z32, EnumC2732n.MANIFEST);
                    }
                }
            }
        } else {
            int I10 = I(i22.o0(), d10);
            C2368u3 N10 = C2377v3.N();
            N10.z("_npa");
            N10.y(f().a());
            N10.C(I10);
            c2216d3.k1((C2377v3) N10.v());
            a().w().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(I10));
        }
        c2216d3.c0(d10.toString());
        boolean S10 = this.f25823a.S(i22.o0());
        List T03 = c2216d3.T0();
        int i10 = 0;
        for (int i11 = 0; i11 < T03.size(); i11++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.S2) T03.get(i11)).F())) {
                com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) ((com.google.android.gms.internal.measurement.S2) T03.get(i11)).p();
                List y10 = r22.y();
                int i12 = 0;
                while (true) {
                    if (i12 >= y10.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.W2) y10.get(i12)).D())) {
                        String F10 = ((com.google.android.gms.internal.measurement.W2) y10.get(i12)).F();
                        if (S10 && F10.length() > 4) {
                            char[] charArray = F10.toCharArray();
                            int i13 = 1;
                            while (true) {
                                if (i13 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13)) {
                                    i10 = i13;
                                    break;
                                }
                                i13++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i10);
                            F10 = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
                        O10.z("_tcfd");
                        O10.B(F10);
                        r22.C(i12, O10);
                    } else {
                        i12++;
                    }
                }
                c2216d3.X0(i11, r22);
                return;
            }
        }
    }

    final void n0(n7 n7Var, long j10) {
        I2 J02 = F0().J0((String) AbstractC1287s.m(n7Var.f26197a));
        if (J02 != null && N0().p(n7Var.f26198b, J02.r0())) {
            a().r().b("New GMP App Id passed in. Removing cached database data. appId", C2.x(J02.o0()));
            C2803w F02 = F0();
            String o02 = J02.o0();
            F02.j();
            F02.h();
            AbstractC1287s.g(o02);
            try {
                SQLiteDatabase u02 = F02.u0();
                String[] strArr = {o02};
                int delete = u02.delete("events", "app_id=?", strArr) + u02.delete("user_attributes", "app_id=?", strArr) + u02.delete("conditional_properties", "app_id=?", strArr) + u02.delete("apps", "app_id=?", strArr) + u02.delete("raw_events", "app_id=?", strArr) + u02.delete("raw_events_metadata", "app_id=?", strArr) + u02.delete("event_filters", "app_id=?", strArr) + u02.delete("property_filters", "app_id=?", strArr) + u02.delete("audience_filter_values", "app_id=?", strArr) + u02.delete("consent_settings", "app_id=?", strArr) + u02.delete("default_event_params", "app_id=?", strArr) + u02.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.K6.a();
                C2760q3 c2760q3 = F02.f25694a;
                if (c2760q3.w().H(null, AbstractC2671f2.f26013i1)) {
                    delete += u02.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (delete > 0) {
                    c2760q3.a().w().c("Deleted application data. app, records", o02, Integer.valueOf(delete));
                }
            } catch (SQLiteException e10) {
                F02.f25694a.a().o().c("Error deleting application data. appId, error", C2.x(o02), e10);
            }
            J02 = null;
        }
        if (J02 != null) {
            boolean z10 = (J02.F0() == -2147483648L || J02.F0() == n7Var.f26206j) ? false : true;
            String D02 = J02.D0();
            if (z10 || ((J02.F0() != -2147483648L || D02 == null || D02.equals(n7Var.f26199c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", D02);
                I i10 = new I("_au", new G(bundle), "auto", j10);
                if (B0().H(null, AbstractC2671f2.f25998d1)) {
                    j(i10, n7Var);
                } else {
                    k(i10, n7Var);
                }
            }
        }
    }

    final void o(I2 i22, C2216d3 c2216d3) {
        b().h();
        O0();
        C2385w2 c02 = com.google.android.gms.internal.measurement.A2.c0();
        byte[] K10 = i22.K();
        if (K10 != null) {
            try {
                c02 = (C2385w2) g7.W(c02, K10);
            } catch (C2326p5 unused) {
                a().r().b("Failed to parse locally stored ad campaign info. appId", C2.x(i22.o0()));
            }
        }
        for (com.google.android.gms.internal.measurement.S2 s22 : c2216d3.T0()) {
            if (s22.F().equals("_cmp")) {
                String str = (String) g7.v(s22, "gclid", BuildConfig.FLAVOR);
                String str2 = (String) g7.v(s22, "gbraid", BuildConfig.FLAVOR);
                String str3 = (String) g7.v(s22, "gad_source", BuildConfig.FLAVOR);
                String[] split = ((String) AbstractC2671f2.f26010h1.b(null)).split(",");
                K0();
                if (!g7.s(s22, split).isEmpty()) {
                    long longValue = ((Long) g7.v(s22, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = s22.H();
                    }
                    if ("referrer API v2".equals(g7.u(s22, "_cis"))) {
                        if (longValue > c02.O()) {
                            if (str.isEmpty()) {
                                c02.J();
                            } else {
                                c02.H(str);
                            }
                            if (str2.isEmpty()) {
                                c02.L();
                            } else {
                                c02.K(str2);
                            }
                            if (str3.isEmpty()) {
                                c02.N();
                            } else {
                                c02.M(str3);
                            }
                            c02.P(longValue);
                            c02.S();
                            c02.T(J(s22));
                        }
                    } else if (longValue > c02.E()) {
                        if (str.isEmpty()) {
                            c02.z();
                        } else {
                            c02.y(str);
                        }
                        if (str2.isEmpty()) {
                            c02.B();
                        } else {
                            c02.A(str2);
                        }
                        if (str3.isEmpty()) {
                            c02.D();
                        } else {
                            c02.C(str3);
                        }
                        c02.G(longValue);
                        c02.Q();
                        c02.R(J(s22));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.A2) c02.v()).equals(com.google.android.gms.internal.measurement.A2.d0())) {
            c2216d3.n0((com.google.android.gms.internal.measurement.A2) c02.v());
        }
        i22.J(((com.google.android.gms.internal.measurement.A2) c02.v()).c());
        if (i22.A()) {
            F0().K0(i22, false, false);
        }
        if (B0().H(null, AbstractC2671f2.f26007g1)) {
            F0().z0(i22.o0(), "_lgclid");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01df, code lost:
    
        if (r11 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final I2 o0(n7 n7Var) {
        boolean z10;
        String str;
        long j10;
        String str2;
        String str3;
        String str4;
        b().h();
        O0();
        AbstractC1287s.m(n7Var);
        String str5 = n7Var.f26197a;
        AbstractC1287s.g(str5);
        String str6 = n7Var.f26216t;
        byte[] bArr = null;
        if (!str6.isEmpty()) {
            this.f25816D.put(str5, new Y6(this, str6, bArr));
        }
        I2 J02 = F0().J0(str5);
        C2633a4 s10 = g(str5).s(C2633a4.f(n7Var.f26215s, 100));
        Z3 z32 = Z3.AD_STORAGE;
        String o10 = s10.o(z32) ? this.f25831i.o(str5, n7Var.f26210n) : BuildConfig.FLAVOR;
        boolean z11 = true;
        if (J02 == null) {
            I2 i22 = new I2(this.f25834l, str5);
            if (s10.o(Z3.ANALYTICS_STORAGE)) {
                i22.q0(p(s10));
            }
            if (s10.o(z32)) {
                i22.w0(o10);
            }
            J02 = i22;
        } else if (s10.o(z32) && o10 != null && !o10.equals(J02.v0())) {
            boolean isEmpty = TextUtils.isEmpty(J02.v0());
            J02.w0(o10);
            if (n7Var.f26210n && !"00000000-0000-0000-0000-000000000000".equals(this.f25831i.m(str5, s10).first) && !isEmpty) {
                if (s10.o(Z3.ANALYTICS_STORAGE)) {
                    J02.q0(p(s10));
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (F0().B0(str5, "_id") != null && F0().B0(str5, "_lair") == null) {
                    F0().A0(new j7(str5, "auto", "_lair", f().a(), 1L));
                }
                J02.s0(n7Var.f26198b);
                str = n7Var.f26207k;
                if (!TextUtils.isEmpty(str)) {
                    J02.y0(str);
                }
                j10 = n7Var.f26201e;
                if (j10 != 0) {
                    J02.K0(j10);
                }
                str2 = n7Var.f26199c;
                if (!TextUtils.isEmpty(str2)) {
                    J02.E0(str2);
                }
                J02.G0(n7Var.f26206j);
                str3 = n7Var.f26200d;
                if (str3 != null) {
                    J02.I0(str3);
                }
                J02.a(n7Var.f26202f);
                J02.e(n7Var.f26204h);
                str4 = n7Var.f26203g;
                if (!TextUtils.isEmpty(str4)) {
                    J02.O(str4);
                }
                J02.Q(n7Var.f26210n);
                J02.S(n7Var.f26212p);
                J02.c(n7Var.f26213q);
                J02.u0(n7Var.f26217u);
                com.google.android.gms.internal.measurement.N6.a();
                if (B0().H(null, AbstractC2671f2.f25960M0)) {
                    com.google.android.gms.internal.measurement.N6.a();
                    if (B0().H(null, AbstractC2671f2.f25958L0)) {
                        J02.U(null);
                    }
                } else {
                    J02.U(n7Var.f26214r);
                }
                J02.W(n7Var.f26218v);
                J02.m0(n7Var.f26193B);
                C2301m7.a();
                if (B0().H(null, AbstractC2671f2.f25968Q0)) {
                    J02.c0(n7Var.f26222z);
                }
                J02.Y(n7Var.f26219w);
                J02.H(n7Var.f26194C);
                J02.L(n7Var.f26196E);
                if (!J02.A()) {
                    z11 = z10;
                }
                F0().K0(J02, z11, false);
                return J02;
            }
            if (TextUtils.isEmpty(J02.p0()) && s10.o(Z3.ANALYTICS_STORAGE)) {
                J02.q0(p(s10));
            }
        } else if (TextUtils.isEmpty(J02.p0()) && s10.o(Z3.ANALYTICS_STORAGE)) {
            J02.q0(p(s10));
        }
        z10 = false;
        J02.s0(n7Var.f26198b);
        str = n7Var.f26207k;
        if (!TextUtils.isEmpty(str)) {
        }
        j10 = n7Var.f26201e;
        if (j10 != 0) {
        }
        str2 = n7Var.f26199c;
        if (!TextUtils.isEmpty(str2)) {
        }
        J02.G0(n7Var.f26206j);
        str3 = n7Var.f26200d;
        if (str3 != null) {
        }
        J02.a(n7Var.f26202f);
        J02.e(n7Var.f26204h);
        str4 = n7Var.f26203g;
        if (!TextUtils.isEmpty(str4)) {
        }
        J02.Q(n7Var.f26210n);
        J02.S(n7Var.f26212p);
        J02.c(n7Var.f26213q);
        J02.u0(n7Var.f26217u);
        com.google.android.gms.internal.measurement.N6.a();
        if (B0().H(null, AbstractC2671f2.f25960M0)) {
        }
        J02.W(n7Var.f26218v);
        J02.m0(n7Var.f26193B);
        C2301m7.a();
        if (B0().H(null, AbstractC2671f2.f25968Q0)) {
        }
        J02.Y(n7Var.f26219w);
        J02.H(n7Var.f26194C);
        J02.L(n7Var.f26196E);
        if (!J02.A()) {
        }
        F0().K0(J02, z11, false);
        return J02;
    }

    final String p(C2633a4 c2633a4) {
        if (!c2633a4.o(Z3.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        N0().q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String p0(n7 n7Var) {
        try {
            return (String) b().r(new T6(this, n7Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            a().o().c("Failed to get app instance id. appId", C2.x(n7Var.f26197a), e10);
            return null;
        }
    }

    final void q(List list) {
        AbstractC1287s.a(!list.isEmpty());
        if (this.f25847y != null) {
            a().o().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f25847y = new ArrayList(list);
        }
    }

    final List q0(n7 n7Var, Bundle bundle) {
        b().h();
        C2301m7.a();
        C2724m B02 = B0();
        String str = n7Var.f26197a;
        if (!B02.H(str, AbstractC2671f2.f25968Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().o().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C2803w F02 = F0();
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        AbstractC1287s.g(str);
                        F02.h();
                        F02.j();
                        try {
                            int delete = F02.u0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            A2 w10 = F02.f25694a.a().w();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(delete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            w10.d(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            F02.f25694a.a().o().c("Error pruning trigger URIs. appId", C2.x(str), e10);
                        }
                    }
                }
            }
        }
        C2803w F03 = F0();
        String str2 = n7Var.f26197a;
        AbstractC1287s.g(str2);
        F03.h();
        F03.j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = F03.u0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = BuildConfig.FLAVOR;
                        }
                        arrayList.add(new B6(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e11) {
                F03.f25694a.a().o().c("Error querying trigger uris. appId", C2.x(str2), e11);
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.b7] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void r() {
        C2803w F02;
        long n10;
        SQLiteException e10;
        I2 J02;
        b().h();
        O0();
        this.f25844v = true;
        try {
            C2760q3 c2760q3 = this.f25834l;
            c2760q3.c();
            Boolean x10 = c2760q3.J().x();
            if (x10 == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (x10.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f25837o > 0) {
                R();
            } else {
                b().h();
                if (this.f25847y != null) {
                    a().w().a("Uploading requested multiple times");
                } else if (E0().m()) {
                    ?? a10 = f().a();
                    Cursor cursor = null;
                    r7 = null;
                    Cursor cursor2 = null;
                    r7 = null;
                    r7 = null;
                    String str = null;
                    int E10 = B0().E(null, AbstractC2671f2.f26015j0);
                    B0();
                    long n11 = a10 - C2724m.n();
                    for (int i10 = 0; i10 < E10 && M(null, n11); i10++) {
                    }
                    C2301m7.a();
                    b().h();
                    v0();
                    long a11 = this.f25831i.f26076h.a();
                    if (a11 != 0) {
                        a().v().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a10 - a11)));
                    }
                    String r10 = F0().r();
                    long j10 = -1;
                    if (TextUtils.isEmpty(r10)) {
                        try {
                            this.f25813A = -1L;
                            F02 = F0();
                            B0();
                            n10 = a10 - C2724m.n();
                            F02.h();
                            F02.j();
                        } catch (Throwable th) {
                            th = th;
                            cursor = a10;
                        }
                        try {
                            a10 = F02.u0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(n10)});
                            try {
                                if (a10.moveToFirst()) {
                                    str = a10.getString(0);
                                } else {
                                    F02.f25694a.a().w().a("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e11) {
                                e10 = e11;
                                F02.f25694a.a().o().b("Error selecting expired configs", e10);
                            }
                        } catch (SQLiteException e12) {
                            e10 = e12;
                            a10 = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        a10.close();
                        if (!TextUtils.isEmpty(str) && (J02 = F0().J0(str)) != null) {
                            B(J02);
                        }
                    } else {
                        if (this.f25813A == -1) {
                            C2803w F03 = F0();
                            try {
                                try {
                                    cursor2 = F03.u0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursor2.moveToFirst()) {
                                        j10 = cursor2.getLong(0);
                                    }
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } catch (SQLiteException e13) {
                                F03.f25694a.a().o().b("Error querying raw events", e13);
                            }
                            cursor2.close();
                            this.f25813A = j10;
                        }
                        s(r10, a10);
                    }
                } else {
                    a().w().a("Network not connected, ignoring upload request");
                    R();
                }
            }
            this.f25844v = false;
            S();
        } catch (Throwable th3) {
            this.f25844v = false;
            S();
            throw th3;
        }
    }

    final void r0(String str, C2676g c2676g) {
        b().h();
        O0();
        C2803w F02 = F0();
        long j10 = c2676g.f26062a;
        e7 n10 = F02.n(j10);
        if (n10 == null) {
            a().r().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j10));
            return;
        }
        String e10 = n10.e();
        if (c2676g.f26063b != EnumC2706j5.SUCCESS.zza()) {
            if (c2676g.f26063b == EnumC2706j5.BACKOFF.zza()) {
                Map map = this.f25817E;
                Z6 z62 = (Z6) map.get(e10);
                if (z62 == null) {
                    z62 = new Z6(this);
                    map.put(e10, z62);
                } else {
                    z62.a();
                }
                a().w().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, e10, Long.valueOf((z62.c() - f().a()) / 1000));
            }
            C2803w F03 = F0();
            Long valueOf = Long.valueOf(c2676g.f26062a);
            F03.w(valueOf);
            a().w().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
            return;
        }
        Map map2 = this.f25817E;
        if (map2.containsKey(e10)) {
            map2.remove(e10);
        }
        C2803w F04 = F0();
        Long valueOf2 = Long.valueOf(j10);
        F04.q(valueOf2);
        a().w().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
        long j11 = c2676g.f26064c;
        if (j11 > 0) {
            C2803w F05 = F0();
            F05.h();
            F05.j();
            Long valueOf3 = Long.valueOf(j11);
            AbstractC1287s.m(valueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(EnumC2714k5.GOOGLE_SIGNAL.zza()));
            C2760q3 c2760q3 = F05.f25694a;
            contentValues.put("creation_timestamp", Long.valueOf(c2760q3.f().a()));
            try {
                if (F05.u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str, String.valueOf(EnumC2714k5.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    c2760q3.a().r().c("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                }
                a().w().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(c2676g.f26064c));
                u(str);
            } catch (SQLiteException e11) {
                F05.f25694a.a().o().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j11), e11);
                throw e11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:417:0x01f7, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0317 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0472  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void s(String str, long j10) {
        Cursor cursor;
        Cursor cursor2;
        List emptyList;
        List<Pair> list;
        String str2;
        C2633a4 g10;
        Z3 z32;
        com.google.android.gms.internal.measurement.Z2 J10;
        int size;
        int i10;
        String str3;
        Object obj;
        long j11;
        N6 n62;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        List list2;
        String str4;
        String str5;
        C3226d.c cVar;
        List emptyList2;
        ArrayList arrayList;
        C2803w F02;
        ContentValues contentValues;
        byte[] byteArray;
        long j12;
        long j13;
        int E10 = B0().E(str, AbstractC2671f2.f26008h);
        int i11 = 0;
        int max = Math.max(0, B0().E(str, AbstractC2671f2.f26011i));
        C2803w F03 = F0();
        F03.h();
        F03.j();
        int i12 = 1;
        AbstractC1287s.a(E10 > 0);
        ?? r10 = max > 0 ? 1 : 0;
        AbstractC1287s.a(r10);
        AbstractC1287s.g(str);
        try {
            try {
                cursor2 = F03.u0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(E10));
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    F03.f25694a.a().o().c("Error querying bundles. appId", C2.x(str), e);
                    emptyList = Collections.emptyList();
                }
            } catch (Throwable th) {
                th = th;
                cursor = r10;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor2.moveToFirst()) {
            list = new ArrayList();
            int i13 = 0;
            while (true) {
                long j14 = cursor2.getLong(i11);
                try {
                    byte[] blob = cursor2.getBlob(i12);
                    g7 K02 = F03.f25405b.K0();
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = gZIPInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArray = byteArrayOutputStream.toByteArray();
                    } catch (IOException e12) {
                        K02.f25694a.a().o().b("Failed to ungzip content", e12);
                        throw e12;
                    }
                } catch (IOException e13) {
                    F03.f25694a.a().o().c("Failed to unzip queued bundle. appId", C2.x(str), e13);
                }
                if (!list.isEmpty() && byteArray.length + i13 > max) {
                    break;
                }
                try {
                    C2216d3 c2216d3 = (C2216d3) g7.W(C2225e3.h0(), byteArray);
                    if (!list.isEmpty()) {
                        C2225e3 c2225e3 = (C2225e3) ((Pair) list.get(0)).first;
                        C2225e3 c2225e32 = (C2225e3) c2216d3.v();
                        if (!c2225e3.I0().equals(c2225e32.I0()) || !c2225e3.P0().equals(c2225e32.P0()) || c2225e3.R0() != c2225e32.R0() || !c2225e3.T0().equals(c2225e32.T0())) {
                            break;
                        }
                        Iterator it = c2225e3.n2().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                j12 = -1;
                                break;
                            }
                            C2377v3 c2377v3 = (C2377v3) it.next();
                            if ("_npa".equals(c2377v3.E())) {
                                j12 = c2377v3.I();
                                break;
                            }
                        }
                        Iterator it2 = c2225e32.n2().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                j13 = -1;
                                break;
                            }
                            C2377v3 c2377v32 = (C2377v3) it2.next();
                            if ("_npa".equals(c2377v32.E())) {
                                j13 = c2377v32.I();
                                break;
                            }
                        }
                        if (j12 != j13) {
                            break;
                        }
                    }
                    if (!cursor2.isNull(2)) {
                        c2216d3.H0(cursor2.getInt(2));
                    }
                    i13 += byteArray.length;
                    list.add(Pair.create((C2225e3) c2216d3.v(), Long.valueOf(j14)));
                } catch (IOException e14) {
                    F03.f25694a.a().o().c("Failed to merge queued bundle. appId", C2.x(str), e14);
                }
                if (!cursor2.moveToNext() || i13 > max) {
                    break;
                }
                i11 = 0;
                i12 = 1;
            }
            cursor2.close();
            if (!list.isEmpty()) {
            }
        } else {
            emptyList = Collections.emptyList();
            cursor2.close();
            list = emptyList;
            if (!list.isEmpty()) {
                return;
            }
            com.google.android.gms.internal.measurement.K6.a();
            C2724m B02 = B0();
            C2663e2 c2663e2 = AbstractC2671f2.f26013i1;
            String str6 = "_f";
            if (B02.H(null, c2663e2)) {
                com.google.android.gms.internal.measurement.K6.a();
                if (B0().H(null, c2663e2)) {
                    if (g(str).o(Z3.ANALYTICS_STORAGE) || !D0().n(str)) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        C2803w F04 = F0();
                        AbstractC1287s.g(str);
                        F04.h();
                        F04.j();
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            try {
                                try {
                                    SQLiteDatabase u02 = F04.u0();
                                    long a10 = F04.f25694a.f().a();
                                    Cursor cursor3 = u02.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(a10)}, null, null, "rowid", null);
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            while (true) {
                                                try {
                                                    arrayList3.add((com.google.android.gms.internal.measurement.S2) ((com.google.android.gms.internal.measurement.R2) g7.W(com.google.android.gms.internal.measurement.S2.M(), cursor3.getBlob(0))).v());
                                                    str2 = str6;
                                                    arrayList = arrayList3;
                                                } catch (C2326p5 e15) {
                                                    arrayList = arrayList3;
                                                    str2 = str6;
                                                    try {
                                                        F04.f25694a.a().t().c("Failed to parse stored NO_DATA mode event, appId", C2.x(str), e15);
                                                    } catch (SQLiteException e16) {
                                                        e = e16;
                                                        F04.f25694a.a().o().c("Error flushing NO_DATA mode events. appId", C2.x(str), e);
                                                        emptyList2 = Collections.emptyList();
                                                        if (cursor3 != null) {
                                                        }
                                                        boolean z14 = true;
                                                        while (r0.hasNext()) {
                                                        }
                                                        list = arrayList2;
                                                        if (list.isEmpty()) {
                                                        }
                                                        g10 = g(str);
                                                        z32 = Z3.AD_STORAGE;
                                                        if (g10.o(z32)) {
                                                        }
                                                        J10 = C2207c3.J();
                                                        size = list.size();
                                                        List arrayList4 = new ArrayList(list.size());
                                                        if (B0().k(str)) {
                                                        }
                                                        boolean o10 = g(str).o(z32);
                                                        boolean o11 = g(str).o(Z3.ANALYTICS_STORAGE);
                                                        z7.a();
                                                        boolean H10 = B0().H(str, AbstractC2671f2.f25962N0);
                                                        O6 o62 = this.f25832j;
                                                        N6 i14 = o62.i(str);
                                                        i10 = 0;
                                                        while (i10 < size) {
                                                        }
                                                        if (J10.z() == 0) {
                                                        }
                                                    }
                                                }
                                                if (!cursor3.moveToNext()) {
                                                    break;
                                                }
                                                arrayList3 = arrayList;
                                                str6 = str2;
                                            }
                                            cursor3.close();
                                            try {
                                                int delete = u02.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(a10)});
                                                A2 w10 = F04.f25694a.a().w();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(delete).length() + 34);
                                                sb2.append("Pruned ");
                                                sb2.append(delete);
                                                sb2.append(" NO_DATA mode events. appId");
                                                w10.b(sb2.toString(), str);
                                            } catch (SQLiteException e17) {
                                                e = e17;
                                                cursor3 = null;
                                                F04.f25694a.a().o().c("Error flushing NO_DATA mode events. appId", C2.x(str), e);
                                                emptyList2 = Collections.emptyList();
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                boolean z142 = true;
                                                while (r0.hasNext()) {
                                                }
                                                list = arrayList2;
                                                if (list.isEmpty()) {
                                                }
                                                g10 = g(str);
                                                z32 = Z3.AD_STORAGE;
                                                if (g10.o(z32)) {
                                                }
                                                J10 = C2207c3.J();
                                                size = list.size();
                                                List arrayList42 = new ArrayList(list.size());
                                                if (B0().k(str)) {
                                                }
                                                boolean o102 = g(str).o(z32);
                                                boolean o112 = g(str).o(Z3.ANALYTICS_STORAGE);
                                                z7.a();
                                                boolean H102 = B0().H(str, AbstractC2671f2.f25962N0);
                                                O6 o622 = this.f25832j;
                                                N6 i142 = o622.i(str);
                                                i10 = 0;
                                                while (i10 < size) {
                                                }
                                                if (J10.z() == 0) {
                                                }
                                            }
                                        } else {
                                            str2 = "_f";
                                            arrayList = arrayList3;
                                            cursor3.close();
                                        }
                                        emptyList2 = arrayList;
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        str2 = str6;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cVar = "data";
                                    if (cVar != 0) {
                                        cVar.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cVar = 0;
                                if (cVar != 0) {
                                }
                                throw th;
                            }
                        } catch (SQLiteException e19) {
                            e = e19;
                            str2 = "_f";
                        }
                        boolean z1422 = true;
                        for (Pair pair : list) {
                            C2216d3 c2216d32 = (C2216d3) ((C2225e3) pair.first).p();
                            if (z1422 && !emptyList2.isEmpty()) {
                                List T02 = c2216d32.T0();
                                c2216d32.c1();
                                c2216d32.b1(emptyList2);
                                c2216d32.b1(T02);
                                z1422 = false;
                            }
                            com.google.android.gms.internal.measurement.H2 D10 = com.google.android.gms.internal.measurement.O2.D();
                            C2224e2 R10 = D0().R(str);
                            ArrayList arrayList5 = new ArrayList();
                            if (R10 != null) {
                                for (com.google.android.gms.internal.measurement.S1 s12 : R10.C()) {
                                    com.google.android.gms.internal.measurement.K2 C10 = com.google.android.gms.internal.measurement.L2.C();
                                    int D11 = s12.D();
                                    X3 x32 = X3.UNINITIALIZED;
                                    int i15 = D11 - 1;
                                    int i16 = 3;
                                    C10.y(i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? 1 : 5 : 4 : 3 : 2);
                                    int F10 = s12.F() - 1;
                                    if (F10 == 1) {
                                        i16 = 2;
                                    } else if (F10 != 2) {
                                        i16 = 1;
                                    }
                                    C10.z(i16);
                                    arrayList5.add((com.google.android.gms.internal.measurement.L2) C10.v());
                                }
                            }
                            D10.y(arrayList5);
                            c2216d32.r0(D10);
                            arrayList2.add(Pair.create((C2225e3) c2216d32.v(), (Long) pair.second));
                        }
                        list = arrayList2;
                        if (list.isEmpty()) {
                            return;
                        }
                    } else {
                        List asList = Arrays.asList(((String) AbstractC2671f2.f26016j1.b(null)).split(","));
                        for (Pair pair2 : list) {
                            try {
                                F0().t(((Long) pair2.second).longValue());
                                for (com.google.android.gms.internal.measurement.S2 s22 : ((C2225e3) pair2.first).h2()) {
                                    if (asList.contains(s22.F())) {
                                        try {
                                            if (!s22.F().equals("_f")) {
                                                if (s22.F().equals("_v")) {
                                                }
                                                F02 = F0();
                                                F02.h();
                                                F02.j();
                                                AbstractC1287s.m(s22);
                                                AbstractC1287s.g(str);
                                                C2760q3 c2760q3 = F02.f25694a;
                                                c2760q3.a().w().b("Caching events in NO_DATA mode", s22);
                                                contentValues = new ContentValues();
                                                contentValues.put("app_id", str);
                                                contentValues.put("name", s22.F());
                                                contentValues.put("data", s22.c());
                                                contentValues.put("timestamp_millis", Long.valueOf(s22.H()));
                                                if (F02.u0().insert("no_data_mode_events", null, contentValues) != -1) {
                                                    try {
                                                        c2760q3.a().o().b("Failed to insert NO_DATA mode event (got -1). appId", C2.x(str));
                                                    } catch (SQLiteException e20) {
                                                        e = e20;
                                                        try {
                                                            F02.f25694a.a().o().c("Error storing NO_DATA mode event. appId", C2.x(str), e);
                                                        } catch (SQLiteException unused) {
                                                            a().t().b("Failed handling NO_DATA mode bundles. appId", str);
                                                        }
                                                    }
                                                }
                                            }
                                            if (F02.u0().insert("no_data_mode_events", null, contentValues) != -1) {
                                            }
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                        }
                                        com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) s22.p();
                                        K0();
                                        g7.o(r22, "_dac", 1L);
                                        s22 = (com.google.android.gms.internal.measurement.S2) r22.v();
                                        F02 = F0();
                                        F02.h();
                                        F02.j();
                                        AbstractC1287s.m(s22);
                                        AbstractC1287s.g(str);
                                        C2760q3 c2760q32 = F02.f25694a;
                                        c2760q32.a().w().b("Caching events in NO_DATA mode", s22);
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str);
                                        contentValues.put("name", s22.F());
                                        contentValues.put("data", s22.c());
                                        contentValues.put("timestamp_millis", Long.valueOf(s22.H()));
                                    }
                                }
                            } catch (SQLiteException unused2) {
                            }
                        }
                        list = Collections.emptyList();
                    }
                }
                str2 = "_f";
                if (list.isEmpty()) {
                }
            } else {
                str2 = "_f";
            }
            g10 = g(str);
            z32 = Z3.AD_STORAGE;
            if (g10.o(z32)) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        str5 = null;
                        break;
                    }
                    C2225e3 c2225e33 = (C2225e3) ((Pair) it3.next()).first;
                    if (!c2225e33.I().isEmpty()) {
                        str5 = c2225e33.I();
                        break;
                    }
                }
                if (str5 != null) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= list.size()) {
                            break;
                        }
                        C2225e3 c2225e34 = (C2225e3) ((Pair) list.get(i17)).first;
                        if (!c2225e34.I().isEmpty() && !c2225e34.I().equals(str5)) {
                            list = list.subList(0, i17);
                            break;
                        }
                        i17++;
                    }
                }
            }
            J10 = C2207c3.J();
            size = list.size();
            List arrayList422 = new ArrayList(list.size());
            boolean z15 = !B0().k(str) && g(str).o(z32);
            boolean o1022 = g(str).o(z32);
            boolean o1122 = g(str).o(Z3.ANALYTICS_STORAGE);
            z7.a();
            boolean H1022 = B0().H(str, AbstractC2671f2.f25962N0);
            O6 o6222 = this.f25832j;
            N6 i1422 = o6222.i(str);
            i10 = 0;
            while (i10 < size) {
                C2216d3 c2216d33 = (C2216d3) ((C2225e3) ((Pair) list.get(i10)).first).p();
                arrayList422.add((Long) ((Pair) list.get(i10)).second);
                B0().A();
                c2216d33.O(133005L);
                c2216d33.q1(j10);
                int i18 = size;
                this.f25834l.c();
                c2216d33.w0(false);
                if (!z15) {
                    c2216d33.G0();
                }
                if (!o1022) {
                    c2216d33.R();
                    c2216d33.U();
                }
                if (!o1122) {
                    c2216d33.X();
                }
                x(str, c2216d33);
                if (!H1022) {
                    c2216d33.O0();
                }
                if (!o1122) {
                    c2216d33.z0();
                }
                String P10 = c2216d33.P();
                if (TextUtils.isEmpty(P10)) {
                    z10 = o1022;
                } else {
                    z10 = o1022;
                    if (!P10.equals("00000000-0000-0000-0000-000000000000")) {
                        z11 = z15;
                        z12 = o1122;
                        z13 = H1022;
                        list2 = list;
                        str4 = str2;
                        if (c2216d33.U0() != 0) {
                            if (B0().H(str, AbstractC2671f2.f25942D0)) {
                                c2216d33.L0(K0().T(((C2225e3) c2216d33.v()).c()));
                            }
                            C2359t3 d10 = i1422.d();
                            if (d10 != null) {
                                c2216d33.o0(d10);
                            }
                            J10.C(c2216d33);
                        }
                        i10++;
                        str2 = str4;
                        size = i18;
                        o1022 = z10;
                        z15 = z11;
                        o1122 = z12;
                        list = list2;
                        H1022 = z13;
                    }
                }
                ArrayList arrayList6 = new ArrayList(c2216d33.T0());
                Iterator it4 = arrayList6.iterator();
                z11 = z15;
                z12 = o1122;
                Long l10 = null;
                Long l11 = null;
                boolean z16 = false;
                boolean z17 = false;
                while (it4.hasNext()) {
                    boolean z18 = H1022;
                    com.google.android.gms.internal.measurement.S2 s23 = (com.google.android.gms.internal.measurement.S2) it4.next();
                    List list3 = list;
                    if ("_fx".equals(s23.F())) {
                        it4.remove();
                        list = list3;
                        H1022 = z18;
                        z16 = true;
                        z17 = true;
                    } else {
                        String str7 = str2;
                        if (str7.equals(s23.F())) {
                            K0();
                            com.google.android.gms.internal.measurement.W2 r11 = g7.r(s23, "_pfo");
                            if (r11 != null) {
                                l10 = Long.valueOf(r11.H());
                            }
                            K0();
                            com.google.android.gms.internal.measurement.W2 r12 = g7.r(s23, "_uwa");
                            if (r12 != null) {
                                l11 = Long.valueOf(r12.H());
                            }
                            str2 = str7;
                            list = list3;
                            H1022 = z18;
                            z17 = true;
                        } else {
                            str2 = str7;
                            list = list3;
                            H1022 = z18;
                        }
                    }
                }
                z13 = H1022;
                list2 = list;
                str4 = str2;
                if (z16) {
                    c2216d33.c1();
                    c2216d33.b1(arrayList6);
                }
                if (z17) {
                    w(c2216d33.K(), true, l10, l11);
                }
                if (c2216d33.U0() != 0) {
                }
                i10++;
                str2 = str4;
                size = i18;
                o1022 = z10;
                z15 = z11;
                o1122 = z12;
                list = list2;
                H1022 = z13;
            }
            if (J10.z() == 0) {
                q(arrayList422);
                A(false, 204, null, null, str, Collections.emptyList());
                return;
            }
            C2207c3 c2207c3 = (C2207c3) J10.v();
            List arrayList7 = new ArrayList();
            boolean z19 = i1422.c() == EnumC2714k5.SGTM_CLIENT;
            if (i1422.c() != EnumC2714k5.SGTM) {
                if (!z19) {
                    j11 = j10;
                    obj = null;
                    if (E0().m()) {
                        return;
                    }
                    Object K10 = Log.isLoggable(a().z(), 2) ? K0().K(c2207c3) : obj;
                    K0();
                    byte[] c10 = c2207c3.c();
                    q(arrayList422);
                    this.f25831i.f26077i.b(j11);
                    a().w().d("Uploading data. app, uncompressed size, data", str, Integer.valueOf(c10.length), K10);
                    this.f25843u = true;
                    E0().n(str, i1422, c2207c3, new Q6(this, str, arrayList7));
                    return;
                }
                z19 = true;
            }
            Iterator it5 = ((C2207c3) J10.v()).C().iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (((C2225e3) it5.next()).a0()) {
                        str3 = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    str3 = null;
                    break;
                }
            }
            C2207c3 c2207c32 = (C2207c3) J10.v();
            b().h();
            O0();
            com.google.android.gms.internal.measurement.Z2 K11 = C2207c3.K(c2207c32);
            if (!TextUtils.isEmpty(str3)) {
                K11.H(str3);
            }
            String x10 = D0().x(str);
            if (!TextUtils.isEmpty(x10)) {
                K11.J(x10);
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it6 = c2207c32.C().iterator();
            while (it6.hasNext()) {
                C2216d3 i02 = C2225e3.i0((C2225e3) it6.next());
                i02.G0();
                arrayList8.add((C2225e3) i02.v());
            }
            K11.E();
            K11.D(arrayList8);
            a().w().b("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str3) ? "null" : K11.G());
            C2207c3 c2207c33 = (C2207c3) K11.v();
            if (TextUtils.isEmpty(str3)) {
                obj = null;
            } else {
                C2207c3 c2207c34 = (C2207c3) J10.v();
                b().h();
                O0();
                com.google.android.gms.internal.measurement.Z2 J11 = C2207c3.J();
                a().w().b("[sgtm] Processing Google Signal, sgtmJoinId:", str3);
                J11.H(str3);
                for (C2225e3 c2225e35 : c2207c34.C()) {
                    C2216d3 h02 = C2225e3.h0();
                    h02.F0(c2225e35.b0());
                    h02.k0(c2225e35.Y0());
                    J11.C(h02);
                }
                C2207c3 c2207c35 = (C2207c3) J11.v();
                String x11 = o6222.f25405b.D0().x(str);
                if (TextUtils.isEmpty(x11)) {
                    obj = null;
                    n62 = new N6((String) AbstractC2671f2.f26035s.b(null), Collections.emptyMap(), z19 ? EnumC2714k5.GOOGLE_SIGNAL_PENDING : EnumC2714k5.GOOGLE_SIGNAL, null);
                } else {
                    Uri parse = Uri.parse((String) AbstractC2671f2.f26035s.b(null));
                    Uri.Builder buildUpon = parse.buildUpon();
                    String authority = parse.getAuthority();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(x11).length() + 1 + String.valueOf(authority).length());
                    sb3.append(x11);
                    sb3.append(".");
                    sb3.append(authority);
                    buildUpon.authority(sb3.toString());
                    obj = null;
                    n62 = new N6(buildUpon.build().toString(), Collections.emptyMap(), z19 ? EnumC2714k5.GOOGLE_SIGNAL_PENDING : EnumC2714k5.GOOGLE_SIGNAL, null);
                }
                arrayList7.add(Pair.create(c2207c35, n62));
            }
            if (z19) {
                com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) c2207c33.p();
                for (int i19 = 0; i19 < c2207c33.D(); i19++) {
                    C2216d3 c2216d34 = (C2216d3) c2207c33.E(i19).p();
                    c2216d34.r1();
                    c2216d34.p0(j10);
                    z22.B(i19, c2216d34);
                }
                arrayList7.add(Pair.create((C2207c3) z22.v(), i1422));
                q(arrayList422);
                A(false, 204, null, null, str, arrayList7);
                if (t(str, i1422.a())) {
                    a().w().b("[sgtm] Sending sgtm batches available notification to app", str);
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    W(this.f25834l.e(), intent);
                    return;
                }
                return;
            }
            j11 = j10;
            c2207c3 = c2207c33;
            if (E0().m()) {
            }
        }
    }

    final void s0(boolean z10) {
        R();
    }

    final boolean t(String str, String str2) {
        I2 J02 = F0().J0(str);
        if (J02 != null && N0().P(str, J02.l0())) {
            this.f25817E.remove(str2);
            return true;
        }
        Z6 z62 = (Z6) this.f25817E.get(str2);
        if (z62 == null) {
            return true;
        }
        return z62.b();
    }

    public final void t0(String str, C2730m5 c2730m5) {
        b().h();
        String str2 = this.f25819G;
        if (str2 == null || str2.equals(str) || c2730m5 != null) {
            this.f25819G = str;
            this.f25818F = c2730m5;
        }
    }

    final void u(String str) {
        C2207c3 d10;
        b().h();
        O0();
        this.f25844v = true;
        try {
            C2760q3 c2760q3 = this.f25834l;
            c2760q3.c();
            Boolean x10 = c2760q3.J().x();
            if (x10 == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (x10.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f25837o > 0) {
                R();
            } else if (!E0().m()) {
                a().w().a("Network not connected, ignoring upload request");
                R();
            } else if (F0().p(str)) {
                C2803w F02 = F0();
                AbstractC1287s.g(str);
                F02.h();
                F02.j();
                List o10 = F02.o(str, I6.j(EnumC2714k5.GOOGLE_SIGNAL), 1);
                e7 e7Var = o10.isEmpty() ? null : (e7) o10.get(0);
                if (e7Var != null && (d10 = e7Var.d()) != null) {
                    a().w().d("[sgtm] Uploading data from upload queue. appId, type, url", str, e7Var.f(), e7Var.e());
                    byte[] c10 = d10.c();
                    if (Log.isLoggable(a().z(), 2)) {
                        a().w().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(c10.length), K0().K(d10));
                    }
                    N6 a10 = e7Var.a();
                    this.f25843u = true;
                    E0().n(str, a10, d10, new R6(this, str, e7Var));
                }
            } else {
                a().w().b("[sgtm] Upload queue has no batches for appId", str);
            }
            this.f25844v = false;
            S();
        } catch (Throwable th) {
            this.f25844v = false;
            S();
            throw th;
        }
    }

    final /* synthetic */ void u0(c7 c7Var) {
        b().h();
        this.f25833k = new T2(this);
        C2803w c2803w = new C2803w(this);
        c2803w.k();
        this.f25825c = c2803w;
        B0().t((InterfaceC2716l) AbstractC1287s.m(this.f25823a));
        C2683g6 c2683g6 = new C2683g6(this);
        c2683g6.k();
        this.f25831i = c2683g6;
        C2660e c2660e = new C2660e(this);
        c2660e.k();
        this.f25828f = c2660e;
        C2690h5 c2690h5 = new C2690h5(this);
        c2690h5.k();
        this.f25830h = c2690h5;
        E6 e62 = new E6(this);
        e62.k();
        this.f25827e = e62;
        this.f25826d = new K2(this);
        if (this.f25840r != this.f25841s) {
            a().o().c("Not all upload components initialized", Integer.valueOf(this.f25840r), Integer.valueOf(this.f25841s));
        }
        this.f25835m.set(true);
        a().w().a("UploadController is now fully initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void v(String str, int i10, Throwable th, byte[] bArr, e7 e7Var) {
        b().h();
        O0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f25843u = false;
                S();
                throw th2;
            }
        }
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str2.substring(0, Math.min(32, str2.length()));
            A2 t10 = a().t();
            Integer valueOf = Integer.valueOf(i10);
            if (th == null) {
                th = substring;
            }
            t10.d("Network upload failed. Will retry later. appId, status, error", str, valueOf, th);
            F0().w(Long.valueOf(e7Var.c()));
            R();
            this.f25843u = false;
            S();
        }
        if (th == null) {
            F0().q(Long.valueOf(e7Var.c()));
            a().w().c("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i10));
            if (E0().m() && F0().p(str)) {
                u(str);
            } else {
                R();
            }
            this.f25843u = false;
            S();
        }
        String str22 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str22.substring(0, Math.min(32, str22.length()));
        A2 t102 = a().t();
        Integer valueOf2 = Integer.valueOf(i10);
        if (th == null) {
        }
        t102.d("Network upload failed. Will retry later. appId, status, error", str, valueOf2, th);
        F0().w(Long.valueOf(e7Var.c()));
        R();
        this.f25843u = false;
        S();
    }

    final void w(String str, boolean z10, Long l10, Long l11) {
        I2 J02 = F0().J0(str);
        if (J02 != null) {
            J02.e0(z10);
            J02.g0(l10);
            J02.i0(l11);
            if (J02.A()) {
                F0().K0(J02, false, false);
            }
        }
    }

    final void x(String str, C2216d3 c2216d3) {
        int X10;
        int indexOf;
        Set F10 = D0().F(str);
        if (F10 != null) {
            c2216d3.P0(F10);
        }
        if (D0().J(str)) {
            c2216d3.E();
        }
        if (D0().K(str)) {
            String B10 = c2216d3.B();
            if (!TextUtils.isEmpty(B10) && (indexOf = B10.indexOf(".")) != -1) {
                c2216d3.C(B10.substring(0, indexOf));
            }
        }
        if (D0().L(str) && (X10 = g7.X(c2216d3, "_id")) != -1) {
            c2216d3.p1(X10);
        }
        if (D0().M(str)) {
            c2216d3.G0();
        }
        if (D0().N(str)) {
            c2216d3.X();
            if (g(str).o(Z3.ANALYTICS_STORAGE)) {
                Map map = this.f25816D;
                Y6 y62 = (Y6) map.get(str);
                if (y62 == null || y62.f25749b + B0().D(str, AbstractC2671f2.f26021l0) < f().c()) {
                    y62 = new Y6(this, (byte[]) null);
                    map.put(str, y62);
                }
                c2216d3.Q0(y62.f25748a);
            }
        }
        if (D0().O(str)) {
            c2216d3.O0();
        }
    }

    final /* synthetic */ C2760q3 x0() {
        return this.f25834l;
    }

    final void y(C2216d3 c2216d3, X6 x62) {
        for (int i10 = 0; i10 < c2216d3.U0(); i10++) {
            com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) c2216d3.V0(i10).p();
            Iterator it = r22.y().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.W2) it.next()).D())) {
                    if (x62.f25734a.U0() >= B0().E(x62.f25734a.C(), AbstractC2671f2.f26024m0)) {
                        int E10 = B0().E(x62.f25734a.C(), AbstractC2671f2.f26050z0);
                        String str = null;
                        if (E10 <= 0) {
                            if (B0().H(x62.f25734a.C(), AbstractC2671f2.f25972S0)) {
                                str = N0().l0();
                                com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
                                O10.z("_tu");
                                O10.B(str);
                                r22.D((com.google.android.gms.internal.measurement.W2) O10.v());
                            }
                            com.google.android.gms.internal.measurement.V2 O11 = com.google.android.gms.internal.measurement.W2.O();
                            O11.z("_tr");
                            O11.D(1L);
                            r22.D((com.google.android.gms.internal.measurement.W2) O11.v());
                            B6 I10 = K0().I(x62.f25734a.C(), c2216d3, r22, str);
                            if (I10 != null) {
                                a().w().c("Generated trigger URI. appId, uri", x62.f25734a.C(), I10.f25322a);
                                F0().K(x62.f25734a.C(), I10);
                                Deque deque = this.f25839q;
                                if (!deque.contains(x62.f25734a.C())) {
                                    deque.add(x62.f25734a.C());
                                }
                            }
                        } else if (F0().L0(h(), x62.f25734a.C(), false, false, false, false, false, false, true).f26322g > E10) {
                            com.google.android.gms.internal.measurement.V2 O12 = com.google.android.gms.internal.measurement.W2.O();
                            O12.z("_tnr");
                            O12.D(1L);
                            r22.D((com.google.android.gms.internal.measurement.W2) O12.v());
                        } else {
                            if (B0().H(x62.f25734a.C(), AbstractC2671f2.f25972S0)) {
                                str = N0().l0();
                                com.google.android.gms.internal.measurement.V2 O13 = com.google.android.gms.internal.measurement.W2.O();
                                O13.z("_tu");
                                O13.B(str);
                                r22.D((com.google.android.gms.internal.measurement.W2) O13.v());
                            }
                            com.google.android.gms.internal.measurement.V2 O14 = com.google.android.gms.internal.measurement.W2.O();
                            O14.z("_tr");
                            O14.D(1L);
                            r22.D((com.google.android.gms.internal.measurement.W2) O14.v());
                            B6 I11 = K0().I(x62.f25734a.C(), c2216d3, r22, str);
                            if (I11 != null) {
                                a().w().c("Generated trigger URI. appId, uri", x62.f25734a.C(), I11.f25322a);
                                F0().K(x62.f25734a.C(), I11);
                                Deque deque2 = this.f25839q;
                                if (!deque2.contains(x62.f25734a.C())) {
                                    deque2.add(x62.f25734a.C());
                                }
                            }
                        }
                    }
                    c2216d3.W0(i10, (com.google.android.gms.internal.measurement.S2) r22.v());
                }
            }
        }
    }

    final /* synthetic */ Deque y0() {
        return this.f25839q;
    }

    final void z(String str, com.google.android.gms.internal.measurement.V2 v22, Bundle bundle, String str2) {
        List b10 = com.google.android.gms.common.util.g.b("_o", "_sn", "_sc", "_si");
        long y10 = (l7.N(v22.y()) || l7.N(str)) ? B0().y(str2, true) : B0().x(str2, true);
        long codePointCount = v22.A().codePointCount(0, v22.A().length());
        l7 N02 = N0();
        String y11 = v22.y();
        B0();
        String q10 = N02.q(y11, 40, true);
        if (codePointCount <= y10 || b10.contains(v22.y())) {
            return;
        }
        if ("_ev".equals(v22.y())) {
            bundle.putString("_ev", N0().q(v22.A(), B0().y(str2, true), true));
            return;
        }
        a().t().c("Param value is too long; discarded. Name, value length", q10, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", q10);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(v22.y());
    }

    final /* synthetic */ void z0(long j10) {
        this.f25821I = j10;
    }
}
