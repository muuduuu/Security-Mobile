package H9;

import android.net.NetworkInfo;

/* loaded from: classes2.dex */
public enum a {
    CG_2G("2g"),
    CG_3G("3g"),
    CG_4G("4g"),
    CG_5G("5g");

    public final String label;

    a(String str) {
        this.label = str;
    }

    public static a fromNetworkInfo(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            return CG_5G;
        }
        switch (subtype) {
        }
        return null;
    }
}
