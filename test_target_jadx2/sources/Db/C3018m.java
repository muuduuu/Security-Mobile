package db;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import expo.modules.imagepicker.ImagePickerAsset;
import expo.modules.imagepicker.ImagePickerOptions;
import expo.modules.imagepicker.ImagePickerResponse;
import expo.modules.imagepicker.MediaType;
import fb.C3161a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;
import zb.InterfaceC5270a;

/* renamed from: db.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3018m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5270a f31407a;

    /* renamed from: db.m$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31408a;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31408a = iArr;
        }
    }

    /* renamed from: db.m$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31409a;

        /* renamed from: b, reason: collision with root package name */
        Object f31410b;

        /* renamed from: c, reason: collision with root package name */
        Object f31411c;

        /* renamed from: d, reason: collision with root package name */
        Object f31412d;

        /* renamed from: e, reason: collision with root package name */
        Object f31413e;

        /* renamed from: f, reason: collision with root package name */
        Object f31414f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f31415g;

        /* renamed from: i, reason: collision with root package name */
        int f31417i;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31415g = obj;
            this.f31417i |= Integer.MIN_VALUE;
            return C3018m.this.f(null, null, this);
        }
    }

    /* renamed from: db.m$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31418a;

        /* renamed from: b, reason: collision with root package name */
        Object f31419b;

        /* renamed from: c, reason: collision with root package name */
        Object f31420c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f31421d;

        /* renamed from: f, reason: collision with root package name */
        int f31423f;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31421d = obj;
            this.f31423f |= Integer.MIN_VALUE;
            return C3018m.this.g(null, this);
        }
    }

    /* renamed from: db.m$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31424a;

        /* renamed from: b, reason: collision with root package name */
        Object f31425b;

        /* renamed from: c, reason: collision with root package name */
        Object f31426c;

        /* renamed from: d, reason: collision with root package name */
        Object f31427d;

        /* renamed from: e, reason: collision with root package name */
        Object f31428e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f31429f;

        /* renamed from: h, reason: collision with root package name */
        int f31431h;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31429f = obj;
            this.f31431h |= Integer.MIN_VALUE;
            return C3018m.this.h(null, null, this);
        }
    }

    public C3018m(InterfaceC5270a appContextProvider) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.f31407a = appContextProvider;
    }

    private final C3006a c(Uri uri) {
        Cursor query = e().getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            int columnIndex = cursor2.getColumnIndex("_display_name");
            int columnIndex2 = cursor2.getColumnIndex("_size");
            cursor2.moveToFirst();
            C3006a c3006a = new C3006a(cursor2.getString(columnIndex), Long.valueOf(cursor2.getLong(columnIndex2)));
            kotlin.io.c.a(cursor, null);
            return c3006a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.c.a(cursor, th);
                throw th2;
            }
        }
    }

    private final File d() {
        return this.f31407a.a().j();
    }

    private final Context e() {
        Context w10 = this.f31407a.a().w();
        if (w10 != null) {
            return w10;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Uri uri, ImagePickerOptions imagePickerOptions, kotlin.coroutines.d dVar) {
        b bVar;
        int i10;
        ImagePickerOptions imagePickerOptions2;
        C3018m c3018m;
        String str;
        File file;
        fb.c cVar;
        Boolean a10;
        Uri uri2;
        fb.c cVar2;
        ImagePickerOptions imagePickerOptions3;
        C3018m c3018m2;
        Uri uri3;
        String str2;
        Boolean a11;
        String str3;
        String str4;
        fb.c cVar3;
        String str5;
        Uri uri4;
        C3018m c3018m3;
        ByteArrayOutputStream byteArrayOutputStream;
        C3006a c10;
        Long b10;
        Uri uri5 = uri;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f31417i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f31417i = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f31415g;
                Object e10 = AbstractC3868b.e();
                i10 = bVar.f31417i;
                Bundle bundle = null;
                if (i10 != 0) {
                    lc.p.b(obj);
                    fb.d eVar = imagePickerOptions.getQuality() == 1.0d ? new fb.e() : new C3161a(this.f31407a, imagePickerOptions.getQuality());
                    ContentResolver contentResolver = e().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                    String h10 = AbstractC3017l.h(contentResolver, uri5);
                    File c11 = AbstractC3017l.c(d(), AbstractC3017l.q(h10));
                    ContentResolver contentResolver2 = e().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                    bVar.f31409a = this;
                    bVar.f31410b = uri5;
                    imagePickerOptions2 = imagePickerOptions;
                    bVar.f31411c = imagePickerOptions2;
                    bVar.f31412d = h10;
                    bVar.f31413e = c11;
                    bVar.f31417i = 1;
                    obj = eVar.a(uri5, c11, contentResolver2, bVar);
                    if (obj == e10) {
                        return e10;
                    }
                    c3018m = this;
                    str = h10;
                    file = c11;
                } else if (i10 == 1) {
                    File file2 = (File) bVar.f31413e;
                    String str6 = (String) bVar.f31412d;
                    ImagePickerOptions imagePickerOptions4 = (ImagePickerOptions) bVar.f31411c;
                    Uri uri6 = (Uri) bVar.f31410b;
                    c3018m = (C3018m) bVar.f31409a;
                    lc.p.b(obj);
                    imagePickerOptions2 = imagePickerOptions4;
                    str = str6;
                    file = file2;
                    uri5 = uri6;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (String) bVar.f31414f;
                        cVar3 = (fb.c) bVar.f31413e;
                        file = (File) bVar.f31412d;
                        str5 = (String) bVar.f31411c;
                        uri4 = (Uri) bVar.f31410b;
                        c3018m3 = (C3018m) bVar.f31409a;
                        lc.p.b(obj);
                        bundle = (Bundle) obj;
                        str3 = str2;
                        c3018m = c3018m3;
                        cVar = cVar3;
                        str4 = str5;
                        uri3 = uri4;
                        Bundle bundle2 = bundle;
                        c10 = c3018m.c(uri3);
                        MediaType mediaType = MediaType.IMAGE;
                        String uri7 = Uri.fromFile(file).toString();
                        int g10 = cVar.g();
                        int f10 = cVar.f();
                        if (c10 != null || (r2 = c10.a()) == null) {
                            String name = file.getName();
                        }
                        String str7 = name;
                        long length = (c10 != null || (b10 = c10.b()) == null) ? file.length() : b10.longValue();
                        String g11 = AbstractC3017l.g(uri3);
                        Intrinsics.d(uri7);
                        return new ImagePickerAsset(g11, mediaType, uri7, g10, f10, str7, kotlin.coroutines.jvm.internal.b.c(length), str4, str3, bundle2, null, null, 3072, null);
                    }
                    cVar2 = (fb.c) bVar.f31414f;
                    file = (File) bVar.f31413e;
                    str = (String) bVar.f31412d;
                    imagePickerOptions3 = (ImagePickerOptions) bVar.f31411c;
                    uri2 = (Uri) bVar.f31410b;
                    c3018m2 = (C3018m) bVar.f31409a;
                    lc.p.b(obj);
                    byteArrayOutputStream = (ByteArrayOutputStream) obj;
                    if (byteArrayOutputStream == null) {
                        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                        uri3 = uri2;
                        c3018m = c3018m2;
                        cVar = cVar2;
                        str2 = encodeToString;
                        a11 = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions3.getExif());
                        if (!a11.booleanValue()) {
                            a11 = null;
                        }
                        if (a11 != null) {
                            str3 = str2;
                            str4 = str;
                            Bundle bundle22 = bundle;
                            c10 = c3018m.c(uri3);
                            MediaType mediaType2 = MediaType.IMAGE;
                            String uri72 = Uri.fromFile(file).toString();
                            int g102 = cVar.g();
                            int f102 = cVar.f();
                            if (c10 != null) {
                            }
                            String name2 = file.getName();
                            String str72 = name2;
                            if (c10 != null) {
                            }
                            String g112 = AbstractC3017l.g(uri3);
                            Intrinsics.d(uri72);
                            return new ImagePickerAsset(g112, mediaType2, uri72, g102, f102, str72, kotlin.coroutines.jvm.internal.b.c(length), str4, str3, bundle22, null, null, 3072, null);
                        }
                        ContentResolver contentResolver3 = c3018m.e().getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver3, "getContentResolver(...)");
                        bVar.f31409a = c3018m;
                        bVar.f31410b = uri3;
                        bVar.f31411c = str;
                        bVar.f31412d = file;
                        bVar.f31413e = cVar;
                        bVar.f31414f = str2;
                        bVar.f31417i = 3;
                        Object d10 = cVar.d(contentResolver3, bVar);
                        if (d10 == e10) {
                            return e10;
                        }
                        cVar3 = cVar;
                        obj = d10;
                        str5 = str;
                        uri4 = uri3;
                        c3018m3 = c3018m;
                        bundle = (Bundle) obj;
                        str3 = str2;
                        c3018m = c3018m3;
                        cVar = cVar3;
                        str4 = str5;
                        uri3 = uri4;
                        Bundle bundle222 = bundle;
                        c10 = c3018m.c(uri3);
                        MediaType mediaType22 = MediaType.IMAGE;
                        String uri722 = Uri.fromFile(file).toString();
                        int g1022 = cVar.g();
                        int f1022 = cVar.f();
                        if (c10 != null) {
                        }
                        String name22 = file.getName();
                        String str722 = name22;
                        if (c10 != null) {
                        }
                        String g1122 = AbstractC3017l.g(uri3);
                        Intrinsics.d(uri722);
                        return new ImagePickerAsset(g1122, mediaType22, uri722, g1022, f1022, str722, kotlin.coroutines.jvm.internal.b.c(length), str4, str3, bundle222, null, null, 3072, null);
                    }
                    cVar = cVar2;
                    uri5 = uri2;
                    c3018m = c3018m2;
                    imagePickerOptions2 = imagePickerOptions3;
                    uri3 = uri5;
                    str2 = null;
                    imagePickerOptions3 = imagePickerOptions2;
                    a11 = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions3.getExif());
                    if (!a11.booleanValue()) {
                    }
                    if (a11 != null) {
                    }
                }
                cVar = (fb.c) obj;
                a10 = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions2.getBase64());
                if (!a10.booleanValue()) {
                    a10 = null;
                }
                if (a10 != null) {
                    ContentResolver contentResolver4 = c3018m.e().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver4, "getContentResolver(...)");
                    bVar.f31409a = c3018m;
                    bVar.f31410b = uri5;
                    bVar.f31411c = imagePickerOptions2;
                    bVar.f31412d = str;
                    bVar.f31413e = file;
                    bVar.f31414f = cVar;
                    bVar.f31417i = 2;
                    Object b11 = cVar.b(contentResolver4, bVar);
                    if (b11 == e10) {
                        return e10;
                    }
                    C3018m c3018m4 = c3018m;
                    uri2 = uri5;
                    cVar2 = cVar;
                    obj = b11;
                    imagePickerOptions3 = imagePickerOptions2;
                    c3018m2 = c3018m4;
                    byteArrayOutputStream = (ByteArrayOutputStream) obj;
                    if (byteArrayOutputStream == null) {
                    }
                }
                uri3 = uri5;
                str2 = null;
                imagePickerOptions3 = imagePickerOptions2;
                a11 = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions3.getExif());
                if (!a11.booleanValue()) {
                }
                if (a11 != null) {
                }
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f31415g;
        Object e102 = AbstractC3868b.e();
        i10 = bVar.f31417i;
        Bundle bundle3 = null;
        if (i10 != 0) {
        }
        cVar = (fb.c) obj2;
        a10 = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions2.getBase64());
        if (!a10.booleanValue()) {
        }
        if (a10 != null) {
        }
        uri3 = uri5;
        str2 = null;
        imagePickerOptions3 = imagePickerOptions2;
        a11 = kotlin.coroutines.jvm.internal.b.a(imagePickerOptions3.getExif());
        if (!a11.booleanValue()) {
        }
        if (a11 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[Catch: d -> 0x00ad, TryCatch #0 {d -> 0x00ad, blocks: (B:12:0x0073, B:14:0x00a7, B:16:0x00b2, B:17:0x00b6), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2 A[Catch: d -> 0x00ad, TryCatch #0 {d -> 0x00ad, blocks: (B:12:0x0073, B:14:0x00a7, B:16:0x00b2, B:17:0x00b6), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Uri uri, kotlin.coroutines.d dVar) {
        c cVar;
        int i10;
        File c10;
        C3018m c3018m;
        Uri uri2 = uri;
        try {
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i11 = cVar.f31423f;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f31423f = i11 - Integer.MIN_VALUE;
                    Object obj = cVar.f31421d;
                    Object e10 = AbstractC3868b.e();
                    i10 = cVar.f31423f;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        c10 = AbstractC3017l.c(d(), ".mp4");
                        ContentResolver contentResolver = e().getContentResolver();
                        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                        cVar.f31418a = this;
                        cVar.f31419b = uri2;
                        cVar.f31420c = c10;
                        cVar.f31423f = 1;
                        if (AbstractC3017l.b(uri2, c10, contentResolver, cVar) == e10) {
                            return e10;
                        }
                        c3018m = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        File file = (File) cVar.f31420c;
                        Uri uri3 = (Uri) cVar.f31419b;
                        c3018m = (C3018m) cVar.f31418a;
                        lc.p.b(obj);
                        c10 = file;
                        uri2 = uri3;
                    }
                    Uri fromFile = Uri.fromFile(c10);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(c3018m.e(), fromFile);
                    C3006a c11 = c3018m.c(uri2);
                    ContentResolver contentResolver2 = c3018m.e().getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver2, "getContentResolver(...)");
                    String h10 = AbstractC3017l.h(contentResolver2, uri2);
                    MediaType mediaType = MediaType.VIDEO;
                    String uri4 = fromFile.toString();
                    int d10 = AbstractC3017l.d(mediaMetadataRetriever, 18);
                    int d11 = AbstractC3017l.d(mediaMetadataRetriever, 19);
                    String a10 = c11 == null ? c11.a() : null;
                    Long b10 = c11 != null ? c11.b() : null;
                    int d12 = AbstractC3017l.d(mediaMetadataRetriever, 9);
                    int d13 = AbstractC3017l.d(mediaMetadataRetriever, 24);
                    String g10 = AbstractC3017l.g(uri2);
                    Intrinsics.d(uri4);
                    return new ImagePickerAsset(g10, mediaType, uri4, d10, d11, a10, b10, h10, null, null, kotlin.coroutines.jvm.internal.b.b(d12), kotlin.coroutines.jvm.internal.b.b(d13), 768, null);
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            mediaMetadataRetriever2.setDataSource(c3018m.e(), fromFile);
            C3006a c112 = c3018m.c(uri2);
            ContentResolver contentResolver22 = c3018m.e().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver22, "getContentResolver(...)");
            String h102 = AbstractC3017l.h(contentResolver22, uri2);
            MediaType mediaType2 = MediaType.VIDEO;
            String uri42 = fromFile.toString();
            int d102 = AbstractC3017l.d(mediaMetadataRetriever2, 18);
            int d112 = AbstractC3017l.d(mediaMetadataRetriever2, 19);
            if (c112 == null) {
            }
            Long b102 = c112 != null ? c112.b() : null;
            int d122 = AbstractC3017l.d(mediaMetadataRetriever2, 9);
            int d132 = AbstractC3017l.d(mediaMetadataRetriever2, 24);
            String g102 = AbstractC3017l.g(uri2);
            Intrinsics.d(uri42);
            return new ImagePickerAsset(g102, mediaType2, uri42, d102, d112, a10, b102, h102, null, null, kotlin.coroutines.jvm.internal.b.b(d122), kotlin.coroutines.jvm.internal.b.b(d132), 768, null);
        } catch (C3009d e11) {
            throw new C3009d(c10, e11);
        }
        cVar = new c(dVar);
        Object obj2 = cVar.f31421d;
        Object e102 = AbstractC3868b.e();
        i10 = cVar.f31423f;
        if (i10 != 0) {
        }
        Uri fromFile2 = Uri.fromFile(c10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b2 -> B:11:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(List list, ImagePickerOptions imagePickerOptions, kotlin.coroutines.d dVar) {
        d dVar2;
        int i10;
        C3018m c3018m;
        Iterator it;
        Collection collection;
        ImagePickerOptions imagePickerOptions2;
        ImagePickerOptions imagePickerOptions3;
        Collection collection2;
        ImagePickerAsset imagePickerAsset;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f31431h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f31431h = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.f31429f;
                Object e10 = AbstractC3868b.e();
                i10 = dVar2.f31431h;
                if (i10 != 0) {
                    lc.p.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.u(list2, 10));
                    c3018m = this;
                    it = list2.iterator();
                    collection = arrayList;
                    imagePickerOptions2 = imagePickerOptions;
                    if (it.hasNext()) {
                    }
                } else if (i10 == 1) {
                    collection = (Collection) dVar2.f31428e;
                    it = (Iterator) dVar2.f31427d;
                    collection2 = (Collection) dVar2.f31426c;
                    imagePickerOptions3 = (ImagePickerOptions) dVar2.f31425b;
                    c3018m = (C3018m) dVar2.f31424a;
                    lc.p.b(obj);
                    imagePickerAsset = (ImagePickerAsset) obj;
                    collection.add(imagePickerAsset);
                    collection = collection2;
                    imagePickerOptions2 = imagePickerOptions3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) dVar2.f31428e;
                    it = (Iterator) dVar2.f31427d;
                    collection2 = (Collection) dVar2.f31426c;
                    imagePickerOptions3 = (ImagePickerOptions) dVar2.f31425b;
                    c3018m = (C3018m) dVar2.f31424a;
                    lc.p.b(obj);
                    imagePickerAsset = (ImagePickerAsset) obj;
                    collection.add(imagePickerAsset);
                    collection = collection2;
                    imagePickerOptions2 = imagePickerOptions3;
                    if (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        MediaType mediaType = (MediaType) pair.getFirst();
                        Uri uri = (Uri) pair.getSecond();
                        int i12 = a.f31408a[mediaType.ordinal()];
                        if (i12 == 1) {
                            dVar2.f31424a = c3018m;
                            dVar2.f31425b = imagePickerOptions2;
                            dVar2.f31426c = collection;
                            dVar2.f31427d = it;
                            dVar2.f31428e = collection;
                            dVar2.f31431h = 1;
                            Object g10 = c3018m.g(uri, dVar2);
                            if (g10 == e10) {
                                return e10;
                            }
                            imagePickerOptions3 = imagePickerOptions2;
                            collection2 = collection;
                            imagePickerAsset = (ImagePickerAsset) g10;
                            collection.add(imagePickerAsset);
                            collection = collection2;
                            imagePickerOptions2 = imagePickerOptions3;
                            if (it.hasNext()) {
                                return new ImagePickerResponse(false, (List) collection);
                            }
                        } else {
                            if (i12 != 2) {
                                throw new lc.m();
                            }
                            dVar2.f31424a = c3018m;
                            dVar2.f31425b = imagePickerOptions2;
                            dVar2.f31426c = collection;
                            dVar2.f31427d = it;
                            dVar2.f31428e = collection;
                            dVar2.f31431h = 2;
                            Object f10 = c3018m.f(uri, imagePickerOptions2, dVar2);
                            if (f10 == e10) {
                                return e10;
                            }
                            imagePickerOptions3 = imagePickerOptions2;
                            obj = f10;
                            collection2 = collection;
                            imagePickerAsset = (ImagePickerAsset) obj;
                            collection.add(imagePickerAsset);
                            collection = collection2;
                            imagePickerOptions2 = imagePickerOptions3;
                            if (it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.f31429f;
        Object e102 = AbstractC3868b.e();
        i10 = dVar2.f31431h;
        if (i10 != 0) {
        }
    }
}
