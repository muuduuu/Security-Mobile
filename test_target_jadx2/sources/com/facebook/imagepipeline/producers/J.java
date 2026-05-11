package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import c3.AbstractC1721a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class J extends L implements u0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Class f20790d = J.class;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f20791e = {"_id", "_data"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f20792f = {"_data"};

    /* renamed from: g, reason: collision with root package name */
    private static final Rect f20793g = new Rect(0, 0, 512, 384);

    /* renamed from: h, reason: collision with root package name */
    private static final Rect f20794h = new Rect(0, 0, 96, 96);

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f20795c;

    public J(Executor executor, e3.i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f20795c = contentResolver;
    }

    private g4.i g(Uri uri, a4.f fVar) {
        Cursor query;
        g4.i j10;
        if (fVar == null || (query = this.f20795c.query(uri, f20791e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (j10 = j(fVar, query.getLong(query.getColumnIndex("_id")))) == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex >= 0) {
                j10.i0(i(query.getString(columnIndex)));
            }
            return j10;
        } finally {
            query.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return q4.e.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e10) {
            AbstractC1721a.l(f20790d, e10, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    private g4.i j(a4.f fVar, long j10) {
        Cursor queryMiniThumbnail;
        int columnIndex;
        int k10 = k(fVar);
        if (k10 == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f20795c, j10, k10, f20792f)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst() && (columnIndex = queryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) b3.l.g(queryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return d(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    private static int k(a4.f fVar) {
        Rect rect = f20794h;
        if (v0.b(rect.width(), rect.height(), fVar)) {
            return 3;
        }
        Rect rect2 = f20793g;
        return v0.b(rect2.width(), rect2.height(), fVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean b(a4.f fVar) {
        Rect rect = f20793g;
        return v0.b(rect.width(), rect.height(), fVar);
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected g4.i e(m4.b bVar) {
        Uri u10 = bVar.u();
        if (j3.f.i(u10)) {
            return g(u10, bVar.q());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
