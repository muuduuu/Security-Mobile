package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import java.io.InputStream;
import pe.M;

/* renamed from: com.squareup.picasso.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2929f extends z {

    /* renamed from: b, reason: collision with root package name */
    private static final UriMatcher f29575b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f29576a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f29575b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C2929f(Context context) {
        this.f29576a = context;
    }

    private InputStream j(x xVar) {
        ContentResolver contentResolver = this.f29576a.getContentResolver();
        Uri uri = xVar.f29666d;
        int match = f29575b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.z
    public boolean c(x xVar) {
        Uri uri = xVar.f29666d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f29575b.match(xVar.f29666d) != -1;
    }

    @Override // com.squareup.picasso.z
    public z.a f(x xVar, int i10) {
        InputStream j10 = j(xVar);
        if (j10 == null) {
            return null;
        }
        return new z.a(M.k(j10), u.e.DISK);
    }
}
