package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import pe.M;

/* loaded from: classes2.dex */
class p extends C2930g {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f29615b = {"orientation"};

    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        a(int i10, int i11, int i12) {
            this.androidKind = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    p(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, f29615b, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i10 = cursor.getInt(0);
                cursor.close();
                return i10;
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    static a l(int i10, int i11) {
        a aVar = a.MICRO;
        if (i10 <= aVar.width && i11 <= aVar.height) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i10 > aVar2.width || i11 > aVar2.height) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.C2930g, com.squareup.picasso.z
    public boolean c(x xVar) {
        Uri uri = xVar.f29666d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.C2930g, com.squareup.picasso.z
    public z.a f(x xVar, int i10) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f29577a.getContentResolver();
        int k10 = k(contentResolver, xVar.f29666d);
        String type = contentResolver.getType(xVar.f29666d);
        boolean z10 = type != null && type.startsWith("video/");
        if (xVar.c()) {
            a l10 = l(xVar.f29670h, xVar.f29671i);
            if (!z10 && l10 == a.FULL) {
                return new z.a(null, M.k(j(xVar)), u.e.DISK, k10);
            }
            long parseId = ContentUris.parseId(xVar.f29666d);
            BitmapFactory.Options d10 = z.d(xVar);
            d10.inJustDecodeBounds = true;
            z.a(xVar.f29670h, xVar.f29671i, l10.width, l10.height, d10, xVar);
            if (z10) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l10 == a.FULL ? 1 : l10.androidKind, d10);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l10.androidKind, d10);
            }
            if (thumbnail != null) {
                return new z.a(thumbnail, null, u.e.DISK, k10);
            }
        }
        return new z.a(null, M.k(j(xVar)), u.e.DISK, k10);
    }
}
