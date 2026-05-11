package com.reactnativegooglesignin;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class o {
    static Scope[] a(ReadableArray readableArray) {
        int size = readableArray.size();
        Scope[] scopeArr = new Scope[size];
        for (int i10 = 0; i10 < size; i10++) {
            scopeArr[i10] = new Scope(readableArray.getString(i10));
        }
        return scopeArr;
    }

    public static int b(Task task) {
        Exception exception = task.getException();
        if (exception instanceof S6.b) {
            return ((S6.b) exception).b();
        }
        return 8;
    }

    static GoogleSignInOptions c(Scope[] scopeArr, String str, boolean z10, boolean z11, String str2, String str3) {
        GoogleSignInOptions.a e10 = new GoogleSignInOptions.a(GoogleSignInOptions.f23243l).e(new Scope("email"), scopeArr);
        if (str != null && !str.isEmpty()) {
            e10.c(str);
            if (z10) {
                e10.f(str, z11);
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            e10.g(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            e10.h(str3);
        }
        return e10.a();
    }

    static WritableMap d(GoogleSignInAccount googleSignInAccount) {
        Uri g12 = googleSignInAccount.g1();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", googleSignInAccount.Z0());
        createMap.putString("name", googleSignInAccount.j());
        createMap.putString("givenName", googleSignInAccount.I());
        createMap.putString("familyName", googleSignInAccount.F());
        createMap.putString("email", googleSignInAccount.u());
        createMap.putString("photo", g12 != null ? g12.toString() : null);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("user", createMap);
        createMap2.putString("idToken", googleSignInAccount.a1());
        createMap2.putString("serverAuthCode", googleSignInAccount.m1());
        WritableArray createArray = Arguments.createArray();
        Iterator it = googleSignInAccount.y0().iterator();
        while (it.hasNext()) {
            createArray.pushString(((Scope) it.next()).toString());
        }
        createMap2.putArray("scopes", createArray);
        return createMap2;
    }

    static String e(ReadableArray readableArray) {
        StringBuilder sb2 = new StringBuilder("oauth2:");
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            sb2.append(readableArray.getString(i10));
            sb2.append(" ");
        }
        return sb2.toString().trim();
    }
}
